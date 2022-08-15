package xyz.teamgravity.kotlindelegationandroid

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class AnalyticsLoggerImp : AnalyticsLogger, LifecycleEventObserver {

    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event) {
            Lifecycle.Event.ON_START -> println("raheem: onStart()")
            Lifecycle.Event.ON_RESUME -> println("raheem: onResume()")
            Lifecycle.Event.ON_PAUSE -> println("raheem: onPause()")
            Lifecycle.Event.ON_STOP -> println("raheem: onStop()")
            else -> Unit
        }
    }
}