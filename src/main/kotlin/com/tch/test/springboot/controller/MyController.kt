package com.tch.test.springboot.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by tianch on 2017/5/19.
 */
@RestController()
class MyController {

    @RequestMapping("/say")
    fun say(): String {
        return "你好啊";
    }

}