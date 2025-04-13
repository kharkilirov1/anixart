package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.Enum;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    @Override // com.google.common.collect.AbstractBiMap
    /* renamed from: J */
    public Object mo11326J(Object obj) {
        Enum r1 = (Enum) obj;
        Objects.requireNonNull(r1);
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public Object put(Object obj, @NullableDecl Object obj2) {
        super.put((Enum) obj, obj2);
        return obj2;
    }
}
