package pl.sg.usercatalog.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private long id;
    private String userName;
    private int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}