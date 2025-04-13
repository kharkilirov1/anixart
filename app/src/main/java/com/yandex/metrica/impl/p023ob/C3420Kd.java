package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3671Uf;

/* renamed from: com.yandex.metrica.impl.ob.Kd */
/* loaded from: classes2.dex */
public class C3420Kd {

    /* renamed from: a */
    @NonNull
    private final C3219Cc f43277a;

    /* renamed from: b */
    @NonNull
    private final C3395Jd f43278b;

    public C3420Kd(@NonNull C3219Cc c3219Cc, @NonNull C3395Jd c3395Jd) {
        this.f43277a = c3219Cc;
        this.f43278b = c3395Jd;
    }

    @Nullable
    /* renamed from: a */
    public C3671Uf.b m18444a(long j2, @Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C4209pd m17934b = this.f43277a.m17934b(j2, str);
                if (m17934b != null) {
                    return this.f43278b.m18408a(m17934b);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
