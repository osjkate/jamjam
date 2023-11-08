package com.jam.hello.service;

import com.jam.hello.domain.UserWork;
import com.jam.hello.domain.UserWorkCustom;
import com.jam.hello.domain.Work;
import com.jam.hello.repository.UserRepository;
import com.jam.hello.repository.workcustom.WorkCustomRepository;
import com.jam.hello.repository.work.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class WorkService {

    private final UserRepository userRepository;
    private final WorkRepository workRepository;
    private final WorkCustomRepository workCustomRepository;



    // 일 목록 모두 조회
    public List<String> getAllWorkList() {
        return workRepository.findAll().stream().map(Work::getName).collect(Collectors.toList());
    }

    // 특정 날짜에 특정 고객의 할 일 모두 조회
    public List<String> getAllWorkListByUserAndDate(Long user_id, Date date) {
        return null;
    }

    // 특정 고객의 할 일 조회
    public List<String> getAllWorkListByUser(Long user_id) {
        List<UserWork> workList = workRepository.findAllByUserId(user_id);
        List<UserWorkCustom> workCustomList = workCustomRepository.findAllByUserId(user_id);
        List<String> workListName = workList.stream().distinct()
                .map(UserWork::getWork)
                .map(Work::getName).collect(Collectors.toList());
        List<String> workCustomListName = workCustomList.stream()
                .map(UserWorkCustom::getName).collect(Collectors.toList());
        return Stream.concat(workListName.stream(), workCustomListName.stream()).collect(Collectors.toList());
    }

    // 할 일 삭제

    // 할 일 분배하기
}
