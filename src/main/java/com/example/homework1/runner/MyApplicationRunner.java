package com.example.homework1.runner;

import com.example.homework1.beans.ProductBean;
import com.example.homework1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    private final ProductBean productBean;
    @Autowired
    public MyApplicationRunner(ProductBean productBean) {
        this.productBean = productBean;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Product1",5));
        products.add(new Product(2,"Product2",10));
        products.add(new Product(3,"Product3",15));
        products.add(new Product(4,"Product4",20));
        productBean.setProductList(products);
    }
}
