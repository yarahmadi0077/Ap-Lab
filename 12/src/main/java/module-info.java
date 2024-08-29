module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.scripting;

    opens com.example to javafx.fxml;
    opens com.example.controller to javafx.fxml; // برای دسترسی به کلاس کنترلر
    opens com.example.model to javafx.fxml; // برای دسترسی به مدل‌ها
    exports com.example;
}
