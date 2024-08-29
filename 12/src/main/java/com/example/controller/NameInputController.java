
package com.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class NameInputController {

    @FXML
    private TextField playerNameField;

    @FXML
    public void handleContinue(ActionEvent event) throws IOException {
        String playerName = playerNameField.getText();
        if (playerName.isEmpty()) {
            return;
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/view/game.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));

        GameController controller = loader.getController();
        controller.setPlayerName(playerName);
    }
}