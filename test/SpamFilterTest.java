import SpamFilter.SpamFilter;

public class SpamFilterTest {

	public static void main(final String[] args) {
		final String spamWords = "sex, viagra, cialis,one million, you've won, nigeria, sexo, ganaste, un millón, has ganado";
		final double thresHold = 0.1;
		final SpamFilter spamFilter = new SpamFilter(spamWords, thresHold);
		final String validString = "Hola hola hola";
		final String validString2 = "Gol Gol Sex Gol Gol Betis Fekir Panda Sabaly Rui Silva Sergio Canales";
		final String notValidString = "VIAGRA";
		final String notValidString2 = "Sex Gol Gol";
		final String notValidString3 = "Gol Gol one million";
		final String notValidString7 = "Vaya golazo del señor SEXO CANALES de chilena";
		final String notValidString8 = "Este verano sacamos pasta por don nabil Fekir Fekir Fekir Fekir";
		final String notValidString9 = "You've won against NIGERIA NIGERIA NIGERIA siu";
		final String notValidString10 = "Este filtro anti-spam es un millón un millón un millón ";
		final String notValidString11 = "sex sex sex sex sex sex sex sex sex ";
		final String notValidString12 = "NIGERIA está lleno de contrabando de viagra ";
		final String notValidString13 = "viva la cialis y la madre que la parió ";
		final String notValidString14 = "Ayer me chuté una buena jeringa que me produjo cialis y no veas que bien";

		System.out.print("La cadena: " + validString + (spamFilter.isSpam(validString) ? " No es valida" + "\n" : " Es valida \n"));
		System.out.print("La cadena: " + validString2 + (spamFilter.isSpam(validString2) ? " No es valida" + "\n" : " Es valida \n"));
		System.out.print("La cadena: " + notValidString + (spamFilter.isSpam(notValidString) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString2 + (spamFilter.isSpam(notValidString2) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString3 + (spamFilter.isSpam(notValidString3) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString7 + (spamFilter.isSpam(notValidString7) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString8 + (spamFilter.isSpam(notValidString8) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString9 + (spamFilter.isSpam(notValidString9) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString10 + (spamFilter.isSpam(notValidString10) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString11 + (spamFilter.isSpam(notValidString11) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString12 + (spamFilter.isSpam(notValidString12) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString13 + (spamFilter.isSpam(notValidString13) ? " No es valida" + "\n" : " Es valida\n"));
		System.out.print("La cadena: " + notValidString14 + (spamFilter.isSpam(notValidString14) ? " No es valida" + "\n" : " Es valida\n"));
	}

}
