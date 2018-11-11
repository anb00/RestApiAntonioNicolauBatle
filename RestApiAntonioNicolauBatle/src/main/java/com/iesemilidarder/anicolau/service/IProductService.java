package com.iesemilidarder.anicolau.service;

import com.iesemilidarder.anicolau.zItems.FirstBean.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findProducts();
    String getProductById();
}