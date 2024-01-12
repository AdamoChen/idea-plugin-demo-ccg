package com.github.adamochen.ideaplugindemoccg.dispose;

import com.intellij.openapi.Disposable;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 20:51
 */
public class FirstDisposeService implements Disposable {
    @Override
    public void dispose() {
        System.out.println("------------ 清除FirstDisposeService资源 -------------");
    }
}