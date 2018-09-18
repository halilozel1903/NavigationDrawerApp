package com.halil.ozel.navigationdrawerapp;

import java.util.ArrayList;

public class NavigationDrawerItem {

    String baslik;
    int resimID;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getResimID() {
        return resimID;
    }

    public void setResimID(int resimID) {
        this.resimID = resimID;
    }

    public static ArrayList<NavigationDrawerItem> getData(){

        ArrayList<NavigationDrawerItem> dataList = new ArrayList<NavigationDrawerItem>();
        int [] resimIDs = getImages();
        String [] basliklar = getBasliklar();


        for (int i=0;i<basliklar.length;i++){
            NavigationDrawerItem navItem = new NavigationDrawerItem();
            navItem.setBaslik(basliklar[i]);
            navItem.setResimID(resimIDs[i]);
            dataList.add(navItem);
        }
        return dataList;
    }

    private static int[] getImages(){
        return new int[]{
             R.drawable.icon1,R.drawable.icon2,R.drawable.icon3,R.drawable.icon4,
        };
    }

    public static String[] getBasliklar(){
        return new String[]{"Linux Komutları","Linux Dosya Yapısı","Linux Dağıtımları","Linux VS Windows"};
    }
}
