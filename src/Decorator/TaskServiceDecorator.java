package Decorator;

// TaskServiceDecorator 추상 클래스: 작업 관리 서비스 데코레이터의 기본 구조를 정의합니다.
public abstract class TaskServiceDecorator implements TaskService {
    protected TaskService decoratedTaskService;

    public TaskServiceDecorator(TaskService decoratedTaskService) {
        this.decoratedTaskService = decoratedTaskService;
    }

    @Override
    public void assignTask(String task, String assignee) {
        decoratedTaskService.assignTask(task, assignee);
    }

    @Override
    public void updateTaskStatus(String task, String status) {
        decoratedTaskService.updateTaskStatus(task, status);
    }
}
