/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

/**
 *
 * @author Himasha Harinda
 */
public class WebControllerUI {
    
    public static void loginUser(String username, String password)
    {
        DataManagement.loginUser(username, password);
        
    }
}
