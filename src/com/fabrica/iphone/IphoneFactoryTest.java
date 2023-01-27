package com.fabrica.iphone;

import com.fabrica.iphone.aparelhos.Iphone13Mini;
import com.fabrica.iphone.aparelhos.Iphone9;
import com.fabrica.iphone.aparelhos.IphoneFactory2;
import com.fabrica.iphone.aparelhos.IphoneX;
import com.fabrica.iphone.modelo.TypeIphoneEnum;

public class IphoneFactoryTest {
	public static void main(String[] args) {

		TypeIphoneEnum type = TypeIphoneEnum.IPHONE13MINI;
		
		
		
		
		IphoneFactory2.factory(type);
		
		
		System.out.println();

		switch (type) {
		case IPHONE13MINI: 
			new Iphone13Mini().ligar(TypeIphoneEnum.IPHONE13MINI);
		break;
		case IPHONE9:
			new Iphone9().ligar(TypeIphoneEnum.IPHONE9);
			break;
		case IPHONEX:
			new IphoneX().ligar(TypeIphoneEnum.IPHONEX);
			break;
		};

	}
}
