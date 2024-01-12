package com.github.adamochen.ideaplugindemoccg.userInterface;

import com.intellij.openapi.ui.DialogWrapper;
import com.sun.istack.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 21:58
 */
public class FirstDialogWrapper extends DialogWrapper {

    public FirstDialogWrapper() {
        // use current window as parent
        super(true);
        setTitle("Test FirstDialogWrapper");
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("testing");
        label.setPreferredSize(new Dimension(200, 200));
        dialogPanel.add(label, BorderLayout.CENTER);

        return dialogPanel;
    }
}