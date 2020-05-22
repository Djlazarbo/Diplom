package org.snowcorp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.snowcorp.login.ui.main.RussFragment;

public class russ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.russ_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, RussFragment.newInstance())
                    .commitNow();
        }
    }
}