package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Map;

@Beta
/* loaded from: classes2.dex */
public final class ImmutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    @Beta
    public static final class Builder<B> {
        public Builder() {
            ImmutableMap.m11648a();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public /* bridge */ /* synthetic */ Object mo7455G() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: H */
    public Map<TypeToken<? extends B>, B> mo11329H() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @DoNotCall
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }
}
