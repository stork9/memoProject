package com.korea.week033.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass//상속했을 때,컬럼으로 인식하게 한다.
@EntityListeners(AuditingEntityListener.class)//생성 수정 시간을 자동으로 반영하도록 설정
public abstract class Timestamped {
    @CreatedDate//생성일자를 알려준다
    private LocalDateTime createdAt;

    @LastModifiedDate //마지막수정일자를 알려준다
    private LocalDateTime modifiedAt;

}
