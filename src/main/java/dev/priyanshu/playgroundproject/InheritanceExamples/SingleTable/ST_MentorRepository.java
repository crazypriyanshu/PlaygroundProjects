package dev.priyanshu.playgroundproject.InheritanceExamples.SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ST_MentorRepository extends JpaRepository<Mentor , Long > {
    Mentor save(Mentor mentor);
    Optional<Mentor> findUsersById(Long id);
}
