package com.example.bitcode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashBoardActivity extends AppCompatActivity{

    LinearLayout linearLayout;
    EditText usernameEditText;
    EditText passwordEditText;
    Button btnLogin;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        linearLayout = new LinearLayout(this);
        linearLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(20,20,20,20);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        linearLayout.setLayoutParams(layoutParams);

        ViewGroup.LayoutParams layoutParamsForViews = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        usernameEditText = new EditText(this);
        usernameEditText.setLayoutParams(layoutParamsForViews);
        usernameEditText.setHint("Enter the name");
        usernameEditText.setBackgroundColor(R.color.white);
        usernameEditText.setTextSize(20.0F);

        linearLayout.addView(usernameEditText);

        passwordEditText = new EditText(this);
        passwordEditText.setLayoutParams(layoutParamsForViews);
        passwordEditText.setHint("Enter the Pass");
        passwordEditText.setBackgroundColor(R.color.white);
        passwordEditText.setTextSize(20.F);

        linearLayout.addView(passwordEditText);

        btnLogin = new Button(this);
        btnLogin.setLayoutParams(layoutParamsForViews);
        btnLogin.setBackgroundColor(R.color.white);
        btnLogin.setTextSize(20.0F);
        btnLogin.setText("LoginBtn");

        linearLayout.addView(btnLogin);

        //way 3 creating reference of listner add initializing it with object of inner class
        View.OnClickListener listener = new MyBtnClickListener();
        btnLogin.setOnClickListener(listener);
        setContentView(linearLayout);


    }
    class MyBtnClickListener implements  View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(usernameEditText.getText().toString().equals("Rohit") && (passwordEditText.getText().toString().equals("Rohit@123"))){
                Toast.makeText(DashBoardActivity.this,"LoginSucccesed",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(DashBoardActivity.this,"Failedd",Toast.LENGTH_LONG).show();
            }
        }
    }

}

