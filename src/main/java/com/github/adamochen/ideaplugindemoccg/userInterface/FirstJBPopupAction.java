package com.github.adamochen.ideaplugindemoccg.userInterface;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.awt.RelativePoint;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 22:30
 */
public class FirstJBPopupAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // 创建一个简单的弹出框
        createPopup(e);
    }


    private void createPopup(AnActionEvent e) {
        // 创建一个 JPanel 作为弹出框内容
        JPanel panel = new JPanel();
        panel.add(new JLabel("这是一个弹出框, 这是一个弹出框"));

        // 使用 JBPopupFactory 创建弹出框
        JBPopup popup = JBPopupFactory.getInstance()
                .createComponentPopupBuilder(panel, null)
                .setRequestFocus(true)
                .createPopup();

        // 显示弹出框，相对于事件触发的位置
        RelativePoint showPoint = JBPopupFactory.getInstance().guessBestPopupLocation(e.getDataContext());
        popup.show(showPoint);
    }
}