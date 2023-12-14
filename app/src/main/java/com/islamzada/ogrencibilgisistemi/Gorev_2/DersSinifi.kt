package com.islamzada.ogrencibilgisistemi.Gorev_2

data class DersSinifi (val ad: String, val kredi: Int) {
    fun dersBilgileri(): String {
        return "Ders Bilgileri: $ad,\nKredi: $kredi"
    }
}