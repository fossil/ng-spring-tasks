package org.pakhomov.tasks.service;

import org.pakhomov.tasks.domain.Task;
import org.pakhomov.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * @author Victor Pakhomov
 * @since 02.08.18.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
