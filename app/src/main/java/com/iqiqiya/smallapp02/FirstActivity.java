package com.iqiqiya.smallapp02;

/**
 * Created by iqiqiya.
 * Author: iqiqiya
 * Date: 2019/8/19
 * Time: 10:31
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.iqiqiya.smallapp02.entity.User;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);

        /**Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        Log.i("FirstActivity","获取的名字是"+name);

        TextView tvShow = findViewById(R.id.tv_show);
        tvShow.setText("获取的姓名为:" + name);*/

        Bundle bundle = getIntent().getExtras();
        User user = (User) bundle.getSerializable("user");
        Log.i("FirstActivity","获取的名字是"+user.getName()+",获取的id是"+user.getId());

        TextView tv_show = findViewById(R.id.tv_show);
        tv_show.setText("获取的名字是"+user.getName()+",获取的id是"+user.getId());
    }

}
