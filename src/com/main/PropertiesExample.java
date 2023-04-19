/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class PropertiesExample {

	public static void main(String[] args) {
		Properties[] array = { new Properties("ABC", "Yes", "Neha", "Mumbai"),
				new Properties("ABC", "No", "Neha", "Mumbai"), new Properties("ABC", "No", "Neha", "Mumbai"),
				new Properties("ABC", "No", "Neha", "Mumbai"), new Properties("ABC", "Yes", "Neha", "Delhi") };
		// printValues(array);

		Properties obj_new = new Properties("1000", "Yes", "Vikas Panday", "Mumbai");
		System.out.println("Object By New : " + obj_new);
		
		try {
			Properties obj_class = (Properties) Class.forName("com.main.Properties").newInstance();
			System.out.println("Object By Class : " + obj_class);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void printValues(Properties[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].code.equals("ABC") && array[i].valuetext.equals("Yes"))
				System.out.println(array[i]);

		}

	}

}

class Properties {
	String code;
	String valuetext;
	String name;
	String city;

	public Properties() {
		
	}
	public Properties(String code, String valuetext, String name, String city) {
		this.code = code;
		this.valuetext = valuetext;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "[code=" + code + ", valuetext=" + valuetext + ", name=" + name + ", city=" + city + "]";
	}

}