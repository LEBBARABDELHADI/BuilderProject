package Product;

import java.awt.Color;

public class Jeu {

	private Color color;
	private Integer weight;
	private String TypeOfGame;
	private Integer nbrOfProduct;
	
	
	public Jeu() {
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getNbrOfProduct() {
		return nbrOfProduct;
	}
	public void setNbrOfProduct(Integer nbrOfProduct) {
		this.nbrOfProduct = nbrOfProduct;
	}
	@Override
	public String toString() {
		return "Jeu [color=" + color + ", weight=" + weight + ", TypeOfGame=" + TypeOfGame + ", nbrOfProduct="
				+ nbrOfProduct + "]";
	}
	public String getTypeOfGame() {
		return TypeOfGame;
	}
	public void setTypeOfGame(String typeOfGame) {
		TypeOfGame = typeOfGame;
	}
	
}
