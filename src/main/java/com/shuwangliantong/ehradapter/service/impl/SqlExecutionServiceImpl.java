package com.shuwangliantong.ehradapter.service.impl;

import com.shuwangliantong.ehradapter.service.SqlExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SqlExecutionServiceImpl implements SqlExecutionService {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * 执行查询型SQL，结果返回为List<Map>
     */
    @Override
    public List<Map<String, Object>> executeQuery(String sql, Map<String, String> params) {
        return namedParameterJdbcTemplate.queryForList(sql, params);
    }

    /**
     * 执行带映射的查询，返回指定类型
     */
    public <T> List<T> executeQuery(String sqlTemplate, Map<String, Object> params, RowMapper<T> rowMapper) {
        return namedParameterJdbcTemplate.query(sqlTemplate, params, rowMapper);
    }

    /**
     * 执行更新/插入型SQL
     */
    public int executeUpdate(String sqlTemplate, Map<String, Object> params) {
        return namedParameterJdbcTemplate.update(sqlTemplate, params);
    }


}
