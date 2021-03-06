package com.company.gui;

import com.company.settings.Style;
import com.company.settings.Text;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.util.Date;
import java.util.Properties;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class MainDatePicker {

    private final JDatePickerImpl datePicker;

    public MainDatePicker() {
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", Text.get("TODAY"));
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);

        datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        model.setValue(new Date());

        JButton button = (JButton) datePicker.getComponent(1);
        button.setIcon(Style.ICON_DATE);
        button.setText("");

    }

    public JDatePickerImpl getDatePicker() {
        return datePicker;
    }

    public void setValue(Date date) {
        ((UtilDateModel) datePicker.getModel()).setValue(date);
    }

}
