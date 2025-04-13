package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Wh */
/* loaded from: classes2.dex */
public class C3723Wh {

    /* renamed from: a */
    @NonNull
    private final String f44394a;

    /* renamed from: b */
    @NonNull
    private final String f44395b;

    /* renamed from: c */
    @NonNull
    private final C3366I9 f44396c;

    public C3723Wh(@NonNull String str, @NonNull String str2) {
        this(str, str2, C3532P0.m18696i().m18718u());
    }

    @Nullable
    /* renamed from: a */
    public String m19361a() {
        C3366I9 c3366i9 = this.f44396c;
        String str = this.f44394a;
        String str2 = this.f44395b;
        Objects.requireNonNull(c3366i9);
        return c3366i9.m18217a(new C4444ye("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, null).m21201a(), (String) null);
    }

    @VisibleForTesting
    public C3723Wh(@NonNull String str, @NonNull String str2, @NonNull C3366I9 c3366i9) {
        this.f44394a = str;
        this.f44395b = str2;
        this.f44396c = c3366i9;
    }

    /* renamed from: a */
    public void m19362a(@Nullable String str) {
        this.f44396c.m18278a(this.f44394a, this.f44395b, str);
    }
}
