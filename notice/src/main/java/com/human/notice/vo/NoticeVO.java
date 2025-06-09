package com.human.notice.vo;

import lombok.Data;

import java.sql.Date;

// 공지사항 테이블 데이터 저장용
@Data
public class NoticeVO {

    private int n_idx;          // 게시글 번호
    private String n_category;  // 공지사항 구분
    private String n_title;     // 공지사항 제목
    private String n_content;   // 공지사항 내용
    private Date n_regdate;     // 공지사항 등록일
    private Date n_update;      // 공지사항 수정일
    private String n_status;    // 공지사항 상태

}