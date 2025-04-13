package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.bc */
/* loaded from: classes2.dex */
public class C3844bc {

    /* renamed from: a */
    @Nullable
    public final C3818ac f44822a;

    /* renamed from: b */
    @NonNull
    public final EnumC3911e1 f44823b;

    /* renamed from: c */
    @Nullable
    public final String f44824c;

    public C3844bc() {
        this(null, EnumC3911e1.UNKNOWN, "identifier info has never been updated");
    }

    /* renamed from: a */
    public boolean m19650a() {
        C3818ac c3818ac = this.f44822a;
        return (c3818ac == null || TextUtils.isEmpty(c3818ac.f44734b)) ? false : true;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("AdTrackingInfoResult{mAdTrackingInfo=");
        m24u.append(this.f44822a);
        m24u.append(", mStatus=");
        m24u.append(this.f44823b);
        m24u.append(", mErrorExplanation='");
        m24u.append(this.f44824c);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }

    public C3844bc(@Nullable C3818ac c3818ac, @NonNull EnumC3911e1 enumC3911e1, @Nullable String str) {
        this.f44822a = c3818ac;
        this.f44823b = enumC3911e1;
        this.f44824c = str;
    }
}
