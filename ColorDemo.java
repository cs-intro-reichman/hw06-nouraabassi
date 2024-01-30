
import java.awt.Color;


public class ColorDemo {
	
	public static void main (String[] args) {	
		
		Color black  = new Color(0, 0, 0);
		Color white  = new Color(255, 255, 255);
		Color red    = new Color(255, 0, 0);
		Color yellow = new Color(255, 255, 0);

        System.out.println("RGB values of yellow:");     
		System.out.println("R = " + yellow.getRed());   // prints 255
		System.out.println("G = " + yellow.getGreen()); // prints 255
		System.out.println("B = " + yellow.getBlue());  // prints   0

     
		System.out.print("Red = "); print(red);
		System.out.println();

        
		Color[] bwbw = { black, white, black, white };
		for (int i = 0; i < bwbw.length; i++) {
			print(bwbw[i]);
		}
		System.out.println();

	 
		Color[] bwbw1 = { new Color(0,0,0), new Color(255,255,255), new Color(255,255,255), new Color(0,0,0) };

    
		Color[][] miniChessBoard = { 
			                         { black, white, black, white } ,
			                         { white, black, white, black } ,
			                         { black, white, black, white } ,
			                         { white, black, white, black } ,
		                           };
								   
		int[][][] image = read("tinypic.ppm");
		print(image); // prints the image data
	}
  
	public static void print(Color c) {
	    System.out.print("(");
		System.out.printf("%3s,", c.getRed());   // Prints the red component
		System.out.printf("%3s,", c.getGreen()); // Prints the green component
        System.out.printf("%3s",  c.getBlue());  // Prints the blue component
        System.out.print(")  ");
	}
}


