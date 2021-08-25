package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
	
		//metodo para localizar o idioma do SO
		Locale loc = Locale.getDefault();
	       
		System.out.println ("O Idioma do seu sistema é " + loc.getDisplayLanguage()); // imprime "Português"
	    
		System.out.println ("O Idioma do seu sistema abreviado " + loc.getLanguage()); // imprime "pt"
	    }
	}

