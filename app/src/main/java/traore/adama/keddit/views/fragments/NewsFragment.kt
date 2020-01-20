package traore.adama.keddit.views.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import traore.adama.keddit.R
import traore.adama.keddit.tools.inflate
import kotlinx.android.synthetic.main.news_fragment.*
import traore.adama.keddit.models.RedditNewsItem
import traore.adama.keddit.tools.adapter.NewsAdapter

public class NewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.inflate(R.layout.news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        rcvNews.setHasFixedSize(true)
        rcvNews.layoutManager = LinearLayoutManager(context)

        initAdapter()

        if (savedInstanceState == null) {
            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(
                    RedditNewsItem(
                        "author$i",
                        "title$i",
                        i,
                        1457207701L - i * 200,
                        "https://picsum.photos/200/200?image=$i",
                        "url"
                    )
                )
            }
            (rcvNews.adapter as NewsAdapter).addNews(news)
        }
    }

    private fun initAdapter() {
        if (rcvNews.adapter == null) {
            rcvNews.adapter = NewsAdapter()
        }
    }
}