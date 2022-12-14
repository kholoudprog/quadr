package oop2;

public class Quadr extends point {
private point endpoints1; 
private point endpoints2;
private point endpoints3;
private point endpoints4;

    public  void setdata(point endpoints1,point endpoints2,point endpoints3,point endpoints4) {
    	this.endpoints1.setPoint(endpoints1.getX(), endpoints1.getY());
    	this.endpoints2.setPoint(endpoints2.getX(), endpoints2.getY());
    	this.endpoints3.setPoint(endpoint3.getX(),endpoints3. getY());
    	this.endpoints4.setPoint(endpoints4.getX(), endpoints4.getY());
    }
    public double Area() {
    	double a=this.distance(endpoints1, endpoints2);
    	double c=this.distance(endpoints1, endpoints3);
    	double b=this.distance(endpoints2, endpoints3);
    	double d=this.distance(endpoints2, endpoints4);
    	double e=this.distance(endpoints3, endpoints4);
    	
    	double s=(a+b+c)/2;
    	double area1=Math.sqrt(s(s-a)(s-b)(s-c));
    	
    	double s=(d+b+e)/2;
    	double area2=Math.sqrt(s(s-d)(s-b)(s-e));
    	
    	return area1+area2;
    }





}
