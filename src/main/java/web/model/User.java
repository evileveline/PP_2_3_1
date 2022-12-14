package web.model;

import lombok.ToString;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Entity(name = User.PERSISTANCE_NAME)
@Component
@Table(name = "users")

public class User {

    static final String PERSISTANCE_NAME = "User";

    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ToString.Include
    @Column(name = "name")
    private String name;

    @ToString.Include
    @Column(name = "age")
    private byte age;

    public User() {
    }

    public User(int id, String name, byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
