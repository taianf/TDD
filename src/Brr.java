
public class Brr extends Money{
	
	public Brr (int amount) {
		this.amount=amount;
	}
public Money times(int multiplier) {
	
		
		return new Brr(amount*multiplier);
	
	}
	


}
