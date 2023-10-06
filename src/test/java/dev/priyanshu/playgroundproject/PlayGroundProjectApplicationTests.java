package dev.priyanshu.playgroundproject;

import dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable.Mentor;
import dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable.MentorRepository;
import dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable.User;
import dev.priyanshu.playgroundproject.InheritanceExamples.JoinedTable.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class PlayGroundProjectApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MentorRepository mentorRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testDiffInheritance() {
        User user = new User();
        user.setEmail("priyanshu@test.com");
        user.setPassword("pass");
        userRepository.save(user);

        Mentor mentor = new Mentor();
        mentor.setNoOfSessions(43);
        mentor.setPassword("passsword");
        mentor.setEmail("mentor@ew.com");
        mentor.setId(2);
        mentorRepository.save(mentor);
//        Optional<Mentor> m = mentorRepository.findMentorByIdIs(new Long(2));
//        System.out.println("mentor is : "+m.getClass().getName());

    }

}
