package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: sgy
 * @CreateDate: 2018/11/8$ 19:05$
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService service;
    @RequestMapping("findDetail")
    public String findById(Model model){
        Items item = service.findById(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
