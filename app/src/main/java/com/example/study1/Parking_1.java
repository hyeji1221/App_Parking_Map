package com.example.study1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Parking_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_1);


        final EditText e4, e5, e6, e7;
        Button b2;
        final double a, b = 0;
        final TextView textResult;
        View.OnClickListener cl;


        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);
        e6 = (EditText) findViewById(R.id.editText6);
        e7 = (EditText) findViewById(R.id.editText7);
        b2 = (Button) findViewById(R.id.button2);
        textResult = (TextView) findViewById(R.id.textView3);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = e4.getText().toString();
                String n2 = e5.getText().toString();
                String n3 = e6.getText().toString();
                String n4 = e7.getText().toString();
                if(n1.equals("")){
                    n1="0";
                }
                if(n2.equals("")){
                    n2="0";
                }
                if(n3.equals("")){
                    n3="0";
                }
                if(n4.equals("")){
                    n4="0";
                }
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);
                int num3 = Integer.parseInt(n3);
                int num4= Integer.parseInt(n4);


                int i=1;
                int minutes = num1 * 60 + num2;

                while(true){
                    if(num3*i<minutes){
                        i++;
                        continue;
                    }
                    else
                        break;
                }

                int a = num4*i;
                textResult.setText(a + "원");

            }
        });
    }


}
