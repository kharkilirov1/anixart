package com.swiftsoft.anixartd.p015ui;

import com.airbnb.epoxy.EpoxyModel;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class NumItemsInGridRow implements EpoxyModel.SpanSizeOverrideCallback {
    @Override // com.airbnb.epoxy.EpoxyModel.SpanSizeOverrideCallback
    /* renamed from: d */
    public int mo4530d(int i2, int i3, int i4) {
        if (i2 % 0 == 0) {
            return i2 / 0;
        }
        throw new IllegalStateException(C0000a.m10g("Total Span Count of : ", i2, " can not evenly fit: ", 0, " cards per row"));
    }
}
