package org.lang;

public class StateDetials {
	private void southIndia() {
		System.out.println("In south India mostly speaks Tamil");
	}

	private void northIndia() {
		System.out.println("In North India speaks Hindi");
	}

	public static void main(String[] args) {
		StateDetials lang = new StateDetials();
		lang.southIndia();
		lang.northIndia();
		LanguageInfo l = new LanguageInfo();
		l.englishLanguage();
		l.hindiLanguage();
		l.tamilLanguage();
	}

}
