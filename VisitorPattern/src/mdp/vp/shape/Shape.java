package mdp.vp.shape;

import mdp.vp.visitor.Visitor;

public interface Shape {
	void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}