
public class TwelveDays {

	public static void main(String[] args) {
		onThe();
		System.out.print("first ");
		sent();
		partridge();
		onThe();
		System.out.print("second ");
		sent();
		turtle();
		onThe();
		System.out.print("third ");
		sent();
		hens();
		onThe();
		System.out.print("fourth ");
		sent();
		birds();
		onThe();
		System.out.print("fifth ");
		sent();
		rings();
		onThe();
		System.out.print("sixth ");
		sent();
		geese();
		onThe();
		System.out.print("seventh ");
		sent();
		swans();
		onThe();
		System.out.print("eighth ");
		sent();
		maids();
		onThe();
		System.out.print("ninth ");
		sent();
		ladies();
		onThe();
		System.out.print("tenth ");
		sent();
		lords();
		onThe();
		System.out.print("eleventh");
		sent();
		pipers();
		onThe();
		System.out.print("twelfth ");
		sent();
		drummers();
	}
	
	//wow this is a lot of static methods
	
	public static void onThe() {
		System.out.print("On the ");  //prints "On the " in order to reduce redundancy
	}
	public static void sent() {
		System.out.println("day of Christmas,\nMy true love sent to me");
	}
	
	public static void partridge() {
		System.out.println("a partridge in a pear tree.\n");
	}
	public static void turtle() {
		System.out.println("two turtle doves, and");
		partridge();
	}
	public static void hens() {
		System.out.println("three French hens,");
		turtle();
	}
	public static void birds() {
		System.out.println("four calling birds,");
		hens();
	}
	public static void rings() {
		System.out.println("five golden rings,");
		birds();
	}
	public static void geese() {
		System.out.println("six geese a-laying,");
		rings();
	}
	public static void swans() {
		System.out.println("seven swans a-swimming,");
		geese();
	}
	public static void maids() {
		System.out.println("eight maids a-milking,");
		swans();
	}
	public static void ladies() {
		System.out.println("nine ladies dancing,");
		maids();
	}
	public static void lords() {
		System.out.println("ten lords a-leaping,");
		ladies();
	}
	public static void pipers() {
		System.out.println("eleven pipers piping,");
		lords();
	}
	public static void drummers() {
		System.out.println("Twelve drummers drumming,");
		pipers();
	}

}