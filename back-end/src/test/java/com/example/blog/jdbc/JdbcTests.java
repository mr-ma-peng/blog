package com.example.blog.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class JdbcTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    void queryTest() {
        List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from user ");
        queryForList.forEach(System.out::println);
        Assertions.assertNotNull(queryForList);
    }
}
