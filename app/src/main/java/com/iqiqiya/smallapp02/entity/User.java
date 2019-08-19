package com.iqiqiya.smallapp02.entity;

/**
 * Created by iqiqiya.
 * Author: iqiqiya
 * Date: 2019/8/19
 * Time: 10:31
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
