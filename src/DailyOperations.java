public interface DailyOperations {
    int operations (int... params);
    default void doSmth() {
        System.out.println("ceva");
    }

    static void demo(){
    }
}
