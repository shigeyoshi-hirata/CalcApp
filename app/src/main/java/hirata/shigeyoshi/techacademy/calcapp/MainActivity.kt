package hirata.shigeyoshi.techacademy.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.support.design.widget.Snackbar
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }


    override fun onClick(v: View) {

        if(editText1.length() != 0 && editText2.length() != 0){

            val hajime = 0.00
            val ato = 0.00
            val kekka = 0.00


            if (v.id == R.id.button1) {

                val hajime = editText1.text.toString().toDouble()
                val ato = editText2.text.toString().toDouble()
                val kekka = hajime + ato
                Log.d("UI_PARTS", "$kekka")

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", kekka)
                startActivity(intent)

            } else if (v.id == R.id.button2) {
                val hajime = editText1.text.toString().toDouble()
                val ato = editText2.text.toString().toDouble()
                val kekka = hajime - ato
                Log.d("UI_PARTS", "$kekka")

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", kekka)
                startActivity(intent)

            } else if (v.id == R.id.button3) {

                val hajime = editText1.text.toString().toDouble()
                val ato = editText2.text.toString().toDouble()
                val kekka = hajime * ato
                Log.d("UI_PARTS", "$kekka")

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", kekka)
                startActivity(intent)

            } else if (v.id == R.id.button4) {
                val hajime = editText1.text.toString().toDouble()
                val ato = editText2.text.toString().toDouble()
                val kekka = hajime / ato
                Log.d("UI_PARTS", "$kekka")

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", kekka)
                startActivity(intent)

            }


        } else {
            Snackbar.make(v, "空欄に数値を入力して下さい。", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}
