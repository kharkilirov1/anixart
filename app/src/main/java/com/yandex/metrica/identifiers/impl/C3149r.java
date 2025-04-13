package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.identifiers.impl.r */
/* loaded from: classes2.dex */
public final class C3149r implements InterfaceC3140i {

    /* renamed from: a */
    public final C3136e f42508a = new C3136e(C3150s.f42509a, C3148q.f42507b, "huawei");

    @Override // com.yandex.metrica.identifiers.impl.InterfaceC3140i
    @NotNull
    /* renamed from: a */
    public C3138g mo17799a(@NotNull Context context) {
        C3138g c3138g;
        C3138g c3138g2;
        C3136e c3136e;
        EnumC3143l enumC3143l = EnumC3143l.f42501d;
        try {
            try {
                try {
                    try {
                        InterfaceC3153v interfaceC3153v = (InterfaceC3153v) this.f42508a.m17798a(context);
                        c3138g2 = new C3138g(EnumC3143l.f42500c, new C3137f("huawei", interfaceC3153v.mo17801a(), Boolean.valueOf(interfaceC3153v.mo17802c())), null, 4);
                        c3136e = this.f42508a;
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    String errorMessage = "exception while fetching hoaid: " + th.getMessage();
                    Intrinsics.m32179h(errorMessage, "errorMessage");
                    c3138g = new C3138g(enumC3143l, null, errorMessage);
                    c3138g2 = c3138g;
                    c3136e = this.f42508a;
                    Objects.requireNonNull(c3136e);
                    c3136e.f42489a.m17797a(context);
                    return c3138g2;
                }
            } catch (C3141j e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                c3138g = new C3138g(enumC3143l, null, message);
                c3138g2 = c3138g;
                c3136e = this.f42508a;
                Objects.requireNonNull(c3136e);
                c3136e.f42489a.m17797a(context);
                return c3138g2;
            }
            Objects.requireNonNull(c3136e);
            c3136e.f42489a.m17797a(context);
            return c3138g2;
        } catch (Throwable th2) {
            try {
                C3136e c3136e2 = this.f42508a;
                Objects.requireNonNull(c3136e2);
                c3136e2.f42489a.m17797a(context);
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }
}
