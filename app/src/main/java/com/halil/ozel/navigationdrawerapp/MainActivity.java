package com.halil.ozel.navigationdrawerapp;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbar();
        setUpDrawer();
    }

    private void setUpToolbar(){
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("NawDrawer Örnek");
        toolbar.setSubtitle("Örnek Uygulama");
    }

    private void setUpDrawer(){

        NavigationDrawerFragment navFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        navFragment.setUpNavigationDrawer(drawerLayout,toolbar);
    }
}
