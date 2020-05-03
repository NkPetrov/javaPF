package com.company.gui.panel;

import com.company.gui.MainFrame;
import com.company.gui.table.AccountTableData;
import com.company.gui.table.ArticleTableData;
import com.company.gui.toolbar.FunctionsToolBar;
import com.company.settings.Style;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class ArticlePanel extends RightPanel {

    public ArticlePanel(MainFrame frame) {
        super(frame, new ArticleTableData(), "ARTICLES", Style.ICON_PANEL_ARTICLES, new FunctionsToolBar());
    }

}
