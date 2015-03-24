package com.example.shinjiung.calculator_v1;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private EditText textValue1;
    private EditText textValue2;
    private EditText resultValue;
    private int value1;
    private int value2;
    private float result;
    private int check = 0;
    private Button button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button0, button_mod, button_div, button_add, button_sub, button_mult, button_equal, button_dot, button_c, button_del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        button_mod = (Button) findViewById(R.id.button_mod);
        button_div = (Button) findViewById(R.id.button_div);
        button_add = (Button) findViewById(R.id.button_add);
        button_sub = (Button) findViewById(R.id.button_sub);
        button_mult = (Button) findViewById(R.id.button_mult);
        button_equal = (Button) findViewById(R.id.button_equal);
        button_dot = (Button) findViewById(R.id.button_dot);
        button_c = (Button) findViewById(R.id.button_c);
        button_del = (Button) findViewById(R.id.button_del);

        textValue1 = (EditText) findViewById(R.id.firstValue);
        textValue2 = (EditText) findViewById(R.id.secondValue);
        resultValue = (EditText) findViewById(R.id.result);


        OnClickListener cl = new OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                if (v == button_c) {
                    textValue1.setText("");
                    textValue2.setText("");
                    resultValue.setText("");
                    check = 0;

                }
                else if (v == button_del) {
                    if (check == 0) {
                        if (textValue1.getText().length() != 0) {
                            textValue1.setText(textValue1.getText().subSequence(0, textValue1.getText().length() - 1));
                        }
                    } else {
                        if (textValue2.getText().length() != 0) {
                            textValue2.setText(textValue2.getText().subSequence(0, textValue2.getText().length() - 1));
                        }
                    }

                }
                else if( v == button_mod) {
                    check = 1;  // mod =1
                }
                else if( v == button_div) {
                    check = 2;  // div =2
                }
                else if( v == button_add) {
                    check = 3;  // add =3
                }
                else if( v == button_sub) {
                    check = 4;  // sub =4
                }
                else if( v == button_mult) {
                    check = 5;  // mult =5
                }
                else if( v == button_dot) {
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+".");
                    else
                        textValue2.setText(textValue2.getText().toString()+".");

                }
                else if(v==button1){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+1);
                    else
                        textValue2.setText(textValue2.getText().toString()+1);
                }
                else if(v==button2){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+2);
                    else
                        textValue2.setText(textValue2.getText().toString()+2);
                }
                else if(v==button3){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+3);
                    else
                        textValue2.setText(textValue2.getText().toString()+3);
                }
                else if(v==button4){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+4);
                    else
                        textValue2.setText(textValue2.getText().toString()+4);
                }
                else if(v==button5){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+5);
                    else
                        textValue2.setText(textValue2.getText().toString()+5);
                }
                else if(v==button6){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+6);
                    else
                        textValue2.setText(textValue2.getText().toString()+6);
                }
                else if(v==button7){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+7);
                    else
                        textValue2.setText(textValue2.getText().toString()+7);
                }
                else if(v==button8){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+8);
                    else
                        textValue2.setText(textValue2.getText().toString()+8);
                }
                else if(v==button9){
                    if(check == 0)
                        textValue1.setText(textValue1.getText().toString()+9);
                    else
                        textValue2.setText(textValue2.getText().toString()+9);
                }
                else if(v==button0){
                    if(check == 0)
                    {
                        if(textValue1.getText().toString() != "0") {
                            textValue1.setText(textValue1.getText().toString() + 0);
                        }
                    }

                    else
                    {
                        if(textValue2.getText().toString() != "0") {
                            textValue2.setText(textValue2.getText().toString() + 0);
                        }
                    }
                }



                else if (v==button_equal){
                    if(check==1){

                        result = Float.parseFloat(textValue1.getText().toString().trim()) % Float.parseFloat((textValue2.getText().toString().trim()));

                        resultValue.setText(Float.toString(result));

                    }
                    if(check==2){

                        result = Float.parseFloat(textValue1.getText().toString().trim()) / Float.parseFloat((textValue2.getText().toString().trim()));

                        resultValue.setText(Float.toString(result));

                    }
                    if(check==3){

                        result = Float.parseFloat(textValue1.getText().toString().trim()) + Float.parseFloat((textValue2.getText().toString().trim()));

                        resultValue.setText(Float.toString(result));

                    }
                    if(check==4){

                        result = Float.parseFloat(textValue1.getText().toString().trim()) - Float.parseFloat((textValue2.getText().toString().trim()));

                        resultValue.setText(Float.toString(result));

                    }
                    if(check==5){

                        result = Float.parseFloat(textValue1.getText().toString().trim()) * Float.parseFloat((textValue2.getText().toString().trim()));

                        resultValue.setText(Float.toString(result));

                    }

                }



                /*

                else if (v==button_equal){
                    if(check==1){

                        result = Float.parseFloat(textValue1.getText().toString().trim()) % Float.parseFloat((textValue2.getText().toString().trim()));

                        resultValue.setText(Float.toString(result));

                    }
                    if(check==2){

                        result = Integer.valueOf(textValue1.getText().toString().trim()) / Integer.valueOf(textValue2.getText().toString().trim());

                        resultValue.setText(Integer.toString(result));

                    }
                    if(check==3){

                        result = Integer.valueOf(textValue1.getText().toString().trim()) + Integer.valueOf(textValue2.getText().toString().trim());

                        resultValue.setText(Integer.toString(result));

                    }
                    if(check==4){

                        result = Integer.valueOf(textValue1.getText().toString().trim()) - Integer.valueOf(textValue2.getText().toString().trim());

                        resultValue.setText(Integer.toString(result));

                    }
                    if(check==5){

                        result = Integer.valueOf(textValue1.getText().toString().trim()) * Integer.valueOf(textValue2.getText().toString().trim());

                        resultValue.setText(Integer.toString(result));

                    }

                }*/
            }
        };
        button1.setOnClickListener(cl);

        button2.setOnClickListener(cl);

        button3.setOnClickListener(cl);

        button4.setOnClickListener(cl);

        button5.setOnClickListener(cl);

        button6.setOnClickListener(cl);

        button7.setOnClickListener(cl);

        button8.setOnClickListener(cl);

        button9.setOnClickListener(cl);

        button0.setOnClickListener(cl);

        button_add.setOnClickListener(cl);

        button_c.setOnClickListener(cl);

        button_del.setOnClickListener(cl);

        button_div.setOnClickListener(cl);

        button_dot.setOnClickListener(cl);

        button_equal.setOnClickListener(cl);
        button_mod.setOnClickListener(cl);
        button_mult.setOnClickListener(cl);
        button_sub.setOnClickListener(cl);
    }
}
    /*
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
    */
    /**
     * A placeholder fragment containing a simple view.
     */
    /*
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }*/
