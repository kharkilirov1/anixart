package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.bb */
/* loaded from: classes2.dex */
public class C3843bb {

    /* renamed from: a */
    @NonNull
    private final Context f44816a;

    /* renamed from: b */
    @NonNull
    private final String f44817b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3869cb f44818c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3807a1 f44819d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3529Om f44820e;

    /* renamed from: f */
    @NonNull
    private final C3583R2 f44821f;

    public C3843bb(@NonNull Context context, @NonNull String str, @NonNull InterfaceC3869cb interfaceC3869cb, @NonNull InterfaceC3807a1 interfaceC3807a1) {
        this(context, str, interfaceC3869cb, interfaceC3807a1, new C3504Nm(), new C3583R2());
    }

    /* renamed from: a */
    public boolean m19649a(@Nullable C3716Wa c3716Wa) {
        long mo18644b = this.f44820e.mo18644b();
        if (c3716Wa == null) {
            return false;
        }
        boolean z = true;
        boolean z2 = mo18644b <= c3716Wa.f44374a;
        if (!z2) {
            z = z2;
        } else if (this.f44819d.mo18321a() + mo18644b > c3716Wa.f44374a) {
            z = false;
        }
        if (z) {
            return this.f44821f.m18938b(this.f44818c.mo19238a(new C3241D9(C3567Qa.m18783a(this.f44816a).m18799g())), c3716Wa.f44375b, C0000a.m20q(new StringBuilder(), this.f44817b, " diagnostics event"));
        }
        return false;
    }

    @VisibleForTesting
    public C3843bb(@NonNull Context context, @NonNull String str, @NonNull InterfaceC3869cb interfaceC3869cb, @NonNull InterfaceC3807a1 interfaceC3807a1, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3583R2 c3583r2) {
        this.f44816a = context;
        this.f44817b = str;
        this.f44818c = interfaceC3869cb;
        this.f44819d = interfaceC3807a1;
        this.f44820e = interfaceC3529Om;
        this.f44821f = c3583r2;
    }
}
