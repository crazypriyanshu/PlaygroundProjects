package dev.priyanshu.playgroundproject.InheritanceExamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "singleT_Instructor")
@DiscriminatorValue(value = "3")
public class Instructor extends User {
    private String companyName;
}
