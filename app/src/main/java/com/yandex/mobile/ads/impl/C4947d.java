package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;

/* renamed from: com.yandex.mobile.ads.impl.d */
/* loaded from: classes3.dex */
public final class C4947d {

    /* renamed from: a */
    private static final int[] f49489a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, CharsToNameCanonicalizer.MAX_ENTRIES_FOR_REUSE, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f49490b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.yandex.mobile.ads.impl.d$a */
    public static final class a {

        /* renamed from: a */
        public final int f49491a;

        /* renamed from: b */
        public final int f49492b;

        /* renamed from: c */
        public final String f49493c;

        public /* synthetic */ a(int i2, int i3, String str, int i4) {
            this(i2, i3, str);
        }

        private a(int i2, int i3, String str) {
            this.f49491a = i2;
            this.f49492b = i3;
            this.f49493c = str;
        }
    }

    /* renamed from: a */
    public static a m23731a(zo0 zo0Var, boolean z) throws ep0 {
        int i2;
        int i3;
        int m30252b = zo0Var.m30252b(5);
        if (m30252b == 31) {
            m30252b = zo0Var.m30252b(6) + 32;
        }
        int m30252b2 = zo0Var.m30252b(4);
        if (m30252b2 == 15) {
            i2 = zo0Var.m30252b(24);
        } else {
            if (m30252b2 >= 13) {
                throw ep0.m24225a((String) null, (Exception) null);
            }
            i2 = f49489a[m30252b2];
        }
        int m30252b3 = zo0Var.m30252b(4);
        String m26036a = k60.m26036a("mp4a.40.", m30252b);
        if (m30252b == 5 || m30252b == 29) {
            int m30252b4 = zo0Var.m30252b(4);
            if (m30252b4 == 15) {
                i3 = zo0Var.m30252b(24);
            } else {
                if (m30252b4 >= 13) {
                    throw ep0.m24225a((String) null, (Exception) null);
                }
                i3 = f49489a[m30252b4];
            }
            i2 = i3;
            int m30252b5 = zo0Var.m30252b(5);
            if (m30252b5 == 31) {
                m30252b5 = zo0Var.m30252b(6) + 32;
            }
            m30252b = m30252b5;
            if (m30252b == 22) {
                m30252b3 = zo0Var.m30252b(4);
            }
        }
        if (z) {
            if (m30252b != 6 && m30252b != 7 && m30252b != 17 && m30252b != 1 && m30252b != 2 && m30252b != 3 && m30252b != 4) {
                switch (m30252b) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ep0.m24224a("Unsupported audio object type: " + m30252b);
                }
            }
            if (zo0Var.m30260f()) {
                d90.m23842d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zo0Var.m30260f()) {
                zo0Var.m30257d(14);
            }
            boolean m30260f = zo0Var.m30260f();
            if (m30252b3 == 0) {
                throw new UnsupportedOperationException();
            }
            if (m30252b == 6 || m30252b == 20) {
                zo0Var.m30257d(3);
            }
            if (m30260f) {
                if (m30252b == 22) {
                    zo0Var.m30257d(16);
                }
                if (m30252b == 17 || m30252b == 19 || m30252b == 20 || m30252b == 23) {
                    zo0Var.m30257d(3);
                }
                zo0Var.m30257d(1);
            }
            switch (m30252b) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m30252b6 = zo0Var.m30252b(2);
                    if (m30252b6 == 2 || m30252b6 == 3) {
                        throw ep0.m24224a("Unsupported epConfig: " + m30252b6);
                    }
            }
        }
        int i4 = f49490b[m30252b3];
        if (i4 != -1) {
            return new a(i2, i4, m26036a, 0);
        }
        throw ep0.m24225a((String) null, (Exception) null);
    }
}
