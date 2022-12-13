package sqgxy.xmp.music.service;

import sqgxy.xmp.music.entity.Comment;

import java.util.List;

public interface CommentService {

    boolean addComment(Comment comment);

    boolean updateCommentMsg(Comment comment);

    boolean deleteComment(Integer id);

    List<Comment> commentOfSongId(Integer songId);

    List<Comment> commentOfSongListId(Integer songListId);

}
