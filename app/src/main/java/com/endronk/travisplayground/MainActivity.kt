package com.endronk.travisplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iteratehq.iterate.Iterate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Iterate.dismissed()
    }
}
