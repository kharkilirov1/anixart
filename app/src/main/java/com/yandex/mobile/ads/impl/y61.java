package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public interface y61 {

    /* renamed from: com.yandex.mobile.ads.impl.y61$a */
    public static final class C6060a {

        /* renamed from: a */
        public final int f56675a;

        /* renamed from: b */
        public final byte[] f56676b;

        /* renamed from: c */
        public final int f56677c;

        /* renamed from: d */
        public final int f56678d;

        public C6060a(int i2, int i3, int i4, byte[] bArr) {
            this.f56675a = i2;
            this.f56676b = bArr;
            this.f56677c = i3;
            this.f56678d = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6060a.class != obj.getClass()) {
                return false;
            }
            C6060a c6060a = (C6060a) obj;
            return this.f56675a == c6060a.f56675a && this.f56677c == c6060a.f56677c && this.f56678d == c6060a.f56678d && Arrays.equals(this.f56676b, c6060a.f56676b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f56676b) + (this.f56675a * 31)) * 31) + this.f56677c) * 31) + this.f56678d;
        }
    }

    /* renamed from: a */
    int mo28344a(InterfaceC4815am interfaceC4815am, int i2, boolean z) throws IOException;

    /* renamed from: a */
    void mo28345a(int i2, ap0 ap0Var);

    /* renamed from: a */
    void mo28346a(long j2, int i2, int i3, int i4, @Nullable C6060a c6060a);

    /* renamed from: a */
    void mo28347a(C5606pv c5606pv);

    /* renamed from: b */
    int mo28348b(InterfaceC4815am interfaceC4815am, int i2, boolean z) throws IOException;

    /* renamed from: b */
    void mo28349b(int i2, ap0 ap0Var);
}
