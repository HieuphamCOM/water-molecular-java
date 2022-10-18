// import Viewer libary 
// * :  take everything in the package
import inf.v3d.view.*;
//import the libary containing Sphere
import inf.v3d.obj.*;

public class WaterProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. to create a canvas/frame object for plotting
		Viewer v = new Viewer();
		
	
		
		// 2. to create the Oxygen object of the type Sphere
		// with the specification of its  center coordinates
		Sphere oxygen = new Sphere(0,0,0);
		Sphere hydrogen1 = new Sphere(0.75, 0.59, 0);
		// set the radius of hyrodgen
		hydrogen1.setRadius(0.675);

		Sphere hydrogen2 = new Sphere(-0.75, 0.59, 0);
		hydrogen2.setRadius(0.675);
		
		// to set the color of oxygen to be red
		oxygen.setColor("red");
		hydrogen1.setColor("blue");
		hydrogen2.setColor("blue");
		
		// 3. to add the oxygen object to the canvas v
		// To add oxygen to v
		v.addObject3D(oxygen);
		v.addObject3D(hydrogen1);
		v.addObject3D(hydrogen2);
		
		// To call a method we use " . "		
		// Make the canvas be visible --> invoke proper method of v
		v.setVisible(true);	
	}

}
// Viewer v = new Viewer ();
//		 (variable ) (memory allocation)  (Viewer constructor)
// what is the meaning of the assignment operator = ?