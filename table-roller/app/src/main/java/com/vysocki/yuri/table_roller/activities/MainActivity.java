package com.vysocki.yuri.table_roller.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.vysocki.yuri.table_roller.R;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {

    NavController navController1;
    NavController navController2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        navController1 = Navigation.findNavController(this, R.id.nav_host_fragment1);
        navController2 = Navigation.findNavController(this, R.id.nav_host_fragment2);
        navController1.navigate(R.id.actionsDiceFragment);
        navController2.navigate(R.id.actionsPanelFragment);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.nav_actions:
                            navController1.navigate(R.id.actionsDiceFragment);
                            navController2.navigate(R.id.actionsPanelFragment);
                            break;

                        case R.id.nav_knowledgebase:
                            navController2.navigate(R.id.knowledgebaseFragment);
                            break;

                        case R.id.nav_characters:
                            navController2.navigate(R.id.charactersFragment);
                            break;
                    }

                    return true;
                }
            };
}
