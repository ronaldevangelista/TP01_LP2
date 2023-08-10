package ex01_ex02;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender(){
        return this.gender;
    }

    public String toString(){
        return "Author[Nome=" + getName() + ",Email=" + getEmail() + ",gender=" + getGender() + "]";
    }

}