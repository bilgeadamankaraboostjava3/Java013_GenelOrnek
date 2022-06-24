package com.muhammet;

import java.util.UUID;

import com.muhammet.repository.MusteriRepository;
import com.muhammet.repository.entity.Musteri;

public class Runner {

	public static void main(String[] args) {
		
		MusteriRepository dbMusteri = new MusteriRepository();
		Musteri musteri = new Musteri();//0X322DD
		musteri.id = UUID.randomUUID().toString();
		musteri.ad= "Ahmet";
		musteri.yas = 34;
		dbMusteri.save(musteri);//0X322DD
		musteri = new  Musteri();//0XEFe
		musteri.id = UUID.randomUUID().toString();
		musteri.ad= "Bahar";
		dbMusteri.save(musteri);//0XEFe
		//dbMusteri.save(musteri);
		dbMusteri.printAll();
	}

}
