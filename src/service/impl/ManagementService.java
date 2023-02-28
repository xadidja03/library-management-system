package service.impl;

import util.MenuUtil;

public class ManagementService{

    public void management(){
        LibraryService libraryService = new LibraryService();

        while (true) {
            int option = MenuUtil.entry();
            switch (option) {
                case 0:
                    System.out.println("Good bye!\n");
                    System.exit(-1);
                case 1:
                    libraryService.register();
                    break;
                case 2:
                    libraryService.getListBooks();
                    break;
                default:

                    System.err.println("Invalid option!");
            }

        }
    }
}

