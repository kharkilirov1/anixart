package com.airbnb.epoxy.stickyheader;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"com/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$bindStickyHeader$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager$bindStickyHeader$1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ StickyHeaderLinearLayoutManager f7078b;

    /* renamed from: c */
    public final /* synthetic */ View f7079c;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f7079c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.f7078b;
        int i2 = stickyHeaderLinearLayoutManager.f7073J;
        if (i2 == -1) {
            return;
        }
        stickyHeaderLinearLayoutManager.mo3674I1(i2, stickyHeaderLinearLayoutManager.f7074K);
        throw null;
    }
}
