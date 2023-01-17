public class PP {
    public static void main(String[] args) {
        PP pp= new PP();
        pp.demo();
        pp.demoInterfaces(new DailyOperationsMariaImpl());
    }

    private void demo() {
        DailyOperations dd = new DailyOperationsMariaImpl();
        dd.operations();
        dd.doSmth();
    }

    private void demoInterfaces(DailyOperations pDailyOper) {
        pDailyOper.operations();
        pDailyOper.doSmth();
    }
}
