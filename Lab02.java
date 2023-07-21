import java.util.Scanner;

public class Lab02 {
	  public static void main(String args[]) {
	    // Complete Task C
		  
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the Input value");
		  double length= sc.nextDouble();

		  String unit= sc.next();
		  
		  Circle c1= new Circle(length,unit);
		  
		  Square s1= new Square(length, unit);
		  
		  Sphere sp1=new Sphere(length, unit);
		  
		  Cube cu1=new Cube(length, unit);
		  
		  System.out.println("Area of a circle with "+Math.round(length)+unit+" radius: "+c1.aCircle()+" "+c1.unitCircle());
		  System.out.println("Surface area of a sphere with "+Math.round(length)+unit+" radius: "+sp1.aSphere()+" "+sp1.unitSphereArea());
		  System.out.println("Area of a square with "+Math.round(length)+unit+" side:"+s1.aSquare()+" "+s1.unitSquare());
		  System.out.println("Surface area of a cube with "+Math.round(length)+unit+" side: "+cu1.aCube()+" "+cu1.unitCubeArea());
		  System.out.println("Volume of a sphere with "+Math.round(length)+unit+" radius: "+sp1.volumeSphere()+" "+sp1.unitSphereVolume());
		  System.out.println("Volume of a cube with "+Math.round(length)+unit+" side: "+cu1.volumeCube()+" "+cu1.unitCubeVolume());
	  }
	}

	class Circle {
	  private double area;
	  private double radius;
	  private String unit;
	  // Implement A
	  
	  public Circle(double radius,String unit) {
		  this.radius=radius;
		  this.unit = unit;
	  }
	  
	  int aCircle() {
		  area =Math.PI*Math.pow(radius, 2);
		  return (int)Math.round(area);
	  }
	  String unitCircle() {
		  if(unit.equals("mm")) {
			  return "mm^2";
		  }
		  else if(unit.equals("cm")) {
			  return "cm^2";
		  }
		  else if(unit.equals("m")) {
			  return "m^2";
		  }
		  else {
			  return "Unacceptable units";
		  }
		
	  }
	}

	class Square {
	  private double area;
	  private double length;
	  private String unit;
	  // Implement A
	  
	  public Square(double length,String unit) {
		  this.length=length;
		  this.unit = unit;
	  }
	  int aSquare() {
		  area =Math.pow(length, 2);
		  return (int)Math.round(area);
	  }
	  String unitSquare() {
		  if(unit.equals("mm")) {
			  return "mm^2";
		  }
		  else if(unit.equals("cm")) {
			  return "cm^2";
		  }
		  else if(unit.equals("m")) {
			  return "m^2";
		  }
		  else {
			  return "Unacceptable units";
		  }
		
	  }
	}

	class Sphere {
	  private double surfaceArea;
	  private double volume;
	  private double radius;
	  private String unit;
	  // Implement A
	  // Implement B
	  public Sphere(double radius,String unit) {
		  this.radius=radius;
		  this.unit = unit;
	  }
	  
	  int aSphere() {
		  surfaceArea =4*Math.PI*Math.pow(radius, 2);
		  return (int)Math.round(surfaceArea);
	  }
	  
	  int volumeSphere() {
		  volume= 4*Math.PI*Math.pow(radius, 3)/3;
		  return (int)Math.round(volume);
		  
	  }
	  String unitSphereArea() {
		  if(unit.equals("mm")) {
			  return "mm^2";
		  }
		  else if(unit.equals("cm")) {
			  return "cm^2";
		  }
		  else if(unit.equals("m")) {
			  return "m^2";
		  }
		  else {
			  return "Unacceptable units";
		  }
		
	  }
	  String unitSphereVolume() {
		  if(unit.equals("mm")) {
			  return "mm^3";
		  }
		  else if(unit.equals("cm")) {
			  return "cm^3";
		  }
		  else if(unit.equals("m")) {
			  return "m^3";
		  }
		  else {
			  return "Unacceptable units";
		  }
		
	  }
	}

	class Cube {
	  private double surfaceArea;
	  private double volume;
	  private double length;
	  private String unit;
	  
	  // Implement A
	  // Implement B
	  
	  public Cube(double length,String unit) {
		  this.length=length;
		  this.unit= unit;
	  }
	  
	  int aCube() {
		  surfaceArea =6*Math.pow(length, 2);
		  return (int)Math.round(surfaceArea);
	  }
	  int volumeCube() {
		  volume= Math.pow(length, 3);
		  return (int)Math.round(volume);
		  
	  }
	  String unitCubeArea() {
		  if(unit.equals("mm")) {
			  return "mm^2";
		  }
		  else if(unit.equals("cm")) {
			  return "cm^2";
		  }
		  else if(unit.equals("m")) {
			  return "m^2";
		  }
		  else {
			  return "Unacceptable units";
		  }
		
	  }
	  String unitCubeVolume() {
		  if(unit.equals("mm")) {
			  return "mm^3";
		  }
		  else if(unit.equals("cm")) {
			  return "cm^3";
		  }
		  else if(unit.equals("m")) {
			  return "m^3";
		  }
		  else {
			  return "Unacceptable units";
		  }
		
	  }
	}
