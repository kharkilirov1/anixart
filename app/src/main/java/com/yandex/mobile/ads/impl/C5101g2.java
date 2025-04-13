package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;

/* renamed from: com.yandex.mobile.ads.impl.g2 */
/* loaded from: classes3.dex */
public final class C5101g2 {

    /* renamed from: a */
    @NonNull
    private final EnumC5007e6 f50473a;

    /* renamed from: e */
    @Nullable
    private AdRequest f50477e;

    /* renamed from: f */
    @Nullable
    private mk0 f50478f;

    /* renamed from: g */
    @Nullable
    private kk0 f50479g;

    /* renamed from: h */
    @Nullable
    private int f50480h;

    /* renamed from: i */
    @Nullable
    private String f50481i;

    /* renamed from: j */
    @Nullable
    private String f50482j;

    /* renamed from: k */
    @Nullable
    private Integer f50483k;

    /* renamed from: l */
    private boolean f50484l;

    /* renamed from: n */
    private int f50486n;

    /* renamed from: o */
    private int f50487o = o00.f53126a;

    /* renamed from: b */
    @NonNull
    private final C5287jj f50474b = new C5287jj();

    /* renamed from: c */
    @NonNull
    private final C5168h6 f50475c = new C5168h6();

    /* renamed from: d */
    @NonNull
    private final q11 f50476d = new q11();

    /* renamed from: m */
    private boolean f50485m = true;

    public C5101g2(@NonNull EnumC5007e6 enumC5007e6) {
        this.f50473a = enumC5007e6;
    }

    /* renamed from: a */
    public final void m24767a(@NonNull SizeInfo sizeInfo) {
        this.f50476d.m27601a(sizeInfo);
    }

    @NonNull
    /* renamed from: b */
    public final EnumC5007e6 m24775b() {
        return this.f50473a;
    }

    @Nullable
    /* renamed from: c */
    public final String m24779c() {
        return this.f50475c.m25066a();
    }

    @Nullable
    /* renamed from: d */
    public final Integer m24782d() {
        return this.f50483k;
    }

    @NonNull
    /* renamed from: e */
    public final C5961w7 m24783e() {
        return this.f50474b.m25892a();
    }

    @Nullable
    /* renamed from: f */
    public final String m24784f() {
        return this.f50481i;
    }

    @Nullable
    /* renamed from: g */
    public final String m24785g() {
        return this.f50482j;
    }

    @NonNull
    /* renamed from: h */
    public final C5287jj m24786h() {
        return this.f50474b;
    }

    /* renamed from: i */
    public final int m24787i() {
        return this.f50487o;
    }

    @NonNull
    /* renamed from: j */
    public final C5507nr m24788j() {
        return this.f50474b.m25895b();
    }

    @Nullable
    /* renamed from: k */
    public final String[] m24789k() {
        return this.f50474b.m25896c();
    }

    /* renamed from: l */
    public final int m24790l() {
        return this.f50486n;
    }

    @Nullable
    /* renamed from: m */
    public final kk0 m24791m() {
        return this.f50479g;
    }

    @Nullable
    /* renamed from: n */
    public final SizeInfo m24792n() {
        return this.f50476d.m27600a();
    }

    @Nullable
    /* renamed from: o */
    public final mk0 m24793o() {
        return this.f50478f;
    }

    @Nullable
    /* renamed from: p */
    public final int m24794p() {
        return this.f50480h;
    }

    /* renamed from: q */
    public final boolean m24795q() {
        return this.f50485m;
    }

    /* renamed from: r */
    public final boolean m24796r() {
        return this.f50484l;
    }

    @Nullable
    /* renamed from: a */
    public final AdRequest m24765a() {
        return this.f50477e;
    }

    /* renamed from: b */
    public final void m24778b(boolean z) {
        this.f50484l = z;
    }

    /* renamed from: c */
    public final void m24780c(@NonNull int i2) {
        this.f50480h = i2;
    }

    /* renamed from: a */
    public final void m24768a(@Nullable AdRequest adRequest) {
        this.f50477e = adRequest;
    }

    /* renamed from: b */
    public final void m24777b(@Nullable String str) {
        this.f50481i = str;
    }

    /* renamed from: c */
    public final void m24781c(@Nullable String str) {
        this.f50482j = str;
    }

    /* renamed from: a */
    public final void m24766a(int i2) {
        this.f50483k = Integer.valueOf(i2);
    }

    /* renamed from: b */
    public final void m24776b(int i2) {
        this.f50486n = i2;
    }

    /* renamed from: a */
    public final void m24773a(@Nullable String str) {
        this.f50475c.m25067a(str);
    }

    /* renamed from: a */
    public final void m24772a(@NonNull C5961w7 c5961w7) {
        this.f50474b.m25894a(c5961w7);
    }

    /* renamed from: a */
    public final void m24771a(@NonNull C5507nr c5507nr) {
        this.f50474b.m25893a(c5507nr);
    }

    /* renamed from: a */
    public final void m24769a(@NonNull kk0 kk0Var) {
        this.f50479g = kk0Var;
    }

    /* renamed from: a */
    public final void m24770a(@NonNull mk0 mk0Var) {
        this.f50478f = mk0Var;
    }

    /* renamed from: a */
    public final void m24774a(boolean z) {
        this.f50485m = z;
    }
}
