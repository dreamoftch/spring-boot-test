package com.tch.test.springboot.controller

import com.tch.test.springboot.mapper.StudentMapper
import com.tch.test.springboot.model.StudentPO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by tianch on 2017/5/19.
 */
@RestController()
class MyController {

    @Autowired
    private lateinit var studentMapper: StudentMapper

    @RequestMapping("/say")
    fun say(): String {
        return "say hello 9090 <<<<<<<<<<<<<<<<<<<<<<"
    }

    @RequestMapping("/countStudent")
    fun countStudent(): Long {
        return studentMapper.count()
    }

    @RequestMapping("/getById")
    fun getById(@RequestParam("id") id: Long): StudentPO {
        return studentMapper.selectByPrimaryKey(id)
    }

}