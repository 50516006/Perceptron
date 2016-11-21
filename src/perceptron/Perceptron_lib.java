package perceptron;

public class Perceptron_lib {
private int n;
private double[] nu;
private double eps;
private double theta;
public Perceptron_lib(int n,double[] nu,double eps ,double theta){
	this.n = n;
	this.eps=eps;
	this.theta=theta;
	this.nu=nu;
}

public double getOutput(double[] x){
	
	double y = 0, output;
	for(int i = 0; i < nu.length; i++){
		y += nu[i] * x[i];
	}
	if( y > theta) output = 1;
	else output = 0;
	
	return output;
}



public void getParameter(double[] x, double y){
	
	for(int i = 0; i < nu.length; i++){
		nu[i] += eps * (y - this.getOutput(x))*x[i]; 
	}
	
}


}


