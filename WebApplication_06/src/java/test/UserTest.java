/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDAO;
import dto.UserDTO;

/**
 *
 * @author lehuy
 */
public class UserTest {

    public static void main(String[] args) {
        UserDTO ul = new UserDTO("TLN01", "Le Quoc Huy", "AD", "khong_co_pass");
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.create(ul));

        for (int i = 0; i < 10; i++) {
            UserDTO ui = new UserDTO("USER" + i, "Nguyen Van " + i, "US", i + "");
            userDAO.create(ui);
        }
    }
}
