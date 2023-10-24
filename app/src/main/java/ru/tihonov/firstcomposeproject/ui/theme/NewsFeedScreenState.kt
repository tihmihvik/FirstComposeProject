package ru.tihonov.firstcomposeproject.ui.theme

import ru.tihonov.firstcomposeproject.domain.FeedPost

sealed class NewsFeedScreenState {

    object Initial : NewsFeedScreenState()

    data class Posts(val posts: List<FeedPost>) : NewsFeedScreenState()
}
