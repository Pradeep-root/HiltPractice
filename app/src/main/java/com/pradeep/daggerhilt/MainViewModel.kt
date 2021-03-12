package com.pradeep.daggerhilt

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named


class MainViewModel @ViewModelInject constructor(
    @Named("String1") val string1 : String,
    @Named("String2") val string2 : String
) : ViewModel() {


    init {
        Log.d("MainViewModel ", "$string1 - This is in ViewModel ")
        Log.d("MainViewModel ", "$string2 - This is in ViewModel ")
    }
}