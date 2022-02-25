public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::print;
        OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(listener, error);
        worker.start();

    }
}
