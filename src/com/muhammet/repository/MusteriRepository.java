package com.muhammet.repository;

import com.muhammet.repository.entity.Musteri;
import com.muhammet.utility.DataBase;

public class MusteriRepository {

	private int sayac =0;
	
	/**
	 * Müþetri sýnýfý tipide bir müþteri nesnesi talep eder.
	 * @param musteri
	 */
	public void save(Musteri musteri) {
		DataBase.musteriListesi[sayac]= musteri;
		sayac++;
	}
	
	public void printAll() {
		for(Musteri musteri: DataBase.musteriListesi) {
			//if(musteri.ad.contains("a"))
			System.out.println("id....: "+musteri.id);
			System.out.println("ad....: "+musteri.ad);
			System.out.println("adres.: "+musteri.adres);
			System.out.println("tel...: "+musteri.telefon);
			System.out.println("yas...: "+musteri.yas);
			System.out.println("-------------------------------------");
		}
	}
	
	public void toplam(int s1,int s2) {
		int toplami = s1+s2;
	}
}
