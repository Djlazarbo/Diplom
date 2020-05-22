package org.snowcorp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.snowcorp.login.ui.main.PhyFragment;

public class phy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phy_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PhyFragment.newInstance())
                    .commitNow();
        }
    }
}