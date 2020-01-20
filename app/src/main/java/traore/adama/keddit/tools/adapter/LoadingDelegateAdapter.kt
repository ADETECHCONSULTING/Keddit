package traore.adama.keddit.tools.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import traore.adama.keddit.R
import traore.adama.keddit.tools.`interface`.ViewType
import traore.adama.keddit.tools.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        parent.inflate(R.layout.news_item_loading))
}