package com.fabrica.iphone;

import com.fabrica.iphone.aparelhos.Iphone13Mini;
import com.fabrica.iphone.aparelhos.Iphone9;
import com.fabrica.iphone.aparelhos.IphoneX;

public class IphoneFactory {
	public static void main(String[] args) {

		TypeIphoneEnum type = TypeIphoneEnum.IPHONE9;

		switch (type) {
		case IPHONE13MINI: 
			new Iphone13Mini().ligar();
		break;
		case IPHONE9:
			new Iphone9().ligar();
			break;
		case IPHONEX:
			new IphoneX().ligar();
			break;
		}
		;

	}
}
