package mostwanted;

public class ClassCastDemo {

	public static void main(String[] args) {

//		Object object = new Object();
		Object object = new String();
		if (object instanceof String) {
			String s = (String) object;
			System.out.println(s);
		}
	}

}
