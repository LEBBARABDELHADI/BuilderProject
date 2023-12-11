package Client;

import Builders.Director;
import Builders.JeuBuilder;
import Builders.LivreBuilder;
import Product.Jeu;
import Product.Livre;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre = new Livre();
		LivreBuilder b =new LivreBuilder(livre);
		Director d =new Director(b);
		d.makeProduct();
		Livre produit = b.getProduit();
		
		System.out.println(produit);
	}

}
