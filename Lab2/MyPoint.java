
public class MyPoint {

	private double xCoor;
	private double yCoor;
	
	public MyPoint(){
		xCoor = 0;
		yCoor = 0;
	}
	
	public MyPoint(double x, double y){
		xCoor = x;
		yCoor = y;
	}
	
	public double getX(){
		return xCoor;
	}
	
	public double getY(){
		return yCoor;
	}
	
	public double distance(MyPoint p2){
		double x2 = p2.getX();
		double y2 = p2.getY();
		double diffX = x2-xCoor;
		double diffY = y2-yCoor;
		return Math.sqrt( Math.pow(diffX, 2) + Math.pow(diffY, 2) );
	}
	
	public double distance(double x2, double y2){
		MyPoint p2 = new MyPoint(x2,y2);
		return distance(p2);
	}
	
	
}
