package dev.priyanshu.playgroundproject.InheritanceExamples.SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ST_UserRepository extends JpaRepository<User , Long > {
    User save(User user);
    Optional<User> findUsersById(Long id);
}
