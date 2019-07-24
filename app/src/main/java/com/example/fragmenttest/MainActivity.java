package com.example.fragmenttest;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_a,btn_b,btn_c,btn_d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idsetter();
        listner();
    }

    private void idsetter() {
        btn_a=findViewById(R.id.button_main_A);
        btn_b=findViewById(R.id.button_main_B);
        btn_c=findViewById(R.id.button_main_C);
        btn_d=findViewById(R.id.button_main_D);

    }

    private void listner() {
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment1  fragment1=new Fragment1();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentf,fragment1,"fragmenta");
                fragmentTransaction.setCustomAnimations(R.anim.abc_popup_enter, R.anim.abc_popup_exit);
//                fragmentTransaction.add(R.id.fragmentf,fragment1,"fragmenta");
                fragmentTransaction.commit();
            }
        });
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentB  fragmentb=new FragmentB();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                fragmentTransaction.replace(R.id.fragmentf,fragmentb,"fragmentb");
                fragmentTransaction.commit();

            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentA fragmentc=new FragmentA();
                FragmentManager fragmentManager=getSupportFragmentManager();
                //fragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                fragmentTransaction.replace(R.id.fragmentf,fragmentc,"fragmenta");
                fragmentTransaction.commit();
            }
        });
        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FregmentSameScreen.class);
                startActivity(i);
            }
        });
    }
}
