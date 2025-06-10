package com.example.zetshop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

import com.example.zetshop.databinding.ItemviewpagerBinding
import com.squareup.picasso.Picasso

class ViewPagerAdapter(  var list: ArrayList<String>,var viewPager2: ViewPager2)  :RecyclerView.Adapter< ViewPagerAdapter.VH>() {
    inner class VH( var itemViewPagerBinding: ItemviewpagerBinding) : RecyclerView.ViewHolder(itemViewPagerBinding.root) {
        fun build(photoLink: String) {
            Picasso.get().load(photoLink).into(itemViewPagerBinding.suratvip)

        }
    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            return VH(ItemviewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun getItemCount(): Int = list.size

        override fun onBindViewHolder(holder: VH, position: Int) {
            holder.build(list[position])
            if (position==list.size-1){
                viewPager2.post(runable())

            }

        }
    private fun runable()= Runnable{
        list.addAll((list))
        notifyDataSetChanged()

    }

    }
