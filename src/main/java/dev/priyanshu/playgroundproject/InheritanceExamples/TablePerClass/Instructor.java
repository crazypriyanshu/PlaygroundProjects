package dev.priyanshu.playgroundproject.InheritanceExamples.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tPerClass_Instructor")
public class Instructor extends User {
    private String companyName;
}
