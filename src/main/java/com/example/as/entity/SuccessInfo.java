package com.example.as.entity;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class SuccessInfo extends ArrayList<SuccessInfo> {
    private boolean success = false;
    private String message;

    public SuccessInfo() {
    }

    public SuccessInfo(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }
}
