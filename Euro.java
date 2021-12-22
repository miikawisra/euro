import java.io.*;

class Euro {
    public static void main(String [] args){
        double markka;
        double euro;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Syötä jokin markkamäärä:");
            markka = Double.parseDouble(in.readLine());

            euro = markka / 5.94573;

            System.out.println("Markat euroina:"+ euro);
        
        }
        catch(Exception e) {
			System.out.println("Antamasi syöte oli virheellinen...");
		}
    }
}
