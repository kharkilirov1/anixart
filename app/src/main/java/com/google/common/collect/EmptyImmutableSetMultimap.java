package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes.dex */
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    static {
        new EmptyImmutableSetMultimap();
    }

    public EmptyImmutableSetMultimap() {
        super(RegularImmutableMap.f21426h, 0, null);
    }
}
