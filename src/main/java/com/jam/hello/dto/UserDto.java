package com.jam.hello.dto;

import com.jam.hello.domain.User;
import com.jam.hello.domain.UserWork;
import com.jam.hello.domain.Work;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Member;
import java.util.List;

public class UserDto {

    @Getter @Setter
    @AllArgsConstructor
    private static class SaveRequest {
        private String username;

        private String password;

        public User toUser() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .build();
        }

        public static SaveRequest of(User user) {
            return new SaveRequest(user.getPassword(), user.getUsername());
        }
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserInfoResponse {
        private Long id;
        private String username;
        private List<UserWork> workList;

        public static UserInfoResponse of(User user) {
            return new UserInfoResponse(user.getId(), user.getUsername(), user.getWorkLists());
        }
    }
}
