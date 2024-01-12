package com.github.adamochen.ideaplugindemoccg;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.JBColor;
import com.intellij.util.xml.ui.TextPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 10:34
 */
public class FirstAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        ApplicationManager.getApplication().invokeLater(() -> JBPopupFactory.getInstance()
                .createHtmlTextBalloonBuilder("this is a prompt", null,
                        new JBColor(new Color(0xF2F2F2), new Color(0x999999)), null)
                .setFadeoutTime(20000)
                .setHideOnAction(true)
                .createBalloon()
                .show(JBPopupFactory.getInstance().guessBestPopupLocation(e.getData(PlatformDataKeys.EDITOR)),
                        Balloon.Position.below));
    }
}
