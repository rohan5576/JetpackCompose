package com.example.tweetsyapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsyapp.repository.TweetRepostory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewMode @Inject constructor(private val repostory: TweetRepostory) : ViewModel() {

    val categories: StateFlow<List<String>>
        get() = repostory.category

    init {
        viewModelScope.launch {
            repostory.getCategories()
        }
    }
}