package org.zerock.bjtotal.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.bjtotal.dto.PageRequestDTO;
import org.zerock.bjtotal.dto.ReplyDTO;

public interface ReplyMapper {
  
    int insert(ReplyDTO replyDTO);

    int updateGno (Long rno);

    int insertChild(ReplyDTO replyDTO);

    List<ReplyDTO> selectList(
        @Param("tno")Long tno, 
        @Param("pr")PageRequestDTO pageRequestDTO
    );

    ReplyDTO selectOne(Long rno);

    @Select("select count(rno) from tbl_reply2 where tno =#{tno}")
    int getTnoCount(Long tno);
}