package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.rf */
/* loaded from: classes3.dex */
public final class C5687rf implements ts0 {

    /* renamed from: a */
    private final InterfaceC5604pt f54299a;

    /* renamed from: b */
    @Nullable
    private InterfaceC5412lt f54300b;

    /* renamed from: c */
    @Nullable
    private C5598pn f54301c;

    public C5687rf(InterfaceC5604pt interfaceC5604pt) {
        this.f54299a = interfaceC5604pt;
    }

    /* renamed from: a */
    public final void m27916a(InterfaceC4978dm interfaceC4978dm, Uri uri, Map map, long j2, long j3, InterfaceC5509nt interfaceC5509nt) throws IOException {
        C5598pn c5598pn = new C5598pn(interfaceC4978dm, j2, j3);
        this.f54301c = c5598pn;
        if (this.f54300b != null) {
            return;
        }
        InterfaceC5412lt[] mo23920a = this.f54299a.mo23920a(uri, map);
        if (mo23920a.length == 1) {
            this.f54300b = mo23920a[0];
        } else {
            int length = mo23920a.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                InterfaceC5412lt interfaceC5412lt = mo23920a[i2];
                try {
                } catch (EOFException unused) {
                    C5220ia.m25476b(this.f54300b != null || c5598pn.getPosition() == j2);
                    c5598pn.mo26765c();
                } catch (Throwable th) {
                    C5220ia.m25476b(this.f54300b != null || c5598pn.getPosition() == j2);
                    c5598pn.mo26765c();
                    throw th;
                }
                if (interfaceC5412lt.mo22432a(c5598pn)) {
                    this.f54300b = interfaceC5412lt;
                    c5598pn.mo26765c();
                    break;
                } else {
                    C5220ia.m25476b(this.f54300b != null || c5598pn.getPosition() == j2);
                    c5598pn.mo26765c();
                    i2++;
                }
            }
            if (this.f54300b == null) {
                StringBuilder m26356a = l60.m26356a("None of the available extractors (");
                int i3 = s91.f54530a;
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < mo23920a.length; i4++) {
                    sb.append(mo23920a[i4].getClass().getSimpleName());
                    if (i4 < mo23920a.length - 1) {
                        sb.append(", ");
                    }
                }
                m26356a.append(sb.toString());
                m26356a.append(") could read the stream.");
                String sb2 = m26356a.toString();
                Objects.requireNonNull(uri);
                throw new z81(sb2);
            }
        }
        this.f54300b.mo22431a(interfaceC5509nt);
    }

    /* renamed from: b */
    public final long m27917b() {
        C5598pn c5598pn = this.f54301c;
        if (c5598pn != null) {
            return c5598pn.getPosition();
        }
        return -1L;
    }

    /* renamed from: c */
    public final void m27918c() {
        InterfaceC5412lt interfaceC5412lt = this.f54300b;
        if (interfaceC5412lt != null) {
            interfaceC5412lt.release();
            this.f54300b = null;
        }
        this.f54301c = null;
    }

    /* renamed from: a */
    public final void m27914a() {
        InterfaceC5412lt interfaceC5412lt = this.f54300b;
        if (interfaceC5412lt instanceof af0) {
            ((af0) interfaceC5412lt).m22482a();
        }
    }

    /* renamed from: a */
    public final void m27915a(long j2, long j3) {
        InterfaceC5412lt interfaceC5412lt = this.f54300b;
        Objects.requireNonNull(interfaceC5412lt);
        interfaceC5412lt.mo22430a(j2, j3);
    }

    /* renamed from: a */
    public final int m27913a(qr0 qr0Var) throws IOException {
        InterfaceC5412lt interfaceC5412lt = this.f54300b;
        Objects.requireNonNull(interfaceC5412lt);
        C5598pn c5598pn = this.f54301c;
        Objects.requireNonNull(c5598pn);
        return interfaceC5412lt.mo22424a(c5598pn, qr0Var);
    }
}
