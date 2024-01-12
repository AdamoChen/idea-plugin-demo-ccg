package com.github.adamochen.ideaplugindemoccg;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.JBColor;

import java.awt.*;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 10:34
 */
public class ServiceAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        FirstProjectService service = project.getService(FirstProjectService.class);
        service.printServiceInfo(project);
    }
}
