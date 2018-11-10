package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @Author: sgy
 * @CreateDate: 2018/11/8$ 18:45$
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao dao;
    @Override
    public Items findById(int id) {
        return dao.findById(id);
    }
}
