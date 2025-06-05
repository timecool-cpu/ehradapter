package com.shuwangliantong.ehradapter.controller;

import com.shuwangliantong.ehradapter.service.SqlExecutionService;
import com.shuwangliantong.ehradapter.utils.req.SqlExecuteRequest;
import com.shuwangliantong.ehradapter.utils.res.ApiResponse;
import com.shuwangliantong.ehradapter.utils.res.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sql")
public class SqlExecutionController {

    @Autowired
    private SqlExecutionService sqlExecutionService;

    @PostMapping("/execute")
    public ApiResponse<List<Map<String, Object>>> execute(@RequestBody SqlExecuteRequest request) {
        if (request.getSql() == null || request.getSql().trim().isEmpty()) {
            return ApiResponse.fail(ResultCode.INVALID_PARAM, "SQL不能为空");
        }
        // 只允许select，简单安全校验
        if (!request.getSql().trim().toLowerCase().startsWith("select")) {
            return ApiResponse.fail(ResultCode.INVALID_PARAM, "只允许select查询");
        }
        try {
            List<Map<String, Object>> results = sqlExecutionService.executeQuery(request.getSql(), request.getParams());
            return ApiResponse.success(results);
        } catch (Exception e) {
            return ApiResponse.fail(ResultCode.PROCESS_ERROR, "SQL执行异常: " + e.getMessage());
        }
    }
}

