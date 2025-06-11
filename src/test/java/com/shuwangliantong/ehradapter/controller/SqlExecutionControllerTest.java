package com.shuwangliantong.ehradapter.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shuwangliantong.ehradapter.utils.req.SqlExecuteRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SqlExecutionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    // 测试空SQL的情况
    @Test
    public void execute_WhenSqlIsEmpty_ShouldReturnError() throws Exception {
        SqlExecuteRequest request = new SqlExecuteRequest();
        request.setSql(""); // 空SQL

        mockMvc.perform(post("/api/sql/execute")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.code").value("INVALID_PARAM"))
                .andExpect(jsonPath("$.message").value("SQL不能为空"));
    }

    // 测试非SELECT语句的情况
    @Test
    public void execute_WhenSqlNotSelect_ShouldReturnError() throws Exception {
        SqlExecuteRequest request = new SqlExecuteRequest();
        request.setSql("INSERT INTO table VALUES (1)"); // 非SELECT

        mockMvc.perform(post("/api/sql/execute")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.code").value("INVALID_PARAM"))
                .andExpect(jsonPath("$.message").value("只允许select查询"));
    }

    // 测试正常SELECT执行（需模拟Service返回）
    // 注：实际测试中需要使用@MockBean模拟SqlExecutionService
}