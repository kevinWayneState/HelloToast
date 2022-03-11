package com.example.android;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

public class HelloCountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_count);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent(); /** Declare intent **/
        int countMessage = intent.getIntExtra(MainActivity.EXTRA_COUNT, 0); /** local string countMessage set from GLOBAL_COUNT from MainActivity **/

        // Capture the layout's TextView and set the string as its text
        TextView currentCount = findViewById(R.id.current_count); /** set local variable currentCount from @string/current_count **/
        currentCount.setText(String.valueOf(countMessage)); /** Set currentCount TextView from local string countMessage **/
    }
}
