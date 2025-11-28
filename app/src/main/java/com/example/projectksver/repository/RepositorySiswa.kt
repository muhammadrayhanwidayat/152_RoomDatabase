package com.example.projectksver.repository



interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
