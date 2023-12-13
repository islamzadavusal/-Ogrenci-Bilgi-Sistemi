package com.islamzada.ogrencibilgisistemi.Gorev_1

class Ogrenci(private val ad: String,private val soyad: String, private val numara: Int) {
    fun ogrenciBilgileri(): String {
        return "Öğrenci Bilgileri: $ad $soyad,\nNumara: $numara"
    }
}