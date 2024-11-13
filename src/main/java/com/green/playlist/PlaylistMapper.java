package com.green.playlist;

import com.green.playlist.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlaylistMapper {
    int postSong(PostReq p);
    List<GetRes> getList();
    GetResOne getPlay(int listId);
    int putSong(PutReq p);
    int delSong(DelReq p);
}
