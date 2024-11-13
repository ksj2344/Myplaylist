package com.green.playlist;

import com.green.playlist.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("playlist")
@RequiredArgsConstructor
public class PlaylistController {
    private final PlaylistService Service;
    @PostMapping
    public int postSong(@RequestBody PostReq p){
        return Service.postSong(p);
    };
    @GetMapping
    public List<GetRes> getList(){
        return Service.getList();
    };
    @GetMapping("{listId}")
    public GetResOne getPlay(@PathVariable int listId){
        return Service.getPlay(listId);
    };
    @PutMapping
    public int putSong(@RequestBody PutReq p){
        return Service.putSong(p);
    };
    @DeleteMapping
    public int delSong(DelReq p){
        return Service.delSong(p);
    };
}
