package com.codingpizza.daggertest.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codingpizza.daggertest.data.DummyService
import javax.inject.Inject

class HomeViewModel @Inject constructor(dummyService: DummyService): ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment ${dummyService.returnData()}"
    }
    val text: LiveData<String> = _text
}