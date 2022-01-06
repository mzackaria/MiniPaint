package com.example.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mCanvasView = MyCanvasView(this)
        mCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        mCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(mCanvasView)
    }
}
