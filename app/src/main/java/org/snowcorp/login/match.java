package org.snowcorp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.snowcorp.login.ui.main.MatchFragment;

public class match extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MatchFragment.newInstance())
                    .commitNow();
        }
    }
}