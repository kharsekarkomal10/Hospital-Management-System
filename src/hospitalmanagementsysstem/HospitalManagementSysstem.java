package hospitalmanagementsysstem;

public class HospitalManagementSysstem {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);   // Your first JFrame
            }
        });
        
    }
}
