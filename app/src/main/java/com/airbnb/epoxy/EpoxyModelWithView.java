package com.airbnb.epoxy;

import android.view.View;

/* loaded from: classes.dex */
public abstract class EpoxyModelWithView<T extends View> extends EpoxyModel<T> {
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: d2 */
    public final int mo4499d2() {
        throw new UnsupportedOperationException("Layout resources are unsupported. Views must be created with `buildView`");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }
}
