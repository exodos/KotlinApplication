package et.ethiotelecom.application.kotlinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button Was Clicked")

            Toast.makeText(this,"Button was clicked", Toast.LENGTH_SHORT).show()

        }

        btnSendMsgToNextActivity.setOnClickListener {
//            Toast.makeText(this,"Second Button was clicked", Toast.LENGTH_SHORT).show()

            val message :String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
