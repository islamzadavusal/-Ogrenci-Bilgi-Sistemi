package com.islamzada.ogrencibilgisistemi.Gorev_3

import com.islamzada.ogrencibilgisistemi.Gorev_1.Ogrenci
import com.islamzada.ogrencibilgisistemi.Gorev_2.DersSinifi
class OgrenciBilgiSistemi {

    private val ogrenciler = mutableListOf<Ogrenci>()
    private val dersler = mutableListOf<DersSinifi>()
    fun ogrenciEkle(ogrenci: Ogrenci) {
        ogrenciler.add(ogrenci)
    }
    fun dersEkle(ders: DersSinifi) {
        dersler.add(ders)
    }
    fun ogrenciBilgileriniGoster() {
        for (ogrenci in ogrenciler) {
            println(ogrenci.ogrenciBilgileri())
        }
    }
    fun dersBilgileriniGoster() {
        for (ders in dersler) {
            println(ders.dersBilgileri())

        }
    }
}