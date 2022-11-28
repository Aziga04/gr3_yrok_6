package com.example.gr3_yrok_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gr3_yrok_6.databinding.ItemMainBinding




class MainAdapter (
    var mainList: ArrayList<Main>,
    var onClick: (position: Int) -> Unit
):
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(private val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {

            itemView.setOnClickListener {
                onClick(adapterPosition)
            }

            val item = mainList[adapterPosition]
            binding.apply {
                imagee.loadImage(item.image!!)
                tvPlaying.text = item.playing
                tvNamePl.text = item.name
                tvAuthor.text = item.author
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) = holder.bind()

    override fun getItemCount(): Int = mainList.size

}