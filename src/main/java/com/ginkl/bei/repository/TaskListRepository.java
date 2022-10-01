package com.ginkl.bei.repository;

import com.ginkl.bei.model.TaskList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskListRepository extends MongoRepository<TaskList, String> {
}
