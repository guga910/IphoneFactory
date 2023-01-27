package com.fabrica.iphone.aparelhos;

import com.fabrica.iphone.modelo.TypeIphoneEnum;

public class IphoneFactory2 {
	
	public static void  factory( TypeIphoneEnum typeIphone) {
		if(typeIphone.equals(TypeIphoneEnum.IPHONE13MINI)) {
			new Iphone13Mini().ligar(TypeIphoneEnum.IPHONE13MINI);
		}
		if(typeIphone.equals(TypeIphoneEnum.IPHONE9)) {
			new Iphone9().ligar(TypeIphoneEnum.IPHONE9);
		}
		if(typeIphone.equals(TypeIphoneEnum.IPHONEX)) {
			new IphoneX().ligar(TypeIphoneEnum.IPHONEX);
		}
		
		
	}

}
