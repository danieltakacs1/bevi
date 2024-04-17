import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(args[0]);
        Filehandler handler = new Filehandler();
        DataService service = new DataService();

        ArrayList<Customer> customerList = handler.readCustomers(args[0]);
        ArrayList<Incoming> incomingList = handler.readIncomings(args[1]);

        service.insertCustomers(customerList);
        service.insertIncomings(incomingList);

        // for (Incoming incoming : incomingList) {
        //     System.out.println(incoming.id);
        // }
    }
}
