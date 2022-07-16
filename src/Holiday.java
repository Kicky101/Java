public class Holiday {
	String date;
	String name;
	public Holiday(String n, String d) {
		name = n;
		date = d;
	}
	public String getDate() {
		return date;
	}
	public String getName() {
		return name;
	}
	public void celebrate() {
        System.out.println("Celebrating the holiday " + name + " on " + date + "!");
    }
}