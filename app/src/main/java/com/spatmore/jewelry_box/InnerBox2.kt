package com.spatmore.jewelry_box

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.box.*
import kotlinx.android.synthetic.main.box.view.*

class InnerBox2 @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        setBackgroundResource(R.drawable.box_border)
        setPadding(40, 40, 40, 40)

        addView(InnerBox3(context), ViewGroup.LayoutParams(200, 200))
    }
}