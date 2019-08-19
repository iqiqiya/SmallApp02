package com.iqiqiya.smallapp02;

/**
 * Created by iqiqiya.
 * Author: iqiqiya
 * Date: 2019/8/19
 * Time: 10:31
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.iqiqiya.smallapp02.entity.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化方法
        initUI();
    }

    private void initUI(){
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        //添加数据
        //intent.putExtra("name","秋绘");

        //传递自定义数据
        User user = new User();
        user.setId(123);
        user.setName("秋绘");
        intent.putExtra("user",user);

        switch (v.getId()){
            case R.id.btn1:
                //跳转到第一个界面

                intent.setClass(getApplicationContext(),FirstActivity.class);
                //startActivity(intent);
                break;
            case R.id.btn2:
                //第二个界面
                intent.setClass(getApplicationContext(),SecondActivity.class);
                //startActivity(intent);
                break;
        }
        startActivity(intent);
    }
}
