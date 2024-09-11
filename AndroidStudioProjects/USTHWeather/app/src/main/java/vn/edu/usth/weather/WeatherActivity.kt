package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class WeatherActivity : AppCompatActivity() {

    private val TAG = "WeatherActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        Log.i(TAG, "onCreate được gọi")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart được gọi")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume được gọi")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause được gọi")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop được gọi")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy được gọi")
    }
}