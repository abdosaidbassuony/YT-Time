package com.example.gulftech_androidtask.util

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.openFragment(
    @IdRes containerViewId: Int,
    fragment: Fragment,
    addToBackStack: Boolean = false,
    tag: String? = null
): Fragment {
    return fragment.also {
        supportFragmentManager.beginTransaction().apply {
            replace(containerViewId, it, tag)
            if (addToBackStack) {
                addToBackStack(null)
            }
            commit()
        }
    }
}