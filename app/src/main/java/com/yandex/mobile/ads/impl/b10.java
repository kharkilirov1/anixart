package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.us0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class b10 implements InterfaceC4978dm {

    /* renamed from: a */
    private final InterfaceC4978dm f48718a;

    /* renamed from: b */
    private final int f48719b;

    /* renamed from: c */
    private final InterfaceC4837a f48720c;

    /* renamed from: d */
    private final byte[] f48721d;

    /* renamed from: e */
    private int f48722e;

    /* renamed from: com.yandex.mobile.ads.impl.b10$a */
    public interface InterfaceC4837a {
    }

    public b10(d41 d41Var, int i2, InterfaceC4837a interfaceC4837a) {
        C5220ia.m25473a(i2 > 0);
        this.f48718a = d41Var;
        this.f48719b = i2;
        this.f48720c = interfaceC4837a;
        this.f48721d = new byte[1];
        this.f48722e = i2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public final Map<String, List<String>> mo22489b() {
        return this.f48718a.mo22489b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f48718a.mo22490d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f48722e == 0) {
            boolean z = false;
            if (this.f48718a.read(this.f48721d, 0, 1) != -1) {
                int i4 = (this.f48721d[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i4 != 0) {
                    byte[] bArr2 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = this.f48718a.read(bArr2, i6, i5);
                        if (read == -1) {
                            break;
                        }
                        i6 += read;
                        i5 -= read;
                    }
                    while (i4 > 0 && bArr2[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        ((us0.C5882a) this.f48720c).m29135a(new ap0(i4, bArr2));
                    }
                }
                z = true;
            }
            if (!z) {
                return -1;
            }
            this.f48722e = this.f48719b;
        }
        int read2 = this.f48718a.read(bArr, i2, Math.min(this.f48722e, i3));
        if (read2 != -1) {
            this.f48722e -= read2;
        }
        return read2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final void mo22488a(v71 v71Var) {
        Objects.requireNonNull(v71Var);
        this.f48718a.mo22488a(v71Var);
    }
}
