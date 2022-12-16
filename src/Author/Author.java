package Author;

public class Author {
  // Variables
  private final String name;
  private String email;
  private final char gender;

  // Constructor
  public Author(String n, String e, char g) {
    name = n;
    email = e;
    gender = g;
  }

  // Methods
  public String getName() {
    return this.name;
  }
  public String getEmail() {
    return this.email;
  }
  public char getGender() {
    return this.gender;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return this.name + " (" + this.gender + ") at " + this.email;
  }
}
