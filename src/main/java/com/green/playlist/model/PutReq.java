package com.green.playlist.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PutReq {
    private String title;
    private String singer;
    private String writer;
    private int listId;
}
