package com.example.rohan.hellotoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int mCount=0;
    private TextView mShowCount;
    String msg="Count is: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView)findViewById(R.id.show_count);
    }
    public void countUp(View view){
        mCount++;
        if(mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
    }

     public void ShowToast(View view){
    Toast toast=Toast.makeText(this,msg+mCount, Toast.LENGTH_LONG);
    toast.show();

    }
}
