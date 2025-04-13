package com.google.common.eventbus;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;

@Beta
/* loaded from: classes.dex */
public class DeadEvent {
    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("source", null);
        m11166b.m11171e("event", null);
        return m11166b.toString();
    }
}
