package com.hiccup.test;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

/**
 * @Author: Hiccup
 * @Date: 2019/9/22 16:02
 */
public class TranslateAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Messages.showMessageDialog("Hello World !", "Information", Messages.getInformationIcon());
    }
}
