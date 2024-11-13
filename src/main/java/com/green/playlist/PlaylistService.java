package com.green.playlist;

import com.green.playlist.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistService {
    private final PlaylistMapper mapper;
    public int postSong(PostReq p){
        return mapper.postSong(p);
    };
    public List<GetRes> getList(){
        return mapper.getList();
    };
    public GetResOne getPlay(int listId){
        return mapper.getPlay(listId);
    };
    public int putSong(PutReq p){
        return mapper.putSong(p);
    };
    public int delSong(DelReq p){
        return mapper.delSong(p);
    };
}
