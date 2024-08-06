package Decorator;

// NotificationDecorator 클래스: 작업 상태 업데이트 시 알림 기능을 추가하는 데코레이터를 구현합니다.
public class NotificationDecorator extends TaskServiceDecorator {
    public NotificationDecorator(TaskService decoratedTaskService) {
        super(decoratedTaskService);
    }

    @Override
    public void assignTask(String task, String assignee) {
        super.assignTask(task, assignee);
        notifyAssignee(task, assignee);
    }

    @Override
    public void updateTaskStatus(String task, String status) {
        super.updateTaskStatus(task, status);
        notifyAssignee(task, status);
    }

    private void notifyAssignee(String task, String message) {
        // 간단한 알림 로직 (예: 콘솔 출력)
        System.out.println("Notification: Task '" + task + "' - " + message);
    }
}
