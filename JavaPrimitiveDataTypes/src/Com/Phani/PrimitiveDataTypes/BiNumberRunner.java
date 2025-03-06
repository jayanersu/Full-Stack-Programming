package Com.Phani.PrimitiveDataTypes;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber number = new BiNumber(2, 3);
		System.out.println(number.add());
		System.out.println(number.multiply());
		number.doubleValue();
		System.out.println(number.getA());
		System.out.println(number.getB());

	}

}
