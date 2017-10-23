package com.szachnowicz;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class BeanInfo  extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor titlePositionDescriptor = new PropertyDescriptor("contBookTitle", ContactBookBean .class);
            titlePositionDescriptor.setPropertyEditorClass(TitleNameEditor.class);
            //PropertyDescriptor inverseDescriptor = new PropertyDescriptor("inverse", ChartBean.class);
            //inverseDescriptor.setPropertyEditorClass(InverseEditor.class);
            PropertyDescriptor regextDescriptor = new PropertyDescriptor("regex", ContactBookBean.class);
            regextDescriptor.setPropertyEditorClass(RegexArrayDescriptor.class);

            return new PropertyDescriptor[] {
                    regextDescriptor,
                    new PropertyDescriptor("contBookTitle", ContactBookBean.class), titlePositionDescriptor
                    //valuesDescriptor, new PropertyDescriptor("graphColor", ChartBean.class), inverseDescriptor
            };
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }


        return null;
    }
}
