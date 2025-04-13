package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
abstract class zzet {
    /* renamed from: a */
    public abstract int mo10757a();

    /* renamed from: b */
    public abstract long mo10758b();

    @Nullable
    /* renamed from: c */
    public abstract String mo10759c();

    /* renamed from: d */
    public abstract boolean mo10760d();

    /* renamed from: e */
    public abstract boolean mo10761e();

    @Nullable
    /* renamed from: f */
    public abstract byte[] mo10762f();

    /* renamed from: g */
    public final boolean m10815g() {
        if (mo10759c() == null) {
            return false;
        }
        return mo10759c().endsWith("/");
    }

    /* renamed from: h */
    public final boolean m10816h() {
        return mo10757a() == 0;
    }
}
