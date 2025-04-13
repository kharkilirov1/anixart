package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.room.util.C0576a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class se0 {

    /* renamed from: com.yandex.mobile.ads.impl.se0$a */
    public interface InterfaceC5743a {

        /* renamed from: com.yandex.mobile.ads.impl.se0$a$a */
        public static final class a implements InterfaceC5743a {

            /* renamed from: a */
            @NotNull
            public static final a f54654a = new a();

            private a() {
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.se0$a$b */
        public static final class b implements InterfaceC5743a {

            /* renamed from: a */
            @NotNull
            private final List<d60> f54655a;

            public b(@NotNull List<d60> causes) {
                Intrinsics.m32179h(causes, "causes");
                this.f54655a = causes;
            }

            @NotNull
            /* renamed from: a */
            public final List<d60> m28236a() {
                return this.f54655a;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.m32174c(this.f54655a, ((b) obj).f54655a);
            }

            public final int hashCode() {
                return this.f54655a.hashCode();
            }

            @NotNull
            public final String toString() {
                return C0576a.m4119r(l60.m26356a("IncorrectIntegration(causes="), this.f54655a, ')');
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public static InterfaceC5743a m28235a(@NotNull Context context, boolean z) {
        Intrinsics.m32179h(context, "context");
        ke0 ke0Var = new ke0(z);
        C5831u0 c5831u0 = new C5831u0();
        d60[] d60VarArr = new d60[4];
        d60 e2 = null;
        try {
            ke0Var.m27911a();
            e = null;
        } catch (d60 e3) {
            e = e3;
        }
        d60VarArr[0] = e;
        try {
            c5831u0.m28811a(context);
            e = null;
        } catch (d60 e4) {
            e = e4;
        }
        d60VarArr[1] = e;
        try {
            rp0.m27965a(context);
            e = null;
        } catch (d60 e5) {
            e = e5;
        }
        d60VarArr[2] = e;
        try {
            C5849u9.m28914a();
        } catch (d60 e6) {
            e2 = e6;
        }
        d60VarArr[3] = e2;
        List m31996I = CollectionsKt.m31996I(d60VarArr);
        return ((ArrayList) m31996I).isEmpty() ^ true ? new InterfaceC5743a.b(m31996I) : InterfaceC5743a.a.f54654a;
    }
}
