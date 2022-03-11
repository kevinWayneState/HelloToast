package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_COUNT = "com.example.android.HelloToast.COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(String.format(Locale.ENGLISH, "%d", mCount));
    }

    public void showHelloCount(View view) {
        /**
         * An intent is an object that provides runtime between separate components, such as two activities.
         * The intent represents an app's intent to do something.
         * You can use intents for a wide range of tasks, but here we're using it to start another activity
         */
        Intent intent = new Intent(this, HelloCountActivity.class); /** Declare new intent from MainActivity to HelloCountActivity */
        /**
         * The putExtra() method adds the value of mShowCount to the intent
         * An intent can carry data types as key-value pairs called extras
         * The key is a public constant called "GLOBAL_COUNT" because the next activity uses that key to receive the text value.
         */
        intent.putExtra(EXTRA_COUNT, mCount); /** Send the string value of TextView mShowCount, and call it globalCount */
        startActivity(intent);
    }
}