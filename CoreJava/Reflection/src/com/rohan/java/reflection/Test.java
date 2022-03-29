package com.rohan.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		try {
//			System.out.println(Class.forName(Calculator.class.getName()));
			Class<?> myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myClass.getMethods()));

			Constructor<?> constructor = myClass.getConstructor(null);
			System.out.println(constructor.newInstance(null));

			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
			Object myObj = constructor2.newInstance(5, 10);
			System.out.println(myObj);

//			Method method = myClass.getMethod("getNum1", null);
//			Object invoke = method.invoke(myObj, null);
//			System.out.println(invoke);
//
//			Method method2 = myClass.getMethod("getNum2", null);
//			System.out.println(method2.invoke(myObj, null));

			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 6);

			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 8);

			Field num1Field = myClass.getDeclaredField("num1");
			num1Field.setAccessible(true);

			num1Field.set(myObj, 80);

			Method method = myClass.getMethod("getNum1", null);
			Object invoke = method.invoke(myObj, null);
			System.out.println(invoke);

			Method method2 = myClass.getMethod("getNum2", null);
			System.out.println(method2.invoke(myObj, null));

			Method sum = myClass.getMethod("sum", double.class, double.class);
			System.out.println(sum.invoke(constructor.newInstance(null), 5.5, 6.5));

			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));

			// method.getAnnotations
			// field.getAnnotations

			MyAnnotation annotation = (MyAnnotation) annotations[0];
			System.out.println(annotation.value1());
			System.out.println(annotation.value2());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

}
