package com.spatmore.jewelry_box

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import kotlinx.android.synthetic.main.box.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.box)

        container.addView(InnerBox1(baseContext), ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,500))
        container.addView(InnerBox2(baseContext), ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300))
    }
}
