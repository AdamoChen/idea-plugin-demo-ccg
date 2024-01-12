package com.github.adamochen.ideaplugindemoccg.userInterface;

import javax.swing.*;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 22:01
 */
public class FirstDialogWrapperService {

    public FirstDialogWrapperService() {
       init();
    }

    private void init(){
        JButton testButton = new JButton();
        testButton.addActionListener(actionEvent -> {
            if (new FirstDialogWrapper().showAndGet()) {
                // user pressed OK
            }
        });
    }
}