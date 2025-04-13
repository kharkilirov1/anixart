package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes.dex */
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    BoundType(boolean z) {
    }

    /* renamed from: a */
    public static BoundType m11424a(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
