import java.util.*;

public class DistributedJobSchedulerQuestion {
    private List jobs;
    private Map workers;

    public DistributedJobSchedulerQuestion() {
        jobs = new ArrayList(); // 1. Raw type usage
        workers = new HashMap(); // 2. Missing generics
    }

    public void addJob(String jobId, String workerId) {
        if (!workers.containsKey(workerId)) {
            System.out.println("Worker not registered"); // 3. Weak error handling
            return;
        }
        jobs.add(jobId + "->" + workerId); // 4. Inefficient job storage format
    }

    public void registerWorker(String workerId) {
        if (workers.containsKey(workerId)) {
            System.out.println("Worker already exists"); // 5. Weak duplicate handling
            return;
        }
        workers.put(workerId, new Object());
    }

    public void distributeJobs() {
        for (Object job : jobs) {
            String[] parts = job.toString().split("->");
            if (parts.length != 2) {
                System.out.println("Invalid job format"); // 6. Poor validation
                continue;
            }
            String jobId = parts[0];
            String workerId = parts[1];
            System.out.println("Assigning job " + jobId + " to worker " + workerId);
        }
    }

    public void removeWorker(String workerId) {
        if (!workers.containsKey(workerId)) {
            System.out.println("Worker does not exist");
            return;
        }
        workers.remove(workerId);
        jobs.removeIf(job -> job.toString().contains("->" + workerId)); // 7. Inefficient cleanup
    }
}
