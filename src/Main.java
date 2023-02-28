import service.ManagementServiceImpl;
import service.impl.ManagementService;

public class Main {
    public static void main(String[] args) {
        while (true) {
            ManagementService managementService = new ManagementService();
            managementService.management();

        }
    }
}