package TaskManagement.service;

import com.example.taskmanagement.model.Task;
import TaskManagement.repository.TaskRepository;

import java.util.List;

public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService() {
        this.taskRepository = new TaskRepository();
    }

    public List<Task> getAllTasks() {
        // FIXME: Cache layer was removed due to performance issues, but it might need re-implementation
        return taskRepository.findAll();
    }

    public void addTask(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Task description cannot be empty");
        }
        taskRepository.save(new Task(description));
    }
}
