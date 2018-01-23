package com.situ.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.situ.mybatis.entity.Student;
import com.situ.mybatis.vo.SearchVO;

public interface IStudentDao {
     public Student findById(int id);
     public List<Student> findAll();
     public List<Student> findByName(String name);
     public List<Student> findBySearchVO(SearchVO searchVO);
     public List<Student> findByPage(Map<String, Integer> map);
     public List<Student> findByPage1(@Param(value="offset")Integer offset,
    	        @Param(value="pageSize")Integer pageSize);
     //查询一共有多少学生
     public Integer count();
     



}
