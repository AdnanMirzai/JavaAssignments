public class TodoMain {
    public static void main(String[] args) {

        Todo myTask = new Todo("Read Java book",
                "Read chapter 9 and 10 in Java book", Priority.HIGH);
        System.out.println(myTask.toString());

        myTask.addToDescription("do not forget 8.1 - 8.3!");
        System.out.println("Task: " + myTask.getTitle());
        System.out.println("Description: " + myTask.getDescription());
        System.out.println("Last updated: " + myTask.getLastUpdate());
        System.out.println("Done?: " + myTask.getTaskDone());
        System.out.println("Priority: " + myTask.getTaskPriority());

        myTask.taskDone();
        System.out.println("\nDone?: " + myTask.getTaskDone());

        Todo yourTask = new Todo("Read Industrial economy book",
                "Read chapters 1-4", Priority.LOW);
        System.out.println(yourTask.toString());

        yourTask.addToDescription("do not forget 8.1 - 8.3!");
        System.out.println("Task: " + yourTask.getTitle());
        System.out.println("Description: " + yourTask.getDescription());
        System.out.println("Last updated: " + yourTask.getLastUpdate());
        System.out.println("Done?: " + yourTask.getTaskDone());
        System.out.println("Priority: " + yourTask.getTaskPriority());
    }
}