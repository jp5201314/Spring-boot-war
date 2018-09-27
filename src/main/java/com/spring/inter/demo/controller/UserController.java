package com.spring.inter.demo.controller;

import com.spring.inter.demo.bean.User;
import com.spring.inter.demo.result.ResultModel;
import com.spring.inter.demo.result.ResultModelTool;
import com.spring.inter.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    @Autowired
    IUserService userService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResultModel getAllUser(){
        List<User> userList = userService.getAllUser();
        Map<String,List<User>> UserMap = new HashMap<>();
        if (userList!=null){
            UserMap.put("users",userList);
        }
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(0);
        resultModel.setData(UserMap);
        return ResultModelTool.handleResultModel(resultModel);
    }

    @PostMapping(value = "/addUser")
    public ResultModel addUser(@RequestParam long id, @RequestParam String name){
        User User = new User(id,name);
        int errorCode = userService.addUser(User);
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(errorCode);
        resultModel.setData(User);
        return ResultModelTool.handleResultModel(resultModel);
    }

    @PostMapping(value = "/updateUser")
    public ResultModel updateUser(@RequestParam long id,@RequestParam String name){
        User User = new User(id,name);
        int errorCode = userService.updateUser(User);
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(errorCode);
        resultModel.setData(User);
        return ResultModelTool.handleResultModel(resultModel);
    }
    @GetMapping(value = "/deleteUser/{id}")
    public ResultModel deleteUser(@PathVariable long id){
        int errorCode = userService.deleteUser(id);
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(errorCode);
        List<User> userList = userService.getAllUser();
        Map<String,List<User>> UserMap = new HashMap<>();
        if (userList!=null){
            UserMap.put("users",userList);
        }
        resultModel.setData(UserMap);
        return ResultModelTool.handleResultModel(resultModel);
    }

}
