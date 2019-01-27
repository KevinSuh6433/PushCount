package com.example.kev.pushcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class CountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count_layout);
    }

    public void buttonClicked(View v)
    {
        TextView countView = (TextView)findViewById(R.id.count);
        int count = Integer.parseInt(countView.getText().toString());
        count++;

        String c =count + "";
        ((TextView) findViewById(R.id.count)).setText(c);


    }
}
