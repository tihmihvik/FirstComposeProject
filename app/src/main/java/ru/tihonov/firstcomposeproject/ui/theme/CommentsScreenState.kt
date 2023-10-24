package ru.tihonov.firstcomposeproject.ui.theme

import ru.tihonov.firstcomposeproject.domain.FeedPost
import ru.tihonov.firstcomposeproject.domain.PostComment

sealed class CommentsScreenState {

    object Initial : CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>
    ) : CommentsScreenState()
}
