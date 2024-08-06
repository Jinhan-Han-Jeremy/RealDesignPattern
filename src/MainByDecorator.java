import Decorator.BasicTaskService;
import Decorator.LoggingDecorator;
import Decorator.NotificationDecorator;
import Decorator.TaskService;

public class MainByDecorator {
    public static void main(String[] args) {
        TaskService taskService = new BasicTaskService();

        // 작업 관리 서비스에 로깅 데코레이터 추가
        taskService = new LoggingDecorator(taskService);

        // 작업 관리 서비스에 상태 알림 데코레이터 추가
        taskService = new NotificationDecorator(taskService);

        // 작업 할당
        taskService.assignTask("Design Database Schema", "Alice");

        System.out.println();

        // 작업 상태 업데이트
        taskService.updateTaskStatus("Design Database Schema", "In Progress");
    }
}
