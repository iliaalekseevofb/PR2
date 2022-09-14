package Author;

public class Author {
  // Variables
  private String name;
  private String email;
  private char gender;

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
  public void setEmail(String e) {
    this.email = e;
  }
  public String toString() {
    return "Author: " + this.name + ", Email: " + this.email + ", Gender: " + this.gender;
  }
}
