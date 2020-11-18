package com.java.multilanguagesupportsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    TextView mText;
    Context context;
    Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
        onClickListener();
    }

    private void initializeView() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        mText = findViewById(R.id.text);
    }

    private void onClickListener() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "hi");
                resources = context.getResources();
                mText.setText(resources.getString(R.string.content));
                button1.setText(resources.getString(R.string.button1));
                button2.setText(resources.getString(R.string.button2));
                button3.setText(resources.getString(R.string.button3));
                setTitle(resources.getString(R.string.app_name));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "en");
                resources = context.getResources();
                mText.setText(resources.getString(R.string.content));
                button1.setText(resources.getString(R.string.button1));
                button2.setText(resources.getString(R.string.button2));
                button3.setText(resources.getString(R.string.button3));
                setTitle(resources.getString(R.string.app_name));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(MainActivity.this, "bn");
                resources = context.getResources();
                mText.setText(resources.getString(R.string.content));
                button1.setText(resources.getString(R.string.button1));
                button2.setText(resources.getString(R.string.button2));
                button3.setText(resources.getString(R.string.button3));
                setTitle(resources.getString(R.string.app_name));
            }
        });

    }



}