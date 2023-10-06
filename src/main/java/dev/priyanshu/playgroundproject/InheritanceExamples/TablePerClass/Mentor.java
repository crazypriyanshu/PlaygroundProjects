package dev.priyanshu.playgroundproject.InheritanceExamples.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tPerClass_Mentor")
public class Mentor extends User {
    private int noOfSessions;
}
