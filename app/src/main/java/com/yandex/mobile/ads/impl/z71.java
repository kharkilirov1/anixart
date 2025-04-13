package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.y61;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class z71 {

    /* renamed from: a */
    private final byte[] f57071a = new byte[10];

    /* renamed from: b */
    private boolean f57072b;

    /* renamed from: c */
    private int f57073c;

    /* renamed from: d */
    private long f57074d;

    /* renamed from: e */
    private int f57075e;

    /* renamed from: f */
    private int f57076f;

    /* renamed from: g */
    private int f57077g;

    /* renamed from: a */
    public final void m30068a() {
        this.f57072b = false;
        this.f57073c = 0;
    }

    /* renamed from: a */
    public final void m30069a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        if (this.f57072b) {
            return;
        }
        interfaceC5458mt.mo26761a(this.f57071a, 0, 10);
        interfaceC5458mt.mo26765c();
        byte[] bArr = this.f57071a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r2 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.f57072b = true;
    }

    /* renamed from: a */
    public final void m30070a(y61 y61Var, long j2, int i2, int i3, int i4, @Nullable y61.C6060a c6060a) {
        C5220ia.m25475b("TrueHD chunk samples must be contiguous in the sample queue.", this.f57077g <= i3 + i4);
        if (this.f57072b) {
            int i5 = this.f57073c;
            int i6 = i5 + 1;
            this.f57073c = i6;
            if (i5 == 0) {
                this.f57074d = j2;
                this.f57075e = i2;
                this.f57076f = 0;
            }
            this.f57076f += i3;
            this.f57077g = i4;
            if (i6 >= 16) {
                m30071a(y61Var, c6060a);
            }
        }
    }

    /* renamed from: a */
    public final void m30071a(y61 y61Var, @Nullable y61.C6060a c6060a) {
        if (this.f57073c > 0) {
            y61Var.mo28346a(this.f57074d, this.f57075e, this.f57076f, this.f57077g, c6060a);
            this.f57073c = 0;
        }
    }
}
