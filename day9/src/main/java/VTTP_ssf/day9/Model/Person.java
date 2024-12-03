package VTTP_ssf.day9.Model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Person {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
