package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private EditText txtName, txtPassword, txtReEnterPassword;
    private TextView txtSignIn;
    private Button btnRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtName = findViewById(R.id.editTextTextPersonName2);
        txtPassword = findViewById(R.id.editTextTextPassword3);
        txtReEnterPassword = findViewById(R.id.editTextTextPassword2);
        txtSignIn = findViewById(R.id.txtSignUp);
        btnRegistration = findViewById(R.id.btnLogIn);

        txtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToSignInPage = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(passToSignInPage);
            }
        });

        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName = txtName.getText().toString();
                String inpPass = txtPassword.getText().toString();
                String inpRePass = txtReEnterPassword.getText().toString();

                if (inpName.equals("Zam") && inpPass.equals("123") && inpRePass.equals("123")) {
                    Intent passToMainActivityPage = new Intent(SignUpActivity.this, MainActivity.class);
                    startActivity(passToMainActivityPage);
                }else {
                    Toast.makeText(SignUpActivity.this, "Name or Password entered incorrectly.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}