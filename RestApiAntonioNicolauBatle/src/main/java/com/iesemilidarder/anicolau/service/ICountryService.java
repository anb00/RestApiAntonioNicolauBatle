package com.iesemilidarder.anicolau.service;

import com.iesemilidarder.anicolau.zItems.FirstBean.Country;
import com.iesemilidarder.anicolau.zItems.FirstBean.Product;

import java.util.List;

public interface ICountryService {

    public List<Country> findAll();

    List<Product> findProducts();

    Product getProductById(Integer id);
}