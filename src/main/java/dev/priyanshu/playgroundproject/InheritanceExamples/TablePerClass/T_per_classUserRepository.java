package dev.priyanshu.playgroundproject.InheritanceExamples.TablePerClass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface T_per_classUserRepository extends JpaRepository<User, Long> {
    User save(User user);
    User findUsersById(Long id);
}
