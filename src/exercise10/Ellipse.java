package exercise10;

public class Ellipse extends Figure {
  
    public Ellipse() {
       super(new Point(0,0),1,1);
    }

    public Ellipse(Point startPoint, double a, double b) {
       super(startPoint,a,b);
    }

    public Ellipse(Ellipse otherEllipse) {
        super(otherEllipse.startPoint, otherEllipse.side1,
        otherEllipse.side2);
    }

    public double calculatePerimeter() {
        return Math.PI * (3.0 * (side1 + side2) - Math.sqrt((3.0 * side1 + side2) * (side1 + 3.0 * side2)));
    }

    public double calculateArea() {
        return Math.PI * side1 * side2;
    }


    public String getType() {
        return (side1 == side2) ? "Circle" : "Ellipse";
    }


    public boolean equal(Figure otherFigure) {
      if(otherFigure instanceof Ellipse){
        return super.equal(otherFigure);
      } else {
        return false;
      }
    }
    
    public boolean containsClick(Point click) {
        double solution = Math.pow((click.getX() - startPoint.getX()),2) / (side1 * side1) + Math.pow((click.getY() - startPoint.getY()),2) / (side2 * side2);

        if(solution <= 1){
          return false;
        } else {
        return true;
        }
    }
} 