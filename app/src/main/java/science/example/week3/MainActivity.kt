package science.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private var button_calculator1: Button? = null
    private var button_calculator2: Button? = null
    private var button_music1: Button? = null
    private var button_music2: Button? = null
    private var button_facebook1: Button? = null
    private var button_facebook2: Button? = null
    private var button_telegram1: Button? = null
    private var button_telegram2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calculator1 = findViewById<View>(R.id.button_calculator1) as Button
        button_calculator1?.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculatorActivity1::class.java)
            startActivity(intent)
        }

        button_calculator2 = findViewById<View>(R.id.button_calculator2) as Button
        button_calculator2?.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculatorActivity2::class.java)
            startActivity(intent)
        }

        button_music1 = findViewById<View>(R.id.button_music1) as Button
        button_music1?.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicActivity1::class.java)
            startActivity(intent)
        }

        button_music2 = findViewById<View>(R.id.button_music2) as Button
        button_music2?.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicActivity2::class.java)
            startActivity(intent)
        }

        button_facebook1 = findViewById<View>(R.id.button_facebook1) as Button
        button_facebook1?.setOnClickListener {
            val intent = Intent(this@MainActivity, FacebookActivity1::class.java)
            startActivity(intent)
        }

        button_facebook2 = findViewById<View>(R.id.button_facebook2) as Button
        button_facebook2?.setOnClickListener {
            val intent = Intent(this@MainActivity, FacebookActivity2::class.java)
            startActivity(intent)
        }

        button_telegram1 = findViewById<View>(R.id.button_telegram1) as Button
        button_telegram1?.setOnClickListener {
            val intent = Intent(this@MainActivity, TelegramActivity1::class.java)
            startActivity(intent)
        }

        button_telegram2 = findViewById<View>(R.id.button_telegram2) as Button
        button_telegram2?.setOnClickListener {
            val intent = Intent(this@MainActivity, TelegramActivity2::class.java)
            startActivity(intent)
        }
    }
}