package com.ginkl.bei.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Task {
    @Id
    private String id;
    private String title;
    private Date dueData;
    private String content;
    private TaskPriority priority;
}
