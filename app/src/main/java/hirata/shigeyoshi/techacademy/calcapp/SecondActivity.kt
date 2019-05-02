package hirata.shigeyoshi.techacademy.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.00)

        Log.d("UI_PARTS", "${value1}")

        textView2.text = "${value1}"

    }
}
