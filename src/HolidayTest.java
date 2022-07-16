public class HolidayTest {
    public static void main(String[] args){
        Holiday monday = new Holiday("monday", "2/28/2022");
        NationalHoliday tuesday = new NationalHoliday("tuesday", "3/1/2022");
        ReligiousHoliday wednesday = new ReligiousHoliday("wednesday", "3/2/2022", "garfield");
        FastingHoliday hubleday = new FastingHoliday("hubleday", "0000/0000/0000", "the horror");

        System.out.println(monday.getName());
        System.out.println(monday.getDate());
        monday.celebrate();
        tuesday.celebrate();
        wednesday.celebrate();
        hubleday.celebrate();
        hubleday.fast();
    }
}