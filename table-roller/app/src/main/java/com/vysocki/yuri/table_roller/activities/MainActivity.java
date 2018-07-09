package com.vysocki.yuri.table_roller.activities;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vysocki.yuri.table_roller.R;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    NavController navController;
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottom_navigation);

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNav, navController);

    }


    public void setBottomNavigationVisibility(boolean visibilityState) {
        if (visibilityState) {
            this.bottomNav.setVisibility(View.VISIBLE);
        }
        else {
            this.bottomNav.setVisibility(View.INVISIBLE);
        }
    }
}
