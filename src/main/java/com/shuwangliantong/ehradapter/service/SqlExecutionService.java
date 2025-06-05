package com.shuwangliantong.ehradapter.service;
import java.util.List;
import java.util.Map;

public interface SqlExecutionService {
    List<Map<String, Object>> executeQuery(String sql, Map<String,String> params);
}

