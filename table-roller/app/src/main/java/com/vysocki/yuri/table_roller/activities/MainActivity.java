package com.vysocki.yuri.table_roller.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.vysocki.yuri.table_roller.R;
import com.vysocki.yuri.table_roller.fragments.ActionsDiceFragment;
import com.vysocki.yuri.table_roller.fragments.ActionsPanelFragment;
import com.vysocki.yuri.table_roller.fragments.CharactersFragment;
import com.vysocki.yuri.table_roller.fragments.KnowledgebaseFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ActionsPanelFragment()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment2_container,
                new ActionsDiceFragment()).commit();

        frameLayout = findViewById(R.id.fragment2_container);
        frameLayout.setVisibility(View.VISIBLE);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_actions:
                            selectedFragment = new ActionsPanelFragment();
                            frameLayout.setEnabled(true);
                            frameLayout.setVisibility(View.VISIBLE);
                            break;

                        case R.id.nav_knowledgebase:
                            selectedFragment = new KnowledgebaseFragment();
                            frameLayout.setEnabled(false);
                            frameLayout.setVisibility(View.GONE);
                            break;

                        case R.id.nav_characters:
                            selectedFragment = new CharactersFragment();
                            frameLayout.setEnabled(false);
                            frameLayout.setVisibility(View.GONE);
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
