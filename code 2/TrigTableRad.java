class TrigTableRad {
	
		public static void main (String argts[]){
			double c,s,t; 
			int d = 0;
			double r = 0, rround = 0;
			double pi = 3.141592653589793238462643383279502884197169399375105820974;
			double i = (pi/12);
			String un = "UN";
			System.out.println("radian measurment is represented as rad"); 
			System.out.println("\t\t rad \t\t| cos(radian) \t\t| sin(rad) \t\t| tan(rad)");
			System.out.println( 
			"-----------------------------------------------------------------------------------" );
			while(r<= (2*pi)){
			//convert angle t to radians r
			c = Math.round(Math.cos(r));
			s = Math.round(Math.sin(r));
			t = Math.round(Math.tan(r));
			rround = Math.round(r*1000)/1000;
			System.out.println("\t\t"+rround+"\t\t |"+c+"\t\t"+s+"\t\t"+t );
			r = r + i;
	
	     }
	 }
}
