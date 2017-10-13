package com.example.demo.utils.jsonutil;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cglib.beans.BeanMap;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * Created by Tony on 2017/10/12.
 * com.example.demo.utils.jsonutil.springbootmybatis
 */
public class JsonUtils {

   private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T jsonToObject(String jsonString ,Class<T> classType){

        T t= null;
        try {
            t = objectMapper.readValue(jsonString, classType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }


    /**
     * 作者:   Tony
     * 时间:   2017/10/13 17:08
     * 方法名: mapToArray
     * 参数:   [dataMap：传入的参数, jsonString：获取参数的键, bean：要转的实体]
     * 返回值: java.util.List<T>
     * 描述  :
     */
    public static <T> List<T> mapToArray(Map dataMap ,String jsonString, Class<T> bean) {
        List<T> list = null;
        if (dataMap == null || dataMap.size()<1)
            return list;
        try {
            if (StringUtils.isBlank(jsonString)) {
                JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, bean);
                list = objectMapper.readValue(JsonUtils.toJsonString(dataMap), javaType);
            }else {
                JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, bean);
                list = objectMapper.readValue(JsonUtils.toJsonString(dataMap.get(jsonString)), javaType);
            }
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static <T> T mapToString(Map map, String jsonStr, Class<T> obj) {
        T t = null;
        try {
            JSONObject o = null;
            if (jsonStr != null && !jsonStr.equals("")) {
                o = (JSONObject) JSONObject.toJSON(map.get(jsonStr));
            } else {
                o = (JSONObject) JSONObject.toJSON(map);
            }
            t = objectMapper.readValue(o.toString(), obj);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public static String toJsonString(Object obj) {
        return JSON.toJSONString(obj);
    }
}
