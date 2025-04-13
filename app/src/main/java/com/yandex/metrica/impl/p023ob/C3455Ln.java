package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Ln */
/* loaded from: classes2.dex */
public class C3455Ln {

    /* renamed from: a */
    @NonNull
    private final C3430Kn f43361a;

    /* renamed from: b */
    @NonNull
    private final C3405Jn f43362b;

    public C3455Ln(@NonNull C3379Im c3379Im, @NonNull String str) {
        this(new C3430Kn(30, 50, 4000, str, c3379Im), new C3405Jn(4500, str, c3379Im));
    }

    /* renamed from: a */
    public synchronized boolean m18525a(@NonNull C3329Gm c3329Gm, @NonNull String str, @Nullable String str2) {
        if (c3329Gm.size() >= this.f43361a.m18464a().m18182a() && (this.f43361a.m18464a().m18182a() != c3329Gm.size() || !c3329Gm.containsKey(str))) {
            this.f43361a.m18465a(str);
            return false;
        }
        if (this.f43362b.m18418a(c3329Gm, str, str2)) {
            this.f43362b.m18417a(str);
            return false;
        }
        c3329Gm.put(str, str2);
        return true;
    }

    /* renamed from: b */
    public boolean m18526b(@Nullable C3329Gm c3329Gm, @NonNull String str, @Nullable String str2) {
        if (c3329Gm == null) {
            return false;
        }
        String mo17985a = this.f43361a.m18466b().mo17985a(str);
        String mo17985a2 = this.f43361a.m18467c().mo17985a(str2);
        if (!c3329Gm.containsKey(mo17985a)) {
            if (mo17985a2 != null) {
                return m18525a(c3329Gm, mo17985a, mo17985a2);
            }
            return false;
        }
        String str3 = c3329Gm.get(mo17985a);
        if (mo17985a2 == null || !mo17985a2.equals(str3)) {
            return m18525a(c3329Gm, mo17985a, mo17985a2);
        }
        return false;
    }

    @VisibleForTesting
    public C3455Ln(@NonNull C3430Kn c3430Kn, @NonNull C3405Jn c3405Jn) {
        this.f43361a = c3430Kn;
        this.f43362b = c3405Jn;
    }
}
