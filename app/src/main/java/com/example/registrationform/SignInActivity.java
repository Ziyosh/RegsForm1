package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private EditText edtName, edtPassword;
    private TextView txtSignUp;
    private Button btnLogIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edtName = findViewById(R.id.editTextTextPersonName2);
        edtPassword = findViewById(R.id.editTextTextPassword3);
        txtSignUp = findViewById(R.id.txtSignUp);
        btnLogIn = findViewById(R.id.btnLogIn);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inpName = edtName.getText().toString();
                String inpPass = edtPassword.getText().toString();

                if(inpName.equals("Tom") && inpPass.equals("123")){
                    Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(SignInActivity.this, "Name or Password entered Incorrectly.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
