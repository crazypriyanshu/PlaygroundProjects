package dev.priyanshu.playgroundproject.InheritanceExamples.TablePerClass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface T_per_classMentorRepository extends JpaRepository<Mentor, Long> {
    Mentor save(Mentor user);
    Mentor findUsersById(Long id);
}
