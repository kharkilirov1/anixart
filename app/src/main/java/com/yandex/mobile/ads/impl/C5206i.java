package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.C5606pv;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.i */
/* loaded from: classes3.dex */
public final class C5206i {

    /* renamed from: a */
    private static final int[] f51154a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f51155b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f51156c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f51157d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f51158e = {32, 40, 48, 56, 64, 80, 96, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN, 576, 640};

    /* renamed from: f */
    private static final int[] f51159f = {69, 87, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.yandex.mobile.ads.impl.i$a */
    public static final class a {

        /* renamed from: a */
        @Nullable
        public final String f51160a;

        /* renamed from: b */
        public final int f51161b;

        /* renamed from: c */
        public final int f51162c;

        /* renamed from: d */
        public final int f51163d;

        /* renamed from: e */
        public final int f51164e;

        public /* synthetic */ a(String str, int i2, int i3, int i4, int i5, int i6) {
            this(str, i3, i4, i5, i6);
        }

        private a(@Nullable String str, int i2, int i3, int i4, int i5) {
            this.f51160a = str;
            this.f51162c = i2;
            this.f51161b = i3;
            this.f51163d = i4;
            this.f51164e = i5;
        }
    }

    /* renamed from: a */
    public static C5606pv m25408a(ap0 ap0Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        int i2 = f51155b[(ap0Var.m22607t() & 192) >> 6];
        int m22607t = ap0Var.m22607t();
        int i3 = f51157d[(m22607t & 56) >> 3];
        if ((m22607t & 4) != 0) {
            i3++;
        }
        return new C5606pv.a().m27555c(str).m27561f("audio/ac3").m27554c(i3).m27569n(i2).m27544a(drmInitData).m27559e(str2).m27550a();
    }

    /* renamed from: b */
    public static C5606pv m25409b(ap0 ap0Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        ap0Var.m22593f(2);
        int i2 = f51155b[(ap0Var.m22607t() & 192) >> 6];
        int m22607t = ap0Var.m22607t();
        int i3 = f51157d[(m22607t & 14) >> 1];
        if ((m22607t & 1) != 0) {
            i3++;
        }
        if (((ap0Var.m22607t() & 30) >> 1) > 0 && (2 & ap0Var.m22607t()) != 0) {
            i3 += 2;
        }
        return new C5606pv.a().m27555c(str).m27561f((ap0Var.m22579a() <= 0 || (ap0Var.m22607t() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").m27554c(i3).m27569n(i2).m27544a(drmInitData).m27559e(str2).m27550a();
    }

    /* renamed from: a */
    public static a m25407a(zo0 zo0Var) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int m30252b;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int m30258e = zo0Var.m30258e();
        zo0Var.m30257d(40);
        boolean z = zo0Var.m30252b(5) > 10;
        zo0Var.m30255c(m30258e);
        int i12 = -1;
        if (z) {
            zo0Var.m30257d(16);
            int m30252b2 = zo0Var.m30252b(2);
            if (m30252b2 == 0) {
                i12 = 0;
            } else if (m30252b2 == 1) {
                i12 = 1;
            } else if (m30252b2 == 2) {
                i12 = 2;
            }
            zo0Var.m30257d(3);
            int m30252b3 = (zo0Var.m30252b(11) + 1) * 2;
            int m30252b4 = zo0Var.m30252b(2);
            if (m30252b4 == 3) {
                i8 = f51156c[zo0Var.m30252b(2)];
                m30252b = 3;
                i7 = 6;
            } else {
                m30252b = zo0Var.m30252b(2);
                i7 = f51154a[m30252b];
                i8 = f51155b[m30252b4];
            }
            int i13 = i7 * 256;
            int m30252b5 = zo0Var.m30252b(3);
            boolean m30260f = zo0Var.m30260f();
            int i14 = f51157d[m30252b5] + (m30260f ? 1 : 0);
            zo0Var.m30257d(10);
            if (zo0Var.m30260f()) {
                zo0Var.m30257d(8);
            }
            if (m30252b5 == 0) {
                zo0Var.m30257d(5);
                if (zo0Var.m30260f()) {
                    zo0Var.m30257d(8);
                }
            }
            if (i12 == 1 && zo0Var.m30260f()) {
                zo0Var.m30257d(16);
            }
            if (zo0Var.m30260f()) {
                if (m30252b5 > 2) {
                    zo0Var.m30257d(2);
                }
                if ((m30252b5 & 1) == 0 || m30252b5 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    zo0Var.m30257d(6);
                }
                if ((m30252b5 & 4) != 0) {
                    zo0Var.m30257d(i10);
                }
                if (m30260f && zo0Var.m30260f()) {
                    zo0Var.m30257d(5);
                }
                if (i12 == 0) {
                    if (zo0Var.m30260f()) {
                        i11 = 6;
                        zo0Var.m30257d(6);
                    } else {
                        i11 = 6;
                    }
                    if (m30252b5 == 0 && zo0Var.m30260f()) {
                        zo0Var.m30257d(i11);
                    }
                    if (zo0Var.m30260f()) {
                        zo0Var.m30257d(i11);
                    }
                    int m30252b6 = zo0Var.m30252b(2);
                    if (m30252b6 == 1) {
                        zo0Var.m30257d(5);
                    } else if (m30252b6 == 2) {
                        zo0Var.m30257d(12);
                    } else if (m30252b6 == 3) {
                        int m30252b7 = zo0Var.m30252b(5);
                        if (zo0Var.m30260f()) {
                            zo0Var.m30257d(5);
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(4);
                            }
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(4);
                            }
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(4);
                            }
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(4);
                            }
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(4);
                            }
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(4);
                            }
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(4);
                            }
                            if (zo0Var.m30260f()) {
                                if (zo0Var.m30260f()) {
                                    zo0Var.m30257d(4);
                                }
                                if (zo0Var.m30260f()) {
                                    zo0Var.m30257d(4);
                                }
                            }
                        }
                        if (zo0Var.m30260f()) {
                            zo0Var.m30257d(5);
                            if (zo0Var.m30260f()) {
                                zo0Var.m30257d(7);
                                if (zo0Var.m30260f()) {
                                    zo0Var.m30257d(8);
                                }
                            }
                        }
                        zo0Var.m30257d((m30252b7 + 2) * 8);
                        zo0Var.m30254c();
                    }
                    if (m30252b5 < 2) {
                        if (zo0Var.m30260f()) {
                            zo0Var.m30257d(14);
                        }
                        if (m30252b5 == 0 && zo0Var.m30260f()) {
                            zo0Var.m30257d(14);
                        }
                    }
                    if (zo0Var.m30260f()) {
                        if (m30252b == 0) {
                            zo0Var.m30257d(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (zo0Var.m30260f()) {
                                    zo0Var.m30257d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zo0Var.m30260f()) {
                zo0Var.m30257d(5);
                if (m30252b5 == 2) {
                    zo0Var.m30257d(4);
                }
                if (m30252b5 >= 6) {
                    zo0Var.m30257d(2);
                }
                if (zo0Var.m30260f()) {
                    zo0Var.m30257d(8);
                }
                if (m30252b5 == 0 && zo0Var.m30260f()) {
                    zo0Var.m30257d(8);
                }
                if (m30252b4 < 3) {
                    zo0Var.m30262h();
                }
            }
            if (i12 == 0 && m30252b != 3) {
                zo0Var.m30262h();
            }
            if (i12 == 2 && (m30252b == 3 || zo0Var.m30260f())) {
                i9 = 6;
                zo0Var.m30257d(6);
            } else {
                i9 = 6;
            }
            str = (zo0Var.m30260f() && zo0Var.m30252b(i9) == 1 && zo0Var.m30252b(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i6 = i13;
            i2 = m30252b3;
            i3 = i8;
            i4 = i14;
        } else {
            zo0Var.m30257d(32);
            int m30252b8 = zo0Var.m30252b(2);
            String str2 = m30252b8 == 3 ? null : "audio/ac3";
            int m25404a = m25404a(m30252b8, zo0Var.m30252b(6));
            zo0Var.m30257d(8);
            int m30252b9 = zo0Var.m30252b(3);
            if ((m30252b9 & 1) != 0 && m30252b9 != 1) {
                zo0Var.m30257d(2);
            }
            if ((m30252b9 & 4) != 0) {
                zo0Var.m30257d(2);
            }
            if (m30252b9 == 2) {
                zo0Var.m30257d(2);
            }
            str = str2;
            i2 = m25404a;
            i3 = m30252b8 < 3 ? f51155b[m30252b8] : -1;
            i4 = f51157d[m30252b9] + (zo0Var.m30260f() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new a(str, i5, i4, i3, i2, i6);
    }

    /* renamed from: a */
    public static int m25406a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m25404a((b & 192) >> 6, b & 63);
    }

    /* renamed from: a */
    public static int m25405a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f51154a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: a */
    private static int m25404a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = f51155b;
        if (i2 >= 3 || i3 < 0) {
            return -1;
        }
        int[] iArr2 = f51159f;
        if (i4 >= 19) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + iArr2[i4]) * 2;
        }
        int i6 = f51158e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }
}
