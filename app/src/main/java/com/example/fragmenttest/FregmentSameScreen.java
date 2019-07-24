package com.example.fragmenttest;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FregmentSameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fregment_same_screen);
        FragmentB fragmentB=new FragmentB();
        FragmentA fragmentC=new FragmentA();

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_1,fragmentB,"fragmenta");
        fragmentTransaction.commit();
        FragmentManager fragmentManager1=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1=fragmentManager1.beginTransaction();
        fragmentTransaction1.add(R.id.frame_2,fragmentC,"fragmentb");
        fragmentTransaction1.commit();

    }


    public void dataRecivedFromA(String toString, char b) {
        Bundle bundle=new Bundle();
        bundle.putString("data",toString);
        FragmentB fragmentB=new FragmentB();
        FragmentA fragmentA=new FragmentA();
        if(b=='B')
        {

            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentA.setArguments(bundle);
            fragmentTransaction.replace(R.id.frame_2,fragmentA,null);
            fragmentTransaction.commit();

        }
       else
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentB.setArguments(bundle);
            fragmentTransaction.replace(R.id.frame_1,fragmentB,null);
            fragmentTransaction.commit();
        }

    }
}
