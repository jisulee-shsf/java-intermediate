package collection.deque.test.queue;

public class SchedulerTest {

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new CleanTask());

        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
        /*
        작업 시작
        데이터 압축...
        자료 백업...
        사용하지 않는 자원 정리...
        작업 완료
        */
    }

    private static void run(TaskScheduler scheduler) {
        while (scheduler.getRemainingTasks() > 0) {
            scheduler.processNextTask();
        }
    }
}
