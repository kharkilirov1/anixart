package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class nt0 {

    /* renamed from: com.yandex.mobile.ads.impl.nt0$a */
    public static class C5510a {

        /* renamed from: a */
        private final UUID f53090a;

        /* renamed from: b */
        private final int f53091b;

        /* renamed from: c */
        private final byte[] f53092c;

        public C5510a(UUID uuid, int i2, byte[] bArr) {
            this.f53090a = uuid;
            this.f53091b = i2;
            this.f53092c = bArr;
        }
    }

    /* renamed from: a */
    public static boolean m26951a(byte[] bArr) {
        return m26953b(bArr) != null;
    }

    @Nullable
    /* renamed from: b */
    private static C5510a m26953b(byte[] bArr) {
        ap0 ap0Var = new ap0(bArr);
        if (ap0Var.m22590e() < 32) {
            return null;
        }
        ap0Var.m22591e(0);
        if (ap0Var.m22595h() != ap0Var.m22579a() + 4 || ap0Var.m22595h() != 1886614376) {
            return null;
        }
        int m26096b = AbstractC5331kb.m26096b(ap0Var.m22595h());
        if (m26096b > 1) {
            c80.m23073a("Unsupported pssh version: ", m26096b, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(ap0Var.m22603p(), ap0Var.m22603p());
        if (m26096b == 1) {
            ap0Var.m22593f(ap0Var.m22611x() * 16);
        }
        int m22611x = ap0Var.m22611x();
        if (m22611x != ap0Var.m22579a()) {
            return null;
        }
        byte[] bArr2 = new byte[m22611x];
        ap0Var.m22583a(bArr2, 0, m22611x);
        return new C5510a(uuid, m26096b, bArr2);
    }

    @Nullable
    /* renamed from: c */
    public static UUID m26954c(byte[] bArr) {
        C5510a m26953b = m26953b(bArr);
        if (m26953b == null) {
            return null;
        }
        return m26953b.f53090a;
    }

    /* renamed from: d */
    public static int m26955d(byte[] bArr) {
        C5510a m26953b = m26953b(bArr);
        if (m26953b == null) {
            return -1;
        }
        return m26953b.f53091b;
    }

    @Nullable
    /* renamed from: a */
    public static byte[] m26952a(UUID uuid, byte[] bArr) {
        C5510a m26953b = m26953b(bArr);
        if (m26953b == null) {
            return null;
        }
        if (uuid.equals(m26953b.f53090a)) {
            return m26953b.f53092c;
        }
        d90.m23842d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m26953b.f53090a + ".");
        return null;
    }
}
