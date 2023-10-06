package dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "joinedT_User")
@Inheritance(strategy = InheritanceType.JOINED)

public class User {
    private String email;
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
