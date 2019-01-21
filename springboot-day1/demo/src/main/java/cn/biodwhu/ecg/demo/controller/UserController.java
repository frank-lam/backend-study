package cn.biodwhu.ecg.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

/**
 * @author Created By Frank
 * @date 2019-01-21 20:39
 */

@RestController
public class UserController {

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public LinkedHashMap<String, Object> createCity(@PathVariable("username") String userName) {

        LinkedHashMap<String,Object> userInfo = new LinkedHashMap();
        userInfo.put("username",userName);
        userInfo.put("age",12);
        userInfo.put("avatar","http://img.biodwhu.cn/12121323123123.png");

        LinkedHashMap<String,Object> hashMap = new LinkedHashMap<>();
        hashMap.put("code",200);
        hashMap.put("msg","return success");
        hashMap.put("data",userInfo);

        return hashMap;
    }
}
