package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class Jobs {

    /* renamed from: a */
    public final Map<Key, EngineJob<?>> f8285a = new HashMap();

    /* renamed from: b */
    public final Map<Key, EngineJob<?>> f8286b = new HashMap();

    /* renamed from: a */
    public final Map<Key, EngineJob<?>> m5054a(boolean z) {
        return z ? this.f8286b : this.f8285a;
    }
}
