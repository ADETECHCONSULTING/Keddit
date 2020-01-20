package traore.adama.keddit.models

import traore.adama.keddit.tools.AdapterConstants
import traore.adama.keddit.tools.`interface`.ViewType

data class RedditNewsItem(
    val author: String,
    val title: String,
    val numComment: Int,
    val created: Long,
    val thumbnail: String,
    val url: String,
    val description: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}