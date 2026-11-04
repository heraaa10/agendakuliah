package com.example.agendakuliah

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class TugasFragment : Fragment(R.layout.fragment_tugas) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnTugas1).setOnClickListener {
            bukaDetail("Laporan Fragment", "Jumat")
        }
        view.findViewById<Button>(R.id.btnTugas2).setOnClickListener {
            bukaDetail("Latihan BottomNav", "Senin")
        }
        view.findViewById<Button>(R.id.btnTugas3).setOnClickListener {
            bukaDetail("Kuis Retrofit", "Rabu")
        }
    }

    private fun bukaDetail(judul: String, batas: String) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, DetailTugasFragment.newInstance(judul, batas))
            .addToBackStack("detail")
            .commit()
    }
}