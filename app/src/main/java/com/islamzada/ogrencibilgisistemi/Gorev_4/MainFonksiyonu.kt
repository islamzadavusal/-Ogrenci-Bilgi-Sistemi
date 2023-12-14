package com.islamzada.ogrencibilgisistemi.Gorev_4

import com.islamzada.ogrencibilgisistemi.Gorev_1.Ogrenci
import com.islamzada.ogrencibilgisistemi.Gorev_2.DersSinifi
import com.islamzada.ogrencibilgisistemi.Gorev_3.OgrenciBilgiSistemi
fun main() {

    val ogrenci1 = Ogrenci("Vusal", "Islamzada", 13)
    val ogrenci2 = Ogrenci("Murad", "Haciyev", 25)

    val ders1 = DersSinifi("Matematik", 10)
    val ders2 = DersSinifi("Fizik", 8)

    val bilgisistemi = OgrenciBilgiSistemi()

    bilgisistemi.ogrenciEkle(ogrenci1)
    bilgisistemi.ogrenciEkle(ogrenci2)

    bilgisistemi.dersEkle(ders1)
    bilgisistemi.dersEkle(ders2)

    bilgisistemi.ogrenciBilgileriniGoster()
    bilgisistemi.dersBilgileriniGoster()
}