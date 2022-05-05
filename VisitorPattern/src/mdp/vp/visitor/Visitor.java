package mdp.vp.visitor;

import mdp.vp.shape.*;

public interface Visitor {
	
	String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cps);
}
