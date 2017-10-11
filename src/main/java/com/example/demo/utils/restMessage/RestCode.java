package com.example.demo.utils.restMessage;

/**
 * Created by Tony on 2017/9/30.
 * com.example.demo.utils.restMessage.SpringBootMybatis
 * 描述 ：返回信息
 */
public class RestCode {
    //成功
    public final static int SUCCESSCODE = 0;
    //参数错误
    public final static int PARAMETERERROR = 4004;
    //序列化错误
    public final static int SERIALIZATIONERROR = 4005;
    //该方法操作失败
    public final static int OPERATIONFAILED = 5001;
    //没有数据
    public final static int NODATA = 4005;
    //没有登录
    public final static int NOTLOGIN = 5005;
    //用户已存在
    public final static int EXISTENCE = 8000;
    //内部错误
    public final static int INSIDE = 8000;

    //参数错误
    public final static String PARAMETERERROR_CN = "参数错误";

    public final static String INSIDE_CN = "内部错误";

    public final static String NOTLOGIN_CN = "没有登录";

    public final static String SUCCESSMESSAGE_CN = "保存成功";

    public final static String QUERYWASSUCCESSFUL_CN = "查询成功";

    public final static String DELETESUCCESSFULLY_CN = "删除成功";

    public final static String MODIFYSUCCESSFULLY_CN = "修改成功";

    public final static String SAVEFAILED_CN = "保存失败";

    public final static String STRINGMODIFYFAILED_CN = "修改失败";

    public final static String DELETEFAILED_CN = "删除失败";

    public final static String QUERYFAILED_CN = "查询失败";

    public final static String NODATA_CN = "没有数据";

    public final static String SORRY_CN = "对不起！";

    public final static String USERNAME_EXISTENCE_CN = "该用户名已被使用";

    public final static String MAILBOX_EXISTENCE_CN = "该邮箱已被使用";

    public final static String CELLPHONENUMBER_EXISTENCE_CN = "该手机号已被使用";

}
