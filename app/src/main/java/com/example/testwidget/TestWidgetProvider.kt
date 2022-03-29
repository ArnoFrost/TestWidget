package com.example.testwidget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log

class TestWidgetProvider : AppWidgetProvider() {
    companion object {
        const val TAG = "TestWidgetProvider"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
        Log.d(
            TAG,
            "onReceive() called with: context = $context, intent action = ${intent?.action},extras = ${intent?.extras}"
        )
    }


    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
        Log.d(
            TAG,
            "onUpdate() called with: context = $context, appWidgetManager = $appWidgetManager, appWidgetIds = $appWidgetIds"
        )
    }

    override fun onAppWidgetOptionsChanged(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetId: Int,
        newOptions: Bundle?
    ) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions)
        Log.d(
            TAG,
            "onAppWidgetOptionsChanged() called with: context = $context, appWidgetManager = $appWidgetManager, appWidgetId = $appWidgetId, newOptions = $newOptions"
        )
    }



    override fun onEnabled(context: Context?) {
        super.onEnabled(context)
        Log.d(TAG, "onEnabled() called with: context = $context")
    }
}