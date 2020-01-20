@file:JvmName("ExtensionsUtils") //if we want to use it in Java
package traore.adama.keddit.tools

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import traore.adama.keddit.R

fun ViewGroup.inflate(layoutId: Int, toAttach: Boolean = false) : View{
    return LayoutInflater.from(context).inflate(layoutId, this, toAttach)
}

fun ImageView.loadImg(imageUrl: String) {
    if(TextUtils.isEmpty(imageUrl)) {
        Picasso.get().load(R.mipmap.ic_launcher).into(this)
    } else {
        Picasso.get().load(imageUrl).into(this)
    }
}