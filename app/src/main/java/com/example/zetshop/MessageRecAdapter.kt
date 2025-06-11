package com.example.zetshop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zetshop.databinding.ItemrecyclemessageBinding

class MessageRecAdapter(var list:List<Messagee>):RecyclerView.Adapter<MessageRecAdapter.VH>(){
    inner class VH( var itemrecyclemessageBinding: ItemrecyclemessageBinding):RecyclerView.ViewHolder(itemrecyclemessageBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
      return VH(ItemrecyclemessageBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }


    override fun onBindViewHolder(holder: VH, position: Int) {
   holder.itemrecyclemessageBinding.xabarid.text=list[position].xabar
    }
    override fun getItemCount(): Int {
       return list.size
    }




}
