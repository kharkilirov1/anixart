package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3671Uf;

/* renamed from: com.yandex.metrica.impl.ob.Id */
/* loaded from: classes2.dex */
public class C3370Id {

    /* renamed from: a */
    @NonNull
    private final C3219Cc f43121a;

    /* renamed from: b */
    @NonNull
    private final C3345Hd f43122b;

    public C3370Id(@NonNull C3219Cc c3219Cc, @NonNull C3345Hd c3345Hd) {
        this.f43121a = c3219Cc;
        this.f43122b = c3345Hd;
    }

    @Nullable
    /* renamed from: a */
    public C3671Uf.a m18309a(long j2, @Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C3643Tc m17931a = this.f43121a.m17931a(j2, str);
                if (m17931a != null) {
                    return this.f43122b.m18232a(m17931a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
