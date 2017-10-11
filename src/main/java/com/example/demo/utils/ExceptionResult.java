package com.example.demo.utils;

import com.example.demo.utils.restMessage.RestCode;
import com.example.demo.utils.restMessage.ResultMsg;

/**
 * Created by Tony on 2017/10/11.
 * com.example.demo.utils.SpringBootMybatis
 */
public class ExceptionResult {
    
    public static ResultMsg exceptionResult(String exception){
        ResultMsg resultMsg = new ResultMsg();
        if (exception.contains("DataException")){
            resultMsg.setMessage(RestCode.PARAMETERERROR_CN);
            resultMsg.setCode(RestCode.PARAMETERERROR);
        }else {
            resultMsg.setMessage(RestCode.INSIDE_CN);
            resultMsg.setCode(RestCode.INSIDE);
        }
        return resultMsg;
    }
}
