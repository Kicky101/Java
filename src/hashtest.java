public class hashtest {
	public static void main(String[] args) {
		hashmap hashmap = new hashmap();
		
		hashmap.add("password01", 1);
		
		hashmap.add("password02", 2);
		
		hashmap.add("password03", 3);
		
		hashmap.add("password04", 4);
		
		hashmap.add("password05", 5);
		
		hashmap.add("password06", 6);
		
		hashmap.add("password07", 7);
		
		hashmap.add("password08", 8);
		
		hashmap.add("password09", 9);
		
		hashmap.add("password10", 10);
		
		hashmap.add("password11", 11);
		
		hashmap.add("password12", 12);
		
		hashmap.add("password13", 13);
		
		hashmap.add("password14", 14);
		
		hashmap.add("password15", 15);
		
		hashmap.add("username01", 16);
		
		hashmap.add("username02", 17);
		
		hashmap.add("username03", 18);
		
		hashmap.add("username04", 19);
		
		hashmap.add("username05", 20);
		
		hashmap.add("username06", 21);
		
		hashmap.add("username07", 22);
		
		hashmap.add("username08", 23);
		
		hashmap.add("username09", 24);
		
		hashmap.add("username10", 25);
		
		hashmap.add("A", 100);
		
		hashmap.add("AB", 101);
		
		hashmap.add("ABC", 102);

		hashmap.add("ABCD", 103);
		
		hashmap.add("ABCDE", 104);
		
		hashmap.add("ABCDEF", 105);

		System.out.println(hashmap.get("password01"));
		
		System.out.println(hashmap.get("password02"));
		
		System.out.println(hashmap.get("password03"));
		
		System.out.println(hashmap.get("password04"));
		
		System.out.println(hashmap.get("password05"));
		
		System.out.println(hashmap.get("password06"));
		
		System.out.println(hashmap.get("password07"));
		
		System.out.println(hashmap.get("password08"));
		
		System.out.println(hashmap.get("password09"));

		System.out.println(hashmap.get("password10"));
		
		System.out.println(hashmap.get("password11"));
		
		System.out.println(hashmap.get("password12"));
		
		System.out.println(hashmap.get("password13"));
		
		System.out.println(hashmap.get("password14"));
		
		System.out.println(hashmap.get("password15"));
		
		System.out.println(hashmap.get("username01"));
		
		System.out.println(hashmap.get("username02"));
		
		System.out.println(hashmap.get("username03"));
		
		System.out.println(hashmap.get("username04"));
		
		System.out.println(hashmap.get("username05"));
		
		System.out.println(hashmap.get("username06"));
		
		System.out.println(hashmap.get("username07"));
		
		System.out.println(hashmap.get("username08"));
		
		System.out.println(hashmap.get("username09"));
		
		System.out.println(hashmap.get("username10"));
		
		System.out.println(hashmap.get("A"));
		
		System.out.println(hashmap.get("AB"));
		
		System.out.println(hashmap.get("ABC"));
		
		System.out.println(hashmap.get("ABCD"));
		
		System.out.println(hashmap.get("ABCDE"));
		
		System.out.println(hashmap.get("ABCDEF"));
		
		hashmap.remove("username01");
		
		hashmap.remove("username02");
		
		hashmap.remove("username03");
		
		hashmap.remove("username04");
		
		hashmap.remove("username05");
		
		hashmap.remove("username06");
		
		hashmap.remove("username07");
		
		hashmap.remove("username08");
		
		hashmap.remove("username09");
		
		hashmap.remove("username10");
		try {
			System.out.println(hashmap.get("username01"));
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		};
	}
}