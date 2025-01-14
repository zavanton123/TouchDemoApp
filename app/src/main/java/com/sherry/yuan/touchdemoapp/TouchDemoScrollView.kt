package com.sherry.yuan.touchdemoapp

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.ScrollView

class TouchDemoScrollView(
    context: Context,
    attrs: AttributeSet? = null
) : ScrollView(context, attrs) {

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            context = context,
            action = ev.action,
            viewName = VIEW_NAME,
            function =  "dispatchTouchEvent",
        )
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            context = context,
            action = ev.action,
            viewName = VIEW_NAME,
            function =  "onInterceptTouchEvent",
        )
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            context = context,
            action = event.action,
            viewName = VIEW_NAME,
            function =  "onTouchEvent",
        )
        return super.onTouchEvent(event)
    }

    companion object {
        private const val VIEW_NAME = "TouchDemoScrollView"
    }
}
