package org.snowcorp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.snowcorp.login.ui.main.BtnFragment;

public class btn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, BtnFragment.newInstance())
                    .commitNow();
        }
    }
}