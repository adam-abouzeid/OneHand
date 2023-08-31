package com.example.administrator.laujavaapp_adam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int counter = 0;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicked(View view){
        counter++;
        int num1 = findViewById(R.id.numb1);
        int num2 = findViewById(R.id.numb2);
//        result.setText("Counter:" + counter);
//        Toast.makeText(this, "You clicked on the button" + counter + " times", Toast.LENGTH_LONG).show();

    }
}
