package dev.priyanshu.playgroundproject.InheritanceExamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "singleT_Mentor")
@DiscriminatorValue(value = "2")
public class Mentor extends User {
    private int noOfSessions;
}
