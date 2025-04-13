package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.InterfaceC5149gx;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cx */
/* loaded from: classes3.dex */
public final class C4943cx<T extends InterfaceC5149gx> implements InterfaceC6044xw<T> {

    /* renamed from: a */
    @NotNull
    private final Context f49368a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC6094yw<T> f49369b;

    /* renamed from: c */
    @NotNull
    private final yv0<C5994ww, InterfaceC6044xw<T>> f49370c;

    /* renamed from: d */
    @NotNull
    private InterfaceC6044xw<T> f49371d;

    /* renamed from: e */
    @NotNull
    private final qw0 f49372e;

    /* renamed from: f */
    @NotNull
    private C5994ww f49373f;

    /* renamed from: g */
    @Nullable
    private T f49374g;

    /* renamed from: h */
    @Nullable
    private Boolean f49375h;

    /* renamed from: com.yandex.mobile.ads.impl.cx$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49376a;

        static {
            int[] iArr = new int[EnumC5901v3.values().length];
            iArr[2] = 1;
            iArr[3] = 2;
            f49376a = iArr;
        }
    }

    public C4943cx(@NotNull Context context, @NotNull InterfaceC6094yw factory, @NotNull C6145zw repository, @NotNull InterfaceC6044xw currentController, @NotNull qw0 resourceUtils) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(factory, "factory");
        Intrinsics.m32179h(repository, "repository");
        Intrinsics.m32179h(currentController, "currentController");
        Intrinsics.m32179h(resourceUtils, "resourceUtils");
        this.f49368a = context;
        this.f49369b = factory;
        this.f49370c = repository;
        this.f49371d = currentController;
        this.f49372e = resourceUtils;
        AdRequest build = new AdRequest.Builder().build();
        Intrinsics.m32178g(build, "Builder().build()");
        this.f49373f = new C5994ww(null, build, qw0.m27790a(context));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23542a(Object obj) {
        T t = (T) obj;
        this.f49371d.mo23542a((InterfaceC6044xw<T>) t);
        this.f49374g = t;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: b */
    public final void mo23545b() {
        this.f49371d.mo23545b();
        C5994ww c5994ww = this.f49373f;
        qw0 qw0Var = this.f49372e;
        Context context = this.f49368a;
        Objects.requireNonNull(qw0Var);
        C5994ww m29579a = C5994ww.m29579a(c5994ww, null, null, qw0.m27790a(context), 3);
        this.f49373f = m29579a;
        if (this.f49370c.mo29977b(m29579a)) {
            return;
        }
        InterfaceC6044xw<T> mo23560a = this.f49369b.mo23560a(this.f49368a);
        C5994ww c5994ww2 = this.f49373f;
        String m29581b = c5994ww2.m29581b();
        if (m29581b != null) {
            mo23560a.mo23543a(m29581b);
        }
        mo23560a.mo23541a(c5994ww2.m29580a());
        n60.m26809b("Loading new. Save with: " + this.f49373f, new Object[0]);
        this.f49370c.mo29976a(this.f49373f, mo23560a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: c */
    public final void mo23546c() {
        n60.m26809b("Destroy cacheable controller", new Object[0]);
        this.f49371d.mo23546c();
        this.f49370c.clear();
        this.f49374g = null;
        this.f49375h = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    @NotNull
    /* renamed from: d */
    public final EnumC5901v3 mo23547d() {
        return this.f49371d.mo23547d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    public final void setShouldOpenLinksInApp(boolean z) {
        this.f49371d.setShouldOpenLinksInApp(z);
        this.f49375h = Boolean.valueOf(z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23541a(@NotNull AdRequest adRequest) {
        Intrinsics.m32179h(adRequest, "adRequest");
        C5994ww m29579a = C5994ww.m29579a(this.f49373f, null, adRequest, 0, 5);
        this.f49373f = m29579a;
        InterfaceC6044xw<T> mo29975a = this.f49370c.mo29975a(m29579a);
        EnumC5901v3 mo23547d = mo29975a != null ? mo29975a.mo23547d() : null;
        StringBuilder m26356a = l60.m26356a("Checking cache with: ");
        m26356a.append(this.f49373f);
        m26356a.append(". State: ");
        m26356a.append(mo23547d);
        n60.m26809b(m26356a.toString(), new Object[0]);
        int i2 = mo23547d == null ? -1 : a.f49376a[mo23547d.ordinal()];
        if (i2 == -1) {
            this.f49371d.mo23541a(adRequest);
            return;
        }
        if (i2 == 1) {
            mo29975a.mo23542a((InterfaceC6044xw<T>) this.f49374g);
            Boolean bool = this.f49375h;
            if (bool != null) {
                mo29975a.setShouldOpenLinksInApp(bool.booleanValue());
            }
            this.f49371d.mo23542a((InterfaceC6044xw<T>) null);
            this.f49371d.mo23546c();
            this.f49371d = mo29975a;
            return;
        }
        if (i2 != 2) {
            m23540a(mo29975a, adRequest);
            return;
        }
        mo29975a.mo23542a((InterfaceC6044xw<T>) this.f49374g);
        Boolean bool2 = this.f49375h;
        if (bool2 != null) {
            mo29975a.setShouldOpenLinksInApp(bool2.booleanValue());
        }
        this.f49371d.mo23542a((InterfaceC6044xw<T>) null);
        this.f49371d.mo23546c();
        this.f49371d = mo29975a;
        T t = this.f49374g;
        if (t != null) {
            t.onAdLoaded();
        }
    }

    public /* synthetic */ C4943cx(Context context, InterfaceC6094yw interfaceC6094yw, C6145zw c6145zw) {
        this(context, interfaceC6094yw, c6145zw, interfaceC6094yw.mo23560a(context), new qw0());
    }

    /* renamed from: a */
    private final void m23540a(InterfaceC6044xw<T> interfaceC6044xw, AdRequest adRequest) {
        interfaceC6044xw.mo23546c();
        this.f49371d.mo23541a(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23543a(@Nullable String str) {
        this.f49371d.mo23543a(str);
        this.f49373f = C5994ww.m29579a(this.f49373f, str, null, 0, 6);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final boolean mo23544a() {
        return this.f49371d.mo23544a();
    }
}
