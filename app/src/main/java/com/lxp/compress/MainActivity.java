package com.lxp.compress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lxp.utils.BitmapCompression;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.test);

        tv.setText(BitmapCompression.saveBitmap("my old path，","名称为金隅嘉华大厦"));
    }
}
