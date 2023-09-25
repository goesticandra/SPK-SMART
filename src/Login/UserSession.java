/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
class UserSession {
    
    private static String userLogin;
    private static String userNama;

    public static void setUserLogin(String userLogin) {
        UserSession.userLogin = userLogin;
    }
    
    public static void setUserNama(String userNama) {
        UserSession.userNama = userNama;
    }
    
    
    
    
    
    //Untuk dipanggil di Pendataan-menuutama
    public static String getUserLogin() {
        return userLogin;
    }
    
    public static String getUserNama() {
        return userNama;
    }
}
