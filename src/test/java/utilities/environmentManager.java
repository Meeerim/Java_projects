package utilities;

public class environmentManager {
    // dev  qa proud
    public static String baseURL;
    public static String userName;
    public static String password;



    public static void setUpEnvironment(){
        switch (ConfigReader.getProperty("environment").toLowerCase()){
            case "dev":
                Dev();
                break;
            case "qa":
                QA();
                break;
            case "prod":
                Prod();
                break;
        }
    }
    private static void Dev(){
        baseURL="https://nambafood.kg/";
        userName ="devUserName";
        password = "somePassword";
    }
    public static void QA (){
        baseURL = "https://qa.nambafood.kg/";
        userName = "QaUserName";
        password ="somePassword";
    }
    public static void Prod(){
        baseURL = "https://nambafood.kg/";
        userName = "ProdUserName";
        password ="somePassword";

    }
}
