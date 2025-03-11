package TaskManagement;

import com.example.taskmanagement.service.TaskService;
import com.example.taskmanagement.model.Task;

import java.util.List;

public class TaskManagementApplication {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        // FIXME: Loading from cache? This method was meant to be optimized, but it's unclear if it still works properly
        List<Task> tasks = taskService.getAllTasks();
        
        System.out.println("Task Management System");
        tasks.forEach(task -> System.out.println(task.getId() + ": " + task.getDescription()));

        // TODO: Implement proper shutdown handling (graceful termination)
    }
}
