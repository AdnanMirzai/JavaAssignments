public class TodoMain {
    public static void main(String[] args) {
        Todo myTask = new Todo("Read Java book", "Read chapter 9 and 10 in Java book");
        System.out.println(myTask.toString());

        myTask.addToDescription("do not forget 8.1 - 8.3!");
        System.out.println("Task: " + myTask.getTitle());
        System.out.println("Description: " + myTask.getDescription());
        System.out.println("Last updated: " + myTask.getLastUpdate());
        System.out.println("Done?: " + myTask.getTaskDone());

        myTask.taskDone();
        System.out.println("\nDone?: " + myTask.getTaskDone());
    }
}
