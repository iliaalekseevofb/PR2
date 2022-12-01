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
  public void setX(double newX) {
    this.x = newX;
  }
  public void setY(double newY) {
    this.y = newY;
  }
  public void setXY(double newX, double newY) {
    this.x = newX;
    this.y = newY;
  }
  public void move(double xDisp, double yDisp) {
    this.x += xDisp;
    this.y += yDisp;
  }
  public String toString() {
    return "X position: " + this.x + ", Y position: " + this.y;
  }
}
