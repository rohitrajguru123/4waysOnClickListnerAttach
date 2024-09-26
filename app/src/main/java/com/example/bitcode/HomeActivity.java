package com.example.bitcode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText usernameEditText;
    EditText passwordEditText;
    TextView welcomeTextView;
    LinearLayout mainContainer;


    //Activity LifeCycle

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceSate){
        super.onCreate(savedInstanceSate);

        mainContainer = new LinearLayout(this);
        mainContainer.setOrientation(LinearLayout.VERTICAL);
        mainContainer.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        mainContainer.setPadding(20,20,20,20);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

                mainContainer.setLayoutParams(layoutParams);

                ViewGroup.LayoutParams layoutParamsForView = new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

                welcomeTextView = new TextView(this);
                welcomeTextView.setLayoutParams(layoutParamsForView);
                welcomeTextView.setText("Welcome To Bitcode");
                welcomeTextView.setTextColor(R.color.black);
                welcomeTextView.setBackgroundColor(R.color.white);

                mainContainer.addView(usernameEditText);

                passwordEditText = new EditText(this);
                passwordEditText.setLayoutParams(layoutParamsForView);
                passwordEditText.setHint("Enter the Password");

                mainContainer.addView(passwordEditText);

                btnSubmit = new Button(this);
                btnSubmit.setLayoutParams(layoutParamsForView);
                btnSubmit.setText("submit");
                btnSubmit.setTextSize(30.0F);
                btnSubmit.setBackgroundColor(R.color.black);

                mainContainer.addView(btnSubmit);

                //way 2 -- pass object of such a class that implements View.OnClickListener
                btnSubmit.setOnClickListener(new MyBtnClickListener());

                setContentView(mainContainer);

    }

    class  MyBtnClickListener implements View.OnClickListener{


        @Override
        public void onClick(View view) {
            if (view == btnSubmit){
                welcomeTextView.setText("welcome" + usernameEditText.getText().toString() );
            }else {
                welcomeTextView.setText("Welcome to Android");
            }
        }
    }

}
