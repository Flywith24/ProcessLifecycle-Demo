package com.flywith24.processlifecycle_demo

import android.app.Application
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ProcessLifecycleOwner

/**
 * @author Flywith24
 * @date   2020/7/1
 * time   9:26
 * description
 */
class App : Application() {

    private val processLifecycleObserver by lazy { ProcessLifecycleObserver() }
    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(processLifecycleObserver)
    }

    companion object {
        val isForeground
            get() = ProcessLifecycleOwner.get().lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)
    }
}