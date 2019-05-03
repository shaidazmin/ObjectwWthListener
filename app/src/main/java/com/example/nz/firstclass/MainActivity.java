package com.example.nz.firstclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView,textView2;
    Button button,button2;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       textView2 = (TextView) findViewById(R.id.textOne);
       textView = (TextView) findViewById(R.id.textTwo);
        button = (Button) findViewById(R.id.buttonOne);
            textView2.setText("Yeah! i am going on my way .. ");



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number++;
               textView.setText("I  can do ....");

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"First is competed",Toast.LENGTH_SHORT).show();
            }
        });



    Azmin azmin = new Azmin();
        button2.setOnClickListener(azmin);


    }
    class Azmin implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(MainActivity.this,"Your Class are working",Toast.LENGTH_SHORT);
            toast.setGravity(0,0,0);
        }
    }

}


/*

    we can implement Class Main Activity ....

    to complete easy way our work ...





 */