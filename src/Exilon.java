public class Exilon {

	public static void main (String[] args) {

		// String listFile = "";
		// ListParser lp = new ListParser();
		// Item[] items = lp.parse(listFile);


		Item dream = new Item("AK-47", "Fire%20Serpent", "Minimal%20Wear", "no");

		Scraper alfred = new Scraper();

		System.out.println(alfred.getRawWithFee(dream));

	}

}