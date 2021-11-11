package com.many.manytomany.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table( name = "stream")
@Entity
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private List<Viewer> followers = new ArrayList<>();
    public Stream(String name) {
        this.name = name;
    }
    public void addViewer(Viewer viewer)
    {
        followers.add(viewer);
    }

}
