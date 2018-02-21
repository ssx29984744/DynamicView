package com.benny.library.dynamicview.widget;

import android.content.Context;
import android.widget.LinearLayout;

import com.benny.library.dynamicview.annotations.DynamicView;
import com.benny.library.dynamicview.view.ViewType;

@DynamicView
public class VBox extends LinearLayout implements ViewType.GroupView {
    public VBox(Context context) {
        super(context);
        setOrientation(VERTICAL);
    }
}
