package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class jn0 {

    /* renamed from: a */
    public int f51662a;

    /* renamed from: b */
    public long f51663b;

    /* renamed from: c */
    public int f51664c;

    /* renamed from: d */
    public int f51665d;

    /* renamed from: e */
    public int f51666e;

    /* renamed from: f */
    public final int[] f51667f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: g */
    private final ap0 f51668g = new ap0(KotlinVersion.MAX_COMPONENT_VALUE);

    /* renamed from: a */
    public final boolean m25914a(C5598pn c5598pn, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        this.f51662a = 0;
        this.f51663b = 0L;
        this.f51664c = 0;
        this.f51665d = 0;
        this.f51666e = 0;
        this.f51668g.m22586c(27);
        try {
            z2 = c5598pn.mo26764b(this.f51668g.m22587c(), 0, 27, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            z2 = false;
        }
        if (!z2 || this.f51668g.m22609v() != 1332176723) {
            return false;
        }
        if (this.f51668g.m22607t() != 0) {
            if (z) {
                return false;
            }
            throw ep0.m24224a("unsupported bit stream revision");
        }
        this.f51662a = this.f51668g.m22607t();
        this.f51663b = this.f51668g.m22599l();
        this.f51668g.m22601n();
        this.f51668g.m22601n();
        this.f51668g.m22601n();
        int m22607t = this.f51668g.m22607t();
        this.f51664c = m22607t;
        this.f51665d = m22607t + 27;
        this.f51668g.m22586c(m22607t);
        try {
            z3 = c5598pn.mo26764b(this.f51668g.m22587c(), 0, this.f51664c, z);
        } catch (EOFException e3) {
            if (!z) {
                throw e3;
            }
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        for (int i2 = 0; i2 < this.f51664c; i2++) {
            this.f51667f[i2] = this.f51668g.m22607t();
            this.f51666e += this.f51667f[i2];
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m25913a(C5598pn c5598pn, long j2) throws IOException {
        boolean z;
        C5220ia.m25473a(c5598pn.getPosition() == c5598pn.mo22718e());
        this.f51668g.m22586c(4);
        while (true) {
            if (j2 != -1 && c5598pn.getPosition() + 4 >= j2) {
                break;
            }
            try {
                z = c5598pn.mo26764b(this.f51668g.m22587c(), 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            this.f51668g.m22591e(0);
            if (this.f51668g.m22609v() == 1332176723) {
                c5598pn.mo26765c();
                return true;
            }
            c5598pn.mo26760a(1);
        }
        do {
            if (j2 != -1 && c5598pn.getPosition() >= j2) {
                break;
            }
        } while (c5598pn.m27351c(1) != -1);
        return false;
    }
}
