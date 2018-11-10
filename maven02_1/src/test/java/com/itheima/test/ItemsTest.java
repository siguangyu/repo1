package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: java类作用描述
 * @Author: sgy
 * @CreateDate: 2018/11/8$ 13:28$
 */

public class ItemsTest {
    @Test
    public void findById(){



        /*获取spring容器*/
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService service = ac.getBean(ItemsService.class);
        Items items = service.findById(1);
        System.out.println(items);

    }
}
