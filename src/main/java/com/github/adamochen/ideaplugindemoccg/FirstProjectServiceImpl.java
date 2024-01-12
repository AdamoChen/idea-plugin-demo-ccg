package com.github.adamochen.ideaplugindemoccg;

import com.intellij.openapi.project.Project;

/**
 * @author chenchonggui
 * @version 1.0
 * @date_time 2024/1/7 14:39
 */
public class FirstProjectServiceImpl implements FirstProjectService{
    @Override
    public void printServiceInfo(Project project) {
        System.out.println("1.-----------------------------");
        System.out.println("项目名：" + project.getName() + " this: " + this);
        System.out.println("2.=============================");
    }
}