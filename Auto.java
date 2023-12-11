//Projektityö Riku & Timo & Elina
//Tee autoluokka
  public class Auto {
	

	public static void main(String[] args) {
		
        // luodaan auto1-olio
        Auto auto1 = new Auto();
        auto1.merkki = "Toyota";
        auto1.malli = "Corolla";
        auto1.bensanMaara = 20;

        auto1.naytaTiedot(); // Tulostaa alkuperäiset tiedot
        auto1.kiihdyta();    // Tulostaa "Auto kiihtyy"
        auto1.naytaTiedot(); // Tulostaa päivitetyt tiedot

        // lisätään kiihdyta-metodiin bensan määrä
        auto1.bensanMaara = 0;
        auto1.kiihdyta(); // Tulostaa "Auto ei voi kiihtyä, koska bensaa on loppu!"

        // Lisätään tankkaa metodi
        auto1.tankkaa(5);

        // Luodaan auto2 olio, jolla kolme 3 parametriä
        Auto auto2 = new Auto("Ford", "Focus", 15);
        auto2.naytaTiedot(); // Tulostaa tiedot, jotka asetettiin muodostimessa
        
        // Luodaan auto3 olio
        Auto auto3 = new Auto();
        auto3.merkki = "Volvo";
        auto3.malli = "V70";
        auto3.bensanMaara = 50;
        auto3.lampotila = 4;
        auto3.naytaTiedot();
        auto3.lisalammitin();
        
        //Luodaan auto4 olio
        Auto auto4 = new Auto("Audi", "A6", 10);
        auto4.naytaTiedot();
        auto4.tarkistaBensanMaara(); // Uusi metodi, joka tarkistaa polttoaineen määrän.
        
    } // Main-luokan lopetus

    public String merkki;
    public String malli;
    public int bensanMaara;
    public int lampotila;

    //Oletusmuodostin
    public Auto() {
    }

    // Parametrillinen muodostin
    public Auto(String merkki, String malli, int bensanMaara) {
        this.merkki = merkki;
        this.malli = malli;
        this.bensanMaara = bensanMaara;
    }
    
// Määritellään metodit
    public void jarruta() {
        System.out.println("Auto jarruttaa");
    }

    public void kiihdyta() {
        if (bensanMaara > 0) {
            System.out.println("Auto kiihtyy");
            bensanMaara--;
        } else {
            System.out.println("Auto ei voi kiihtyä, koska bensaa on loppu!");
        }
    }

    public void naytaTiedot() {
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }

    public void tankkaa(int maara) {
        System.out.println("Tankissa bensaa: " + bensanMaara);
        System.out.println("Tankkaus: " + maara);
        bensanMaara += maara;
        System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);
    }
    
    public void lisalammitin () {
    	if (lampotila < 5) {
    		System.out.println("Lämpötila alle 5 astetta, Lisälämmitin kytketty päälle");
    	} else {
    		System.out.println("Lämpötila yli 5 astetta, Lisälämmitin ei kytketty");
    	}
    	
    }
    public void tarkistaBensanMaara()
    {
    	if (bensanMaara < 7){
    		System.out.println("Varoitus: Bensaa vähän jäljellä!");
    	} else {
    		System.out.println("Bensaa on vielä riittävästi.");
    	}
    }
}

//pystyttekö tarkastamaan toimiiko tämä koodi, ja onko jättämäni kommentit oikeissa kohdissa.
//Muuttaakaa jos jotain puuttuu tai on väärin. Elina 30.11.2023