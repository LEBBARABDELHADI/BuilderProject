package Product;

import java.awt.Color;

public class Livre {

	private Color color;
	private Integer nbrOfPages;
	private Integer weight;
	private Integer nbrOfProduct;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Integer getNbrOfPages() {
		return nbrOfPages;
	}
	@Override
	public String toString() {
		return "Livre [color=" + color + ", nbrOfPages=" + nbrOfPages + ", weight=" + weight + ", nbrOfProduct="
				+ nbrOfProduct + "]";
	}
	public void setNbrOfPages(Integer nbrOfPages) {
		this.nbrOfPages = nbrOfPages;
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
	
}
