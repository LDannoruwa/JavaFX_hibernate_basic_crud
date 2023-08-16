package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

import org.example.dto.CustomerDto;
import org.example.service.ServiceFactory;
import org.example.service.ServiceType;
import org.example.service.custom.CustomerService;

public class CustomerController {
    @FXML
    private TextField txt_customerAddress;

    @FXML
    private TextField txt_customerID;

    @FXML
    private TextField txt_customerName;

    @FXML
    private TextField txt_customerSalary;

    private CustomerService customerService = ServiceFactory.getService(ServiceType.CUSTOMER);

    @FXML
    void btnSaveOnAction(ActionEvent event) {

            int customerID = Integer.parseInt(this.txt_customerID.getText());
            String customerName = this.txt_customerName.getText();
            String customerAddress = this.txt_customerAddress.getText();
            double customerSalary = Double.parseDouble(this.txt_customerSalary.getText());

            CustomerDto customerDto = new CustomerDto(customerID, customerName, customerAddress, customerSalary);

        try {
            boolean isSaved = customerService.saveCustomer(customerDto);

            if (isSaved) {
                (new Alert(AlertType.CONFIRMATION, "Customer is saved.!", new ButtonType[0])).show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }
}
