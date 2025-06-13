package com.example.zetshop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zetshop.databinding.ItemrecylermahsulotlarBinding

class MahsulotRecAdapter(var list: ArrayList<Mahsulot>): RecyclerView.Adapter<MahsulotRecAdapter.VH>(){
    inner class VH(  val itemrecylermahsulotlarBinding: ItemrecylermahsulotlarBinding): RecyclerView.ViewHolder(itemrecylermahsulotlarBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH( ItemrecylermahsulotlarBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemrecylermahsulotlarBinding.mahsulottxt.text=list[position].textview
        holder.itemrecylermahsulotlarBinding.mahsulotimg.setImageResource(R.drawable.mahsulot)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}