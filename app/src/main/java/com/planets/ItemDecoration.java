package com.planets;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class ItemDecoration extends RecyclerView.ItemDecoration {

    private int halfSpace;

    public ItemDecoration(int space) {
        this.halfSpace = space / 2;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        if (parent.getPaddingLeft() != halfSpace) {
            parent.setPadding(halfSpace, halfSpace, halfSpace, halfSpace);
            parent.setClipToPadding(false);
        }

        outRect.top = (int) (halfSpace*0.5);
        outRect.bottom = (int) (halfSpace*0.5);
        outRect.left = halfSpace*2;
        outRect.right = halfSpace*2;
    }
}