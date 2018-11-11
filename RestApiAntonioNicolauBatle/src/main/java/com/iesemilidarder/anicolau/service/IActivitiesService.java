package com.iesemilidarder.anicolau.service;



import com.iesemilidarder.anicolau.data.Activities;
import com.iesemilidarder.anicolau.data.Activity;
import com.iesemilidarder.anicolau.zItems.FirstBean.Country;
import com.iesemilidarder.anicolau.zItems.FirstBean.Product;

import java.util.List;

public interface IActivitiesService {

  public List<Activity> findActivities();

    //List<Product> findActivities();
}