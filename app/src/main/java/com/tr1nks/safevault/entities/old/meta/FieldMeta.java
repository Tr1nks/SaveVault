package com.tr1nks.safevault.entities.old.meta;

import com.tr1nks.safevault.entities.meta.Meta;

public class FieldMeta extends Meta {
    private int fieldType;
    private int fieldOrder;

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public int getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(int fieldOrder) {
        this.fieldOrder = fieldOrder;
    }
}
