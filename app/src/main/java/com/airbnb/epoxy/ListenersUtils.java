package com.airbnb.epoxy;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ListenersUtils {
    @Nullable
    /* renamed from: a */
    public static RecyclerView m4588a(@Nullable View view) {
        if (view == null) {
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return (RecyclerView) parent;
        }
        if (parent instanceof View) {
            return m4588a((View) parent);
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static EpoxyViewHolder m4589b(View view) {
        RecyclerView m4588a = m4588a(view);
        if (m4588a == null) {
            return null;
        }
        View m3775H = m4588a.m3775H(view);
        RecyclerView.ViewHolder m3783Q = m3775H == null ? null : m4588a.m3783Q(m3775H);
        if (m3783Q != null && (m3783Q instanceof EpoxyViewHolder)) {
            return (EpoxyViewHolder) m3783Q;
        }
        return null;
    }
}
