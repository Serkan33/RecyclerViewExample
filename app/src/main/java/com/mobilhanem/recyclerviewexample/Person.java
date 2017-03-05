package com.mobilhanem.recyclerviewexample;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alper on 15.5.2015.
 */
public class Person {

    private String name;
    private String age;
    private int photo_id;
    public List<Person> person_list;
    public String getName()
    {
        return this.name;
    }
    public String getAge()
    {
        return this.age;
    }
    public int getPhoto_id()
    {
        return this.photo_id;
    }

    public Person(String name,String age,int photo_id)
    {
        this.name = name;
        this.age = age;
        this.photo_id = photo_id;
    }
    public Person()
    {

    }


}
