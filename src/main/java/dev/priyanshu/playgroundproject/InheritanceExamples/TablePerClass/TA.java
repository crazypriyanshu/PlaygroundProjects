package dev.priyanshu.playgroundproject.InheritanceExamples.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tPerClass_TA")
public class TA extends User {
    private double rating;
}
