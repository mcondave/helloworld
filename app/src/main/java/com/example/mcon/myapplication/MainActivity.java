package com.example.mcon.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butt = (Button) findViewById(R.id.button1);
        Button butt2 = (Button) findViewById(R.id.button2);
        TextView text = (TextView) findViewById(R.id.text);
        //((TextView) findViewById(R.id.text)).setText("Yo hey test");
        butt.setOnClickListener(new View.OnClickListener() {
            String hello = getResources().getString(R.string.Hello);
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.text);
                text.setText(text.getText() + hello);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            String world = getResources().getString(R.string.World);
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.text);
                text.setText(text.getText() + world);
            }
        });
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
