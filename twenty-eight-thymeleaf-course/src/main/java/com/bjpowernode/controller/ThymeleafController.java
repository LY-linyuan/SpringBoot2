package com.bjpowernode.controller;

import com.bjpowernode.model.SysUser;
import com.bjpowernode.vo.Cat;
import com.bjpowernode.vo.Dog;
import com.bjpowernode.vo.Zoo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @Author 临渊
 * @Date 2022-08-24 22:44
 */

@Controller
@RequestMapping("/tpl")
public class ThymeleafController {

    // 第一个标准变量表达式
    @GetMapping("/expression1")
    public String expression1(Model model) {
        // 添加数据到model
        model.addAttribute("site", "www.like.com");
        model.addAttribute("mylike", new SysUser(516, "T", "女", 17));
        // 指定视图
        return "expression1";
    }

    // 选择变量表达式
    @GetMapping("/expression2")
    public String expression2(Model model) {
        // 添加数据到model
        model.addAttribute("site", "www.like.com");
        model.addAttribute("mylike", new SysUser(516, "T", "女", 17));
        // 指定视图
        return "expression2";
    }

    // 连接表达式
    @GetMapping("/link")
    public String link(Model model) {
        model.addAttribute("userId", 516);
        return "link";
    }

    // 测试连接表达式的地址
    @GetMapping("/queryAccount")
    @ResponseBody
    public String QueryAccount(Integer id) {
        return "queryAccount 参数是id = " + id;
    }

    // 有两个参数的地址
    @GetMapping("/queryUser")
    @ResponseBody
    public String queryUser(String name, Integer age) {
        return "queryUser, 有两个参数, name = " + name + " age = " + age;
    }

    // 模板的属性
    @GetMapping("/property")
    public String userProperty(Model model) {
        model.addAttribute("methodAttr", "post");
        model.addAttribute("id", "5160000");
        model.addAttribute("paramname", "name");
        model.addAttribute("uservalue", "W");
        model.addAttribute("textcolor", "color:blue");

        return "html-property";
    }

    // 循环List
    @GetMapping("/eachList")
    public String eachList(Model model) {
        List<SysUser> userList = new ArrayList<SysUser>();
        userList.add(new SysUser(100516, "T", "女", 17));
        userList.add(new SysUser(200516, "W", "女", 18));
        userList.add(new SysUser(300516, "J", "女", 19));
        userList.add(new SysUser(400516, "E", "女", 20));
        userList.add(new SysUser(500516, "A", "女", 21));
        model.addAttribute("userList", userList);
        return "eachList";
    }

    // 循环数组
    @GetMapping("/eachArray")
    public String eachArray(Model model) {
        SysUser[] userArray = new SysUser[3];
        userArray[0] = new SysUser(100516, "T", "女", 17);
        userArray[1] = new SysUser(200516, "W", "女", 18);
        userArray[2] = new SysUser(300516, "J", "女", 19);
        model.addAttribute("userArray", userArray);
        return "eachArray";
    }

    // 循环Map
    @GetMapping("/eachMap")
    public String eachMap(Model model) {
        Map<String, SysUser> map = new HashMap<String, SysUser>();
        map.put("user1", new SysUser(110516, "T", "女", 17));
        map.put("user2", new SysUser(220516, "W", "女", 18));
        map.put("user3", new SysUser(330516, "J", "女", 19));
        model.addAttribute("userMap", map);
        Map<String, String> strMap = new HashMap<String, String>();
        strMap.put("str1", "hello1");
        strMap.put("str2", "hello2");
        strMap.put("str3", "hello3");
        model.addAttribute("strMap", strMap);

        // List<Map<String, SysUser>>
        List<Map<String, SysUser>> listMap = new ArrayList<Map<String, SysUser>>();
        listMap.add(map);
        Map<String, SysUser> map1 = new HashMap<String, SysUser>();
        map1.put("user11", new SysUser(111516, "T", "女", 17));
        map1.put("user22", new SysUser(222516, "W", "女", 18));
        map1.put("user33", new SysUser(333516, "J", "女", 19));
        listMap.add(map1);
        model.addAttribute("listMap", listMap);

        return "eachMap";
    }

    // ifunless
    @GetMapping("/ifunless")
    public String ifunless(Model model) {
        model.addAttribute("sex", "0");
        model.addAttribute("isLogin", true);
        model.addAttribute("age", 17);
        model.addAttribute("name", "");
        model.addAttribute("isOld", null);
        return "ifunless";
    }

    // switch
    @GetMapping("/switch")
    public String doswitch(Model model) {
        model.addAttribute("sex", "n");
        return "switch";
    }

    // 内联text
    @GetMapping("/inline")
    public String inline(Model model) {
        model.addAttribute("sex", "0");
        model.addAttribute("age", 17);
        model.addAttribute("name", "T");
        model.addAttribute("user", new SysUser(1516, "W", "女", 17));
        return "inline";
    }

    // 字面量 text
    @GetMapping("/text")
    public String text(Model model) {
        model.addAttribute("sex", "0");
        model.addAttribute("age", 17);
        model.addAttribute("name", "T");
        model.addAttribute("city", "xian");
        model.addAttribute("isLogin", true);
        model.addAttribute("user", new SysUser(1516, "W", "女", 17));
        return "text";
    }

    // 字面量 字符串连接
    @GetMapping("/strjoin")
    public String strjoin(Model model) {
        model.addAttribute("sex", "0");
        model.addAttribute("age", 17);
        model.addAttribute("name", "T");
        model.addAttribute("city", "xian");
        model.addAttribute("isLogin", true);
        model.addAttribute("user", new SysUser(1516, "W", "女", 17));
        return "strjoin";
    }

    // 运算符的使用
    @GetMapping("/sym")
    public String sym(Model model) {
        model.addAttribute("sex", "0");
        model.addAttribute("age", 17);
        model.addAttribute("name", "T");
        model.addAttribute("city", "xian");
        model.addAttribute("isLogin", true);
        model.addAttribute("user", null);
        return "sym";
    }

    // 模板的内置对象
    @GetMapping("/baseObject")
    public String baseObject(Model model, HttpServletRequest request, HttpSession session) {
        // 添加数据
        model.addAttribute("name", "T");
        request.setAttribute("requestDate", "request作用域中的数据");
        session.setAttribute("sessionDate", "session作用域中的数据");
        // 直接使用session
        session.setAttribute("loginname", "W");

        return "baseObject";
    }

    // 内置的工具类对象
    @GetMapping("/utilobject")
    public String utilObject(Model model){
        model.addAttribute("mydate", new Date());
        model.addAttribute("mynum",26.695);
        model.addAttribute("mystr","bjpowernode");

        List<String> list = Arrays.asList("a", "b", "c");
        model.addAttribute("mylist", list);


        // 创建Zoo对象
        Zoo zoo = new Zoo();
        Cat cat = new Cat();
        cat.setName("喵");

        Dog dog = new Dog();
        dog.setName("二哈");

        zoo.setCat(cat);
        // zoo.setDog(dog); zoo.dog = null

        model.addAttribute("zoo",zoo);

        return "utilObject";
    }


    // 自定义模板
    @GetMapping("/customtpl")
    public String customTemplate(Model model){
        return "customtpl";
    }


}
