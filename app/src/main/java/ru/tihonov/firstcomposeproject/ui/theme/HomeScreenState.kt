package ru.tihonov.firstcomposeproject.ui.theme

import ru.tihonov.firstcomposeproject.domain.FeedPost
import ru.tihonov.firstcomposeproject.domain.PostComment

sealed class HomeScreenState {

    object Initial: HomeScreenState()

    data class Posts(val posts: List<FeedPost>) : HomeScreenState()

    data class Comments(val feedPost: FeedPost, val comments: List<PostComment>) : HomeScreenState()
}
