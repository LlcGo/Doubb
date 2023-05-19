package com.lc.gamll.service.impl;

import com.lc.bean.UserAddress;
import com.lc.service.OrderService;
import com.lc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/19
 * @Description
 */
@Service
public class OrderServiceimpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println(userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
