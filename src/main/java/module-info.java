module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.slf4j;
    requires org.seleniumhq.selenium.chrome_driver;
    requires passay;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.remote_driver;
    requires dev.failsafe.core;
    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}