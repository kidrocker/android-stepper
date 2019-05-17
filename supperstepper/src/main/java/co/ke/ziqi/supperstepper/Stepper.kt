package co.ke.ziqi.supperstepper

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Stepper : View {
    private var mContext: Context? = null
    private var STEPPER_TYPE:Int=0
    private var STEPPER_COUNT = 3
    private var STEP_COLOR = Color.BLACK
    private var STEP_TIMED = false
    private var STEP_INTERVAL = 0
    private var HEIGHT=0
    private var WIDTH=0
    private var paint:Paint? = null



    constructor(context: Context) : super(context){
        init()
    }

    private fun init() {
        paint = Paint()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.Stepper, 0, 0)

        try {

            STEP_COLOR = typedArray.getColor(R.styleable.Stepper_stepColor, Color.BLACK)
            STEP_TIMED = typedArray.getBoolean(R.styleable.Stepper_stepTimed, false);
            STEP_INTERVAL = typedArray.getInt(R.styleable.Stepper_stepInterval, 0)
            STEPPER_COUNT = typedArray.getInt(R.styleable.Stepper_stepCount, 3)
            STEPPER_TYPE = typedArray.getInt(R.styleable.Stepper_stepperStyle,0)

        } finally {
            typedArray.recycle()
        }
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        mContext = context
        init()

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        WIDTH = w
        HEIGHT = h
    }
}
