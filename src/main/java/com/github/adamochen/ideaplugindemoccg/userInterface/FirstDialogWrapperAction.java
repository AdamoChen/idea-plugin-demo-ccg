package com.github.adamochen.ideaplugindemoccg.userInterface;

import com.github.adamochen.ideaplugindemoccg.FirstProjectService;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

import javax.swing.*;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 22:12
 */
public class FirstDialogWrapperAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        JButton testButton = new JButton("FirstDialogWrapper button");
        testButton.addActionListener(actionEvent -> {
            if (new FirstDialogWrapper().showAndGet()) {
                // user pressed OK
            }
        });
    }
}