package com.shuwangliantong.ehradapter.utils.res;

public enum ResultCode {
    SUCCESS(0, "成功"),
    INVALID_PARAM(1001, "请求参数不合法"),
    PROCESS_ERROR(1002, "处理失败"),
    NOT_FOUND(1003, "找不到相应数据"),
    INTERNAL_ERROR(9999, "系统异常");

    private final int code;
    private final String defaultMsg;

    ResultCode(int code, String defaultMsg) {
        this.code = code;
        this.defaultMsg = defaultMsg;
    }

    public int getCode() { return code; }
    public String getDefaultMsg() { return defaultMsg; }
}

