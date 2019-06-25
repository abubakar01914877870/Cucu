package lib;

import com.csvreader.CsvWriter;
import lib.helperObject.PinterestUser;

import java.io.File;
import java.io.FileWriter;

public class WriteInCSV {

    public void ResultWriteInCSV(PinterestUser pUser){

        try {
            String csvOutputFile = "csvOutputFile.csv";
            boolean isFileExist = new File("target/" + csvOutputFile).exists();
            CsvWriter testcases = new CsvWriter(new FileWriter(csvOutputFile, true), ',');
//            if(!isFileExist){
//                testcases.write("User ID");
//                testcases.write("Password");
//
//                //end the record
//                testcases.endRecord();
//            }
              testcases.write(pUser.email);
              testcases.write(pUser.password);
              testcases.endRecord();
              testcases.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
