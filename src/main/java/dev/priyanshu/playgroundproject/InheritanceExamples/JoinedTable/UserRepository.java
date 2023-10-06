package dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
    User findUsersById(Long id);
}
