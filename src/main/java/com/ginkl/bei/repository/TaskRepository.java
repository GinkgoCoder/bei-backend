package com.ginkl.bei.repository;

import com.ginkl.bei.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
