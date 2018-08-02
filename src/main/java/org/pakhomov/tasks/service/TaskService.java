package org.pakhomov.tasks.service;

import org.pakhomov.tasks.domain.Task;

/**
 * @author Victor Pakhomov
 * @since 02.08.18.
 */
public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
