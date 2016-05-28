package com.apptakeme.tests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.Window;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }
    public void goTocadastro (View view){
        Intent intent = new Intent(this, cadastro.class);
        startActivity(intent);
    }
    /*public void goToMainUserScreen(View view){
        Intent intent = new Intent(this, UserMainScreen.class);
        startActivity(intent);
    }
    <RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:android="http://schemas.android.com/apk/res/android" >

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="125dp"
        android:layout_alignParentTop="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:background="#000000"
        android:id="@+id/cabecalho">


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/usu_ria_da_silva"
            android:id="@+id/username"
            android:layout_marginRight="56dp"
            android:layout_marginEnd="56dp"
            android:textColor="#ffffff"
            android:textSize="25sp"
            android:layout_centerVertical="true"
            android:layout_alignParentRight="true"
            android:layout_alignParentEnd="true" />
    </RelativeLayout>

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="125dp"
        android:layout_alignParentBottom="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:id="@+id/lowbar"
        android:background="#b3b3b3">


        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="85dp"
            android:layout_alignParentBottom="true"
            android:layout_alignParentLeft="true"
            android:layout_alignParentStart="true"
            android:background="#2aabe2"
            android:id="@+id/minhasreservas">

            <Button
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:text="@string/minhas_reservas"
                android:id="@+id/minhasreservasBTN"
                android:layout_centerVertical="true"
                android:layout_centerHorizontal="true"
                android:background="#2aabe2"
                android:textColor="#ffffff"
                android:textSize="18sp"
                android:enabled="true" />
        </RelativeLayout>

        <Button
            android:layout_width="105dp"
            android:layout_height="35dp"
            android:id="@+id/settings"
            android:background="@drawable/settingsbtn"
            android:layout_above="@+id/minhasreservas"
            android:layout_alignParentLeft="true"
            android:layout_alignParentStart="true"
            android:enabled="true" />

        <Button
            android:layout_width="105dp"
            android:layout_height="35dp"
            android:id="@+id/home"
            android:background="@drawable/clickedhomebtn"
            android:layout_above="@+id/minhasreservas"
            android:layout_centerHorizontal="true"
            android:enabled="true" />

        <Button
            android:layout_width="105dp"
            android:layout_height="35dp"
            android:id="@+id/coupons"
            android:background="@drawable/couponsbtn"
            android:layout_alignTop="@+id/home"
            android:layout_alignParentRight="true"
            android:layout_alignParentEnd="true"
            android:enabled="true" />
    </RelativeLayout>

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/cabecalho"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:layout_above="@+id/lowbar">




    </ScrollView>
</RelativeLayout>
*/



}
