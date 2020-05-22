package org.snowcorp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.snowcorp.login.ui.main.ChemFragment;

public class chem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chem_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ChemFragment.newInstance())
                    .commitNow();
        }
    }
}