package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_rating =findViewById(R.id.btn_rating);
        Button btn_general =findViewById(R.id.btn_general);
        Button btn_food_beverage=findViewById(R.id.btn_food_beverage);
        Button btn_feedback=findViewById(R.id.btn_feedback);
        btn_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_rating();
            }
        });
        btn_general.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                activity_general();
            }
        });
        btn_food_beverage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                activity_food_beverage();
            }
        });
        btn_feedback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                activity_feedback();
            }
        });
    }
    private void activity_rating() {
        Intent intent=new Intent(this,Rating.class);
        startActivity(intent);
    }

    private void activity_general() {
        Intent intent=new Intent(this,General.class);
        startActivity(intent);
    }

    private void activity_food_beverage() {
        Intent intent=new Intent(this,Food_Beverage.class);
        startActivity(intent);
    }

    private void activity_feedback() {
        Intent intent=new Intent(this,Feedback.class);
        startActivity(intent);
    }
}