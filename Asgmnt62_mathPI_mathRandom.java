package assignments;

public class Asgmnt62_mathPI_mathRandom {

	public static void main(String[] args) {
		// Try to find area of circle using PI from Math.PI, and radius from Math.random in the for loop  for 10 times.
		
		for (int i = 0; i < 10; i++) {
            double area_of_circle = Math.PI * Math.random() * Math.random(); 
            System.out.println("Area: " + area_of_circle);
            
        }

	}

}
