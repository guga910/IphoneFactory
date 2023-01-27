package com.fabrica.iphone.aparelhos;

import com.fabrica.iphone.modelo.Iphone;
import com.fabrica.iphone.modelo.TypeIphoneEnum;

public class Iphone9 implements Iphone{
	
	@Override
	public void ligar(TypeIphoneEnum type) {
		System.out.println("Ligando meu "+type);
		
	}

	@Override
	public void desligar(TypeIphoneEnum type) {
		System.out.println("Desligando meu "+type);
		
	}

}
