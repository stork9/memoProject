package com.korea.week033.service;

import com.korea.week033.domain.Memo;
import com.korea.week033.domain.MemoRepository;
import com.korea.week033.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional  //이게 DB에 꼭
    public Long update(Long id, MemoRequestDto requestDto){
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지않습니다.")
        );
        memo.update(requestDto);
        return memo.getId();
    }
}
