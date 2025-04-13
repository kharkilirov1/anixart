package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.k6 */
/* loaded from: classes2.dex */
public class C4072k6 {

    /* renamed from: a */
    @NonNull
    private final C4020i6 f45601a;

    /* renamed from: b */
    @NonNull
    private final C4046j6 f45602b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4438y8 f45603c;

    public C4072k6(@NonNull Context context, @NonNull C3862c4 c3862c4) {
        this(new C4046j6(), new C4020i6(), C3567Qa.m18783a(context).m18791a(c3862c4), "event_hashes");
    }

    @NonNull
    /* renamed from: a */
    public C3994h6 m20230a() {
        try {
            byte[] mo18665a = this.f45603c.mo18665a("event_hashes");
            if (C3658U2.m19214a(mo18665a)) {
                C4020i6 c4020i6 = this.f45601a;
                Objects.requireNonNull(this.f45602b);
                return c4020i6.mo17817a(new C3926eg());
            }
            C4020i6 c4020i62 = this.f45601a;
            Objects.requireNonNull(this.f45602b);
            return c4020i62.mo17817a((C3926eg) AbstractC3909e.m19776a(new C3926eg(), mo18665a));
        } catch (Throwable unused) {
            C4020i6 c4020i63 = this.f45601a;
            Objects.requireNonNull(this.f45602b);
            return c4020i63.mo17817a(new C3926eg());
        }
    }

    @VisibleForTesting
    public C4072k6(@NonNull C4046j6 c4046j6, @NonNull C4020i6 c4020i6, @NonNull InterfaceC4438y8 interfaceC4438y8, @NonNull String str) {
        this.f45602b = c4046j6;
        this.f45601a = c4020i6;
        this.f45603c = interfaceC4438y8;
    }

    /* renamed from: a */
    public void m20231a(@NonNull C3994h6 c3994h6) {
        InterfaceC4438y8 interfaceC4438y8 = this.f45603c;
        C4046j6 c4046j6 = this.f45602b;
        C3926eg mo17818b = this.f45601a.mo17818b(c3994h6);
        Objects.requireNonNull(c4046j6);
        interfaceC4438y8.mo18664a("event_hashes", AbstractC3909e.m19777a(mo17818b));
    }
}
