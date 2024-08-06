package Decorator;

// LoggingDecorator 클래스: 작업 관리 서비스에 로깅 기능을 추가하는 데코레이터를 구현합니다.
public class LoggingDecorator extends TaskServiceDecorator {
    public LoggingDecorator(TaskService decoratedTaskService) {
        super(decoratedTaskService);
    }

    @Override
    public void assignTask(String task, String assignee) {
        System.out.println("Logging: Assigning task '" + task + "' to " + assignee);
        super.assignTask(task, assignee);
        System.out.println("Logging: Task '" + task + "' assigned to " + assignee);
    }

    @Override
    public void updateTaskStatus(String task, String status) {
        System.out.println("Logging: Updating task '" + task + "' status to " + status);
        super.updateTaskStatus(task, status);
        System.out.println("Logging: Task '" + task + "' status updated to " + status);
    }
}