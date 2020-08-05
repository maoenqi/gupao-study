package com.gupao.pattern.proxy.dbroute;


import com.gupao.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom on 2019/3/10.
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy(new OrderService());
            orderServiceStaticProxy.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}