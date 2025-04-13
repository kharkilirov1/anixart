package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.h0 */
/* loaded from: classes2.dex */
public final class C3988h0<T> {

    /* renamed from: a */
    private final InterfaceC3910e0<T> f45241a;

    /* renamed from: b */
    private final InterfaceC3936f0<T> f45242b;

    /* renamed from: c */
    private final C3507O0 f45243c;

    /* renamed from: d */
    private final String f45244d;

    @VisibleForTesting
    public C3988h0(@NotNull InterfaceC3910e0<T> interfaceC3910e0, @NotNull InterfaceC3936f0<T> interfaceC3936f0, @NotNull C3507O0 c3507o0, @NotNull String str) {
        this.f45241a = interfaceC3910e0;
        this.f45242b = interfaceC3936f0;
        this.f45243c = c3507o0;
        this.f45244d = str;
    }

    /* renamed from: a */
    public final void m19993a(@NotNull Context context, @NotNull ContentValues contentValues) {
        try {
            T invoke = this.f45241a.invoke(contentValues);
            if (invoke != null) {
                this.f45243c.m18653a(context);
                if (this.f45242b.invoke(invoke).booleanValue()) {
                    C3184B2.m17877a("Successfully saved " + this.f45244d, new Object[0]);
                } else {
                    C3184B2.m17883b("Did not save " + this.f45244d + " because data is already present", new Object[0]);
                }
            }
        } catch (Throwable th) {
            C3184B2.m17878a(th, "Unexpected error occurred", new Object[0]);
        }
    }
}
