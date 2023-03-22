package com.example.student.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResultBean
 * @Description TODO
 * @Author 胡
 * @Date 2023/2/23 17:19
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBean<T> {

    private int code;
    private String message;
    private T data;



    public static <T> ResultBean<T> success() {
        ResultBean<T> result = new ResultBean<>();
        result.setCode(0);
        result.setMessage("成功");
        return result;
    }

    public static <T> ResultBean<T> success(T data) {
        ResultBean<T> result = new ResultBean<>();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(data);
        return result;
    }

    public static <T> ResultBean<T> error(int code, String message) {
        ResultBean<T> result = new ResultBean<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public boolean isSuccess() {
        return code == 0;
    }

    public ResultBean<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public ResultBean<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResultBean<T> setData(T data) {
        this.data = data;
        return this;
    }


}
