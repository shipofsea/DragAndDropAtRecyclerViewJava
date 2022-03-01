package com.mstar.dragdropsample3;

/**
 * Created by Mstar on 02-28-2022.
 */

public class ViewType {

    private final int dataIndex;
    private final int type;

    public ViewType(int dataIndex, int type) {
        this.dataIndex = dataIndex;
        this.type = type;
    }

    public int getDataIndex() {
        return dataIndex;
    }

    public int getType() {
        return type;
    }
}
