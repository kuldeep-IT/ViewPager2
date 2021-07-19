package com.peerbitskuldeep.viewpager2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peerbitskuldeep.viewpager2.R
import kotlinx.android.synthetic.main.custom_viewpager.view.*

class ViewPager2Apdater(var imgList: ArrayList<Int>) : RecyclerView.Adapter<ViewPager2Apdater.VPViewHolder>() {

    var list = arrayListOf<Int>()

    init {

        list = imgList

    }

    inner class VPViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VPViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_viewpager,parent,false)
        return VPViewHolder(view)
    }

    override fun onBindViewHolder(holder: VPViewHolder, position: Int) {

        holder.itemView.apply {

            imageView.setImageResource(list[position])

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

}