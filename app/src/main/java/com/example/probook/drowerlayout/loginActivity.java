package com.example.probook.drowerlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
    private EditText usernameEditText,passwordEditText;
    private Button loginButton;
    private TextView textView;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.userNameId);
        passwordEditText = findViewById(R.id.passwordId);
        loginButton = findViewById(R.id.angry_btn);
        textView = findViewById(R.id.textViewId);
        textView.setText("Number of attempts remaining : 3");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if(username.equals("admin") && password.equals("4321")) {
                    Intent in = new Intent(loginActivity.this,adminActivity.class);
                    startActivity(in);
                }
                else {
                    counter--;
                    textView.setText("Number of attempts remaininfg : "+counter);

                    if(counter == 0){
                        loginButton.setEnabled(false);
                    }
                }
            }
        });
    }
}
