package net.msonic.lab01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by manuelzegarra on 11/30/16.
 */

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
    }

    public void sumar(View v){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
