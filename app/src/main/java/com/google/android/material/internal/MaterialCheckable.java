package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.MaterialCheckable;

@RestrictTo
/* loaded from: classes.dex */
public interface MaterialCheckable<T extends MaterialCheckable<T>> extends Checkable {

    public interface OnCheckedChangeListener<C> {
        /* renamed from: a */
        void mo10114a(C c2, boolean z);
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable OnCheckedChangeListener<T> onCheckedChangeListener);
}
