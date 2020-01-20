package traore.adama.keddit.tools.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import traore.adama.keddit.tools.`interface`.ViewType

interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}