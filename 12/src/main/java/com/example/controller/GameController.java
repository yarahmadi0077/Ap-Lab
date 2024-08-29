
package com.example.controller;

import com.example.model.GameModel;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class GameController {

    @FXML
    private GridPane gridPane;

    @FXML
    private Label timerLabel;

    private GameModel gameModel;
    private Random random = new Random();
    private Timeline timeline;
    private int timeRemaining = 60;
    private MediaPlayer mediaPlayer;
    private boolean isPlaying;

    public void setPlayerName(String playerName) {
        this.gameModel = new GameModel();
        startGame();
    }

    private void startGame() {
        initializeBoard();
        startTimer();
        playBackgroundMusic();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setPrefSize(100, 100);
                final int row = i;
                final int col = j;
                button.setOnAction(e -> handleMove(button, row, col));
                gridPane.add(button, i, j);
            }
        }
    }

    private void startTimer() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateTimer()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void playBackgroundMusic() {
        String musicFile = getClass().getResource("/com/example/music/background_music.mp3").toExternalForm();
        Media media = new Media(musicFile);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
        isPlaying = true;
    }

    private void handleMove(Button button, int row, int col) {
        if (!button.getText().isEmpty() || !gameModel.isPlayerTurn()) {
            return;
        }
        button.setText("X");
        gameModel.placeMove(row, col, "X");

        if (gameModel.checkWin("X")) {
            endGame("Player wins!");
            return;
        }

        if (gameModel.isBoardFull()) {
            endGame("Draw!");
            return;
        }

        gameModel.switchTurn();
        botMove();
    }

    private void botMove() {
        while (true) {
            int i = random.nextInt(3);
            int j = random.nextInt(3);
            if (gameModel.getBoard()[i][j] == null) { // Check if the cell is empty
                gameModel.placeMove(i, j, "O");
                Button button = (Button) gridPane.getChildren().get(i * 3 + j);
                button.setText("O");
                gameModel.switchTurn();
                break;
            }
        }

        if (gameModel.checkWin("O")) {
            endGame("Bot wins!");
            return;
        }

        if (gameModel.isBoardFull()) {
            endGame("Draw!");
        }
    }

    private void endGame(String message) {
        timeline.stop();
        if (isPlaying) {
            mediaPlayer.stop();
            isPlaying = false;
        }
        showAlert(message);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
        ((Stage) gridPane.getScene().getWindow()).close();
    }

    private void updateTimer() {
        timeRemaining--;
        timerLabel.setText(String.valueOf(timeRemaining));
        if (timeRemaining <= 0) {
            endGame("Draw!");
        }
    }

    @FXML
    private void toggleMusic() {
        if (isPlaying) {
            mediaPlayer.pause();
            isPlaying = false;
        } else {
            mediaPlayer.play();
            isPlaying = true;
        }
    }
}