package com.airbnb.epoxy;

import android.widget.CompoundButton;
import com.airbnb.epoxy.EpoxyModel;
import java.util.Objects;

/* loaded from: classes.dex */
public class WrappedEpoxyModelCheckedChangeListener<T extends EpoxyModel<?>, V> implements CompoundButton.OnCheckedChangeListener {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedEpoxyModelCheckedChangeListener)) {
            return false;
        }
        Objects.requireNonNull((WrappedEpoxyModelCheckedChangeListener) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        EpoxyViewHolder m4589b = ListenersUtils.m4589b(compoundButton);
        if (m4589b == null || m4589b.getAdapterPosition() == -1) {
            return;
        }
        m4589b.m4576a();
        throw null;
    }
}
