
package com.example.estacionamientoc2.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import java.util.concurrent.Semaphore;


public class VehiculoController implements Initializable, Observer {

    @FXML
    private Label lbentrada;
    @FXML
    private Label lb1;
    @FXML
    private Label lb2;
    @FXML
    private Label lb3;
    @FXML
    private Label lb4;
    @FXML
    private Label lb5;
    @FXML
    private Label lb6;
    @FXML
    private Label lb7;
    @FXML
    private Label lb8;
    @FXML
    private Label lb9;
    @FXML
    private Label lb10;
    @FXML
    private Label lb11;
    @FXML
    private Label lb14;
    @FXML
    private Label lb13;
    @FXML
    private Label lb12;
    @FXML
    private Label lb20;
    @FXML
    private Label lb16;
    @FXML
    private Label lb15;
    @FXML
    private Label lb18;
    @FXML
    private Label lb17;
    @FXML
    private Label lb19;
    @FXML
    public Button Boton;

    @FXML
    void comenzar(MouseEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void update(Observable o, Object arg) {

    }

}
