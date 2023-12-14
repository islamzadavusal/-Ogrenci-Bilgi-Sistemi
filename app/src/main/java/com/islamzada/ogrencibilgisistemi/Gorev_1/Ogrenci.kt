package com.islamzada.ogrencibilgisistemi.Gorev_1

data class Ogrenci(val ad: String,val soyad: String, val numara: Int) {
    fun ogrenciBilgileri(): String {
        return "Öğrenci Bilgileri: $ad $soyad,\nNumara: $numara"
    }
}