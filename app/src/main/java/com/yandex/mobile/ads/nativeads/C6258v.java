package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C5472n4;
import com.yandex.mobile.ads.impl.C6134zp;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.ok0;
import com.yandex.mobile.ads.impl.tg1;
import com.yandex.mobile.ads.impl.yp0;

/* renamed from: com.yandex.mobile.ads.nativeads.v */
/* loaded from: classes3.dex */
class C6258v implements ok0 {

    /* renamed from: a */
    @NonNull
    @VisibleForTesting
    public final InterfaceC6213h0 f57955a;

    /* renamed from: c */
    @NonNull
    private final AdResponse f57957c;

    /* renamed from: d */
    @Nullable
    private C6264w f57958d;

    /* renamed from: b */
    @NonNull
    private final yp0 f57956b = yp0.m29957a();

    /* renamed from: e */
    @NonNull
    private final C6134zp f57959e = new C6134zp();

    public C6258v(@NonNull C6210g c6210g, @NonNull AdResponse adResponse) {
        this.f57955a = c6210g;
        this.f57957c = adResponse;
    }

    /* renamed from: a */
    public final void m30740a(@NonNull C6264w c6264w) {
        this.f57958d = c6264w;
        this.f57955a.mo30550a(c6264w);
    }

    @NonNull
    /* renamed from: b */
    public final aa1 m30742b(@NonNull Context context, int i2) {
        Pair<aa1.EnumC4801a, String> mo30616a = mo30616a(context, i2, !this.f57956b.m29961b(context), true);
        aa1 mo30617a = mo30617a(context, (aa1.EnumC4801a) mo30616a.first, true, i2);
        mo30617a.m22443a((String) mo30616a.second);
        return mo30617a;
    }

    @Override // com.yandex.mobile.ads.impl.ok0
    @NonNull
    /* renamed from: a */
    public final aa1 mo27089a(@NonNull Context context, int i2) {
        Pair<aa1.EnumC4801a, String> mo30616a = mo30616a(context, i2, !this.f57956b.m29961b(context), false);
        aa1 mo30617a = mo30617a(context, (aa1.EnumC4801a) mo30616a.first, false, i2);
        mo30617a.m22443a((String) mo30616a.second);
        return mo30617a;
    }

    /* renamed from: b */
    public final boolean m30743b() {
        View m30754e;
        C6264w c6264w = this.f57958d;
        return (c6264w == null || (m30754e = c6264w.m30754e()) == null || tg1.m28657b(m30754e) < 1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<com.yandex.mobile.ads.impl.aa1.EnumC4801a, java.lang.String> mo30616a(@androidx.annotation.NonNull android.content.Context r7, int r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            com.yandex.mobile.ads.base.AdResponse r0 = r6.f57957c
            java.lang.String r0 = r0.m21833w()
            com.yandex.mobile.ads.impl.zp r1 = r6.f57959e
            java.util.Objects.requireNonNull(r1)
            boolean r7 = com.yandex.mobile.ads.impl.C6134zp.m30263a(r7)
            r1 = 0
            if (r9 == 0) goto L18
            if (r10 != 0) goto L18
            com.yandex.mobile.ads.impl.aa1$a r7 = com.yandex.mobile.ads.impl.aa1.EnumC4801a.f48454c
            goto L97
        L18:
            boolean r9 = r6.m30741a()
            if (r9 == 0) goto L22
            com.yandex.mobile.ads.impl.aa1$a r7 = com.yandex.mobile.ads.impl.aa1.EnumC4801a.f48463l
            goto L97
        L22:
            com.yandex.mobile.ads.nativeads.w r9 = r6.f57958d
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L41
            android.view.View r9 = r9.m30754e()
            if (r9 == 0) goto L41
            r4 = 10
            int r5 = com.yandex.mobile.ads.impl.tg1.f55120b
            int r5 = r9.getHeight()
            int r9 = r9.getWidth()
            if (r9 < r4) goto L41
            if (r5 >= r4) goto L3f
            goto L41
        L3f:
            r9 = 0
            goto L42
        L41:
            r9 = 1
        L42:
            if (r9 == 0) goto L47
            com.yandex.mobile.ads.impl.aa1$a r7 = com.yandex.mobile.ads.impl.aa1.EnumC4801a.f48464m
            goto L97
        L47:
            com.yandex.mobile.ads.nativeads.w r9 = r6.f57958d
            if (r9 == 0) goto L5a
            android.view.View r9 = r9.m30754e()
            if (r9 == 0) goto L5a
            int r9 = com.yandex.mobile.ads.impl.tg1.m28657b(r9)
            if (r9 >= r3) goto L58
            goto L5a
        L58:
            r9 = 0
            goto L5b
        L5a:
            r9 = 1
        L5b:
            if (r9 == 0) goto L60
            com.yandex.mobile.ads.impl.aa1$a r7 = com.yandex.mobile.ads.impl.aa1.EnumC4801a.f48465n
            goto L97
        L60:
            com.yandex.mobile.ads.nativeads.w r9 = r6.f57958d
            if (r9 == 0) goto L6e
            android.view.View r9 = r9.m30754e()
            boolean r8 = com.yandex.mobile.ads.impl.tg1.m28655a(r9, r8)
            r8 = r8 ^ r3
            goto L6f
        L6e:
            r8 = 1
        L6f:
            if (r8 == 0) goto L76
            if (r10 != 0) goto L76
            com.yandex.mobile.ads.impl.aa1$a r7 = com.yandex.mobile.ads.impl.aa1.EnumC4801a.f48460i
            goto L97
        L76:
            if (r7 == 0) goto L81
            java.lang.String r7 = "divkit"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L81
            r2 = 1
        L81:
            if (r2 != 0) goto L95
            com.yandex.mobile.ads.nativeads.h0 r7 = r6.f57955a
            com.yandex.mobile.ads.nativeads.h0$a r7 = r7.mo30548a(r10)
            com.yandex.mobile.ads.nativeads.g0 r7 = (com.yandex.mobile.ads.nativeads.C6211g0) r7
            com.yandex.mobile.ads.impl.aa1$a r8 = r7.m30556b()
            java.lang.String r1 = r7.m30555a()
            r7 = r8
            goto L97
        L95:
            com.yandex.mobile.ads.impl.aa1$a r7 = com.yandex.mobile.ads.impl.aa1.EnumC4801a.f48453b
        L97:
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r7, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.C6258v.mo30616a(android.content.Context, int, boolean, boolean):android.util.Pair");
    }

    /* renamed from: a */
    public aa1 mo30617a(@NonNull Context context, aa1.EnumC4801a enumC4801a, boolean z, int i2) {
        return new aa1(enumC4801a, new C5472n4());
    }

    @VisibleForTesting
    /* renamed from: a */
    public final boolean m30741a() {
        View m30754e;
        C6264w c6264w = this.f57958d;
        if (c6264w == null || (m30754e = c6264w.m30754e()) == null) {
            return true;
        }
        return tg1.m28660d(m30754e);
    }
}
