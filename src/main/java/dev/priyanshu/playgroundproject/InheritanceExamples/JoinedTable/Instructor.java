package dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "joinedT_Instructor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User {
    private String companyName;
}
