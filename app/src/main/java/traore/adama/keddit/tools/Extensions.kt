@file:JvmName("ExtensionsUtils") //if we want to use it in Java
package traore.adama.keddit.tools

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(layoutId: Int, toAttach: Boolean = false) : View{
    return LayoutInflater.from(context).inflate(layoutId, this, toAttach)
}