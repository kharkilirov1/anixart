package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

@Immutable
@GwtIncompatible
/* loaded from: classes.dex */
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* renamed from: b */
    public final ImmutableMap<Class<? extends B>, B> f21026b;

    public static final class Builder<B> {
        public Builder() {
            ImmutableMap.m11648a();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public Object mo11329H() {
        return this.f21026b;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: H */
    public Map<Class<? extends B>, B> mo7455G() {
        return this.f21026b;
    }
}
