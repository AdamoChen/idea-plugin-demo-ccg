package com.github.adamochen.ideaplugindemoccg;

import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 15:17
 */
public class FirstVfsListener implements BulkFileListener {

    @Override
    public void after(@NotNull List<? extends @NotNull VFileEvent> events) {

        System.out.println("------------------------ FirstVfsListener");
        System.out.println(events);
        System.out.println("======================== FirstVfsListener");

    }
}