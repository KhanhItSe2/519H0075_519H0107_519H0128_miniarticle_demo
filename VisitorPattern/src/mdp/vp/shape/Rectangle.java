package mdp.vp.shape;

import mdp.vp.visitor.Visitor;

public class Rectangle implements Shape {
	private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Moving rectangle");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle");
	}

	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visitRectangle(this);
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

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
