package com.codingpizza.daggertest.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codingpizza.daggertest.data.DummyService
import javax.inject.Inject

class DashboardViewModel @Inject constructor(dummyService: DummyService): ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment ${dummyService.returnData()}"
    }
    val text: LiveData<String> = _text
}