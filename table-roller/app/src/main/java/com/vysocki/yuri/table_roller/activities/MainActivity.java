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

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        setNavController(R.id.nav_host_fragment);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.actionsFragment:
                            navigateNavController(R.id.actionsFragment);
                            break;

                        case R.id.knowledgebaseFragment:
                            navigateNavController(R.id.knowledgebaseFragment);
                            break;

                        case R.id.charactersFragment:
                            navigateNavController(R.id.charactersFragment);
                            break;
                    }

                    return true;
                }
            };

    public void setNavController(int hostFragment) {
        this.navController = Navigation.findNavController(this, hostFragment);
    }

    public void navigateNavController(int fragment) {
        this.navController.navigate(fragment);
    }
}
