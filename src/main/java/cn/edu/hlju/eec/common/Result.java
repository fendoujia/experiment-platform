package cn.edu.hlju.eec.common;

import lombok.Data;

/**
 * @author zjxu97 at 2020-05-26 18:49
 */
@Data
public class Result<T> {

    private static final String SUCCESS = "success";
    private static final int SUCCESS_CODE = 200;

    private static final String FAIL = "fail";
    private static final int FAIL_CODE = 500;


    private int code;
    private T data;
    private String msg;

    @SuppressWarnings("unchecked")
    public static <T> Result<T> success(T data) {
        Result result = new Result<>();
        result.setData(data);
        result.setCode(SUCCESS_CODE);
        result.setMsg(SUCCESS);
        return result;
    }

    @SuppressWarnings("unchecked")
    public static <T> Result<T> fail(T data) {
        Result result = new Result<>();
        result.setData(data);
        result.setCode(FAIL_CODE);
        result.setMsg(FAIL);
        return result;
    }
}
