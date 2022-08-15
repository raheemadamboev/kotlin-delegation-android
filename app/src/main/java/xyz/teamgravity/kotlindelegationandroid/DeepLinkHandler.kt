package xyz.teamgravity.kotlindelegationandroid

import android.app.Activity
import android.content.Intent

interface DeepLinkHandler {
    fun handleDeepLink(activity: Activity, intent: Intent?)
}