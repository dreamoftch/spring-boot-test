package com.tch.test.springboot

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by tianch on 2017/5/19.
 */
@SpringBootApplication
@MapperScan("com.tch.test.springboot.mapper")
open class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }


}