package com.example.demo.Controller;

import com.example.demo.Do.UserDo;
import com.example.demo.Service.UserServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/user/{id}")
    @Operation(summary = "获取用户信息", description = "使用用户名获取用户信息")
    public UserDo getUserById(@PathVariable("id") long id) {
        return userServices.getUsersById(id);
    }

    @GetMapping("/user")
    @Operation(summary = "获取所有用户", description = "获取所有用户列表")
    public List<UserDo> getUserList() {
        return userServices.getAllUsers();
    }

    @PostMapping("/user")
    @Operation(summary = "添加用户", description = "添加新用户")
    public void addUser(@RequestBody UserDo user) {
        userServices.adduser(user);
    }

    @PutMapping("/user/{id}")
    @Operation(summary = "修改用户信息", description = "使用用户名修改用户信息")
    public void updateUser(@PathVariable("id") long id, @RequestBody UserDo user) {
        user.setId(id);
        userServices.edituser(user);
    }

    @DeleteMapping("/user/{id}")
    @Operation(summary = "删除用户", description = "使用用户名删除用户")
    public void deleteUser(@PathVariable("id") long id) {
        userServices.removeuser(id);
    }
}
