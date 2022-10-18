import inf.v3d.view.*;
import inf.v3d.obj.*;
/*object names as pointers
 *  s { radius{}, color{}, coordinate{} }
 *  s1 { radius{1}, color{white}, coordinate{0,0,0} }
 *  s2 { radius{1}, color{white}, coordinate{2,0,0} }
 *   
 *  s = s2
 *  s now points to the box s2 is pointing  
 *  s,s2 -->  { radius{1}, color{white}, coordinate{2,0,0} }
 *  s.setColor("red")
 *  s,s2 -->  { radius{1}, color{red}, coordinate{2,0,0} }
 *  
 *  s2 = s1
 *  s2, s1 --> { radius{1}, color{white}, coordinate{0,0,0} }
 *  s1.setRadius(0.5)
 *  s1, s2 --> { radius{0.5}, color{white}, coordinate{0,0,0} }
 *   
 *  s = s2;
 *  s, s1, s2 --> { radius{0.5}, color{white}, coordinate{0,0,0} }
 *  
 * 
 *  CANNOT CHAGNE  { radius{1}, color{red}, coordinate{2,0,0} } ANYMORE
 *  DEEP COPY
 *  SHAWLLOW COPY =! DEEP COPY
 *  
 *  DEEP COPY -> COPY CONSTRUCTOR
 *  
 *  
 */

public class AssignemntProgram {

	public static void main(String[] args) {

		Sphere s; // un-assigned
		Viewer v = new Viewer();
		Sphere s1 = new Sphere(0, 0, 0);
		Sphere s2 = new Sphere(2, 0, 0);
				

		//s1.setColor("blue");
		//s2.setColor("red");
		
		v.addObject3D(s1);
		v.addObject3D(s2);
		
		// use the temp s to set the color of s1 and s2
		s = s2; // assign s2 to s
		s.setColor("red");
		
		s2 = s1;	// because of this 
		s2.setRadius(1.5);
		
		s = s2;
		s.setColor("blue");
		
		v.setVisible(true);
	}

}







 
 
 

 
 

