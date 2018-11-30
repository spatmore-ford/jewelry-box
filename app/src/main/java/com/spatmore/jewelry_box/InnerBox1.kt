package com.spatmore.jewelry_box

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class InnerBox1 @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        setBackgroundResource(R.drawable.box_border)
    }
}