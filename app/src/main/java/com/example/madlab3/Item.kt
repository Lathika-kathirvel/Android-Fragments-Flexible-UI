package com.example.madlab3

import java.io.Serializable

/**
 * Simple data model representing a course/item shown in the list
 * and later in the detail screen.
 */
data class Item(
    val id: Int,
    val title: String,
    val description: String
) : Serializable