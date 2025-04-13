package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.yandex.mobile.ads.impl.nb */
/* loaded from: classes3.dex */
public final class C5481nb implements InterfaceC5589pf {

    /* renamed from: g */
    public static final C5481nb f52893g = new d().m26834a();

    /* renamed from: a */
    public final int f52894a;

    /* renamed from: b */
    public final int f52895b;

    /* renamed from: c */
    public final int f52896c;

    /* renamed from: d */
    public final int f52897d;

    /* renamed from: e */
    public final int f52898e;

    /* renamed from: f */
    @Nullable
    private c f52899f;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.nb$a */
    public static final class a {
        @DoNotInline
        /* renamed from: a */
        public static void m26832a(AudioAttributes.Builder builder, int i2) {
            builder.setAllowedCapturePolicy(i2);
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.nb$b */
    public static final class b {
        @DoNotInline
        /* renamed from: a */
        public static void m26833a(AudioAttributes.Builder builder, int i2) {
            builder.setSpatializationBehavior(i2);
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.nb$c */
    public static final class c {

        /* renamed from: a */
        public final AudioAttributes f52900a;

        public /* synthetic */ c(C5481nb c5481nb, int i2) {
            this(c5481nb);
        }

        private c(C5481nb c5481nb) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c5481nb.f52894a).setFlags(c5481nb.f52895b).setUsage(c5481nb.f52896c);
            int i2 = s91.f54530a;
            if (i2 >= 29) {
                a.m26832a(usage, c5481nb.f52897d);
            }
            if (i2 >= 32) {
                b.m26833a(usage, c5481nb.f52898e);
            }
            this.f52900a = usage.build();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb$d */
    public static final class d {

        /* renamed from: a */
        private int f52901a = 0;

        /* renamed from: b */
        private int f52902b = 0;

        /* renamed from: c */
        private int f52903c = 1;

        /* renamed from: d */
        private int f52904d = 1;

        /* renamed from: e */
        private int f52905e = 0;

        /* renamed from: a */
        public final void m26835a(int i2) {
            this.f52904d = i2;
        }

        /* renamed from: b */
        public final void m26836b(int i2) {
            this.f52901a = i2;
        }

        /* renamed from: c */
        public final void m26837c(int i2) {
            this.f52902b = i2;
        }

        /* renamed from: d */
        public final void m26838d(int i2) {
            this.f52905e = i2;
        }

        /* renamed from: e */
        public final void m26839e(int i2) {
            this.f52903c = i2;
        }

        /* renamed from: a */
        public final C5481nb m26834a() {
            return new C5481nb(this.f52901a, this.f52902b, this.f52903c, this.f52904d, this.f52905e, 0);
        }
    }

    static {
        jp1 jp1Var = jp1.f51699j;
    }

    public /* synthetic */ C5481nb(int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i2, i3, i4, i5, i6);
    }

    @RequiresApi
    /* renamed from: a */
    public final c m26831a() {
        if (this.f52899f == null) {
            this.f52899f = new c(this, 0);
        }
        return this.f52899f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5481nb.class != obj.getClass()) {
            return false;
        }
        C5481nb c5481nb = (C5481nb) obj;
        return this.f52894a == c5481nb.f52894a && this.f52895b == c5481nb.f52895b && this.f52896c == c5481nb.f52896c && this.f52897d == c5481nb.f52897d && this.f52898e == c5481nb.f52898e;
    }

    public final int hashCode() {
        return ((((((((this.f52894a + 527) * 31) + this.f52895b) * 31) + this.f52896c) * 31) + this.f52897d) * 31) + this.f52898e;
    }

    private C5481nb(int i2, int i3, int i4, int i5, int i6) {
        this.f52894a = i2;
        this.f52895b = i3;
        this.f52896c = i4;
        this.f52897d = i5;
        this.f52898e = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static C5481nb m26829a(Bundle bundle) {
        d dVar = new d();
        if (bundle.containsKey(Integer.toString(0, 36))) {
            dVar.m26836b(bundle.getInt(Integer.toString(0, 36)));
        }
        if (bundle.containsKey(Integer.toString(1, 36))) {
            dVar.m26837c(bundle.getInt(Integer.toString(1, 36)));
        }
        if (bundle.containsKey(Integer.toString(2, 36))) {
            dVar.m26839e(bundle.getInt(Integer.toString(2, 36)));
        }
        if (bundle.containsKey(Integer.toString(3, 36))) {
            dVar.m26835a(bundle.getInt(Integer.toString(3, 36)));
        }
        if (bundle.containsKey(Integer.toString(4, 36))) {
            dVar.m26838d(bundle.getInt(Integer.toString(4, 36)));
        }
        return dVar.m26834a();
    }
}
