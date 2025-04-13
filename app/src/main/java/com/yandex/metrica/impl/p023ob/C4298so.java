package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.so */
/* loaded from: classes2.dex */
public final class C4298so {

    /* renamed from: a */
    private final boolean f46480a;

    /* renamed from: b */
    private final String f46481b;

    private C4298so(@NonNull InterfaceC4350uo<?> interfaceC4350uo, boolean z, @NonNull String str) {
        Objects.requireNonNull(interfaceC4350uo);
        this.f46480a = z;
        this.f46481b = str;
    }

    @NonNull
    /* renamed from: a */
    public final String m20771a() {
        return this.f46481b;
    }

    /* renamed from: b */
    public final boolean m20772b() {
        return this.f46480a;
    }

    /* renamed from: a */
    public static final C4298so m20769a(@NonNull InterfaceC4350uo<?> interfaceC4350uo) {
        return new C4298so(interfaceC4350uo, true, "");
    }

    /* renamed from: a */
    public static final C4298so m20770a(@NonNull InterfaceC4350uo<?> interfaceC4350uo, @NonNull String str) {
        return new C4298so(interfaceC4350uo, false, str);
    }
}
