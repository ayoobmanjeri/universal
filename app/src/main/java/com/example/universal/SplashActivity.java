package com.example.universal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SplashActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        getSupportActionBar().hide();
        button = findViewById(R.id.Button);

               button.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {

                       Intent intent = new Intent( SplashActivity.this,LoginActivity.class );
                               startActivity(intent);
                               finish();
                   }
               });
    }
}