package com.flywith24.processlifecycle_demo

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

/**
 * @author Flywith24
 * @date   2020/7/1
 * time   9:28
 * description
 */
class ProcessLifecycleObserver : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        //只会调用一次
        Log.i(TAG, "onCreate: ")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.i(TAG, "onResume: ")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.i(TAG, "onPause: ")
    }

    override fun onStart(owner: LifecycleOwner) {
        //进入前台
        Log.i(TAG, "onStart: ")
    }

    override fun onStop(owner: LifecycleOwner) {
        // 进入后台
        Log.i(TAG, "onStop: ")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        // 不会调用
        Log.i(TAG, "onDestroy: ")
    }

    companion object {
        private const val TAG = "TAG"
    }
}