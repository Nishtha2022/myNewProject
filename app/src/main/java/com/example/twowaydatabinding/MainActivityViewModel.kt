package com.example.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.databinding.Bindable

class MainActivityViewModel: ViewModel() {

    var userNumber = MutableLiveData<String>("")
    var result = MutableLiveData<String>("")
    init {
        result.value = ""
        userNumber.value = ""
    }

     fun findResult()
    {
        var number = userNumber.value?.toBigInteger()
        var res = number?.toString(16)
        result.value = res
    }


}