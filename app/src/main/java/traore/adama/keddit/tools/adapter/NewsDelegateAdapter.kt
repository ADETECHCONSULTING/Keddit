package traore.adama.keddit.tools.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_item.view.*
import traore.adama.keddit.R
import traore.adama.keddit.models.RedditNewsItem
import traore.adama.keddit.tools.`interface`.ViewType
import traore.adama.keddit.tools.getFriendlyTime
import traore.adama.keddit.tools.inflate
import traore.adama.keddit.tools.loadImg

class NewsDelegateAdapter: ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class NewsViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(parent.inflate(R.layout.news_item)) {
        fun bind(item: RedditNewsItem) = with(itemView) {
            imgThumbnail.loadImg(item.thumbnail)
            txvAuthor.text = item.author
            txvTitle.text = item.title
            txvComment.text = "${item.numComment} comments"
            txvTime.text = item.created.getFriendlyTime()
        }
    }

}