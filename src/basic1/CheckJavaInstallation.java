package basic1;

public class CheckJavaInstallation {

	public static void main(String[] args) {
		
		System.out.println("Java Version: " + System.getProperty("java.version") +"\n"+ "Java Runtime Version: " + System.getProperty("java.runtime.version")+"\n"+"Java Home: "+System.getProperty("java.home")+"\n"+"Java Vendor: "+System.getProperty("java.vendor")+"\n"+"Java Vendor URL: "+System.getProperty("java.vendor.url")+"\n"+"Java Class Path: "+System.getProperty("java.class.path"));
		
	}

}
