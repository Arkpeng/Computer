package com.example.administrator.computer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button exit;
    public Button reset;
    public TextView title;
    public TextView xiaoshoujiage;
    public EditText edt_xiaoshoujiage;
    public TextView tax_xiaoshoujiage;
    public EditText edt_tax_xiaoshoujiage;
    public TextView caigoujiage;
    public EditText edt_caigoujiage;
    public TextView tax_caigoujiage;
    public EditText edt_tax_caigoujiage;
    public TextView yunshufeiyong;
    public EditText edt_yunshufeiyong;
    public TextView tax_yunshufeiyong;
    public EditText edt_tax_yunshufeiyong;
    public TextView jiagongfeiyong;
    public EditText edt_jiagongfeiyong;
    public TextView tax_jiagongfeiyong;
    public EditText edt_tax_jiagongfeiyong;
    public TextView mubiaolirun;
    public EditText edt_mubiaolirun;
    public TextView fanhuan;
    public EditText edt_fanhuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        exit = (Button) findViewById(R.id.exit);
        reset = (Button) findViewById(R.id.reset);
        title = (TextView) findViewById(R.id.title);
        xiaoshoujiage = (TextView) findViewById(R.id.xiaoshoujiage);
        edt_xiaoshoujiage = (EditText) findViewById(R.id.edt_xiaoshoujiage);
        tax_xiaoshoujiage = (TextView) findViewById(R.id.tax_xiaoshoujiage);
        edt_tax_xiaoshoujiage =(EditText) findViewById(R.id.edt_tax_xiaoshoujiage);
        caigoujiage = (TextView) findViewById(R.id.caigoujiage);
        edt_caigoujiage = (EditText) findViewById(R.id.edt_caigoujiage);
        tax_caigoujiage = (TextView) findViewById(R.id.tax_caigoujiage);
        edt_tax_caigoujiage =(EditText) findViewById(R.id.edt_tax_caigoujiage);
        yunshufeiyong = (TextView) findViewById(R.id.yunshufeiyong);
        edt_yunshufeiyong = (EditText) findViewById(R.id.edt_yunshufeiyong);
        tax_yunshufeiyong = (TextView) findViewById(R.id.tax_yunshufeiyong);
        edt_tax_yunshufeiyong =(EditText) findViewById(R.id.edt_tax_yunshufeiyong);

    }

}
