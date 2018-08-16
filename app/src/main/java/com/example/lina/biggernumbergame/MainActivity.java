package com.example.lina.biggernumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int rand1;
    private int rand2;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //When app loads up
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PickRandomNumbers();

    }
    protected void PickRandomNumbers(){
        //pick a random number
        Random randy = new Random();
        rand1 = randy.nextInt(10);
        while (true){
            rand2 = randy.nextInt(10);
            if(rand2!=rand1) break;
        }

        Button lbutt = (Button) findViewById(R.id.left_button);
        lbutt.setText(Integer.toString(rand1));
        Button rbutt = (Button) findViewById(R.id.right_button);
        rbutt.setText(Integer.toString(rand2));
    }

    public void leftButtonClick(View view) {
        TextView p = (TextView) findViewById(R.id.points_field);
        if(rand1>rand2){
            count ++;
            Toast.makeText(this,"shatra ya mama", Toast.LENGTH_SHORT).show();
        }else {
            count --;
            Toast.makeText(this,"fashla ya mama", Toast.LENGTH_SHORT).show();
        }     p.setText("Points: " +Integer.toString(count));
        PickRandomNumbers();
    }

    public void rightButtonClick(View view) {
        // todo
        TextView p = (TextView) findViewById(R.id.points_field);
        if(rand2>rand1){
            count ++;
            Toast.makeText(this,"Great Job!", Toast.LENGTH_SHORT).show();
        }else {
            count --;
            Toast.makeText(this,"You SUCK", Toast.LENGTH_SHORT).show();
        }     p.setText("Points:"+Integer.toString(count));
        PickRandomNumbers();
    }
}
