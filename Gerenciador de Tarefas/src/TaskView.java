import java.util.List;

public class TaskView {
    public void printTasks(List<String> tasks) {
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
