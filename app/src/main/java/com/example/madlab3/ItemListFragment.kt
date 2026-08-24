package com.example.madlab3

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemListFragment : Fragment() {

    fun interface OnItemSelectedListener {
        fun onItemSelected(item: Item)
    }

    private var listener: OnItemSelectedListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // The hosting Activity must implement the callback interface.
        listener = context as? OnItemSelectedListener
            ?: throw RuntimeException("$context must implement OnItemSelectedListener")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_item_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_items)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val items = buildItemList()
        recyclerView.adapter = ItemAdapter(items) { item -> listener?.onItemSelected(item) }
    }

    private fun buildItemList(): List<Item> = listOf(
        Item(1, "Android", "Android is Google's mobile operating system, used to build apps with Activities, Fragments, and Views."),
        Item(2, "Kotlin", "Kotlin is a modern, statically typed language that runs on the JVM and is fully interoperable with Java."),
        Item(3, "Java", "Java is a general-purpose, class-based, object-oriented programming language widely used for Android development."),
        Item(4, "Flutter", "Flutter is Google's UI toolkit for building natively compiled applications from a single Dart codebase."),
        Item(5, "React Native", "React Native lets you build mobile apps using JavaScript and React.")
    )
}