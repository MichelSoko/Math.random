package app;

public class MathRandomApp {

	public static void main(String[] args) {
	
		// génère un nombre décimal entre 0 et 1
		double rand0 = Math.random();
		System.out.println("Math.random() vierge : " + rand0);
		
		// génère un nombre entier entre 0 et 1
		int rand1 = (int) (Math.random() * 1.99);
		System.out.println("0 ou 1 : " + rand1);
		
		// génère un entier entre 0 et 1000
		int ampleur = 1000;
		int rand2 = (int) (Math.random() * ampleur);
		System.out.println("Entre 0 et 1000 : " + rand2);
		
		// génére un entier entre 10000 et 99999
		int codepostal = (int) (10000 + Math.random() * 89999);
		System.out.println("codepostal : " + codepostal);
		
		// génère un entier entre 100k et 1M
		int inhabitants = (int) (100000 + Math.random() * 900000);
		System.out.println("inhabitants : " + inhabitants);
		
		// génère un numéro de téléphone portable français
		String phone = "0" + (int) (6 + Math.random() * 1.9999) + (int) (10000000 + Math.random() * 90000000);
		System.out.println("phone : " + phone);

	}

}
