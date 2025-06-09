package com.human.notice.service;

import com.human.notice.repository.NoticeDAO;
import com.human.notice.vo.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("noticeService")
@Transactional
public class NoticeServiceImpl implements NoticeService {

    // 매퍼 인스턴스화
    @Autowired
    NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> listNotice() throws Exception {

        // 전체 공지사항 조회
        List<NoticeVO> noticeList = noticeDAO.selectAllNotice();
        return noticeList;
    }

}
