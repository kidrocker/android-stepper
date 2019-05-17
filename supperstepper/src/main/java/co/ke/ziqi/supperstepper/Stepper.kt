package co.ke.ziqi.supperstepper

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class Stepper  : View {
    private var  mContext:Context? = null
    private var stepperType:Enum? = null
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        mContext = context
        stepperType = attrs.

    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    )

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        Stepper()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
    }
}
