package generics;

public class GenericDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Integer Type
		GenericExample<Integer> intObj = new GenericExample<Integer>(10);
		System.out.println(intObj.getObject());

		//String type
		GenericExample<String> strObj = new GenericExample<String>("java");
		System.out.println(strObj.getObject());
	}
}
