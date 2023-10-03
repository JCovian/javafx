module es.covian.dam.di.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;

    opens es.covian.dam.di.testjavafx to javafx.fxml;
    exports es.covian.dam.di.testjavafx;
}
