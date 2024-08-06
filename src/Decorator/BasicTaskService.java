package Decorator;

// BasicTaskService 클래스: 기본 작업 관리 서비스를 구현합니다.
public class BasicTaskService implements TaskService {
    @Override
    public void assignTask(String task, String assignee) {
        // 실제 작업 할당 로직
        System.out.println("Task '" + task + "' assigned to " + assignee);
    }

    @Override
    public void updateTaskStatus(String task, String status) {
        // 실제 작업 상태 업데이트 로직
        System.out.println("Task '" + task + "' status updated to " + status);
    }
}
