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

public class FouthWayActivity extends AppCompatActivity {

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

        ViewGroup.LayoutParams layoutParamsForView = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        usernameEditText = new EditText(this);
        usernameEditText.setLayoutParams(layoutParamsForView);
        usernameEditText.setHint("Enter the User Name");
        usernameEditText.setBackgroundColor(R.color.white);
        usernameEditText.setTextSize(20.0F);

        linearLayout.addView(usernameEditText);

        passwordEditText = new EditText(this);
        passwordEditText.setLayoutParams(layoutParamsForView);
        passwordEditText.setHint("ENter the PassWord");
        passwordEditText.setTextSize(20.0F);

        linearLayout.addView(passwordEditText);

        btnLogin = new Button(this);
        btnLogin.setText("Login");
        btnLogin.setBackgroundColor(R.color.white);
        btnLogin.setTextSize(20.0F);
        btnLogin.setLayoutParams(layoutParamsForView);


        linearLayout.addView(btnLogin);

        //Way 4 Passing an object of anonymous class

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usernameEditText.getText().toString().equals("Rohit") && passwordEditText.getText().toString().equals("Rohit@123")){
                    Toast.makeText(FouthWayActivity.this,"LoginSucced",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(FouthWayActivity.this,"Login Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
        setContentView(linearLayout);
    }
}
