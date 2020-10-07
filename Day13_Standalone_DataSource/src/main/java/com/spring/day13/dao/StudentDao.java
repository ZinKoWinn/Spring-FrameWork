package com.spring.day13.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setStudentDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> findByEmail(){
        return  jdbcTemplate.queryForList("select contact_email from studentInfo",String.class);
    }
}
