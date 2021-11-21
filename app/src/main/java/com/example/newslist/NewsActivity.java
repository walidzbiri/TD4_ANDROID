package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());
        Button newsButton =(Button) findViewById(R.id.button_news);
        Button logoutButton =(Button) findViewById(R.id.button_logout);
        NewsListApplication app=(NewsListApplication) getApplicationContext();
        String login = app.getLogin();
        TextView textViewLoginAccount = (TextView) findViewById(R.id.login_account);
        textViewLoginAccount.setText(login);

        newsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String url="https://news.google.com";
                //Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                Intent intent=new Intent( v.getContext(),DetailsActivity.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( v.getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}