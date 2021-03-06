// Bart 20060831 -> i18n

// **********************************************************************
// 
// <copyright>
// 
//  BBN Technologies
//  10 Moulton Street
//  Cambridge, MA 02138
//  (617) 873-8000
// 
//  Copyright (C) BBNT Solutions LLC. All rights reserved.
// 
// </copyright>
// **********************************************************************
// 
// $Source: /home/cvs/nodus/src/com/bbn/openmap/util/propertyEditor/YesNoPropertyEditor.java,v $
// $RCSfile: YesNoPropertyEditor.java,v $
// $Revision: 1.1 $
// $Date: 2006-08-31 15:56:07 $
// $Author: jourquin $
// 
// **********************************************************************

package com.bbn.openmap.util.propertyEditor;

import javax.swing.JRadioButton;

import com.bbn.openmap.Environment;
import com.bbn.openmap.I18n;

/**
 * A PropertyEditor that displays a Yes/No option. The widget returns
 * true or false as a string when queried.
 */
public class YesNoPropertyEditor extends TrueFalsePropertyEditor {

    //  I18N mechanism
    static I18n i18n = Environment.getI18n();
    
    public YesNoPropertyEditor() {
        trueButton = new JRadioButton(i18n.get(YesNoPropertyEditor.class, "Yes", "Yes"));
        falseButton = new JRadioButton(i18n.get(YesNoPropertyEditor.class, "No", "No"));
    }
}