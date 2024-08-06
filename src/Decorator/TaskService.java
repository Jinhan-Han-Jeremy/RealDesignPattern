package Decorator;

// TaskService 인터페이스: 작업 관리 서비스의 공통 인터페이스를 정의합니다.
public interface TaskService {
    void assignTask(String task, String assignee);
    void updateTaskStatus(String task, String status);
}
