package com.kano.diceroller;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.Year;

public class MainJava extends AppCompatActivity {
    Button gotoActivtyB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);

      /*  gotoActivtyB = findViewById(R.id.activity_a);
        gotoActivtyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent activity_a = new Intent(MainJava.this,ActvityB.class);
                //startActivity(activity_a);

                //startActivity(new Intent(MainJava.this, ActvityB.class));
            }
        });
*/
    }
    public void Activity(View view){
        startActivity(new Intent(MainJava.this, ActvityB.class));
        finish();
    }

}
