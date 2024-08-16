package com.example.tweetsyapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsyapp.model.TweetListItem
import com.example.tweetsyapp.repository.TweetRepostory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val repostory: TweetRepostory) : ViewModel() {

    val tweets: StateFlow<List<TweetListItem>>
        get() = repostory.tweets

    init {
        viewModelScope.launch {
            repostory.getTweets("motivation")
        }
    }
}