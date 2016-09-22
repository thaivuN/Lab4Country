package com.example.mdthai.lab4countries;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCallMap(View view)
    {
        Uri geoLocation = Uri.parse("geo:0,0?q="+ getString(R.string.country));
        Intent intent = new Intent(Intent.ACTION_VIEW);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);

    }
}
