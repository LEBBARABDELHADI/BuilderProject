package Builders;
import java.awt.Color;

import Product.Jeu;
import Product.Livre;

public class Director {

	
	private ProduitBuilderInterface builder;

	public Director(ProduitBuilderInterface builder) {
		this.builder = builder;
	}
	
	public void makeProduct(){
	    if (builder instanceof JeuBuilder) {
	        Jeu j = new Jeu();
	        ((JeuBuilder) builder).setJeu(j);  // Set the new Jeu object in the builder
	        ((JeuBuilder) builder).setTypeOfGame("Action");
	    } else {
	        Livre l = new Livre();
	        ((LivreBuilder) builder).setLivre(l);  
	        ((LivreBuilder) builder).setNbrOfPages(4);
	    }
		builder.setColor(Color.red);
		builder.setWeight(3);
		builder.setNbrOfProduct(2);
	}
	
	
	
}
