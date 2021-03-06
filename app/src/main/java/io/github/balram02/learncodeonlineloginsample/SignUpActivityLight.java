package io.github.balram02.learncodeonlineloginsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SignUpActivityLight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_light);

        findViewById(R.id.sign_up).setOnClickListener(view -> {
            startActivity(new Intent(this, LoginActivityDark.class));
            finish();
        });
    }
}
