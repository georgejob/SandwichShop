
public class Fish extends Sandwich{

	@Override
	public boolean add(Object obj) {
		return false;
	}

	@Override
	public boolean remove(Object obj) {
		return false;
	}

	@Override
	public double price() {
		return 12.99;
	}

}
