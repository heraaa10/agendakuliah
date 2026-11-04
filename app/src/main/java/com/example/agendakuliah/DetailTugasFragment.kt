package com.example.agendakuliah

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailTugasFragment : Fragment(R.layout.fragment_detail_tugas) {

    companion object {
        private const val ARG_JUDUL = "judul"
        private const val ARG_BATAS = "batas"

        fun newInstance(judul: String, batas: String) = DetailTugasFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_JUDUL, judul)
                putString(ARG_BATAS, batas)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val judul = arguments?.getString(ARG_JUDUL).orEmpty()
        val batas = arguments?.getString(ARG_BATAS).orEmpty()

        view.findViewById<TextView>(R.id.tvJudulDetail).text = judul
        view.findViewById<TextView>(R.id.tvBatasDetail).text = "Batas: $batas"

        view.findViewById<Button>(R.id.btnKembali).setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}