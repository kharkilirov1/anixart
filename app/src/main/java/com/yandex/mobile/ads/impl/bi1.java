package com.yandex.mobile.ads.impl;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.exo.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class bi1 {

    /* renamed from: com.yandex.mobile.ads.impl.bi1$a */
    public static final class C4868a {

        /* renamed from: a */
        public final String[] f48885a;

        public C4868a(String[] strArr) {
            this.f48885a = strArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bi1$b */
    public static final class C4869b {

        /* renamed from: a */
        public final boolean f48886a;

        public C4869b(boolean z) {
            this.f48886a = z;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bi1$c */
    public static final class C4870c {

        /* renamed from: a */
        public final int f48887a;

        /* renamed from: b */
        public final int f48888b;

        /* renamed from: c */
        public final int f48889c;

        /* renamed from: d */
        public final int f48890d;

        /* renamed from: e */
        public final int f48891e;

        /* renamed from: f */
        public final int f48892f;

        /* renamed from: g */
        public final byte[] f48893g;

        public C4870c(int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
            this.f48887a = i2;
            this.f48888b = i3;
            this.f48889c = i4;
            this.f48890d = i5;
            this.f48891e = i6;
            this.f48892f = i7;
            this.f48893g = bArr;
        }
    }

    /* renamed from: a */
    public static C4870c m22838a(ap0 ap0Var) throws ep0 {
        m22839a(1, ap0Var, false);
        int m22598k = ap0Var.m22598k();
        if (m22598k < 0) {
            throw new IllegalStateException(k60.m26036a("Top bit not zero: ", m22598k));
        }
        int m22607t = ap0Var.m22607t();
        int m22598k2 = ap0Var.m22598k();
        if (m22598k2 < 0) {
            throw new IllegalStateException(k60.m26036a("Top bit not zero: ", m22598k2));
        }
        int m22598k3 = ap0Var.m22598k();
        int i2 = m22598k3 <= 0 ? -1 : m22598k3;
        int m22598k4 = ap0Var.m22598k();
        int i3 = m22598k4 <= 0 ? -1 : m22598k4;
        ap0Var.m22598k();
        int m22607t2 = ap0Var.m22607t();
        int pow = (int) Math.pow(2.0d, m22607t2 & 15);
        int pow2 = (int) Math.pow(2.0d, (m22607t2 & 240) >> 4);
        ap0Var.m22607t();
        return new C4870c(m22607t, m22598k2, i2, i3, pow, pow2, Arrays.copyOf(ap0Var.m22587c(), ap0Var.m22590e()));
    }

    /* renamed from: a */
    public static C4868a m22837a(ap0 ap0Var, boolean z, boolean z2) throws ep0 {
        if (z) {
            m22839a(3, ap0Var, false);
        }
        ap0Var.m22580a((int) ap0Var.m22601n(), C5285jh.f51608c);
        long m22601n = ap0Var.m22601n();
        String[] strArr = new String[(int) m22601n];
        for (int i2 = 0; i2 < m22601n; i2++) {
            strArr[i2] = ap0Var.m22580a((int) ap0Var.m22601n(), C5285jh.f51608c);
        }
        if (z2 && (ap0Var.m22607t() & 1) == 0) {
            throw ep0.m24225a("framing bit expected to be set", (Exception) null);
        }
        return new C4868a(strArr);
    }

    @Nullable
    /* renamed from: a */
    public static Metadata m22836a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            int i3 = s91.f54530a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                ai1.m22527a("Failed to parse Vorbis comment: ", str, "VorbisUtil");
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    ap0 ap0Var = new ap0(Base64.decode(split[1], 0));
                    int m22595h = ap0Var.m22595h();
                    String m22580a = ap0Var.m22580a(ap0Var.m22595h(), C5285jh.f51606a);
                    String m22580a2 = ap0Var.m22580a(ap0Var.m22595h(), C5285jh.f51608c);
                    int m22595h2 = ap0Var.m22595h();
                    int m22595h3 = ap0Var.m22595h();
                    int m22595h4 = ap0Var.m22595h();
                    int m22595h5 = ap0Var.m22595h();
                    int m22595h6 = ap0Var.m22595h();
                    byte[] bArr = new byte[m22595h6];
                    ap0Var.m22583a(bArr, 0, m22595h6);
                    arrayList.add(new PictureFrame(m22595h, m22580a, m22580a2, m22595h2, m22595h3, m22595h4, m22595h5, bArr));
                } catch (RuntimeException e2) {
                    d90.m23840b("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: a */
    public static boolean m22839a(int i2, ap0 ap0Var, boolean z) throws ep0 {
        if (ap0Var.m22579a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder m26356a = l60.m26356a("too short header: ");
            m26356a.append(ap0Var.m22579a());
            throw ep0.m24225a(m26356a.toString(), (Exception) null);
        }
        if (ap0Var.m22607t() != i2) {
            if (z) {
                return false;
            }
            StringBuilder m26356a2 = l60.m26356a("expected header type ");
            m26356a2.append(Integer.toHexString(i2));
            throw ep0.m24225a(m26356a2.toString(), (Exception) null);
        }
        if (ap0Var.m22607t() == 118 && ap0Var.m22607t() == 111 && ap0Var.m22607t() == 114 && ap0Var.m22607t() == 98 && ap0Var.m22607t() == 105 && ap0Var.m22607t() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ep0.m24225a("expected characters 'vorbis'", (Exception) null);
    }
}
