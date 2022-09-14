package Author;

public class TestAuthor {
  public static void main (String[] args) {
    Author a1 = new Author("Артур Конан Дойл", "arthurcd@gmail.com", 'M');
    System.out.println(a1.getName());
    System.out.println(a1.getEmail());
    System.out.println(a1.getGender());
    a1.setEmail("arthurcdNew@gmail.com");
    System.out.println(a1.getEmail());
    System.out.println(a1);
  }
}