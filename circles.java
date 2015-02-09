
/*Created by Colleen Kimball
 * November, 2013
 * Ithaca, NY
 * 
 * This program draws and fills in circles, making a geometric pattern.
 * You must use the StdDraw Java library for this code to work. 
 *
 */

public class FractalArt {
	
	public static void fractal(double x, double y, double r, int level){
		
		if (level == 1) return;
		
		if (level%2==0) {
			StdDraw.setPenColor(StdDraw.ORANGE);
		}
		else StdDraw.setPenColor(StdDraw.PINK);
		
		StdDraw.filledCircle(x,y,r);
		fractal(x+r/2 ,.5, r/2, level-1);
		fractal(x-r/2, -.5, r/2, level-1);
		fractal(x+r/2, -.5, r/2, level-1);
		fractal(x-r/2, .5, r/2, level-1);
		fractal(x+r ,.5, r/2, level-1);
		fractal(x-r, -.5, r/2, level-1);
		fractal(x+r, -.5, r/2, level-1);
		fractal(x-r, .5, r/2, level-1);
	}
	public static void main(String[] args) {
		StdDraw.setXscale(-1,1);
		StdDraw.setYscale(-1,1);
		fractal(0,0,1,7);
	}

}
