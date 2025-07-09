package com.example.demo.Controller;

import com.example.demo.Do.UserDo;
import com.example.demo.Service.UserServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {
    @Autowired
    private UserServices userServices;

    @PostMapping("/register")
    @Operation(summary = "注册",description = "用户注册")
    public void add(@RequestBody UserDo goods){
        userServices.adduser(goods);
    }
}