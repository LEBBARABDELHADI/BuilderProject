package Builders;
import java.awt.Color;

import Product.Livre;

public class LivreBuilder  implements ProduitBuilderInterface{

	private Livre livre;
	public LivreBuilder(Livre livre) {
		this.livre = livre;
	}

	public LivreBuilder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor(Color color) {
		livre.setColor(color);
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		livre.setWeight(weight);
		
	}
	public void setNbrOfPages(Integer nbrOfPages) {
		livre.setNbrOfPages(nbrOfPages);
		
	}

	@Override
	public void setNbrOfProduct(int nbrOfProduct) {
		// TODO Auto-generated method stub
		livre.setNbrOfProduct(nbrOfProduct);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
			this.livre =new Livre();
	}
	
	public Livre getProduit() {
		Livre l1=this.livre;
		reset();
		return l1;
	}
	public void setLivre(Livre livre) {
		this.livre=livre;
	}
}
