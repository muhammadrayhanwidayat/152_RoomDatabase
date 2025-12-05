package com.example.projectksver.viewmodel.provider

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.projectksver.repository.AplikasiSiswa
import com.example.projectksver.viewmodel.EntryViewModel
import com.example.projectksver.viewmodel.HomeViewModel

object PenyediaViewModel {

    val Factory = viewModelFactory {

        // --- HomeViewModel ---
        initializer {
            HomeViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        // --- EntryViewModel ---
        initializer {
            EntryViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa {
    return (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
}