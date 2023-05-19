package com.lc.gamll;

import com.lc.bean.UserAddress;
import com.lc.gamll.service.impl.OrderServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/19
 * @Description
 */

public class MainAppliaction {
    @SuppressWarnings("resources")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderServiceimpl orderServiceimpl = context.getBean(OrderServiceimpl.class);
        List<UserAddress> userAddresses = orderServiceimpl.initOrder("1");
        userAddresses.forEach(userAddress -> {
            System.out.println(userAddress.getId());
        });
        System.in.read();
    }
}
