package dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MentorRepository extends JpaRepository<Mentor, Long> {
    Mentor save(Mentor mentor);
    Optional<Mentor> findMentorByIdIs(Long id);
}
