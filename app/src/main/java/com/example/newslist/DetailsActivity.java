package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());
        Button okButton =(Button) findViewById(R.id.button_ok);

        NewsListApplication app=(NewsListApplication) getApplicationContext();
        String login = app.getLogin();
        TextView textViewLoginAccount = (TextView) findViewById(R.id.login_account);
        textViewLoginAccount.setText(login);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( v.getContext(),NewsActivity.class);
                startActivity(intent);
            }
        });

    }
}