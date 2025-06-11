package com.shuwangliantong.ehradapter.utils.req;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SqlExecuteRequest {
    private String sql;
    private Map<String,String> params;
}