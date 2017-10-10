package com.example.demo.utils.myexception;

import com.example.demo.utils.restMessage.RestCode;

/**
 * Created by Tony on 2017/10/10.
 * com.example.demo.SpringBootMybatis
 */
public class PublicException extends Throwable {
    private int errorCode = RestCode.NOTLOGIN;

    private String errorMessage = RestCode.NOTLOGIN_CN;

    public PublicException() {
    }

    public PublicException(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {

        return errorMessage;
    }

    public PublicException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {

        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
