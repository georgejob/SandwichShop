
public class Beef extends Sandwich{

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
		return 10.99;
	}

}
