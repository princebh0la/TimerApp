package com.example.timerapp

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class TimerActivityFragment : com.takisoft.fix.support.v7.preference.PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.prefrences)
    }

    override fun onCreatePreferencesFix(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.prefrences)
    }
}