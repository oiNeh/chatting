package git.com.chatting.entity;

import git.com.chatting.testFixtures.UserFixture;
import java.util.Date;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void 유저생성() {
        User user = UserFixture.getUser();

        Assertions.assertThat(user).isNotNull();
    }

}
