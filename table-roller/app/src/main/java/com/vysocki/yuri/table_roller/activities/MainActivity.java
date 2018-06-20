package com.vysocki.yuri.table_roller.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.vysocki.yuri.table_roller.R;
import com.vysocki.yuri.table_roller.fragments.ActionsFragment;
import com.vysocki.yuri.table_roller.fragments.CharactersFragment;
import com.vysocki.yuri.table_roller.fragments.KnowledgebaseFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ActionsFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_actions:
                            selectedFragment = new ActionsFragment();
                            break;

                        case R.id.nav_knowledgebase:
                            selectedFragment = new KnowledgebaseFragment();
                            break;

                        case R.id.nav_characters:
                            selectedFragment = new CharactersFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
