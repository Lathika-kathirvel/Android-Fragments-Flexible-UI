package com.example.madlab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
    private val itemList: List<Item>,
    private val listener: (Item) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.text_item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.title.text = item.title

        holder.itemView.setOnClickListener {
            // --------------------------------------------------------------
            // PLACE THE CONDITIONAL BREAKPOINT ON THE LINE BELOW.
            // Right-click the breakpoint marker -> Condition:
            //      item.title == "Android"
            // Execution will pause here ONLY when the "Android" row is
            // tapped; taps on any other row will not suspend the app.
            // --------------------------------------------------------------
            listener(item)
        }
    }

    override fun getItemCount(): Int = itemList.size
}