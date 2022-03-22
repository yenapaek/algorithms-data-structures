/**
 * Exercise R-1.10 
 * @author yena
 *
 */

public class Flower {
	String flowerName;
	int petalCount;
	float flowerPrice;
	
	public Flower (String name, int count, float price) {
		flowerName = name;
		petalCount = count;
		flowerPrice = price;
	}
	
	public void setFlowerName(String name) {
		this.flowerName = name;
	}
	
	public void setPetalCount(int count) {
		this.petalCount = count;
	}
	
	public void setFlowerPrice(int price) {
		this.flowerPrice = price;
	}
	
	public String getFlowerName() {
		return this.flowerName;
	}
	
	public int getPetalCount() {
		return this.petalCount;
	}
	
	public float getFlowerPrice() {
		return this.flowerPrice;
	}

	public static void main(String[] args) {
		Flower daisy = new Flower("daisy", 21, 0.5f);
		System.out.println(daisy.getFlowerName());
		System.out.println(daisy.getPetalCount());		
		System.out.println(daisy.getFlowerPrice());		
	}
	
}
