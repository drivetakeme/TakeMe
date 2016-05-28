package com.apptakeme.tests;

/**
 * Created by Andre Motta on 5/26/2016.
 */

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import 	android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.widget.DatePicker;

import java.util.Calendar;



public  class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener

    //vc vai ter que fazer um método lá que vai literalmente receber um valor e setar no texto do botão, só isso, e nese ondataset vc chama esse metódo e faz isso, provavelmente
    //para evitar problemas esse método tem que ser státic
{
    public Calendar c;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);


        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user
        //transforma esses yerar, month, day em uma string

        String txt = day+"/"+month+"/"+year;

        cadastro cd_TKM = (cadastro)getActivity();
        cd_TKM.alterButtonTxt(txt);


    }
}