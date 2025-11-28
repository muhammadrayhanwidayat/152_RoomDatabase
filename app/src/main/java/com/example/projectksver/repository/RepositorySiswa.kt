package com.example.projectksver.repository



interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}


class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
)