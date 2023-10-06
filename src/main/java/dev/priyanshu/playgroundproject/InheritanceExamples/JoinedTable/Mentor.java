package dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "joinedT_Mentor")
@PrimaryKeyJoinColumn(name = "id")
public class Mentor extends User {
    private int noOfSessions;
}
