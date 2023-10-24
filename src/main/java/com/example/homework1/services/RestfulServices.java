package com.example.homework1.services;

import com.example.homework1.beans.DailyDiscountSelector;
import com.example.homework1.beans.ProductBean;
import com.example.homework1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestfulServices {

    private final ProductBean productBean;
    public final DailyDiscountSelector discountSelector;

    @Value("${welcomeMessage}")
    private String welcomeMessage;

    @Value("${headerMessage}")
    private String headerMessage;

    @Autowired
    public RestfulServices(ProductBean productBean, DailyDiscountSelector discountSelector) {
        this.productBean = productBean;
        this.discountSelector = discountSelector;
    }


    @GetMapping(value="/products")
    public List<String> listProducts() {
        List<String> messages=new ArrayList<String>();
        messages.add(welcomeMessage);
        messages.add(headerMessage);
        //add products to messages list

        List<Product> productList = productBean.getProductList();

        for(Product product : productList) {
            messages.add(product.toString());
        }
        int discountRate = discountSelector.getDailyDiscountRate();
        messages.add("You are lucky. Today's discount rate is " + discountRate);
        return messages;
    }
}
