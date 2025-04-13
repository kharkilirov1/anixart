package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Jn */
/* loaded from: classes2.dex */
public class C3405Jn {

    /* renamed from: a */
    private final String f43252a;

    /* renamed from: b */
    @NonNull
    private final C3379Im f43253b;

    public C3405Jn(int i2, @NonNull String str, @NonNull C3379Im c3379Im) {
        this.f43252a = str;
        this.f43253b = c3379Im;
    }

    /* renamed from: a */
    public boolean m18418a(@NonNull C3329Gm c3329Gm, @NonNull String str, @Nullable String str2) {
        int m18179a = c3329Gm.m18179a();
        if (str2 != null) {
            m18179a += str2.length();
        }
        if (c3329Gm.containsKey(str)) {
            String str3 = c3329Gm.get(str);
            if (str3 != null) {
                m18179a -= str3.length();
            }
        } else {
            m18179a += str.length();
        }
        return m18179a > 4500;
    }

    /* renamed from: a */
    public void m18417a(@NonNull String str) {
        if (this.f43253b.m21337c()) {
            this.f43253b.m21336c("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f43252a, 4500, str);
        }
    }
}
