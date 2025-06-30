package com.example.zetshop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zetshop.databinding.ItemrecylersavatBinding

class SavatRecAdapter2(var list: ArrayList<Savat>): RecyclerView.Adapter<SavatRecAdapter2.VH>(){
    inner class VH(  val itemrecylersavatBinding: ItemrecylersavatBinding): RecyclerView.ViewHolder(itemrecylersavatBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH( ItemrecylersavatBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemrecylersavatBinding.mahsulottexti.text=list[position].mahsulottexti
        holder.itemrecylersavatBinding.mahsulotimgagesi.setImageResource(R.drawable.mahsulot)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}