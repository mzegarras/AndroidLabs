package net.msonic.lab01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String titulo1 =  getString(R.string.titulo1);
        String titulo2 =  getString(R.string.titulo2);


        TextView aaa = (TextView)findViewById(R.id.lbl2);

        aaa.setText("TATATATAATTAT");

        int rpta = 5 + 5;
        aaa.setText(String.valueOf(rpta));
        aaa.setText(R.string.titulo2);

    }

    public void sumar(View v){

        EditText editText = (EditText)findViewById(R.id.editText);

        EditText editText2 = (EditText)findViewById(R.id.editText2);

        TextView lblRp = (TextView)findViewById(R.id.lblRp);


        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int rp = n1 + n2;

        lblRp.setText(String.valueOf(rp));


    }
}
