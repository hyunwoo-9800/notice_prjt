package com.human.notice.repository;

import com.human.notice.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface NoticeDAO {

    // 전체 공지사항 조회
    public List<NoticeVO> selectAllNotice() throws DataAccessException;

}
