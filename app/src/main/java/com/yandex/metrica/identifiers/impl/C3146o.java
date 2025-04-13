package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.identifiers.impl.o */
/* loaded from: classes2.dex */
public final class C3146o implements InterfaceC3140i {

    /* renamed from: a */
    public final C3136e f42505a = new C3136e(C3147p.f42506a, C3145n.f42504b, "yandex");

    @Override // com.yandex.metrica.identifiers.impl.InterfaceC3140i
    @NotNull
    /* renamed from: a */
    public C3138g mo17799a(@NotNull Context context) {
        C3138g c3138g;
        C3138g c3138g2;
        EnumC3143l enumC3143l = EnumC3143l.f42501d;
        try {
            try {
                try {
                    try {
                        C3138g m17800b = m17800b(context);
                        try {
                            return m17800b;
                        } catch (Throwable unused) {
                            return m17800b;
                        }
                    } finally {
                        try {
                            C3136e c3136e = this.f42505a;
                            Objects.requireNonNull(c3136e);
                            c3136e.f42489a.m17797a(context);
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th) {
                    c3138g2 = new C3138g(EnumC3143l.f42502e, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                    try {
                        C3136e c3136e2 = this.f42505a;
                        Objects.requireNonNull(c3136e2);
                        c3136e2.f42489a.m17797a(context);
                    } catch (Throwable unused3) {
                    }
                    return c3138g2;
                }
            } catch (C3144m e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "No yandex adv_id service";
                }
                c3138g = new C3138g(enumC3143l, null, message, 2);
                c3138g2 = c3138g;
                C3136e c3136e22 = this.f42505a;
                Objects.requireNonNull(c3136e22);
                c3136e22.f42489a.m17797a(context);
                return c3138g2;
            }
        } catch (C3141j e3) {
            String message2 = e3.getMessage();
            if (message2 == null) {
                message2 = "unknown exception while binding yandex adv_id service";
            }
            c3138g = new C3138g(enumC3143l, null, message2, 2);
            c3138g2 = c3138g;
            C3136e c3136e222 = this.f42505a;
            Objects.requireNonNull(c3136e222);
            c3136e222.f42489a.m17797a(context);
            return c3138g2;
        }
    }

    /* renamed from: b */
    public final C3138g m17800b(Context context) {
        InterfaceC3134c interfaceC3134c = (InterfaceC3134c) this.f42505a.m17798a(context);
        String mo17795b = interfaceC3134c.mo17795b();
        Intrinsics.m32178g(mo17795b, "service.advId");
        return new C3138g(EnumC3143l.f42500c, new C3137f("yandex", mo17795b, Boolean.valueOf(interfaceC3134c.mo17796d())), null, 4);
    }
}
