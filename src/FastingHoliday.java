public class FastingHoliday extends ReligiousHoliday{
    public FastingHoliday(String n, String d, String r) {
        super(n, d, r);
    }
    public void celebrate() {
        System.out.println("Celebrating the Religious Holiday, " + getName() + " on " + getDate() + ", by worshiping God.");
    }
    public void fast() {
        System.out.println("Not eating today.");
    }
}