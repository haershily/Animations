package com.example.harshil.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int t=1;

    public void fade(View view){
        ImageView bart= (ImageView) findViewById(R.id.bart);
        ImageView homer= (ImageView) findViewById(R.id.homer);

       if(t==1) {
           t=0;
           bart.animate().alpha(0f).setDuration(2000);
           homer.animate().alpha(1f).setDuration(2000);
       }
        else
       {
          t=1;
               bart.animate().alpha(1f).setDuration(2000);
               homer.animate().alpha(0f).setDuration(2000);

       }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
