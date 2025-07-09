package com.example.demo.Controller;

import com.example.demo.Do.UserDo;
import com.example.demo.Service.UserServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/api/auth")
public class LoginController {
    @Autowired
    private UserServices userServices;
    @PostMapping("/login")
    @Operation(summary = "用户登录", description = "使用用户名和密码进行登录")
    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest) {
        // 验证用户名和密码是否为空
        if (loginRequest.getYhm() == null || loginRequest.getYhm().isEmpty()) {
            return ResponseEntity.badRequest().body(createErrorResponse("用户名不能为空"));
        }

        if (loginRequest.getMm() == null || loginRequest.getMm().isEmpty()) {
            return ResponseEntity.badRequest().body(createErrorResponse("密码不能为空"));
        }

        // 查询所有用户
        List<UserDo> allUsers = userServices.getAllUsers();

        // 查找匹配的用户
        UserDo matchedUser = null;
        for (UserDo user : allUsers) {
            if (user.getYhm().equals(loginRequest.getYhm())) {
                matchedUser = user;
                break;
            }
        }

        // 用户不存在
        if (matchedUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(createErrorResponse("用户名不存在"));
        }

        // 验证密码
        if (!matchedUser.getMm().equals(loginRequest.getMm())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(createErrorResponse("密码不正确"));
        }

        // 登录成功，返回用户信息（排除密码）
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "登录成功");
        response.put("user", createUserResponse(matchedUser));

        return ResponseEntity.ok(response);
    }

    // 创建错误响应
    private Map<String, Object> createErrorResponse(String message) {
        Map<String, Object> response = new HashMap<>();
        response.put("success", false);
        response.put("message", message);
        return response;
    }

    // 创建用户响应对象（排除密码）
    private Map<String, Object> createUserResponse(UserDo user) {
        Map<String, Object> userResponse = new HashMap<>();
        userResponse.put("id", user.getId());
        userResponse.put("yhm", user.getYhm());
        userResponse.put("xb", user.getXb());
        userResponse.put("jzd", user.getJzd());
        userResponse.put("zy", user.getZy());
        userResponse.put("grjj", user.getGrjj());
        userResponse.put("js", user.getJs());
        return userResponse;
    }

    // 登录请求DTO
    static class LoginRequest {
        private String yhm;
        private String mm;

        // Getters and Setters
        public String getYhm() {
            return yhm;
        }

        public void setYhm(String yhm) {
            this.yhm = yhm;
        }

        public String getMm() {
            return mm;
        }

        public void setMm(String mm) {
            this.mm = mm;
        }
    }

}