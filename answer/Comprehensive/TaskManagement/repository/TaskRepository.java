package TaskManagement.repository;

import com.example.taskmanagement.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> findAll() {
        return tasks.stream()
            .filter(task -> !task.getDescription().equalsIgnoreCase("deleted")) // Soft deletion
            .collect(Collectors.toList());
    }

    public void save(Task task) {
        // FIXME: No validation logic here, should we check for duplicates?
        tasks.add(task);
    }

    public void delete(String taskId) {
        tasks.stream()
            .filter(task -> task.getId().equals(taskId))
            .findFirst()
            .ifPresent(task -> tasks.set(tasks.indexOf(task), new Task("deleted")));
    }
}
