package hu.nive.ujratervezes.zarovizsga.people;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String ip;



    public Person(String[] data){
        this.id = Integer.parseInt(data[0]);
        this.firstName = data[1];
        this.lastName = data[2];
        this.email = data [3];
        String gender = data [4];
        if (gender.equals("Male")) {
            this.gender = Gender.MALE;
        } else if (gender.equals("Female")) {
            this.gender = Gender.FEMALE;
        } else {
            this.gender = Gender.NONBINARY;
        }
        this.ip = data [5];
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getIp() {
        return ip;
    }
}
