package jennifer.org.model;

import jennifer.org.Enums.Gender;

public abstract class Person {
    private String name;
    private Integer phoneNo;
    private Gender gender;

    public Person(String name, Integer phoneNo, Gender gender) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

