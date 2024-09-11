package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

public class UserPropertiesReader {
    private static Properties properties;
    //private static final String propertiesFileName = "user.properties";
    private static final String propertiesFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\user.properties";
    
    //JAR file - get from resources
    /*
    static {
        properties = new Properties();
        try {
            InputStream inputStream = UserPropertiesReader.class.getClassLoader().getResourceAsStream(propertiesFileName);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	*/
    
   //Run from IDE - Use absolute path
    
    static {
        properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(propertiesFilePath);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static String getUsername1() {
        return properties.getProperty("newuserusername1");
    }
    public static String getfirstname() {
        return properties.getProperty("firstname");
    }
    public static String getsurname() {
        return properties.getProperty("surname");
    }

    public static String getUsername2() {
        return properties.getProperty("newuserusername2");
    }
    
    public static String getmobnum() {
        return properties.getProperty("mobilenumber");
    }
    
    public static String getemail1() {
        return properties.getProperty("email1");
    }
    public static String getpassport() {
        return properties.getProperty("passport");
    }
    
   
    	
    
    public static String getpassword() {
    	return properties.getProperty("password");
    }
    
    public static String getdocumentno() {
    	return properties.getProperty("documentno");
    }
    
    public static String getaccountno() {
    	return properties.getProperty("accountno");
    }
    
    public static String getemail2() {
        return properties.getProperty("email2");
    }

    public static String baseurl() {return properties.getProperty("baseUrl");}

    public static String gamename() {return properties.getProperty("Gamename");}

    public static void incrementUsername1() {
        String currentValue = properties.getProperty("newuserusername1");
        int number = Integer.parseInt(currentValue.substring(6)); // Correctly extract the numeric part starting from the 7th character
        number++; // Increment the number
        String newValue = currentValue.substring(0, 6) + String.format("%04d", number); // Format the number with leading zeros
        properties.setProperty("newuserusername1", newValue);

        saveProperties(propertiesFilePath);
    }


    public static void incrementUsername2() {
        String currentValue = properties.getProperty("newuserusername2");
        int number = Integer.parseInt(currentValue.substring(6)); // Correctly extract the numeric part starting from the 7th character
        number++; // Increment the number
        String newValue = currentValue.substring(0, 6) + String.format("%04d", number); // Format the number with leading zeros
        properties.setProperty("newuserusername2", newValue);

        saveProperties(propertiesFilePath);
    }


    public static void incrementPassport() {
        String currentValue = properties.getProperty("passport");
        int number = Integer.parseInt(currentValue.substring(8)); // Extract the numeric part
        number++; // Increment the number
        String newValue = currentValue.substring(0, 8) + String.format("%09d", number); // Format the number with leading zeros
        properties.setProperty("passport", newValue);

        saveProperties(propertiesFilePath);
    }

    public static void incrementDocumentNo() {
        String currentValue = properties.getProperty("documentno");
        int number = Integer.parseInt(currentValue.substring(10)); // Extract the numeric part starting from the 11th character
        number++; // Increment the number
        String newValue = currentValue.substring(0, 10) + String.format("%06d", number); // Format the number with leading zeros
        properties.setProperty("documentno", newValue);

        saveProperties(propertiesFilePath);
    }
    public static void incrementAccountNo() {
        String currentValue = properties.getProperty("accountno");
        int number = Integer.parseInt(currentValue.substring(9)); // Extract the numeric part starting from the 10th character
        number++; // Increment the number
        String newValue = currentValue.substring(0, 9) + String.format("%06d", number); // Format the number with leading zeros
        properties.setProperty("accountno", newValue);

        saveProperties(propertiesFilePath);
    }
    
    public static void incrementMobileNumber() {
        // Retrieve the current value from the properties file
        String currentValue = properties.getProperty("mobilenumber");
        
        // Ensure the currentValue is not null and has a length sufficient for substring operations
        if (currentValue != null && currentValue.length() >= 9) {
            // Extract the numeric part of the string
            String numericPart = currentValue.substring(currentValue.length() - 9); // Extracts the last 9 digits
            int number = Integer.parseInt(numericPart);
            
            // Increment the numeric part
            number++;
            
            // Format the number to ensure it remains 9 digits long with leading zeros
            String newValue = currentValue.substring(0, currentValue.length() - 9) + String.format("%09d", number);
            
            // Update the property with the new value
            properties.setProperty("mobilenumber", newValue);

            // Save the updated properties to the file
            saveProperties(propertiesFilePath);
        } else {
            System.out.println("Current value is either null or has an incorrect format.");
        }
    }



    private static void saveProperties(String filePath) {
        try {
            OutputStream outputStream = new FileOutputStream(filePath);
            properties.store(outputStream, null);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
