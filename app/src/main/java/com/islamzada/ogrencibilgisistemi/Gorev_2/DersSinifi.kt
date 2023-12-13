package com.islamzada.ogrencibilgisistemi.Gorev_2

class DersSinifi (private val ad: String,private val kredi: Int) {
    fun dersBilgileri(): String {
        return "Ders Bilgileri: $ad,\nKredi: $kredi"
    }
}