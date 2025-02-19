package com.example.daily_issue.checklist.common.service;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Embeddable
@MappedSuperclass
public class CommonModel {
    @CreatedDate @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;               // 생성일
    private String creatorUserId;           // 생성자 아이디
    @LastModifiedDate @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;          // 마지막 수정일
    private String lastModifierUserId;      // 마지막 수정자 아이디
    private Character deleteAt = 'N';       // 삭제여부
}
