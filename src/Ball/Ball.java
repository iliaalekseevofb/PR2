package Ball;

public class Ball {
  // Variables
  private double x = 0.0;
  private double y = 0.0;

  // Constructors (overloaded)
  public Ball() {}
  public Ball(double newX, double newY) {
    x = newX;
    y = newY;
  }

  // Methods
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }

  public void setX(double x) {
    this.x = x;
  }
  public void setY(double y) {
    this.y = y;
  }
  public void setXY(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void move(double xDisp, double yDisp) {
    this.x += xDisp;
    this.y += yDisp;
  }
  public String toString() {
    return "Ball @ ("+this.x+", "+this.y+").";
  }
}
