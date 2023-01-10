package com.example.nutrinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setInfoPage();
        configureBackButton();
    }

    protected void setInfoPage() {
        try {
            Bundle extras = getIntent().getExtras();
            String item = null;
            if (extras != null) {
                item = extras.getString("item");
                //The key argument here must match that used in the other activity
            }

            switch (item) {
                case "apple":
                    setContentView(R.layout.info_page_apple);
                    break;
                case "banana":
                    setContentView(R.layout.info_page_banana);
                    break;
                case "orange":
                    setContentView(R.layout.info_page_orange);
                    break;
                default:
                    finish();
            }
        } catch (RuntimeException e){
            e.printStackTrace();
            finish();
        }
    }

    protected void configureBackButton() {
        // BACK BUTTOM
        Button backBtn = findViewById(R.id.back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
