package erk5.github.io.weatherapp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import erk5.github.io.weatherapp.Greeting
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val scope = CoroutineScope(Job() + Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        scope.launch {
            tv.text = Greeting().greeting()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.coroutineContext.cancelChildren()
    }
}
