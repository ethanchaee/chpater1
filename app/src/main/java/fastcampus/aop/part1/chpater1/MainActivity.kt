package fastcampus.aop.part1.chpater1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.number_text_view)
        numberTextView.text = number.toString()

        val countUpButton = findViewById<Button>(R.id.button)
        countUpButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
        }

        val resetButton = findViewById<Button>(R.id.button2)
        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
        }
    }
}