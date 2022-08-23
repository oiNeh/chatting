package git.com.chatting.testFixtures;

import git.com.chatting.entity.User;

public class UserFixture {

    private static int INCREASE = 0;

    public static User getUser(){
        INCREASE++;
        return new User("userId"+INCREASE , " userPw" , "nickname"+INCREASE);
    }
}
