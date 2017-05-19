package com.tch.test.springboot.mapper

import org.apache.ibatis.annotations.Select

/**
 * Created by tianch on 2017/5/19.
 */
interface StudentMapper: StudentPOMapper {

    @Select("SELECT count(1) FROM student")
    fun count(): Long

}