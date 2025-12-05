package com.example.projectksver.repository

import com.example.projectksver.room.Siswa
import com.example.projectksver.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)

    //tugas 8

    fun getSiswaStream(id: Int): Flow<Siswa?>

    suspend fun deleteSiswa(siswa: Siswa)

    suspend fun updateSiswa(siswa: Siswa)
}


class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
) : RepositoriSiswa {

    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()

    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)

    //tugas 8

    override fun getSiswaStream(id: Int): Flow<Siswa?> = siswaDao.getSiswa(id)

    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)

    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)
}
