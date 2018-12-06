package com.example.kike.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.kike.hellotoast.extra.MESSAGE";
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        String message = mShowCount.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Hello! \n" + message);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
