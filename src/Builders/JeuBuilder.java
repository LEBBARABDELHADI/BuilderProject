package Builders;

import java.awt.Color;

import Product.Jeu;
import Product.Livre;

public class JeuBuilder implements ProduitBuilderInterface {

    private Jeu jeu;

    // Constructor with a Jeu object
    public JeuBuilder(Jeu jeu) {
        this.jeu = jeu;
    }

    // Default constructor
    public JeuBuilder() {
        this.jeu = new Jeu();  // Initialize the jeu object
    }

    @Override
    public void setColor(Color color) {
        jeu.setColor(color);
    }

    @Override
    public void setWeight(int weight) {
        jeu.setWeight(weight);
    }

    @Override
    public void setNbrOfProduct(int nbrOfProduct) {
        jeu.setNbrOfProduct(nbrOfProduct);
    }

    public void setTypeOfGame(String typeOfGame) {
        jeu.setTypeOfGame(typeOfGame);
    }

    @Override
    public void reset() {
        this.jeu = new Jeu();  // Create a new Jeu object when resetting
    	
    }
    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    public Jeu getProduit() {
        Jeu l1 = this.jeu;
        reset();
        return l1;
    }

	
}
