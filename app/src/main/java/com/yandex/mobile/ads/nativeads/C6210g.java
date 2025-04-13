package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.InterfaceC5330ka;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.nativeads.InterfaceC6213h0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.g */
/* loaded from: classes3.dex */
class C6210g implements InterfaceC6213h0 {

    /* renamed from: a */
    private final List<C5276ja<?>> f57699a;

    /* renamed from: b */
    public final cj0 f57700b;

    /* renamed from: c */
    private String f57701c;

    /* renamed from: d */
    private C6264w f57702d;

    /* renamed from: com.yandex.mobile.ads.nativeads.g$a */
    public class a implements InterfaceC6213h0.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.nativeads.InterfaceC6213h0.b
        public final boolean isValid(@NonNull List<C5276ja<?>> list) {
            InterfaceC5330ka m30749a;
            for (C5276ja<?> c5276ja : list) {
                if (c5276ja.m25828f() && (m30749a = C6210g.this.f57702d.m30749a(c5276ja)) != null && m30749a.mo23915d()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.g$b */
    public class b implements InterfaceC6213h0.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.nativeads.InterfaceC6213h0.b
        public final boolean isValid(@NonNull List<C5276ja<?>> list) {
            InterfaceC5330ka m30749a;
            for (C5276ja<?> c5276ja : list) {
                if (c5276ja.m25828f() && ((m30749a = C6210g.this.f57702d.m30749a(c5276ja)) == null || !m30749a.mo23916e())) {
                    C6210g.this.f57701c = c5276ja.m25824b();
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.g$c */
    public class c implements InterfaceC6213h0.b {
        public c() {
        }

        @Override // com.yandex.mobile.ads.nativeads.InterfaceC6213h0.b
        public final boolean isValid(@NonNull List<C5276ja<?>> list) {
            for (C5276ja<?> c5276ja : list) {
                if (c5276ja.m25828f()) {
                    InterfaceC5330ka m30749a = C6210g.this.f57702d.m30749a(c5276ja);
                    Object m25826d = c5276ja.m25826d();
                    if (m30749a == null || !m30749a.mo23911a(m25826d)) {
                        C6210g.this.f57701c = c5276ja.m25824b();
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.g$d */
    public class d implements InterfaceC6213h0.b {
        public d() {
        }

        @Override // com.yandex.mobile.ads.nativeads.InterfaceC6213h0.b
        public final boolean isValid(@NonNull List<C5276ja<?>> list) {
            InterfaceC5330ka m30749a;
            for (C5276ja<?> c5276ja : list) {
                if (c5276ja.m25828f() && ((m30749a = C6210g.this.f57702d.m30749a(c5276ja)) == null || !m30749a.mo23912b())) {
                    C6210g.this.f57701c = c5276ja.m25824b();
                    return false;
                }
            }
            return true;
        }
    }

    public C6210g(@Nullable List<C5276ja<?>> list, @NonNull cj0 cj0Var) {
        this.f57699a = list;
        this.f57700b = cj0Var;
    }

    @VisibleForTesting
    /* renamed from: b */
    public boolean m30552b() {
        return !(this.f57702d != null && mo30551a(new a(), this.f57699a));
    }

    /* renamed from: c */
    public boolean m30553c() {
        return !(this.f57702d != null && mo30551a(new c(), this.f57699a));
    }

    @VisibleForTesting
    /* renamed from: d */
    public boolean m30554d() {
        return !(this.f57702d != null && mo30551a(new b(), this.f57699a));
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6213h0
    /* renamed from: a */
    public void mo30550a(C6264w c6264w) {
        this.f57702d = c6264w;
    }

    @SuppressLint
    /* renamed from: a */
    public boolean mo30551a(@NonNull InterfaceC6213h0.b bVar, @Nullable List<C5276ja<?>> list) {
        Objects.requireNonNull(this.f57700b);
        return list != null && bVar.isValid(list);
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6213h0
    @NonNull
    /* renamed from: a */
    public C6223m0 mo30549a() {
        return new C6223m0(this.f57701c, this.f57702d != null && mo30551a(new d(), this.f57699a));
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6213h0
    /* renamed from: a */
    public InterfaceC6213h0.a mo30548a(boolean z) {
        int i2;
        aa1.EnumC4801a enumC4801a;
        List<C5276ja<?>> list = this.f57699a;
        boolean z2 = false;
        if (list != null) {
            Iterator<C5276ja<?>> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().m25828f()) {
                    i2++;
                }
            }
        } else {
            i2 = 0;
        }
        if ((i2 >= 2) && m30552b()) {
            z2 = true;
        }
        if (z2 && !z) {
            enumC4801a = aa1.EnumC4801a.f48458g;
        } else if (m30554d()) {
            enumC4801a = aa1.EnumC4801a.f48461j;
        } else if (m30553c()) {
            enumC4801a = aa1.EnumC4801a.f48455d;
        } else {
            enumC4801a = aa1.EnumC4801a.f48453b;
        }
        return new C6211g0(enumC4801a, this.f57701c);
    }
}
