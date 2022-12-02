package com.feritkeskin.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.feritkeskin.paintapp.PaintView.Companion.colorList
import com.feritkeskin.paintapp.PaintView.Companion.currentBrush
import com.feritkeskin.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val yellowBtn = findViewById<ImageButton>(R.id.yellowColor)
        val greenBtn = findViewById<ImageButton>(R.id.greenColor)
        val whiteBtn = findViewById<ImageButton>(R.id.whiteColor)

        blueBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Mavi", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        redBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Kırmızı", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        yellowBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Sarı", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)
        }

        greenBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Yeşil", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        whiteBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Temizlendi", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color: Int) {
        currentBrush = color
        path = Path()
    }
}