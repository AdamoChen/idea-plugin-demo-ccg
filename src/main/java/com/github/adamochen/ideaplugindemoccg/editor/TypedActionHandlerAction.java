package com.github.adamochen.ideaplugindemoccg.editor;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/8 22:50
 */
public class TypedActionHandlerAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        // 获取修改所必须的对象
        Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
        Project project = event.getRequiredData(CommonDataKeys.PROJECT);
        Document document = editor.getDocument();

        // 从文本插入符(caret) 中获取已选择文本的相关信息
        Caret primaryCaret = editor.getCaretModel().getPrimaryCaret();
        int start = primaryCaret.getSelectionStart();
        int end = primaryCaret.getSelectionEnd();

//        int column = primaryCaret.getLogicalPosition().column;
//        primaryCaret.getOffset()
//        editor.getCaretModel().getPrimaryCaret().getVisualPosition();


        // 替换字符串
        // 必须在write action 里执行.
        WriteCommandAction.runWriteCommandAction(project, () ->
                document.replaceString(start, end, "替换替换替换123abc")
        );
        // 因为已选择文本已被替换，所以移除它的选择状态
        primaryCaret.removeSelection();
    }
}