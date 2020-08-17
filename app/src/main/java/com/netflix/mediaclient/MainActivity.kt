package com.netflix.mediaclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button : Button = findViewById(R.id.veli)

        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"HELLO",Toast.LENGTH_LONG).show()
        })
    }
}
