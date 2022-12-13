package sqgxy.xmp.music.mapper;

import sqgxy.xmp.music.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int updateCommentMsg(Comment record);

    int deleteComment(Integer id);

    List<Comment> commentOfSongId(Integer songId);

    List<Comment> commentOfSongListId(Integer songListId);
}
