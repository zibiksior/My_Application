package com.example.zygi.myapplication.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.zygi.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    Button btnHello;

    ArrayList<Integer> mojaLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

//        btnHello = (Button) findViewById(R.id.main_activity_btn_hello);
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(btnHello.getText().toString().equals("Hello"))
//                btnHello.setText("HWDP");
//                else
//                    btnHello.setText("Hello");
//            }
//        });
    }

    private void initComponents() {
        mojaLista = new ArrayList<Integer>();
        mojaLista.add(1);
        mojaLista.add(2);
        mojaLista.add(3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
