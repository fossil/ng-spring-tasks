package org.pakhomov.tasks.controller;

import org.pakhomov.tasks.domain.Task;
import org.pakhomov.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

/**Created by fossil on
 * @author Victor Pakhomov
 * @since 02.08.18.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return taskService.list();
    }

    @PostMapping("/save")
    public Task save(@RequestBody Task task) {
        return taskService.save(task);
    }
}
