package com.example.companycheckup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8;
    TextView pagia,apothema,apaithseis,diathesima,kefalaio,provlepseis,m_ypoxrewseis,b_ypoxrewseis;
    Button button1,button2;
    protected void onCreate(Bundle savedInstaceState)
    {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_main2);

        editText1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        editText2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        editText3 = (EditText) findViewById(R.id.editTextNumberDecimal3);
        editText4 = (EditText) findViewById(R.id.editTextNumberDecimal4);
        editText5 = (EditText) findViewById(R.id.editTextNumberDecimal5);
        editText6 = (EditText) findViewById(R.id.editTextNumberDecimal6);
        editText7 = (EditText) findViewById(R.id.editTextNumberDecimal7);
        editText8 = (EditText) findViewById(R.id.editTextNumberDecimal8);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        pagia = (TextView) findViewById(R.id.pagia);
        apothema = (TextView) findViewById(R.id.apothema);
        apaithseis = (TextView) findViewById(R.id.apaithseis);
        diathesima = (TextView)findViewById(R.id.diathesima);
        kefalaio = (TextView) findViewById(R.id.textView6);
        provlepseis = (TextView)findViewById(R.id.textView7);
        m_ypoxrewseis = (TextView)findViewById(R.id.textView8);
        b_ypoxrewseis = (TextView) findViewById(R.id.textView9);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Reset();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParsingValues();
            }
        });
    }

    public void ParsingValues()
    {
        float energitiko, pathitiko;
        String isologismos;

        String pagio = pagia.getEditableText().toString();
        String apothemata = apothema.getEditableText().toString();
        String apai = apaithseis.getEditableText().toString();
        String dia = diathesima.getEditableText().toString();
        String kef = kefalaio.getEditableText().toString();
        String pro = provlepseis.getEditableText().toString();
        String my = m_ypoxrewseis.getEditableText().toString();
        String by = b_ypoxrewseis.getEditableText().toString();

        float pag = Float.parseFloat(pagio);
        float apo = Float.parseFloat(apothemata);
        float apa = Float.parseFloat(apai);
        float diathesimo = Float.parseFloat(dia);
        float kefalaia = Float.parseFloat(kef);
        float pr0 = Float.parseFloat(pro);
        float mypo = Float.parseFloat(my);
        float bypo = Float.parseFloat(by);


        energitiko = pag + apo + apa + diathesimo;
        pathitiko = kefalaia + pr0 + mypo + bypo;

        if (energitiko > pathitiko) {
            isologismos = "Ο ισολογισμός είναι ενεργητικός";
        } else if (pathitiko > energitiko) {
            isologismos = "Ο ισολογισμός είναι αρνητικός";
        } else {
            isologismos = "Ο ισολογισμός είναι ουδέτερος";
        }
    }

    public void setApaithseis(TextView apaithseis) {
        this.apaithseis = apaithseis;
    }


    private void Reset()
    {
        editText1.getText().clear();
        editText2.getText().clear();
        editText3.getText().clear();
        editText4.getText().clear();
        editText5.getText().clear();
        editText6.getText().clear();
        editText7.getText().clear();
        editText8.getText().clear();
    }
}
