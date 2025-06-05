package com.shuwangliantong.ehradapter.utils.res;

public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;

    public ApiResponse() {}

    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 工厂方法
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDefaultMsg(), data);
    }

    public static <T> ApiResponse<T> fail(ResultCode code) {
        return new ApiResponse<>(code.getCode(), code.getDefaultMsg(), null);
    }

    public static <T> ApiResponse<T> fail(ResultCode code, String customMsg) {
        return new ApiResponse<>(code.getCode(), customMsg, null);
    }

    // getter/setter
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}

