package com.example.valentinmakhlay.taphello;

import android.inputmethodservice.KeyboardView;
import android.opengl.Visibility;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.visible;

public class MainLayoutActivity extends AppCompatActivity {

    TextView textView;
    Button btnshow;
    Button btnhide;

    ImageView ImageView;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        textView = (TextView) findViewById(R.id.textView);
        btnshow = (Button) findViewById(R.id.btnshow);
        btnhide = (Button) findViewById(R.id.btnhide);
        ImageView = (ImageView) findViewById(R.id.smile);

        btnhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Вы нажали на кнопку - скрыть");
                ImageView.setVisibility(View.INVISIBLE);
            }
        });

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Вы нажали на кнопку - показать");
                ImageView.setVisibility(View.VISIBLE);
            }
        });
    }

}
