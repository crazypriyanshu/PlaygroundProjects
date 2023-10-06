package dev.priyanshu.playgroundproject.InheritanceExamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "singleT_TA")
@DiscriminatorValue(value = "1")
public class TA extends User {
    private double rating;
}
