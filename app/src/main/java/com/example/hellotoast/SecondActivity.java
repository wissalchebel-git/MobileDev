package com.example.hellotoast;



import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

    public class SecondActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            TextView messageView = findViewById(R.id.message);
            int count = getIntent().getIntExtra("COUNT_VALUE", 0);

            messageView.setText("Hello!\n" + count);
        }
    }


