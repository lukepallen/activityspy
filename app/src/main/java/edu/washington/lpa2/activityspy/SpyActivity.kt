package edu.washington.lpa2.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SpyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spy)
        Log.i(this::class.java.simpleName, "onCreate event fired")
    }

    override fun onDestroy() {
        Log.e(this::class.java.simpleName, "We’re going down, Captain!")
        super.onDestroy()
    }
}
