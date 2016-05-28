package com.apptakeme.tests;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.apptakeme.tests.Mask;
import android.widget.DatePicker;
import android.widget.EditText;
import 	android.support.v4.app.DialogFragment;
import android.widget.Toast;




public class cadastro extends AppCompatActivity {

    //coloca o botão aqui
    public Button dateButton;
    public DialogFragment newFragment;
    public EditText phone;
    private TextWatcher phoneMask;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //defina no construtor, eu diria para você definir no construtor, esse oncreate é para
        // literalmente criar o dialog/tela vc com certeza tem um construtor, entende?
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cadastro);
        newFragment = new DatePickerFragment();
        phone = (EditText) findViewById(R.id.Phone);
        phoneMask= Mask.insert("(##)#####-####", phone);
        phone.addTextChangedListener(phoneMask);
        dateButton = (Button) findViewById(R.id.date);//viu aprendendo coisas



    }

    public void showDatePickerDialog(View v) {
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void alterButtonTxt(String buttonTXT){
    //agora aqui você tem acesso a ele
        Toast.makeText(getApplicationContext(), "Data Salva", Toast.LENGTH_SHORT).show();

        this.dateButton.setText(buttonTXT);//vamo ver se ele n reclama, creio que o string deve ser um objeto que herda de charsequence, //sei la
    }


    public void goToMainActivity (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
