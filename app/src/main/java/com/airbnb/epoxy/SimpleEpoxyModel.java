package com.airbnb.epoxy;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class SimpleEpoxyModel extends EpoxyModel<View> {
    @Override // com.airbnb.epoxy.EpoxyModel
    @CallSuper
    /* renamed from: Z1 */
    public void mo4496Z1(@NonNull View view) {
        View view2 = view;
        view2.setOnClickListener(null);
        view2.setClickable(false);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: d2 */
    public int mo4499d2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: e2 */
    public int mo4500e2(int i2, int i3, int i4) {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEpoxyModel) || !super.equals(obj)) {
            return false;
        }
        Objects.requireNonNull((SimpleEpoxyModel) obj);
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return (((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @CallSuper
    /* renamed from: s2 */
    public void mo4506s2(@NonNull View view) {
        view.setOnClickListener(null);
    }
}
