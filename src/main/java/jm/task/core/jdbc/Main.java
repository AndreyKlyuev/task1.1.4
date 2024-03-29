package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Антон", "Филатов", (byte) 33);
        userService.saveUser("Вадим", "Сушенко", (byte) 18);
        userService.saveUser("Екатерина", "Распутина", (byte) 26);
        userService.saveUser("Андрей", "Онопко", (byte) 56);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
