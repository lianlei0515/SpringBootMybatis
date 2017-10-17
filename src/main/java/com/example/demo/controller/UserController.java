package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.jsonutil.JsonUtils;
import com.example.demo.utils.restMessage.RestCode;
import com.example.demo.utils.restMessage.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import sun.net.www.http.HttpClient;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Base64;
import java.util.List;
import java.util.Map;

/**
 * Created by Tony on 2017/8/23.
 * com.example.demo.controller.SpringBootMybatis
 *
 * @RequestParam：接收路径中（？）之后的参数；例如：http://localhost:8083/users.do?page=2；接收page=2
 *      注：(value = "page", defaultValue = "1" , required = false)
 *         value：参数名称，若写这个属性则传入的参数需要和value相同
 *         defaultValue：为参数设置默认值
 *         required：判断参数是否可以为空，false：不能为空，true：可以为空，默认为true
 *
 * @PathVariable：接收路径中最后一个（/）后的参数，不用定义参数名；例如：http://localhost:8083/find.do/12；接收12
 *      注：请求路径设定为   /find.do/{id} 则接收后参数id=12
 *
 *  @RequestBody：接收Body中的参数可以是json格式等。。。，多用于接收对象
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 作者:   Tony
     * 时间:   2017/10/11 16:07
     * 方法名: register
     * 参数:   [request, response, user]
     * 返回值: com.example.demo.utils.restMessage.ResultMsg
     * 描述  :注册
     */
    @RequestMapping(value = "/register.do" , method = RequestMethod.POST)
    public ResultMsg register(HttpServletRequest request , HttpServletResponse response , @RequestBody User user){
        ResultMsg resultMsg = userService.register(user);
        return resultMsg;
    }

    /**
     * 作者:   Tony
     * 时间:   2017/10/11 16:07
     * 方法名: user
     * 参数:   [request, response, id]
     * 返回值: com.example.demo.utils.restMessage.ResultMsg
     * 描述  :根据id获取用户信息
     */
    @RequestMapping(value = "/user.do/{id}")
    public ResultMsg user(HttpServletRequest request , HttpServletResponse response , @PathVariable String id){
        ResultMsg resultMsg = userService.user(id);
        return resultMsg;
    }

    /**
     * 作者:   Tony
     * 时间:   2017/10/12 10:14
     * 方法名: users
     * 参数:   [request, response, pageable]
     * 返回值: com.example.demo.utils.restMessage.ResultMsg
     * 描述  :模糊查询分页排序；
     *       @PageableDefault(sort = { "createTime" }, direction = Sort.Direction.DESC) Pageable pageable
     *       请求路径：http://localhost:8083/users.do?size=2&page=0
     *          注：jpa内置分页注解
     *               sort：参数是实体类中的属性
     *               Pageable：jpa内置分页默认类
     *                  size：jpa内置参数：每页条数
     *                  page：jpa内置参数：当前页
     *
     */
    @RequestMapping(value = "/users.do" , method = RequestMethod.GET)
    public ResultMsg users(HttpServletRequest request , HttpServletResponse response , @PageableDefault(sort = { "createTime" }, direction = Sort.Direction.DESC)
                                       Pageable pageable,@RequestParam(value = "name") String userName){
        return userService.users(pageable,userName);
    }

    @RequestMapping(value = "/add.do" , method = RequestMethod.POST)
    public ResultMsg add(HttpServletRequest request , HttpServletResponse response, String li){
        return null;
    }

    @RequestMapping(value = "/login.do" , method = RequestMethod.POST)
    public ResultMsg login(HttpServletRequest request , HttpServletResponse response, @RequestBody User user){
        return null;
    }

}
