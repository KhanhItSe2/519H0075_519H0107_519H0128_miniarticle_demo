package Client;

import mdp.nonvp.shape.Dot;
import mdp.nonvp.shape.FileExport;
import mdp.nonvp.shape.Shape;

public class NormalApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dot dot = new Dot();
		
		export(dot); //Expect "Exporting dot", but "Exporting shape" is out
	}

	private static void export(Shape s) {
		FileExport fe = new FileExport();
		System.out.println(fe.export(s));
	}
}
