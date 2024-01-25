package kr.co.fastcampus.part4plus.restaurant.features.feed.presentation.input

interface IFeedViewModelInput {
    fun openDetail(id: Int)
    fun openInfoDialog()
    fun refreshFeed()
}
