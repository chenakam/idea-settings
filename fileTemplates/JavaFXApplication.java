#parse("Copyright.java")

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME};#end
#parse("File Header.java")

import javafx.application.Application;
import javafx.stage.Stage;

public class ${NAME} extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
    }
}
