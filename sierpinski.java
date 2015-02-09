/*
 * Created by Colleen Kimball
 * November, 2013
 * Ithaca, NY
 * 
 * This program uses recursion to draw Sierpinski triangles.
 * Must have the StdDraw library to run this code.
 */
public class Sierpinski {
	
	public static void triangle(double[]x, double[]y){
		StdDraw.filledPolygon(x,y);	
	}

	public static void sierpinski(double[] x, double[] y, int N){
		if (N==0) return;
		//base case
		triangle(x,y);
		
		double[] x1 = new double[3];
		double[] y1 = new double[3];
		for (int i=0; i<3; i++){
			x1[i] = .5*x[i];
			y1[i] = .5*y[i];
		}
		sierpinski(x1, y1, N-1);
		double[] x2 = new double[3];
		double[] y2 = new double[3];
		for (int i=0; i<3; i++){
			x2[i] = .5*x[i]+.5;
			y2[i] = .5*y[i]+.75;
		}
		sierpinski(x2, y2, N-1);
		double[] x3 = new double[3];
		double[] y3 = new double[3];
		for (int i=0; i<3; i++){
			x3[i] = .5*x[i]+1;
			y3[i] = .5*y[i];
		}
		sierpinski(x3, y3, N-1);
		
	}
	public static void main(String[] args) {
		int seed = 5;
		StdDraw.setXscale(0,2);
		StdDraw.setYscale(0,2);
		double x[]={0.5,1.5,1};
		double y[]={.75,.75,0};
		sierpinski(x, y, seed);
	}

}
