package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.lang.Enum;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    @Override // com.google.common.collect.AbstractBiMap
    /* renamed from: J */
    public Object mo11326J(Object obj) {
        Enum r1 = (Enum) obj;
        Objects.requireNonNull(r1);
        return r1;
    }

    @Override // com.google.common.collect.AbstractBiMap
    /* renamed from: K */
    public Object mo11327K(Object obj) {
        Enum r1 = (Enum) obj;
        Objects.requireNonNull(r1);
        return r1;
    }
}
