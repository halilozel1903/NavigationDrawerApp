package com.halil.ozel.navigationdrawerapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NavigationDrawerFragment extends Fragment {


    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mdrawerLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_navigation,container,false);
        return v;

    }

    public void setUpNavigationDrawer(DrawerLayout drawerLayout, Toolbar toolbar){

        mdrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(),mdrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);

        mdrawerLayout.post(new Runnable() {
            @Override
            public void run() {

                mDrawerToggle.syncState();
            }
        });


    }
}
