public class Variable {
	public static void main(String[] args) {
		byte cores = 8;
		short cpuFrequency = 4000;
		int ramMB = 64000;
		long hddKB = 1073741824;
		float tMin = 13.5f;
		double tMax = 100.2;
		char classPU = 'A';
		boolean isOn = true;

		System.out.println("Information of my PC:");
		System.out.println("1. Amoutn of cores " + cores);
		System.out.println("2. CPU frequency " + cpuFrequency);
		System.out.println("3. Amount of memory " + ramMB + "MB");
		System.out.println("4. Amount of memory on Hard disk " + hddKB + "KB");
		System.out.println("5. Minimal temperature of CPU " + tMin);
		System.out.println("6. Maximal temperature of CPU " + tMax);
		System.out.println("7. Class of power usage - " + classPU);
		System.out.println("8. Is the computer turned on? - " + isOn);

	}
}