package mdp.vp.shape;

import mdp.vp.visitor.Visitor;

public class Dot implements Shape {
	private int id;
    private int x;
    private int y;
    
    public Dot() {}

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Moving dot");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing dot");
	}

	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visitDot(this);
	}

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
