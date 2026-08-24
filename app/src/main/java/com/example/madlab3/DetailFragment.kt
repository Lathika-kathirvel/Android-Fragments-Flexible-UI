package com.example.madlab3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {

    companion object {
        private const val ARG_ID = "arg_id"
        private const val ARG_TITLE = "arg_title"
        private const val ARG_DESCRIPTION = "arg_description"
        private const val TAG = "DetailFragment"

        fun newInstance(item: Item): DetailFragment {
            val fragment = DetailFragment()
            val args = Bundle()
            args.putInt(ARG_ID, item.id)
            args.putString(ARG_TITLE, item.title)
            args.putString(ARG_DESCRIPTION, item.description)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach") // lifecycle checkpoint 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate") // lifecycle checkpoint 2
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // ------------------------------------------------------------------
        // PLACE THE NORMAL BREAKPOINT ON THE LINE BELOW (the "val id = ..."
        // line). When it hits, use the Debug tool window to inspect:
        //   - Variables pane -> id, title, description, savedInstanceState
        //   - Frames pane (call stack) -> trace back through
        //     FragmentManager / FragmentTransaction to MainActivity
        // Then Resume Program (F9) repeatedly to watch onCreate ->
        // onCreateView -> onViewCreated -> onStart -> onResume fire in Logcat.
        // ------------------------------------------------------------------
        val id = arguments?.getInt(ARG_ID) ?: -1
        val title = arguments?.getString(ARG_TITLE) ?: ""
        val description = arguments?.getString(ARG_DESCRIPTION) ?: ""

        Log.d(TAG, "onCreateView id=$id title=$title") // lifecycle checkpoint 3

        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        val titleView = view.findViewById<TextView>(R.id.text_detail_title)
        val descriptionView = view.findViewById<TextView>(R.id.text_detail_description)
        titleView.text = title
        descriptionView.text = description

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated") // lifecycle checkpoint 4
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart") // lifecycle checkpoint 5
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume") // lifecycle checkpoint 6
    }
}