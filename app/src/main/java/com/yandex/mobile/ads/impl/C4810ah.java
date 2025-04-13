package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.C5751sl;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.ah */
/* loaded from: classes3.dex */
public final class C4810ah extends AbstractC4865bh {

    /* renamed from: g */
    private final ap0 f48540g = new ap0();

    /* renamed from: h */
    private final zo0 f48541h = new zo0();

    /* renamed from: i */
    private int f48542i = -1;

    /* renamed from: j */
    private final int f48543j;

    /* renamed from: k */
    private final b[] f48544k;

    /* renamed from: l */
    private b f48545l;

    /* renamed from: m */
    @Nullable
    private List<C5751sl> f48546m;

    /* renamed from: n */
    @Nullable
    private List<C5751sl> f48547n;

    /* renamed from: o */
    @Nullable
    private c f48548o;

    /* renamed from: p */
    private int f48549p;

    /* renamed from: com.yandex.mobile.ads.impl.ah$a */
    public static final class a {

        /* renamed from: c */
        private static final Comparator<a> f48550c = C4891by.f49007c;

        /* renamed from: a */
        public final C5751sl f48551a;

        /* renamed from: b */
        public final int f48552b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f2, int i2, float f3, int i3, boolean z, int i4, int i5) {
            C5751sl.a m28316d = new C5751sl.a().m28304a(spannableStringBuilder).m28309b(alignment).m28302a(0, f2).m28301a(i2).m28307b(f3).m28308b(i3).m28316d(-3.4028235E38f);
            if (z) {
                m28316d.m28317d(i4);
            }
            this.f48551a = m28316d.m28305a();
            this.f48552b = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m22506a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f48552b, aVar.f48552b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ah$b */
    public static final class b {

        /* renamed from: A */
        private static final int[] f48553A;

        /* renamed from: B */
        private static final boolean[] f48554B;

        /* renamed from: C */
        private static final int[] f48555C;

        /* renamed from: D */
        private static final int[] f48556D;

        /* renamed from: E */
        private static final int[] f48557E;

        /* renamed from: F */
        private static final int[] f48558F;

        /* renamed from: w */
        public static final int f48559w = m22509a(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f48560x;

        /* renamed from: y */
        private static final int[] f48561y;

        /* renamed from: z */
        private static final int[] f48562z;

        /* renamed from: a */
        private final ArrayList f48563a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f48564b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f48565c;

        /* renamed from: d */
        private boolean f48566d;

        /* renamed from: e */
        private int f48567e;

        /* renamed from: f */
        private boolean f48568f;

        /* renamed from: g */
        private int f48569g;

        /* renamed from: h */
        private int f48570h;

        /* renamed from: i */
        private int f48571i;

        /* renamed from: j */
        private int f48572j;

        /* renamed from: k */
        private boolean f48573k;

        /* renamed from: l */
        private int f48574l;

        /* renamed from: m */
        private int f48575m;

        /* renamed from: n */
        private int f48576n;

        /* renamed from: o */
        private int f48577o;

        /* renamed from: p */
        private int f48578p;

        /* renamed from: q */
        private int f48579q;

        /* renamed from: r */
        private int f48580r;

        /* renamed from: s */
        private int f48581s;

        /* renamed from: t */
        private int f48582t;

        /* renamed from: u */
        private int f48583u;

        /* renamed from: v */
        private int f48584v;

        static {
            int m22509a = m22509a(0, 0, 0, 0);
            f48560x = m22509a;
            int m22509a2 = m22509a(0, 0, 0, 3);
            f48561y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f48562z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f48553A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f48554B = new boolean[]{false, false, false, true, true, true, false};
            f48555C = new int[]{m22509a, m22509a2, m22509a, m22509a, m22509a2, m22509a, m22509a};
            f48556D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f48557E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f48558F = new int[]{m22509a, m22509a, m22509a, m22509a, m22509a, m22509a2, m22509a2};
        }

        public b() {
            m22524h();
        }

        /* renamed from: a */
        public final void m22514a(boolean z) {
            this.f48566d = z;
        }

        /* renamed from: b */
        public final void m22518b(int i2, int i3) {
            this.f48577o = i2;
            this.f48574l = i3;
        }

        /* renamed from: c */
        public final SpannableString m22519c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f48564b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f48578p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f48578p, length, 33);
                }
                if (this.f48579q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f48579q, length, 33);
                }
                if (this.f48580r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f48581s), this.f48580r, length, 33);
                }
                if (this.f48582t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f48583u), this.f48582t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public final void m22520d() {
            this.f48563a.clear();
            this.f48564b.clear();
            this.f48578p = -1;
            this.f48579q = -1;
            this.f48580r = -1;
            this.f48582t = -1;
            this.f48584v = 0;
        }

        /* renamed from: e */
        public final boolean m22521e() {
            return this.f48565c;
        }

        /* renamed from: f */
        public final boolean m22522f() {
            return !this.f48565c || (this.f48563a.isEmpty() && this.f48564b.length() == 0);
        }

        /* renamed from: g */
        public final boolean m22523g() {
            return this.f48566d;
        }

        /* renamed from: h */
        public final void m22524h() {
            m22520d();
            this.f48565c = false;
            this.f48566d = false;
            this.f48567e = 4;
            this.f48568f = false;
            this.f48569g = 0;
            this.f48570h = 0;
            this.f48571i = 0;
            this.f48572j = 15;
            this.f48573k = true;
            this.f48574l = 0;
            this.f48575m = 0;
            this.f48576n = 0;
            int i2 = f48560x;
            this.f48577o = i2;
            this.f48581s = f48559w;
            this.f48583u = i2;
        }

        /* renamed from: a */
        public final void m22516a(boolean z, boolean z2, int i2, boolean z3, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f48565c = true;
            this.f48566d = z;
            this.f48573k = z2;
            this.f48567e = i2;
            this.f48568f = z3;
            this.f48569g = i3;
            this.f48570h = i4;
            this.f48571i = i6;
            int i9 = i5 + 1;
            if (this.f48572j != i9) {
                this.f48572j = i9;
                while (true) {
                    if ((!z2 || this.f48563a.size() < this.f48572j) && this.f48563a.size() < 15) {
                        break;
                    } else {
                        this.f48563a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.f48575m != i7) {
                this.f48575m = i7;
                int i10 = i7 - 1;
                int i11 = f48555C[i10];
                boolean z4 = f48554B[i10];
                int i12 = f48562z[i10];
                int i13 = f48553A[i10];
                int i14 = f48561y[i10];
                this.f48577o = i11;
                this.f48574l = i14;
            }
            if (i8 == 0 || this.f48576n == i8) {
                return;
            }
            this.f48576n = i8;
            int i15 = i8 - 1;
            int i16 = f48557E[i15];
            int i17 = f48556D[i15];
            m22515a(false, false);
            m22513a(f48559w, f48558F[i15]);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
        @androidx.annotation.Nullable
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.C4810ah.a m22517b() {
            /*
                Method dump skipped, instructions count: 184
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4810ah.b.m22517b():com.yandex.mobile.ads.impl.ah$a");
        }

        /* renamed from: a */
        public final void m22515a(boolean z, boolean z2) {
            if (this.f48578p != -1) {
                if (!z) {
                    this.f48564b.setSpan(new StyleSpan(2), this.f48578p, this.f48564b.length(), 33);
                    this.f48578p = -1;
                }
            } else if (z) {
                this.f48578p = this.f48564b.length();
            }
            if (this.f48579q == -1) {
                if (z2) {
                    this.f48579q = this.f48564b.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f48564b.setSpan(new UnderlineSpan(), this.f48579q, this.f48564b.length(), 33);
                this.f48579q = -1;
            }
        }

        /* renamed from: a */
        public final void m22513a(int i2, int i3) {
            if (this.f48580r != -1 && this.f48581s != i2) {
                this.f48564b.setSpan(new ForegroundColorSpan(this.f48581s), this.f48580r, this.f48564b.length(), 33);
            }
            if (i2 != f48559w) {
                this.f48580r = this.f48564b.length();
                this.f48581s = i2;
            }
            if (this.f48582t != -1 && this.f48583u != i3) {
                this.f48564b.setSpan(new BackgroundColorSpan(this.f48583u), this.f48582t, this.f48564b.length(), 33);
            }
            if (i3 != f48560x) {
                this.f48582t = this.f48564b.length();
                this.f48583u = i3;
            }
        }

        /* renamed from: a */
        public final void m22512a(int i2) {
            if (this.f48584v != i2) {
                m22511a('\n');
            }
            this.f48584v = i2;
        }

        /* renamed from: a */
        public final void m22510a() {
            int length = this.f48564b.length();
            if (length > 0) {
                this.f48564b.delete(length - 1, length);
            }
        }

        /* renamed from: a */
        public final void m22511a(char c2) {
            if (c2 == '\n') {
                this.f48563a.add(m22519c());
                this.f48564b.clear();
                if (this.f48578p != -1) {
                    this.f48578p = 0;
                }
                if (this.f48579q != -1) {
                    this.f48579q = 0;
                }
                if (this.f48580r != -1) {
                    this.f48580r = 0;
                }
                if (this.f48582t != -1) {
                    this.f48582t = 0;
                }
                while (true) {
                    if ((!this.f48573k || this.f48563a.size() < this.f48572j) && this.f48563a.size() < 15) {
                        return;
                    } else {
                        this.f48563a.remove(0);
                    }
                }
            } else {
                this.f48564b.append(c2);
            }
        }

        /* renamed from: a */
        public static int m22509a(int i2, int i3, int i4, int i5) {
            C5220ia.m25471a(i2, 4);
            C5220ia.m25471a(i3, 4);
            C5220ia.m25471a(i4, 4);
            C5220ia.m25471a(i5, 4);
            int i6 = KotlinVersion.MAX_COMPONENT_VALUE;
            int i7 = i5 != 2 ? i5 != 3 ? KotlinVersion.MAX_COMPONENT_VALUE : 0 : 127;
            int i8 = i2 > 1 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
            int i9 = i3 > 1 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
            if (i4 <= 1) {
                i6 = 0;
            }
            return Color.argb(i7, i8, i9, i6);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ah$c */
    public static final class c {

        /* renamed from: a */
        public final int f48585a;

        /* renamed from: b */
        public final int f48586b;

        /* renamed from: c */
        public final byte[] f48587c;

        /* renamed from: d */
        public int f48588d = 0;

        public c(int i2, int i3) {
            this.f48585a = i2;
            this.f48586b = i3;
            this.f48587c = new byte[(i3 * 2) - 1];
        }
    }

    public C4810ah(int i2, @Nullable List<byte[]> list) {
        this.f48543j = i2 == -1 ? 1 : i2;
        if (list != null) {
            C5081fj.m24608a(list);
        }
        this.f48544k = new b[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f48544k[i3] = new b();
        }
        this.f48545l = this.f48544k[0];
    }

    /* renamed from: i */
    private void m22501i() {
        c cVar = this.f48548o;
        if (cVar == null) {
            return;
        }
        if (cVar.f48588d != (cVar.f48586b * 2) - 1) {
            StringBuilder m26356a = l60.m26356a("DtvCcPacket ended prematurely; size is ");
            m26356a.append((this.f48548o.f48586b * 2) - 1);
            m26356a.append(", but current index is ");
            m26356a.append(this.f48548o.f48588d);
            m26356a.append(" (sequence number ");
            m26356a.append(this.f48548o.f48585a);
            m26356a.append(");");
            d90.m23837a("Cea708Decoder", m26356a.toString());
        }
        zo0 zo0Var = this.f48541h;
        c cVar2 = this.f48548o;
        zo0Var.m30249a(cVar2.f48588d, cVar2.f48587c);
        boolean z = false;
        while (true) {
            if (this.f48541h.m30251b() > 0) {
                int m30252b = this.f48541h.m30252b(3);
                int m30252b2 = this.f48541h.m30252b(5);
                if (m30252b == 7) {
                    this.f48541h.m30257d(2);
                    m30252b = this.f48541h.m30252b(6);
                    if (m30252b < 7) {
                        c80.m23073a("Invalid extended service number: ", m30252b, "Cea708Decoder");
                    }
                }
                if (m30252b2 == 0) {
                    if (m30252b != 0) {
                        d90.m23842d("Cea708Decoder", "serviceNumber is non-zero (" + m30252b + ") when blockSize is 0");
                    }
                } else if (m30252b != this.f48543j) {
                    this.f48541h.m30259e(m30252b2);
                } else {
                    int m30258e = (m30252b2 * 8) + this.f48541h.m30258e();
                    while (this.f48541h.m30258e() < m30258e) {
                        int m30252b3 = this.f48541h.m30252b(8);
                        if (m30252b3 == 16) {
                            int m30252b4 = this.f48541h.m30252b(8);
                            if (m30252b4 > 31) {
                                if (m30252b4 <= 127) {
                                    if (m30252b4 == 32) {
                                        this.f48545l.m22511a(' ');
                                    } else if (m30252b4 == 33) {
                                        this.f48545l.m22511a((char) 160);
                                    } else if (m30252b4 == 37) {
                                        this.f48545l.m22511a((char) 8230);
                                    } else if (m30252b4 == 42) {
                                        this.f48545l.m22511a((char) 352);
                                    } else if (m30252b4 == 44) {
                                        this.f48545l.m22511a((char) 338);
                                    } else if (m30252b4 == 63) {
                                        this.f48545l.m22511a((char) 376);
                                    } else if (m30252b4 == 57) {
                                        this.f48545l.m22511a((char) 8482);
                                    } else if (m30252b4 == 58) {
                                        this.f48545l.m22511a((char) 353);
                                    } else if (m30252b4 == 60) {
                                        this.f48545l.m22511a((char) 339);
                                    } else if (m30252b4 != 61) {
                                        switch (m30252b4) {
                                            case 48:
                                                this.f48545l.m22511a((char) 9608);
                                                break;
                                            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                                this.f48545l.m22511a((char) 8216);
                                                break;
                                            case 50:
                                                this.f48545l.m22511a((char) 8217);
                                                break;
                                            case 51:
                                                this.f48545l.m22511a((char) 8220);
                                                break;
                                            case 52:
                                                this.f48545l.m22511a((char) 8221);
                                                break;
                                            case 53:
                                                this.f48545l.m22511a((char) 8226);
                                                break;
                                            default:
                                                switch (m30252b4) {
                                                    case C4632R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                        this.f48545l.m22511a((char) 8539);
                                                        break;
                                                    case C4632R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                        this.f48545l.m22511a((char) 8540);
                                                        break;
                                                    case C4632R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                        this.f48545l.m22511a((char) 8541);
                                                        break;
                                                    case C4632R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                        this.f48545l.m22511a((char) 8542);
                                                        break;
                                                    case C4632R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                        this.f48545l.m22511a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f48545l.m22511a((char) 9488);
                                                        break;
                                                    case C4632R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                        this.f48545l.m22511a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f48545l.m22511a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f48545l.m22511a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f48545l.m22511a((char) 9484);
                                                        break;
                                                    default:
                                                        c80.m23073a("Invalid G2 character: ", m30252b4, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f48545l.m22511a((char) 8480);
                                    }
                                } else if (m30252b4 <= 159) {
                                    if (m30252b4 <= 135) {
                                        this.f48541h.m30257d(32);
                                    } else if (m30252b4 <= 143) {
                                        this.f48541h.m30257d(40);
                                    } else if (m30252b4 <= 159) {
                                        this.f48541h.m30257d(2);
                                        this.f48541h.m30257d(this.f48541h.m30252b(6) * 8);
                                    }
                                } else if (m30252b4 > 255) {
                                    c80.m23073a("Invalid extended command: ", m30252b4, "Cea708Decoder");
                                } else if (m30252b4 == 160) {
                                    this.f48545l.m22511a((char) 13252);
                                } else {
                                    c80.m23073a("Invalid G3 character: ", m30252b4, "Cea708Decoder");
                                    this.f48545l.m22511a('_');
                                }
                                z = true;
                            } else if (m30252b4 > 7) {
                                if (m30252b4 <= 15) {
                                    this.f48541h.m30257d(8);
                                } else if (m30252b4 <= 23) {
                                    this.f48541h.m30257d(16);
                                } else if (m30252b4 <= 31) {
                                    this.f48541h.m30257d(24);
                                }
                            }
                        } else if (m30252b3 > 31) {
                            if (m30252b3 <= 127) {
                                if (m30252b3 == 127) {
                                    this.f48545l.m22511a((char) 9835);
                                } else {
                                    this.f48545l.m22511a((char) (m30252b3 & KotlinVersion.MAX_COMPONENT_VALUE));
                                }
                            } else if (m30252b3 <= 159) {
                                switch (m30252b3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i2 = m30252b3 - 128;
                                        if (this.f48549p != i2) {
                                            this.f48549p = i2;
                                            this.f48545l = this.f48544k[i2];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        for (int i3 = 1; i3 <= 8; i3++) {
                                            if (this.f48541h.m30260f()) {
                                                this.f48544k[8 - i3].m22520d();
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i4 = 1; i4 <= 8; i4++) {
                                            if (this.f48541h.m30260f()) {
                                                this.f48544k[8 - i4].m22514a(true);
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (this.f48541h.m30260f()) {
                                                this.f48544k[8 - i5].m22514a(false);
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (this.f48541h.m30260f()) {
                                                this.f48544k[8 - i6].m22514a(!r2.m22523g());
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (this.f48541h.m30260f()) {
                                                this.f48544k[8 - i7].m22524h();
                                            }
                                        }
                                        break;
                                    case 141:
                                        this.f48541h.m30257d(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        for (int i8 = 0; i8 < 8; i8++) {
                                            this.f48544k[i8].m22524h();
                                        }
                                        break;
                                    case 144:
                                        if (this.f48545l.m22521e()) {
                                            this.f48541h.m30252b(4);
                                            this.f48541h.m30252b(2);
                                            this.f48541h.m30252b(2);
                                            boolean m30260f = this.f48541h.m30260f();
                                            boolean m30260f2 = this.f48541h.m30260f();
                                            this.f48541h.m30252b(3);
                                            this.f48541h.m30252b(3);
                                            this.f48545l.m22515a(m30260f, m30260f2);
                                            break;
                                        } else {
                                            this.f48541h.m30257d(16);
                                            break;
                                        }
                                    case 145:
                                        if (this.f48545l.m22521e()) {
                                            int m22509a = b.m22509a(this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2));
                                            int m22509a2 = b.m22509a(this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2));
                                            this.f48541h.m30257d(2);
                                            b.m22509a(this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2), 0);
                                            this.f48545l.m22513a(m22509a, m22509a2);
                                            break;
                                        } else {
                                            this.f48541h.m30257d(24);
                                            break;
                                        }
                                    case 146:
                                        if (this.f48545l.m22521e()) {
                                            this.f48541h.m30257d(4);
                                            int m30252b5 = this.f48541h.m30252b(4);
                                            this.f48541h.m30257d(2);
                                            this.f48541h.m30252b(6);
                                            this.f48545l.m22512a(m30252b5);
                                            break;
                                        } else {
                                            this.f48541h.m30257d(16);
                                            break;
                                        }
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        c80.m23073a("Invalid C1 command: ", m30252b3, "Cea708Decoder");
                                        break;
                                    case 151:
                                        if (this.f48545l.m22521e()) {
                                            int m22509a3 = b.m22509a(this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2));
                                            this.f48541h.m30252b(2);
                                            b.m22509a(this.f48541h.m30252b(2), this.f48541h.m30252b(2), this.f48541h.m30252b(2), 0);
                                            this.f48541h.m30260f();
                                            this.f48541h.m30260f();
                                            this.f48541h.m30252b(2);
                                            this.f48541h.m30252b(2);
                                            int m30252b6 = this.f48541h.m30252b(2);
                                            this.f48541h.m30257d(8);
                                            this.f48545l.m22518b(m22509a3, m30252b6);
                                            break;
                                        } else {
                                            this.f48541h.m30257d(32);
                                            break;
                                        }
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i9 = m30252b3 - 152;
                                        b bVar = this.f48544k[i9];
                                        this.f48541h.m30257d(2);
                                        boolean m30260f3 = this.f48541h.m30260f();
                                        boolean m30260f4 = this.f48541h.m30260f();
                                        this.f48541h.m30260f();
                                        int m30252b7 = this.f48541h.m30252b(3);
                                        boolean m30260f5 = this.f48541h.m30260f();
                                        int m30252b8 = this.f48541h.m30252b(7);
                                        int m30252b9 = this.f48541h.m30252b(8);
                                        int m30252b10 = this.f48541h.m30252b(4);
                                        int m30252b11 = this.f48541h.m30252b(4);
                                        this.f48541h.m30257d(2);
                                        this.f48541h.m30252b(6);
                                        this.f48541h.m30257d(2);
                                        bVar.m22516a(m30260f3, m30260f4, m30252b7, m30260f5, m30252b8, m30252b9, m30252b11, m30252b10, this.f48541h.m30252b(3), this.f48541h.m30252b(3));
                                        if (this.f48549p != i9) {
                                            this.f48549p = i9;
                                            this.f48545l = this.f48544k[i9];
                                            break;
                                        }
                                        break;
                                }
                            } else if (m30252b3 <= 255) {
                                this.f48545l.m22511a((char) (m30252b3 & KotlinVersion.MAX_COMPONENT_VALUE));
                            } else {
                                c80.m23073a("Invalid base command: ", m30252b3, "Cea708Decoder");
                            }
                            z = true;
                        } else if (m30252b3 != 0) {
                            if (m30252b3 == 3) {
                                this.f48546m = m22502j();
                            } else if (m30252b3 != 8) {
                                switch (m30252b3) {
                                    case 12:
                                        for (int i10 = 0; i10 < 8; i10++) {
                                            this.f48544k[i10].m22524h();
                                        }
                                        break;
                                    case 13:
                                        this.f48545l.m22511a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (m30252b3 < 17 || m30252b3 > 23) {
                                            if (m30252b3 < 24 || m30252b3 > 31) {
                                                c80.m23073a("Invalid C0 command: ", m30252b3, "Cea708Decoder");
                                                break;
                                            } else {
                                                c80.m23073a("Currently unsupported COMMAND_P16 Command: ", m30252b3, "Cea708Decoder");
                                                this.f48541h.m30257d(16);
                                                break;
                                            }
                                        } else {
                                            c80.m23073a("Currently unsupported COMMAND_EXT1 Command: ", m30252b3, "Cea708Decoder");
                                            this.f48541h.m30257d(8);
                                            break;
                                        }
                                }
                            } else {
                                this.f48545l.m22510a();
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            this.f48546m = m22502j();
        }
        this.f48548o = null;
    }

    /* renamed from: j */
    private List<C5751sl> m22502j() {
        a m22517b;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.f48544k[i2].m22522f() && this.f48544k[i2].m22523g() && (m22517b = this.f48544k[i2].m22517b()) != null) {
                arrayList.add(m22517b);
            }
        }
        Collections.sort(arrayList, a.f48550c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(((a) arrayList.get(i3)).f48551a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh
    /* renamed from: b */
    public final void mo22503b(a51 a51Var) {
        ByteBuffer byteBuffer = a51Var.f54757c;
        Objects.requireNonNull(byteBuffer);
        this.f48540g.m22582a(byteBuffer.limit(), byteBuffer.array());
        while (this.f48540g.m22579a() >= 3) {
            int m22607t = this.f48540g.m22607t() & 7;
            int i2 = m22607t & 3;
            boolean z = (m22607t & 4) == 4;
            byte m22607t2 = (byte) this.f48540g.m22607t();
            byte m22607t3 = (byte) this.f48540g.m22607t();
            if (i2 == 2 || i2 == 3) {
                if (z) {
                    if (i2 == 3) {
                        m22501i();
                        int i3 = (m22607t2 & 192) >> 6;
                        int i4 = this.f48542i;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            for (int i5 = 0; i5 < 8; i5++) {
                                this.f48544k[i5].m22524h();
                            }
                            StringBuilder m26356a = l60.m26356a("Sequence number discontinuity. previous=");
                            m26356a.append(this.f48542i);
                            m26356a.append(" current=");
                            m26356a.append(i3);
                            d90.m23842d("Cea708Decoder", m26356a.toString());
                        }
                        this.f48542i = i3;
                        int i6 = m22607t2 & 63;
                        if (i6 == 0) {
                            i6 = 64;
                        }
                        c cVar = new c(i3, i6);
                        this.f48548o = cVar;
                        byte[] bArr = cVar.f48587c;
                        int i7 = cVar.f48588d;
                        cVar.f48588d = i7 + 1;
                        bArr[i7] = m22607t3;
                    } else {
                        C5220ia.m25473a(i2 == 2);
                        c cVar2 = this.f48548o;
                        if (cVar2 == null) {
                            d90.m23839b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f48587c;
                            int i8 = cVar2.f48588d;
                            int i9 = i8 + 1;
                            bArr2[i8] = m22607t2;
                            cVar2.f48588d = i9 + 1;
                            bArr2[i9] = m22607t3;
                        }
                    }
                    c cVar3 = this.f48548o;
                    if (cVar3.f48588d == (cVar3.f48586b * 2) - 1) {
                        m22501i();
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh
    /* renamed from: c */
    public final w41 mo22504c() {
        List<C5751sl> list = this.f48546m;
        this.f48547n = list;
        Objects.requireNonNull(list);
        return new C4922ch(list);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh, com.yandex.mobile.ads.impl.InterfaceC5597pm
    public final void flush() {
        super.flush();
        this.f48546m = null;
        this.f48547n = null;
        this.f48549p = 0;
        this.f48545l = this.f48544k[0];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f48544k[i2].m22524h();
        }
        this.f48548o = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh
    /* renamed from: h */
    public final boolean mo22505h() {
        return this.f48546m != this.f48547n;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    public final /* bridge */ /* synthetic */ void release() {
    }
}
