package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());
        Button loginButton =(Button) findViewById(R.id.button_login);
        EditText loginAccount=(EditText) findViewById(R.id.login_account);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),NewsActivity.class);
                //intent.putExtra("login",loginAccount.getText().toString());
                // cet extra est uniquement disponible dans NewsActivity
                // c'est pas vraiment pratique car il faudra chaque fois le transferer vers chaque Activité
                // La solution => utiliser le contexte de l'application
                //System.out.println(loginAccount.getText().toString());
                NewsListApplication app=(NewsListApplication) getApplicationContext();
                app.setLogin(loginAccount.getText().toString());
                finish();
                startActivity(intent);
            }
        });
    }
}