public class NationalHoliday extends Holiday {
	public NationalHoliday(String n, String d) {
        super(n, d);
    }
    public void celebrate() {
        System.out.println("Celebrating the National Holiday, " + getName() + " on " + getDate() + ", with no school.");
    }
}