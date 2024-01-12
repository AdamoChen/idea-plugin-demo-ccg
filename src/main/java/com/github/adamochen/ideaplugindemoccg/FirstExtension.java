package com.github.adamochen.ideaplugindemoccg;

import com.github.adamochen.ideaplugindemoccg.userInterface.FirstDialogWrapper;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 14:06
 */
public class FirstExtension implements ToolWindowFactory {
    @Override
    public boolean isApplicable(@NotNull Project project) {
        return ToolWindowFactory.super.isApplicable(project);
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        // 创建一个简单的 JPanel 作为容器
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Hello, Tool Window!\n"));

        // 一个按钮
        JButton testButton = new JButton("test dialog");
        testButton.addActionListener(actionEvent -> {
            if (new FirstDialogWrapper().showAndGet()) {
                // user pressed OK
            }
        });

        myPanel.add(testButton);

        // 使用 ContentFactory 创建一个 Content 对象
        ContentFactory contentFactory = ContentFactory.getInstance();
        Content content = contentFactory.createContent(myPanel, "My Content", false);

        toolWindow.getContentManager().addContent(content);
    }

    @Override
    public void init(@NotNull ToolWindow toolWindow) {
        ToolWindowFactory.super.init(toolWindow);



    }

//    @Override
//    public boolean shouldBeAvailable(@NotNull Project project) {
//        return ToolWindowFactory.super.shouldBeAvailable(project);
//    }

//    @Override
//    public boolean isDoNotActivateOnStart() {
//        return ToolWindowFactory.super.isDoNotActivateOnStart();
//    }

    @Override
    public @Nullable ToolWindowAnchor getAnchor() {
        return ToolWindowAnchor.RIGHT;
    }

    @Override
    public @Nullable Icon getIcon() {
        return ToolWindowFactory.super.getIcon();
    }
}