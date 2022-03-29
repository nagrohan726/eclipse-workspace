package bonusprograms;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class Student {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException {

		Student s1 = new Student();
//		Class.forName("bonusprograms.Student").newInstance();
		Student s2 = Student.class.getConstructor().newInstance();
		Student s3 = (Student) s1.clone();
		DateFormat dateFormat = DateFormat.getInstance();

	}

}
