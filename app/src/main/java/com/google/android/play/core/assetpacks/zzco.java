package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzco {

    /* renamed from: a */
    public final Map<String, Double> f19874a = new HashMap();

    /* renamed from: a */
    public final synchronized double m10774a(String str) {
        Double d = this.f19874a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* renamed from: b */
    public final synchronized void m10775b(String str) {
        this.f19874a.put(str, Double.valueOf(0.0d));
    }
}
