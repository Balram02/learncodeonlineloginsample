package io.github.balram02.learncodeonlineloginsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivityDark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dark);

        findViewById(R.id.sign_in).setOnClickListener(view -> {
            startActivity(new Intent(this, LoginActivityLight.class));
            finish();
        });
    }
}
