package com.sunilson.firenote.presentation.shared

import android.content.Context
import android.support.v4.content.ContextCompat
import com.sunilson.firenote.R
import com.sunilson.firenote.data.models.*

object Constants {

    fun sortingMethods(context: Context): List<SortingMethod> {
        return listOf(
                SortingMethod(context.resources.getString(R.string.sort_descending_date), R.drawable.ic_mode_edit_black_24dp, ElementComparators.sortByDate(true)),
                SortingMethod(context.resources.getString(R.string.sort_ascending_date), R.drawable.ic_mode_edit_black_24dp, ElementComparators.sortByDate(false)),
                SortingMethod(context.resources.getString(R.string.sort_descending_name), R.drawable.ic_mode_edit_black_24dp, ElementComparators.sortByName(true)),
                SortingMethod(context.resources.getString(R.string.sort_ascending_name), R.drawable.ic_mode_edit_black_24dp, ElementComparators.sortByName(false)),
                SortingMethod(context.resources.getString(R.string.sort_category_name), R.drawable.ic_mode_edit_black_24dp, ElementComparators.sortByCategory())
        )
    }

    fun categories(context: Context): List<Category> {
        return listOf(
                Category(context.getString(R.string.category_business), "business"),
                Category(context.getString(R.string.category_events), "events"),
                Category(context.getString(R.string.category_finances), "finances"),
                Category(context.getString(R.string.category_general), "general"),
                Category(context.getString(R.string.category_hobbies), "hobbies"),
                Category(context.getString(R.string.category_holidays), "holidays"),
                Category(context.getString(R.string.category_project), "project"),
                Category(context.getString(R.string.category_school), "school"),
                Category(context.getString(R.string.category_shopping), "shopping"),
                Category(context.getString(R.string.category_sport), "sport")
        )
    }

    fun colors(context: Context): List<NoteColor> {
        return listOf(
                NoteColor("note_color_1", ContextCompat.getColor(context, R.color.note_color_1)),
                NoteColor("note_color_2", ContextCompat.getColor(context, R.color.note_color_2)),
                NoteColor("note_color_3", ContextCompat.getColor(context, R.color.note_color_3)),
                NoteColor("note_color_4", ContextCompat.getColor(context, R.color.note_color_4)),
                NoteColor("note_color_5", ContextCompat.getColor(context, R.color.note_color_5)),
                NoteColor("note_color_6", ContextCompat.getColor(context, R.color.note_color_6)),
                NoteColor("note_color_7", ContextCompat.getColor(context, R.color.note_color_7)),
                NoteColor("note_color_8", ContextCompat.getColor(context, R.color.note_color_8)),
                NoteColor("note_color_9", ContextCompat.getColor(context, R.color.note_color_9))
        )
    }
}