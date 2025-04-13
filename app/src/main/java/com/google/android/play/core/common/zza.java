package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a */
    public final Map<String, Object> f20081a = new HashMap();

    /* renamed from: b */
    public final AtomicBoolean f20082b = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized boolean m10822a() {
        if (!this.f20082b.get()) {
            synchronized (this) {
                this.f20081a.put("assetOnlyUpdates", Boolean.FALSE);
            }
        }
        Object obj = this.f20081a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
