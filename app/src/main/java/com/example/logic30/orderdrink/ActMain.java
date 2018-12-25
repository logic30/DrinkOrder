package com.example.logic30.orderdrink;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

                lblSum.setText(String.valueOf(n1+25));
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
                lblSum.setText(String.valueOf(n1+25));
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
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+25));
            }
            String st=lblShow.getText().toString();
            if(st.equals("茶類"))
                lblShow.setText("茶類\n青茶");
            else
                lblShow.setText(lblShow.getText().toString()+"\n青茶");


        }
    };
    private View.OnClickListener btnWlongTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("25");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+25));
            }
            String st=lblShow.getText().toString();
            if(st.equals("茶類"))
                lblShow.setText("茶類\n烏龍");
            else
                lblShow.setText(lblShow.getText().toString()+"\n烏龍");

        }
    };
    private View.OnClickListener btnDuoDuoG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+35));
            }

            lblShow.setText(lblShow.getText().toString()+"\n多綠");

        }
    };
    private View.OnClickListener btnPlumG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+35));
            }

            lblShow.setText(lblShow.getText().toString()+"\n梅綠");

        }
    };
    private View.OnClickListener btnIceB_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+35));
            }

            lblShow.setText(lblShow.getText().toString()+"\n可可");

        }
    };
    private View.OnClickListener btnMintG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("35");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+35));
            }

            lblShow.setText(lblShow.getText().toString()+"\n薄青");

        }
    };
    private View.OnClickListener btnMilkTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+40));
            }

            lblShow.setText(lblShow.getText().toString()+"\n奶茶");

        }
    };
    private View.OnClickListener btnMilkG_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+40));
            }

            lblShow.setText(lblShow.getText().toString()+"\n奶綠");

        }
    };
    private View.OnClickListener btnAlmond_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+40));
            }

            lblShow.setText(lblShow.getText().toString()+"\n杏奶");

        }
    };
    private View.OnClickListener btnWMTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("40");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+40));
            }

            lblShow.setText(lblShow.getText().toString()+"\n烏奶");

        }
    };
    private RadioGroup.OnCheckedChangeListener rgSweet_checked=new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            String st=lblShow.getText().toString();
            String st2=lblShow2.getText().toString();


            switch(rgSweet.getCheckedRadioButtonId()){
                case R.id.rBMoreS:
                    if(st.length()-st2.length()==3)
                        lblShow2.setText(lblShow2.getText().toString()+"\n多糖");
                    break;
                case R.id.rBNormalS:
                    if(st.length()-st2.length()==3)
                        lblShow2.setText(lblShow2.getText().toString()+"\n正常");
                    break;
                case R.id.rBLessS:
                    if(st.length()-st2.length()==3)
                        lblShow2.setText(lblShow2.getText().toString()+"\n少糖");
                    break;
                case R.id.rBHalfS:
                    if(st.length()-st2.length()==3)
                        lblShow2.setText(lblShow2.getText().toString()+"\n半糖");
                    break;
                case R.id.rBLittleS:
                    if(st.length()-st2.length()==3)
                        lblShow2.setText(lblShow2.getText().toString()+"\n微糖");
                    break;
                case R.id.rBNoS:
                    if(st.length()-st2.length()==3)
                        lblShow2.setText(lblShow2.getText().toString()+"\n無糖");
                    break;
            }

        }
    };
    private RadioGroup.OnCheckedChangeListener rgIce_checked=new RadioGroup.OnCheckedChangeListener() {
        @Override

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            String st=lblShow.getText().toString();
            String st3=lblShow3.getText().toString();


            switch(rgIce.getCheckedRadioButtonId()){
                case R.id.rBMoreI:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n多冰");

                    break;
                case R.id.rBNormalI:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n正常");
                    break;
                case R.id.rBLessI:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n少冰");
                    break;
                case R.id.rBHalfI:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n半冰");
                    break;
                case R.id.rBlittleI:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n微冰");
                    break;
                case R.id.rBNoI:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n去冰");
                    break;
                case R.id.rBNormalT:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n常溫");
                    break;
                case R.id.rBWarmT:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n溫");
                    break;
                case R.id.rBHotT:
                    if(st.length()-st3.length()==3)
                    lblShow3.setText(lblShow3.getText().toString()+"\n熱");
                    break;
            }
        }
    };
    private RadioGroup.OnCheckedChangeListener rBadditional_checked=new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            String st=lblShow.getText().toString();
            String st4=lblShow4.getText().toString();
            int t=Integer.parseInt(lblSum.getText().toString());
            switch(rBadditional.getCheckedRadioButtonId()){

                case R.id.rBBoba:
                    if(st.length()-st4.length()==3) {
                        lblShow4.setText(lblShow4.getText().toString() + "\n波霸");
                        if(t==0)
                            lblSum.setText("5");
                        else{
                            n1 = Integer.parseInt(lblSum.getText().toString());
                            lblSum.setText(String.valueOf(n1+5));
                        }
                    }
                    break;
                case R.id.rBPearl:
                    if(st.length()-st4.length()==3) {
                        lblShow4.setText(lblShow4.getText().toString() + "\n珍珠");
                        if(t==0)
                            lblSum.setText("5");
                        else{
                            n1 = Integer.parseInt(lblSum.getText().toString());
                            lblSum.setText(String.valueOf(n1+5));
                        }
                    }
                    break;
                case R.id.rBCoconut:
                    if(st.length()-st4.length()==3) {
                        lblShow4.setText(lblShow4.getText().toString() + "\n耶果");
                        if(t==0)
                            lblSum.setText("5");
                        else{
                            n1 = Integer.parseInt(lblSum.getText().toString());
                            lblSum.setText(String.valueOf(n1+5));
                        }
                    }
                    break;
                case R.id.rBPudding:
                    if(st.length()-st4.length()==3) {
                        lblShow4.setText(lblShow4.getText().toString() + "\n布丁");
                        if(t==0)
                            lblSum.setText("5");
                        else{
                            n1 = Integer.parseInt(lblSum.getText().toString());
                            lblSum.setText(String.valueOf(n1+5));
                        }
                    }
                    break;
                case R.id.rBTeaJelly:
                    if(st.length()-st4.length()==3) {
                        lblShow4.setText(lblShow4.getText().toString() + "\n茶凍");
                        if(t==0)
                            lblSum.setText("5");
                        else{
                            n1 = Integer.parseInt(lblSum.getText().toString());
                            lblSum.setText(String.valueOf(n1+5));
                        }
                    }
                    break;
            }
        }
    };
    private View.OnClickListener btnBcup_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("5");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+5));
            }


        }
    };
    private View.OnClickListener btnNcup_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener btnx1_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    };
    private View.OnClickListener btnx2_click= new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("0");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1*2));
            }


        }
    };
    private View.OnClickListener btnx3_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("0");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1*3));
            }

        }
    };
    private View.OnClickListener btnx4_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("0");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1*4));
            }

        }
    };
    private View.OnClickListener btnx5_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("0");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1*5));
            }

        }
    };
    private View.OnClickListener btnPay_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.btnPay){
                new AlertDialog.Builder(ActMain.this)
                        .setTitle("總金額")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("共"+lblSum.getText().toString()+"元")
                        .setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .show();

            }

        }
    };



    private View.OnClickListener btnBag_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblSum.getText().toString());
            if(t==0)
                lblSum.setText("1");
            else{
                n1 = Integer.parseInt(lblSum.getText().toString());
                lblSum.setText(String.valueOf(n1+1));
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
        btnBcup=findViewById(R.id.btnBCup);
        btnBcup.setOnClickListener(btnBcup_click);
        btnNcup=findViewById(R.id.btnNcup);
        btnNcup.setOnClickListener(btnNcup_click);
        btnx1=findViewById(R.id.btnx1);
        btnx1.setOnClickListener(btnx1_click);
        btnx2=findViewById(R.id.btnx2);
        btnx2.setOnClickListener(btnx2_click);
        btnx3=findViewById(R.id.btnx3);
        btnx3.setOnClickListener(btnx3_click);
        btnx4=findViewById(R.id.btnx4);
        btnx4.setOnClickListener(btnx4_click);
        btnx5=findViewById(R.id.btnx5);
        btnx5.setOnClickListener(btnx5_click);
        btnPay=findViewById(R.id.btnPay);
        btnPay.setOnClickListener(btnPay_click);
        btnBag=findViewById(R.id.btnBag);
        btnBag.setOnClickListener(btnBag_click);

        rgSweet=findViewById(R.id.rgSweet);
        rgSweet.setOnCheckedChangeListener(rgSweet_checked);

        rgIce=findViewById(R.id.rgIce);
        rgIce.setOnCheckedChangeListener(rgIce_checked);

        rBadditional=findViewById(R.id.rBadditional);
        rBadditional.setOnCheckedChangeListener(rBadditional_checked);


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
    Button btnBcup;
    Button btnNcup;
    Button btnx1;
    Button btnx2;
    Button btnx3;
    Button btnx4;
    Button btnx5;
    Button btnPay;
    Button btnBag;
    RadioGroup rgSweet;
    MyRadioButton1 rgIce;
    RadioGroup rBadditional;
    RadioButton rBMoreI;
}
