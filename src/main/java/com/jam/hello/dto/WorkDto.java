package com.jam.hello.dto;

import com.jam.hello.domain.UserWorkCustom;
import com.jam.hello.domain.Work;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class WorkDto {

    @Getter @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class WorkInfoResponse {
        private Long id;
        private String name;

        public static WorkInfoResponse of(Work work) {
            return new WorkInfoResponse(work.getId(), work.getName());
        }
    }

    @AllArgsConstructor
    public static class WorkCustomInfoResponse {
        private Long id;
        private String name;

        public static WorkCustomInfoResponse of(UserWorkCustom userWorkCustom) {
            return new WorkCustomInfoResponse(userWorkCustom.getId(), userWorkCustom.getName());
        }
    }
}
