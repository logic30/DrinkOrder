package com.example.logic30.orderdrink;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ActMain extends Activity {
    int n1=0;
    String str="";

    private View.OnClickListener btnBlackTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("25");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                int n2 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+n2));
            }
            String st=lblShow.getText().toString();
            if(st.equals("茶類"))
                lblShow.setText("茶類\n紅茶");
            else
                lblShow.setText(lblShow.getText().toString()+"\n紅茶");

        }
    };
    private View.OnClickListener btnGreenTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("25");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                int n2 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+n2));
            }
            String st=lblShow.getText().toString();
            if(st.equals("茶類"))
                lblShow.setText("茶類\n綠茶");
            else
                lblShow.setText(lblShow.getText().toString()+"\n綠茶");


        }
    };
    private View.OnClickListener btnLightTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("25");
            else
                lblSum.setText(lblSum.getText().toString()+"25");


        }
    };
    private View.OnClickListener btnWlongTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("25");

            else
                lblSum.setText(lblSum.getText().toString()+"25");

        }
    };
    private View.OnClickListener btnDuoDuoG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else
                lblSum.setText(lblSum.getText().toString()+"35");

        }
    };
    private View.OnClickListener btnPlumG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else
                lblSum.setText(lblSum.getText().toString()+"35");

        }
    };
    private View.OnClickListener btnIceB_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else
                lblSum.setText(lblSum.getText().toString()+"35");

        }
    };
    private View.OnClickListener btnMintG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else
                lblSum.setText(lblSum.getText().toString()+"35");

        }
    };
    private View.OnClickListener btnMilkTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else
                lblSum.setText(lblSum.getText().toString()+"40");

        }
    };
    private View.OnClickListener btnMilkG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else
                lblSum.setText(lblSum.getText().toString()+"40");

        }
    };
    private View.OnClickListener btnAlmond_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else
                lblSum.setText(lblSum.getText().toString()+"40");

        }
    };
    private View.OnClickListener btnWMTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else
                lblSum.setText(lblSum.getText().toString()+"40");

        }
    };
    private RadioGroup.OnCheckedChangeListener rgSweet_checked=new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {


            switch(rgSweet.getCheckedRadioButtonId()){
                case R.id.rBMoreS:
                    lblShow2.setText("甜度\n多糖");
                    break;
                case R.id.rBNormalS:
                    lblShow2.setText("甜度\n正常");
                    break;
                case R.id.rBLessS:
                    lblShow2.setText("甜度\n少糖");
                    break;
                case R.id.rBHalfS:
                    lblShow2.setText("甜度\n半糖");
                    break;
                case R.id.rBLittleS:
                    lblShow2.setText("甜度\n微糖");
                    break;
                case R.id.rBNoS:
                    lblShow2.setText("甜度\n無糖");
                    break;
            }

        }
    };
    private RadioGroup.OnCheckedChangeListener rgIce_checked=new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch(rgIce.getCheckedRadioButtonId()){
                case R.id.rBMoreI:
                    lblShow3.setText("多冰");
                    break;
                case R.id.rBNormalI:
                    lblShow3.setText("正常");
                    break;
                case R.id.rBLessI:
                    lblShow3.setText("少冰");
                    break;
                case R.id.rBHalfI:
                    lblShow3.setText("半冰");
                    break;
                case R.id.rBlittleI:
                    lblShow3.setText("微冰");
                    break;
                case R.id.rBNoI:
                    lblShow3.setText("去冰");
                    break;
                case R.id.rBNormalT:
                    lblShow3.setText("常溫");
                    break;
                case R.id.rBWarmT:
                    lblShow3.setText("溫");
                    break;
                case R.id.rBHotT:
                    lblShow3.setText("熱");
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }
    private void InitialComponent() {
        lblSum=findViewById(R.id.lblSum);
        lblShow=findViewById(R.id.lblShow);
        lblShow2=findViewById(R.id.lblShow2);
        lblShow3=findViewById(R.id.lblShow3);
        lblShow4=findViewById(R.id.lblShow4);
        btnBlackTea=findViewById(R.id.btnBlackTea);
        btnBlackTea.setOnClickListener(btnBlackTea_click);
        btnGreenTea=findViewById(R.id.btnGreenTea);
        btnGreenTea.setOnClickListener(btnGreenTea_click);
        btnLightTea=findViewById(R.id.btnLightTea);
        btnLightTea.setOnClickListener(btnLightTea_click);
        btnWlongTea=findViewById(R.id.btnWlongTea);
        btnWlongTea.setOnClickListener(btnWlongTea_click);
        btnDuoDuoG=findViewById(R.id.btnDuoDuoG);
        btnDuoDuoG.setOnClickListener(btnDuoDuoG_click);
        btnPlumG=findViewById(R.id.btnPlumG);
        btnPlumG.setOnClickListener(btnPlumG_click);
        btnIceB=findViewById(R.id.btnIceB);
        btnIceB.setOnClickListener(btnIceB_click);
        btnMintG=findViewById(R.id.btnMintG);
        btnMintG.setOnClickListener(btnMintG_click);
        btnMilkTea=findViewById(R.id.btnＭilkTea);
        btnMilkTea.setOnClickListener(btnMilkTea_click);
        btnMilkG=findViewById(R.id.btnMilkG);
        btnMilkG.setOnClickListener(btnMilkG_click);
        btnAlmond=findViewById(R.id.btnAlmond);
        btnAlmond.setOnClickListener(btnAlmond_click);
        btnWMTea=findViewById(R.id.btnWMTea);
        btnWMTea.setOnClickListener(btnWMTea_click);

        rgSweet=findViewById(R.id.rgSweet);
        rgSweet.setOnCheckedChangeListener(rgSweet_checked);

        rgIce=findViewById(R.id.rgIce);
        rgIce.setOnCheckedChangeListener(rgIce_checked);


    }
    TextView lblShow;
    TextView lblShow2;
    TextView lblShow3;
    TextView lblShow4;
    TextView lblSum;
    Button btnBlackTea;
    Button btnGreenTea;
    Button btnLightTea;
    Button btnWlongTea;
    Button btnDuoDuoG;
    Button btnPlumG;
    Button btnIceB;
    Button btnMintG;
    Button btnMilkTea;
    Button btnMilkG;
    Button btnAlmond;
    Button btnWMTea;
    RadioGroup rgSweet;
    MyRadioButton1 rgIce;
}
