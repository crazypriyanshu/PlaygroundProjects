package dev.priyanshu.playgroundproject.InheritanceExamples.TablePerClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tPerClass_User")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    private String email;
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
