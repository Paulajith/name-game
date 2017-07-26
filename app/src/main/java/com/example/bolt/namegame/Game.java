package com.example.bolt.namegame;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Game extends AppCompatActivity {

    public ImageView iv;
    public Button b1;
    public int c,bi,idx,ix;
    public String me,t;
    public int count=0;
    public TextView tv;
    //public obj o = new obj(R.drawable.anger , "anger");
    //public obj ob = new obj(R.drawable.joy, "JOY");
    public int[] bid={R.id.b1, R.id.b2,R.id.b3};
    public int[] rsid = {R.drawable.joy , R.drawable.anger, R.drawable.fear , R.drawable.disgust , R.drawable.sad};
    public String[] name = { "JOY" , "ANGER" , "FEAR" , "DISGUST" , "SAD" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        iv = (ImageView)findViewById(R.id.im);
        createImg();
        iv.setBackgroundResource(c);
        buttonSel();
        b1=(Button)findViewById(bi);
        b1.setText(me);

    }

    public void clicked (View v) {
        b1 =(Button)v;
        tv =(TextView)findViewById(R.id.t2);
        String buttonText = b1.getText().toString();
        if(buttonText.equals(me)) {
            createImg();
            count+=10;
            String s = String.valueOf(count);
            iv.setBackgroundResource(c);
            buttonSel();
            b1=(Button)findViewById(bi);
            b1.setText(me);
            tv.setText(s);
        }

    }

    public void createImg(){
        idx = new Random().nextInt(rsid.length);
        c = rsid[idx];
        me = name[idx];

    }

    public String getName(){
        idx = new Random().nextInt(name.length);
        return name[idx];
    }

    public void buttonSel(){
        ix = new Random().nextInt(bid.length);
        bi = bid[ix];
    }

    /*public void buttonset(){
        buttonSel();
        String t="",t1="";
        b1=(Button)findViewById(bi);
        b1.setText(me);
        for(int q= 0;q<3;q++){
            while (bid[q]!=bi){
                t = getName();
                if(!t.equals(me) && !t.equals(t1)){
                    b1=(Button)findViewById(bid[q]);
                    b1.setText(t);
                    t1=t;
                }
            }
        }
    }*/
}
