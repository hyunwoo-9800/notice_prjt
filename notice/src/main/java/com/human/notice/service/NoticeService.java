package com.human.notice.service;

import com.human.notice.vo.NoticeVO;

import java.util.List;

public interface NoticeService {

    // 전체 공지사항 조회
    List<NoticeVO> listNotice() throws Exception;

}
