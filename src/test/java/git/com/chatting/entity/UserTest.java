package git.com.chatting.entity;

import java.util.Date;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void 유저생성() {
        User user = getUser();

        Assertions.assertThat(user).isNotNull();
    }

    private User getUser() {
        return new User("testId", "testPw", new Date());
    }

}
