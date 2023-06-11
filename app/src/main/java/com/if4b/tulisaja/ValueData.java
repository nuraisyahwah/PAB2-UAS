//03
package com.if4b.tulisaja;

import com.google.gson.annotations.SerializedName;


public class ValueData<T> {
    @SerializedName("success")
    private int success;
    @SerializedName("message")
    private String message;

    private T data;

    public int getSuccessNah() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
