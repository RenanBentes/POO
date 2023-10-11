import java.util.Scanner;

public class TaskController {
    private TaskModel model;
    private TaskView view;
    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(String task) {
        model.addTask(task);
    }

    public void showTasks() {
        view.printTasks(model.getTasks());
    }

    public void markTaskAsCompleted(int index) {
        model.markTaskAsCompleted(index);
    }

    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.printMessage("Escolha uma opção:\n1. Adicionar Tarefa\n2. Ver Tarefas\n3. Marcar Tarefa como Concluída\n4. Sair");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    view.printMessage("Digite a tarefa:");
                    String task = scanner.nextLine();
                    controller.addTask(task);
                    break;
                case 2:
                    controller.showTasks();
                    break;
                case 3:
                    view.printMessage("Digite o número da tarefa a ser marcada como concluída:");
                    int index = scanner.nextInt();
                    controller.markTaskAsCompleted(index - 1); // Subtrai 1 para corresponder ao índice na lista
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}