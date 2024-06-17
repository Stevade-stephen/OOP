package org.stevade;

public class Female extends Person implements PersonInterface {

    private String hairStyle;
    private String shoeSize;
    private Gender gender;

    public Female(String firstName, String lastName,int age, String hairStyle, String shoeSize) {
        super(firstName, lastName, age);
        this.hairStyle = hairStyle;
        this.shoeSize = shoeSize;
        this.gender = Gender.FEMALE;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    @Override
    public String toString() {
        return "Female{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", hairStyle='" + hairStyle + '\'' +
                ", shoeSize='" + shoeSize + '\'' +
                '}';
    }

    @Override
    public void walk() {
        System.out.println("Female is walking");
    }

    @Override
    public void run() {
        System.out.println("Female is running");
    }

    @Override
    public void eat() {
        System.out.println("Female is eating");
    }
}
