package git.com.chatting.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRequestTest {


    @ValueSource(strings = {
            "success1",
            "success1_success1"
    })
    @ParameterizedTest
    void 아이디_최소5글자_최대18글자(String id) {
        Assertions.assertThatCode(() -> new UserRequest(id, "password", "nickname"))
                .isNotInstanceOf(IllegalArgumentException.class);
    }

    @ValueSource(strings = {
            "success2",
            "success2_success2"
    })
    @ParameterizedTest
    void 비밀번호_최소5글자_최대18글자(String pw) {
        Assertions.assertThatCode(() -> new UserRequest("idTests", pw, "nickname"))
                .isNotInstanceOf(IllegalArgumentException.class);
    }

    @ValueSource(strings = {
            "hell",
            "romeo",
            "juliet",
            "love_love"
    })
    @ParameterizedTest
    void 닉네임_최소3글자_최대12글자(String nickname) {
        Assertions.assertThatCode(() -> new UserRequest("idTests","password", nickname))
                .isNotInstanceOf(IllegalArgumentException.class);
    }

}
