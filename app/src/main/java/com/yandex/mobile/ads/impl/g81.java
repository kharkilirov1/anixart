package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface g81 {

    /* renamed from: com.yandex.mobile.ads.impl.g81$a */
    public static final class C5109a {

        /* renamed from: a */
        public final String f50526a;

        /* renamed from: b */
        public final byte[] f50527b;

        public C5109a(String str, byte[] bArr) {
            this.f50526a = str;
            this.f50527b = bArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g81$b */
    public static final class C5110b {

        /* renamed from: a */
        @Nullable
        public final String f50528a;

        /* renamed from: b */
        public final List<C5109a> f50529b;

        /* renamed from: c */
        public final byte[] f50530c;

        public C5110b(int i2, @Nullable String str, @Nullable ArrayList arrayList, byte[] bArr) {
            this.f50528a = str;
            this.f50529b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f50530c = bArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g81$c */
    public interface InterfaceC5111c {
        /* renamed from: a */
        SparseArray<g81> mo24819a();

        @Nullable
        /* renamed from: a */
        g81 mo24820a(int i2, C5110b c5110b);
    }

    /* renamed from: com.yandex.mobile.ads.impl.g81$d */
    public static final class C5112d {

        /* renamed from: a */
        private final String f50531a;

        /* renamed from: b */
        private final int f50532b;

        /* renamed from: c */
        private final int f50533c;

        /* renamed from: d */
        private int f50534d;

        /* renamed from: e */
        private String f50535e;

        public C5112d(int i2, int i3, int i4) {
            String str;
            if (i2 != Integer.MIN_VALUE) {
                str = i2 + "/";
            } else {
                str = "";
            }
            this.f50531a = str;
            this.f50532b = i3;
            this.f50533c = i4;
            this.f50534d = Integer.MIN_VALUE;
            this.f50535e = "";
        }

        /* renamed from: a */
        public final void m24821a() {
            int i2 = this.f50534d;
            this.f50534d = i2 == Integer.MIN_VALUE ? this.f50532b : i2 + this.f50533c;
            this.f50535e = this.f50531a + this.f50534d;
        }

        /* renamed from: b */
        public final String m24822b() {
            if (this.f50534d != Integer.MIN_VALUE) {
                return this.f50535e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: c */
        public final int m24823c() {
            int i2 = this.f50534d;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    void mo23746a();

    /* renamed from: a */
    void mo23747a(int i2, ap0 ap0Var) throws ep0;

    /* renamed from: a */
    void mo23748a(p61 p61Var, InterfaceC5509nt interfaceC5509nt, C5112d c5112d);
}
