package org.pakhomov.tasks.repository;

import org.pakhomov.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Victor Pakhomov
 * @since 02.08.18.
 */
public interface TaskRepository extends CrudRepository<Task, Long> {
}
