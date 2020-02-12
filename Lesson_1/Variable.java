public class Variable {
	public static void main(String[] args) {
		byte cores = 8;
		short cpuFrequency = 4000;
		int ramMb = 64000;
		long hddKb = 1073741824;
		float tempMin = 13.5f;
		double tempMax = 100.2;
		char classPu = 'A';
		boolean isOn = true;

		System.out.println("Information of my PC:");
		System.out.println("1. Amoutn of cores " + cores);
		System.out.println("2. CPU frequency " + cpuFrequency);
		System.out.println("3. Amount of memory " + ramMb + "MB");
		System.out.println("4. Amount of memory on Hard disk " + hddKb + "KB");
		System.out.println("5. Minimal temperature of CPU " + tempMin);
		System.out.println("6. Maximal temperature of CPU " + tempMax);
		System.out.println("7. Class of power usage - " + classPu);
		System.out.println("8. Is the computer turned on? - " + isOn);

	}
}