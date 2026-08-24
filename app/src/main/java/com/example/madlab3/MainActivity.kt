package com.example.madlab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), ItemListFragment.OnItemSelectedListener {

    private var twoPane: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // detail_container only exists in res/layout-sw600dp/activity_main.xml
        // (large screens / tablets). Its absence means we're on a phone.
        twoPane = findViewById<android.view.View?>(R.id.detail_container) != null

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.list_container, ItemListFragment())
                .commit()
        }
    }

    override fun onItemSelected(item: Item) {
        val detailFragment = DetailFragment.newInstance(item)

        if (twoPane) {
            // Tablet / large screen: swap the detail pane in place, list stays visible.
            supportFragmentManager.beginTransaction()
                .replace(R.id.detail_container, detailFragment)
                .commit()
        } else {
            // Phone: navigate forward, replacing the list with the detail
            // screen, and push onto the back stack so Back returns to the list.
            supportFragmentManager.beginTransaction()
                .replace(R.id.list_container, detailFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}