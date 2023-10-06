package dev.priyanshu.playgroundproject.InheritanceExamples.MappedSuperClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mappedSuperClass_Instructor")
public class Instructor extends User {
    private String companyName;
}
