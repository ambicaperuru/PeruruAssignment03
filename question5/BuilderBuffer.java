package question5;

public class BuilderBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sTime = System.currentTimeMillis();
		StringBuffer sbuffer = new StringBuffer("String");
		for (int i = 0; i < 10000; i++) {
			sbuffer.append("Buffer");
		}
		System.out.println("time taken for StringBuffer: " + (System.currentTimeMillis() - sTime) + "ms");
		sTime = System.currentTimeMillis();
		StringBuilder sbuilder = new StringBuilder("String");
		for (int i = 0; i < 10000; i++) {
			sbuilder.append("Builder");
		}
		System.out.println("time taken for StringBuilder: " + (System.currentTimeMillis() - sTime) + "ms");

	}

}