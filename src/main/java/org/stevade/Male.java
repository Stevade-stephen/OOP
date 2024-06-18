package org.stevade;

public class Male extends Person implements PersonInterface {
    private String buzzVoice;
    private String mustache;
    private String  broadShoulder;
    private Gender gender;


    public Male (String firstName, String lastName, int age,String buzzVoice, String mustache, String broadShoulder) {
        super(firstName, lastName,age);
        this.buzzVoice = buzzVoice;
        this.mustache = mustache;
        this.broadShoulder = broadShoulder;
        this.gender  = Gender.MALE;
    }
    public Gender getGender() {return gender;}

    public void setGender(Gender gender) {this.gender = gender;}

    public String getBuzzVoiCe() {return buzzVoice;}

    public void setBuzzVoice(String buzzVoice){this.buzzVoice = buzzVoice;}

    public String getMustache() {return mustache;}

    public void setMustache(String mustache) {this.mustache = mustache;}

    public String getBroadShoulder() {return broadShoulder;}

    public void setBroadShoulder(String broadShoulder) {this.broadShoulder = broadShoulder;}

    @Override
    public  String toString(){
        return "Male{" +
                "firstName=' " + super.getFirstName() +'\'' +
                ",lastName=' " + super.getLastName() +'\'' +
                ",age=' " + super.getAge() +'\'' +
                ", buzzVoice=' " + buzzVoice + '\''+
                ", mustache=' " + mustache+ '\''+
                ",  broadShoulder=' " +  broadShoulder+ '\''+
                '}';
    }
    @Override
    public void walk() {
        System.out.println("male is WALKing");
    }
    @Override
    public void run(){
        System.out.println("male is running");
    }
    @Override
    public void eat(){
        System.out.println("male is eating");
    }







}

