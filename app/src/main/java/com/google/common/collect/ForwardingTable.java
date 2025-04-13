package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import java.util.Map;
import java.util.Set;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Table<R, C, V> mo7455G();

    @Override // com.google.common.collect.Table
    /* renamed from: d */
    public Set<Table.Cell<R, C, V>> mo11409d() {
        return mo7455G().mo11409d();
    }

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
        return obj == this || mo7455G().equals(obj);
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return mo7455G().hashCode();
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return mo7455G().size();
    }

    @Override // com.google.common.collect.Table
    /* renamed from: t */
    public Map<R, Map<C, V>> mo11417t() {
        return mo7455G().mo11417t();
    }
}
