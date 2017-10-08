package com.example.katiegu.studybears;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        LinearLayout root = (LinearLayout) findViewById(R.id.rootLayout);

//        LinearLayout layout = new LinearLayout(this);
//        layout.setLayoutParams(new LinearLayout.LayoutParams(
//                        ViewGroup.LayoutParams.WRAP_CONTENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT, 0.0F));
//        layout.setOrientation(LinearLayout.VERTICAL);
//
//        TextView dynamicTextView = new TextView(this);
//        dynamicTextView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        dynamicTextView.setText("Welcome to StudyBears!");
//
//        layout.addView(dynamicTextView);
//        root.addView(layout);
//
//        setContentView(root);
    }

    public void toLogIn(View v) {
        startActivity(new Intent(Home.this, LogIn.class));
    }

    public void toSignUp(View v) {
        startActivity(new Intent(Home.this, SignUp.class));
    }

}
