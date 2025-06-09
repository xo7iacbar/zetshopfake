package com.example.zetshop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.zetshop.databinding.ItemviewpagerBinding

class ViewPagerAdapter(  var list: ArrayList<String>)  :RecyclerView.Adapter< ViewPagerAdapter.VH>() {
    inner class VH(itemViewPagerBinding: ItemviewpagerBinding) : RecyclerView.ViewHolder(itemViewPagerBinding.root) {

        fun build(photoLink: String) {

        }
    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            return VH(ItemviewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun getItemCount(): Int = list.size

        override fun onBindViewHolder(holder: VH, position: Int) {
            holder.build(list[position])
            if (position==list.size-1)
                runable()
        }
    private fun runable(){
        list.addAll((list))
        notifyDataSetChanged()
    }

    }
