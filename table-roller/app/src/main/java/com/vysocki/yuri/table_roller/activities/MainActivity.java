package com.vysocki.yuri.table_roller.activities;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vysocki.yuri.table_roller.R;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        setNavController(R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNav, navController);

    }


    public void setNavController(int hostFragment) {
        this.navController = Navigation.findNavController(this, hostFragment);
    }

    public void navigateNavController(int fragment) {
        this.navController.navigate(fragment);
    }
}
