package com.github.adamochen.ideaplugindemoccg.editor;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.TypedActionHandler;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/8 23:41
 */
public class SecondTypedHandler implements TypedActionHandler {
    @Override
    public void execute(@NotNull Editor editor,
                        char c,
                        @NotNull DataContext dataContext) {
        Document document = editor.getDocument();
        Project project = editor.getProject();

        //写操作必须保证线程安全，所以使用 WriteCommandAction.runWriteCommandAction（）
        WriteCommandAction.runWriteCommandAction(project, () -> document.insertString(0, "嘿嘿嘿\n"));
    }
}