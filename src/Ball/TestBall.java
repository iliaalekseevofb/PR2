package Ball;

public class TestBall {
  public static void main(String[] args) {
    Ball b1 = new Ball();
    Ball b2 = new Ball(12.5, 10.0);
    b1.setX(1);
    b1.setY(2);
    System.out.println(b1.getX());
    System.out.println(b1.getY());
    b2.move(10, 12.5);
    System.out.println(b2);
  }
}
