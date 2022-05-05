package mdp.vp.shape;

import mdp.vp.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
	public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }
    
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Moving compound shape");

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing compound shape");
	}

	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visitCompoundGraphic(this);
	}

	public void add(Shape shape) {
        children.add(shape);
    }

	public int getId() {
		return id;
	}
}
