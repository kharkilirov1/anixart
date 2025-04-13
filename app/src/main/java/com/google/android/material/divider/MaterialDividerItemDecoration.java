package com.google.android.material.divider;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: f */
    public void mo3404f(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        int m3782P = recyclerView.m3782P(view);
        if ((m3782P == -1 || m3782P == state.m3942b() - 1) ? false : true) {
            rect.right = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: g */
    public void mo3576g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            canvas.clipRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            recyclerView.getHeight();
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (m10040i(recyclerView, childAt)) {
                RecyclerView.m3760S(childAt, null);
                throw null;
            }
        }
        canvas.restore();
    }

    /* renamed from: i */
    public final boolean m10040i(@NonNull RecyclerView recyclerView, @NonNull View view) {
        int m3782P = recyclerView.m3782P(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return (m3782P == -1 || adapter == null || m3782P == adapter.getItemCount() - 1) ? false : true;
    }
}
