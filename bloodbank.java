package lab5;

public class bloodbank {
	 public static final String[] names = {"AQSA", "WANIA", "SARAH"};
	 public static donor getdonor(String name) {
		 for (int i = 0; i < names.length; i++) {
		 if (names[i].equalsIgnoreCase(name)){
		 return new realdonor(name);
		 } }
		 return new Nulldonor();
		 }

}
