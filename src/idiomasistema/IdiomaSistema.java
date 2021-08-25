package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
	
		//metodo para localizar o idioma do SO
		Locale loc = Locale.getDefault();
	       
		System.out.println ("O Idioma do seu sistema � " + loc.getDisplayLanguage()); // imprime "Portugu�s"
	    
		System.out.println ("O Idioma do seu sistema abreviado " + loc.getLanguage()); // imprime "pt"
	    }
	}

