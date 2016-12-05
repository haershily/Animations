package com.example.harshil.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int f=1,r=1,s=1,m=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final ImageView bart= (ImageView) findViewById(R.id.bart);
        Button faded=(Button)findViewById(R.id.faded);
        Button rotate=(Button)findViewById(R.id.rotation);
        Button size=(Button)findViewById(R.id.size);
        Button move=(Button)findViewById(R.id.move);

        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.faded: if(f==1){f=0;bart.animate().alpha(0f).setDuration(2000);}else{f=1;bart.animate().alpha(1f).setDuration(2000);}break;
                    case R.id.rotation: if(r==1){r=0;bart.animate().rotation(1800f).setDuration(2000);}else{r=1;bart.animate().rotation(-1800f).setDuration(2000);}break;
                    case R.id.size: if(s==1){s=0;bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);}else{s=1;bart.animate().scaleX(1f).scaleY(1f).setDuration(2000);}break;
                    case R.id.move: if(m==1){m=0;bart.animate().translationXBy(1500f).setDuration(2000);}else{m=1;bart.animate().translationXBy(-1500f).setDuration(2000);}break;}
            }
        };
        faded.setOnClickListener(onClickListener);
        rotate.setOnClickListener(onClickListener);
        size.setOnClickListener(onClickListener);
        move.setOnClickListener(onClickListener);

    }
}
