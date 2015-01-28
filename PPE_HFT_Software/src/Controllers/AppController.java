package Controllers;

import Models.DBConnection;
import Models.DBConnectionImpl;
import Models.ReadExcelFile;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Main Controller of PPE_HFT application
 *
 * @author Nicolas_2
 */
public class AppController {

    /*
     * Main Method
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
         // Attempt Database Connection
         try {
         // create ReservationManager object
         DBConnection dbConnection = new DBConnectionImpl(args[0], args[1], args[2]);

         // create the database
            
         } catch (SQLException | ClassNotFoundException e) {
         System.err.println("Connection aborted " + e);
         }*/

        // Read excel file
        ReadExcelFile test = new ReadExcelFile();
        test.setInputFile("Execution.xls");
        test.read();
        System.out.println("coucou");
    }
}
