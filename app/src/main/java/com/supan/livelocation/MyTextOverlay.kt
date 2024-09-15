package com.supan.livelocation

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

@SuppressLint("ViewConstructor")
class MyTextOverlay(
    context: Context,
    private var text: String,
    private val viewWidth: Float,
    private val viewHeight: Float
) : View(context) {

    private val paint = Paint().apply {
        color = Color.WHITE
        textSize = 48f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawText(text, viewWidth - 300, 50f, paint)
    }
}
