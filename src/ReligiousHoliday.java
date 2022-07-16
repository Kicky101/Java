public class ReligiousHoliday extends Holiday {
    private String religion;
    public ReligiousHoliday(String n, String d, String r) {
        super(n, d);
        religion = r;
    }
    public void celebrate() {
        System.out.println("Celebrating the Religious Holiday, " + getName() + " on " + getDate() + ", by worshiping God.");
    }
}