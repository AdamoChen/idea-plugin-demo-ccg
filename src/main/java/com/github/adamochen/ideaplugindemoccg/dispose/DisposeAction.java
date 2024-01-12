package com.github.adamochen.ideaplugindemoccg.dispose;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Disposer;
import org.jetbrains.annotations.NotNull;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 20:53
 */
public class DisposeAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getRequiredData(CommonDataKeys.PROJECT);
        FirstDisposeService firstDisposeService = new FirstDisposeService();
        ParentDisposeService parentDisposeService = new ParentDisposeService();
        Disposer.register(parentDisposeService, firstDisposeService);

        Disposer.dispose(parentDisposeService);
    }
}