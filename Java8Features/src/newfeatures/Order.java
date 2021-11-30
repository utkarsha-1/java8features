package newfeatures;

public class Order {
	public enum Side{ BUY, SELL };//constant array
	private  int quantity;
	private  String symbol;
	private  double price;
	private  Side side;
	public Order(int quantity, String symbol, double price, Side side) {
		super();
		this.quantity = quantity;
		this.symbol = symbol;
		this.price = price;
		this.side = side;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", symbol=" + symbol + ", price=" + price + ", side=" + side + "]";
	}
	public static int compareByQuantity(Order a, Order b){
	return a.quantity - b.quantity; }
	
	public int compareByPrice(Order a, Order b){
	return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice()));
	}


}
