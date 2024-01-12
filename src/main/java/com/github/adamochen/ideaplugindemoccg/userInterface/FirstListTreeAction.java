package com.github.adamochen.ideaplugindemoccg.userInterface;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.JBColor;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.ui.components.JBList;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 22:56
 */
public class FirstListTreeAction extends AnAction {

    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabled(false);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        // 创建一个 JBPanel
        JBPanel panel = new JBPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // 创建一个 JBList
        JBList<String> jbList = new JBList<>(new String[]{"Item 1", "Item 2", "Item 3"});
        jbList.setBackground(JBColor.background());

        // 创建一个 JScrollPane 包装 JBList
        JBScrollPane listScrollPane = new JBScrollPane(jbList);
        listScrollPane.setPreferredSize(JBUI.size(200, 150));

        // 创建一个 JBTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        root.add(node1);
        root.add(node2);

        Tree tree = new Tree(new DefaultTreeModel(root));
        tree.setBackground(JBColor.background());

        // 创建一个 JScrollPane 包装 JBTree
        JBScrollPane treeScrollPane = new JBScrollPane(tree);
        treeScrollPane.setPreferredSize(JBUI.size(200, 150));

        // 将列表和树添加到 JBPanel
        panel.add(listScrollPane);
        // 添加一些间距
        panel.add(Box.createHorizontalStrut(10));
        panel.add(treeScrollPane);

        // 创建弹出框，包含 JBPanel
        JBPopup popup = JBPopupFactory.getInstance()
                .createComponentPopupBuilder(panel, null)
                .setTitle("List and Tree Example")
                .setMovable(true)
                .setResizable(true)
                .setDimensionServiceKey(null, "ListTreePopup", false)
                .createPopup();

        // 显示弹出框，相对于事件触发的位置
        RelativePoint showPoint = JBPopupFactory.getInstance().guessBestPopupLocation(e.getDataContext());
        popup.show(showPoint);
    }
}