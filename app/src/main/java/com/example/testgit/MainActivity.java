package com.example.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        print();
        Cat c1;
    }

    private void print() {
        Toast.makeText(this, "print", Toast.LENGTH_SHORT).show();
    }
}
