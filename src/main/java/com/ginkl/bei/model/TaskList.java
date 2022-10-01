package com.ginkl.bei.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class TaskList {
    @Id
    private String id;
    private List<String> taskIds;
}
