package mdp.vp.visitor;

import mdp.vp.shape.*;

public class FileExportVisitor implements Visitor {
	
	public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape information:" + "\n");
        for (Shape shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }
	
	@Override
	public String visitDot(Dot dot) {
		// TODO Auto-generated method stub
		return "Dot:" + "\n" +
				"	id: " + dot.getId() + "\n" +
				"	x: " + dot.getX() + "\n" +
				"	y: " + dot.getY() + "\n";
	}

	@Override
	public String visitCircle(Circle circle) {
		// TODO Auto-generated method stub
		return "Circle:" + "\n" +
				"	id: " + circle.getId() + "\n" +
				"	x: " + circle.getX() + "\n" +
				"	y: " + circle.getY() + "\n" +
				"	radius: " + circle.getRadius() + "\n";
	}

	@Override
	public String visitRectangle(Rectangle rectangle) {
		// TODO Auto-generated method stub
		return "Rectangle:" + "\n" +
				"	id: " + rectangle.getId() + "\n" +
				"	x: " + rectangle.getX() + "\n" +
				"	y: " + rectangle.getY() + "\n" +
				"	width: " + rectangle.getWidth() + "\n" +
				"	height: " + rectangle.getHeight() + "\n";
	}

	@Override
	public String visitCompoundGraphic(CompoundShape cps) {
		// TODO Auto-generated method stub
		return "Compound graphic:" + "\n" +
                "   id: " + cps.getId() + "\n" +
                _visitCompoundGraphic(cps);
	}

	private String _visitCompoundGraphic(CompoundShape cps) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : cps.children) {
            String obj = shape.accept(this);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
