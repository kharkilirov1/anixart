package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.C5567p6;
import com.yandex.mobile.ads.impl.InterfaceC5330ka;
import com.yandex.mobile.ads.impl.InterfaceC5504no;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.xl0;

/* renamed from: com.yandex.mobile.ads.nativeads.c0 */
/* loaded from: classes3.dex */
public final class C6203c0 implements xl0 {

    /* renamed from: a */
    @NonNull
    private final eh0 f57678a;

    /* renamed from: b */
    @Nullable
    private C6264w f57679b;

    public C6203c0(@NonNull eh0 eh0Var) {
        this.f57678a = eh0Var;
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29766a(@NonNull C6264w c6264w) {
        c6264w.m30750a();
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29767a(@NonNull C6264w c6264w, @NonNull C6200b c6200b) {
        this.f57679b = c6264w;
        C5567p6 c5567p6 = new C5567p6(c6264w, c6200b, this.f57678a.m24172e());
        for (C5276ja<?> c5276ja : this.f57678a.m24163b()) {
            InterfaceC5330ka m30749a = c6264w.m30749a(c5276ja);
            if (m30749a != null) {
                m30749a.mo23914c(c5276ja.m25826d());
                m30749a.mo23910a(c5276ja, c5567p6);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29765a() {
        if (this.f57679b != null) {
            for (C5276ja<?> c5276ja : this.f57678a.m24163b()) {
                InterfaceC5330ka m30749a = this.f57679b.m30749a(c5276ja);
                if (m30749a instanceof InterfaceC5504no) {
                    ((InterfaceC5504no) m30749a).mo26788b(c5276ja.m25826d());
                }
            }
        }
    }
}
