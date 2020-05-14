package com.example.administrator.computer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button exit;
    public Button reset;
    public Button count;
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
    public TextView xiaoshoumaoli;
    public TextView show_xiaoshoumaoli;
    public TextView caigouxianjia;
    public TextView show_caigouxianjia;
    public String value_xiaoshoujiage;
    public String value_tax_xiaoshoujiage;
    public String value_caigoujiage;
    public String value_tax_caigoujiage;
    public String value_yunshufeiyong;
    public String value_tax_yunshufeiyong;
    public String value_jiagongfeiyong;
    public String value_tax_jiagongfeiyong;
    public String value_mubiaolirun;
    public String value_fanhuan;
    public String value_xiaoshoumaoli;
    public String value_caigouxianjia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getValue();
        exit.setOnClickListener(this);
        reset.setOnClickListener(this);
        count.setOnClickListener(this);
    }

    private void getValue() {
        value_xiaoshoujiage = edt_xiaoshoujiage.getText().toString();
        value_tax_xiaoshoujiage = edt_tax_xiaoshoujiage.getText().toString();
        value_caigoujiage = edt_caigoujiage.getText().toString();
        value_tax_caigoujiage = edt_tax_caigoujiage.getText().toString();
        value_yunshufeiyong = edt_yunshufeiyong.getText().toString();
        value_tax_yunshufeiyong = edt_tax_yunshufeiyong.getText().toString();
        value_jiagongfeiyong = edt_jiagongfeiyong.getText().toString();
        value_tax_jiagongfeiyong = edt_tax_jiagongfeiyong.getText().toString();
        value_mubiaolirun = edt_mubiaolirun.getText().toString();
        value_fanhuan = edt_fanhuan.getText().toString();
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
        jiagongfeiyong = (TextView) findViewById(R.id.jiagongfeiyong);
        edt_jiagongfeiyong = (EditText) findViewById(R.id.edt_jiagongfeiyong);
        tax_jiagongfeiyong = (TextView) findViewById(R.id.tax_yunshufeiyong);
        edt_tax_jiagongfeiyong = (EditText) findViewById(R.id.edt_tax_jiagongfeiyong);
        mubiaolirun = (TextView) findViewById(R.id.mubiaolirun);
        edt_mubiaolirun = (EditText) findViewById(R.id.edt_mubiaolirun);
        fanhuan = (TextView) findViewById(R.id.fanhuan);
        edt_fanhuan = (EditText) findViewById(R.id.edt_fanhuan);
        count = (Button) findViewById(R.id.count);
        xiaoshoumaoli = (TextView) findViewById(R.id.xiaoshoumaoli);
        show_xiaoshoumaoli = (TextView) findViewById(R.id.show_xiaoshoumaoli);
        caigouxianjia = (TextView) findViewById(R.id.caigouxianjia);
        show_caigouxianjia = (TextView) findViewById(R.id.show_caigouxianjia);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.exit:
                finish();
            case R.id.reset:
                edt_xiaoshoujiage.setText("");
                edt_tax_xiaoshoujiage.setText("");
                edt_caigoujiage.setText("");
                edt_tax_caigoujiage.setText("");
                edt_yunshufeiyong.setText("");
                edt_tax_yunshufeiyong.setText("");
                edt_jiagongfeiyong.setText("");
                edt_tax_jiagongfeiyong.setText("");
                edt_mubiaolirun.setText("");
                edt_fanhuan.setText("");
                show_xiaoshoumaoli.setText("");
                show_caigouxianjia.setText("");

        }
    }
}
