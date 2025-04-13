package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.yandex.mobile.ads.C4632R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class Cea708Decoder extends CeaDecoder {

    /* renamed from: g */
    public final ParsableByteArray f13548g = new ParsableByteArray();

    /* renamed from: h */
    public final ParsableBitArray f13549h = new ParsableBitArray();

    /* renamed from: i */
    public int f13550i = -1;

    /* renamed from: j */
    public final int f13551j;

    /* renamed from: k */
    public final CueInfoBuilder[] f13552k;

    /* renamed from: l */
    public CueInfoBuilder f13553l;

    /* renamed from: m */
    @Nullable
    public List<Cue> f13554m;

    /* renamed from: n */
    @Nullable
    public List<Cue> f13555n;

    /* renamed from: o */
    @Nullable
    public DtvCcPacket f13556o;

    /* renamed from: p */
    public int f13557p;

    public static final class Cea708CueInfo {

        /* renamed from: a */
        public final Cue f13558a;

        /* renamed from: b */
        public final int f13559b;

        public Cea708CueInfo(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5, int i6) {
            Cue.Builder builder = new Cue.Builder();
            builder.f13454a = charSequence;
            builder.f13456c = alignment;
            builder.f13458e = f2;
            builder.f13459f = i2;
            builder.f13460g = i3;
            builder.f13461h = f3;
            builder.f13462i = i4;
            builder.f13465l = f4;
            if (z) {
                builder.f13468o = i5;
                builder.f13467n = true;
            }
            this.f13558a = builder.m7178a();
            this.f13559b = i6;
        }
    }

    public static final class CueInfoBuilder {

        /* renamed from: A */
        public static final int[] f13560A;

        /* renamed from: B */
        public static final boolean[] f13561B;

        /* renamed from: C */
        public static final int[] f13562C;

        /* renamed from: D */
        public static final int[] f13563D;

        /* renamed from: E */
        public static final int[] f13564E;

        /* renamed from: F */
        public static final int[] f13565F;

        /* renamed from: w */
        public static final int f13566w = m7213d(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f13567x;

        /* renamed from: y */
        public static final int[] f13568y;

        /* renamed from: z */
        public static final int[] f13569z;

        /* renamed from: a */
        public final List<SpannableString> f13570a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f13571b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f13572c;

        /* renamed from: d */
        public boolean f13573d;

        /* renamed from: e */
        public int f13574e;

        /* renamed from: f */
        public boolean f13575f;

        /* renamed from: g */
        public int f13576g;

        /* renamed from: h */
        public int f13577h;

        /* renamed from: i */
        public int f13578i;

        /* renamed from: j */
        public int f13579j;

        /* renamed from: k */
        public boolean f13580k;

        /* renamed from: l */
        public int f13581l;

        /* renamed from: m */
        public int f13582m;

        /* renamed from: n */
        public int f13583n;

        /* renamed from: o */
        public int f13584o;

        /* renamed from: p */
        public int f13585p;

        /* renamed from: q */
        public int f13586q;

        /* renamed from: r */
        public int f13587r;

        /* renamed from: s */
        public int f13588s;

        /* renamed from: t */
        public int f13589t;

        /* renamed from: u */
        public int f13590u;

        /* renamed from: v */
        public int f13591v;

        static {
            int m7213d = m7213d(0, 0, 0, 0);
            f13567x = m7213d;
            int m7213d2 = m7213d(0, 0, 0, 3);
            f13568y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f13569z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f13560A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f13561B = new boolean[]{false, false, false, true, true, true, false};
            f13562C = new int[]{m7213d, m7213d2, m7213d, m7213d, m7213d2, m7213d, m7213d};
            f13563D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f13564E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f13565F = new int[]{m7213d, m7213d, m7213d, m7213d, m7213d, m7213d2, m7213d2};
        }

        public CueInfoBuilder() {
            m7218f();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m7213d(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.google.android.exoplayer2.util.Assertions.m7515c(r4, r0, r1)
                com.google.android.exoplayer2.util.Assertions.m7515c(r5, r0, r1)
                com.google.android.exoplayer2.util.Assertions.m7515c(r6, r0, r1)
                com.google.android.exoplayer2.util.Assertions.m7515c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.Cea708Decoder.CueInfoBuilder.m7213d(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m7214a(char c2) {
            if (c2 != '\n') {
                this.f13571b.append(c2);
                return;
            }
            this.f13570a.add(m7215b());
            this.f13571b.clear();
            if (this.f13585p != -1) {
                this.f13585p = 0;
            }
            if (this.f13586q != -1) {
                this.f13586q = 0;
            }
            if (this.f13587r != -1) {
                this.f13587r = 0;
            }
            if (this.f13589t != -1) {
                this.f13589t = 0;
            }
            while (true) {
                if ((!this.f13580k || this.f13570a.size() < this.f13579j) && this.f13570a.size() < 15) {
                    return;
                } else {
                    this.f13570a.remove(0);
                }
            }
        }

        /* renamed from: b */
        public SpannableString m7215b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13571b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f13585p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f13585p, length, 33);
                }
                if (this.f13586q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13586q, length, 33);
                }
                if (this.f13587r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13588s), this.f13587r, length, 33);
                }
                if (this.f13589t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13590u), this.f13589t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: c */
        public void m7216c() {
            this.f13570a.clear();
            this.f13571b.clear();
            this.f13585p = -1;
            this.f13586q = -1;
            this.f13587r = -1;
            this.f13589t = -1;
            this.f13591v = 0;
        }

        /* renamed from: e */
        public boolean m7217e() {
            return !this.f13572c || (this.f13570a.isEmpty() && this.f13571b.length() == 0);
        }

        /* renamed from: f */
        public void m7218f() {
            m7216c();
            this.f13572c = false;
            this.f13573d = false;
            this.f13574e = 4;
            this.f13575f = false;
            this.f13576g = 0;
            this.f13577h = 0;
            this.f13578i = 0;
            this.f13579j = 15;
            this.f13580k = true;
            this.f13581l = 0;
            this.f13582m = 0;
            this.f13583n = 0;
            int i2 = f13567x;
            this.f13584o = i2;
            this.f13588s = f13566w;
            this.f13590u = i2;
        }

        /* renamed from: g */
        public void m7219g(boolean z, boolean z2) {
            if (this.f13585p != -1) {
                if (!z) {
                    this.f13571b.setSpan(new StyleSpan(2), this.f13585p, this.f13571b.length(), 33);
                    this.f13585p = -1;
                }
            } else if (z) {
                this.f13585p = this.f13571b.length();
            }
            if (this.f13586q == -1) {
                if (z2) {
                    this.f13586q = this.f13571b.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f13571b.setSpan(new UnderlineSpan(), this.f13586q, this.f13571b.length(), 33);
                this.f13586q = -1;
            }
        }

        /* renamed from: h */
        public void m7220h(int i2, int i3) {
            if (this.f13587r != -1 && this.f13588s != i2) {
                this.f13571b.setSpan(new ForegroundColorSpan(this.f13588s), this.f13587r, this.f13571b.length(), 33);
            }
            if (i2 != f13566w) {
                this.f13587r = this.f13571b.length();
                this.f13588s = i2;
            }
            if (this.f13589t != -1 && this.f13590u != i3) {
                this.f13571b.setSpan(new BackgroundColorSpan(this.f13590u), this.f13589t, this.f13571b.length(), 33);
            }
            if (i3 != f13567x) {
                this.f13589t = this.f13571b.length();
                this.f13590u = i3;
            }
        }
    }

    public static final class DtvCcPacket {

        /* renamed from: a */
        public final int f13592a;

        /* renamed from: b */
        public final int f13593b;

        /* renamed from: c */
        public final byte[] f13594c;

        /* renamed from: d */
        public int f13595d = 0;

        public DtvCcPacket(int i2, int i3) {
            this.f13592a = i2;
            this.f13593b = i3;
            this.f13594c = new byte[(i3 * 2) - 1];
        }
    }

    public Cea708Decoder(int i2, @Nullable List<byte[]> list) {
        this.f13551j = i2 == -1 ? 1 : i2;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f13552k = new CueInfoBuilder[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f13552k[i3] = new CueInfoBuilder();
        }
        this.f13553l = this.f13552k[0];
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    /* renamed from: e */
    public Subtitle mo7196e() {
        List<Cue> list = this.f13554m;
        this.f13555n = list;
        Objects.requireNonNull(list);
        return new CeaSubtitle(list);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    /* renamed from: f */
    public void mo7197f(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = subtitleInputBuffer.f10605d;
        Objects.requireNonNull(byteBuffer);
        this.f13548g.m7633D(byteBuffer.array(), byteBuffer.limit());
        while (this.f13548g.m7637a() >= 3) {
            int m7657u = this.f13548g.m7657u() & 7;
            int i2 = m7657u & 3;
            boolean z = (m7657u & 4) == 4;
            byte m7657u2 = (byte) this.f13548g.m7657u();
            byte m7657u3 = (byte) this.f13548g.m7657u();
            if (i2 == 2 || i2 == 3) {
                if (z) {
                    if (i2 == 3) {
                        m7210j();
                        int i3 = (m7657u2 & 192) >> 6;
                        int i4 = this.f13550i;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            m7212l();
                            Log.w("Cea708Decoder", C0576a.m4112k(71, "Sequence number discontinuity. previous=", this.f13550i, " current=", i3));
                        }
                        this.f13550i = i3;
                        int i5 = m7657u2 & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i3, i5);
                        this.f13556o = dtvCcPacket;
                        byte[] bArr = dtvCcPacket.f13594c;
                        int i6 = dtvCcPacket.f13595d;
                        dtvCcPacket.f13595d = i6 + 1;
                        bArr[i6] = m7657u3;
                    } else {
                        Assertions.m7513a(i2 == 2);
                        DtvCcPacket dtvCcPacket2 = this.f13556o;
                        if (dtvCcPacket2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = dtvCcPacket2.f13594c;
                            int i7 = dtvCcPacket2.f13595d;
                            int i8 = i7 + 1;
                            dtvCcPacket2.f13595d = i8;
                            bArr2[i7] = m7657u2;
                            dtvCcPacket2.f13595d = i8 + 1;
                            bArr2[i8] = m7657u3;
                        }
                    }
                    if (this.f13556o.f13595d == (r8.f13593b * 2) - 1) {
                        m7210j();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.f13554m = null;
        this.f13555n = null;
        this.f13557p = 0;
        this.f13553l = this.f13552k[0];
        m7212l();
        this.f13556o = null;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    /* renamed from: h */
    public boolean mo7199h() {
        return this.f13554m != this.f13555n;
    }

    /* renamed from: j */
    public final void m7210j() {
        DtvCcPacket dtvCcPacket = this.f13556o;
        if (dtvCcPacket == null) {
            return;
        }
        int i2 = dtvCcPacket.f13595d;
        int i3 = (dtvCcPacket.f13593b * 2) - 1;
        if (i2 != i3) {
            int i4 = dtvCcPacket.f13592a;
            StringBuilder m4120s = C0576a.m4120s(C4632R.styleable.AppCompatTheme_tooltipFrameBackground, "DtvCcPacket ended prematurely; size is ", i3, ", but current index is ", i2);
            m4120s.append(" (sequence number ");
            m4120s.append(i4);
            m4120s.append(");");
            Log.d("Cea708Decoder", m4120s.toString());
        }
        ParsableBitArray parsableBitArray = this.f13549h;
        DtvCcPacket dtvCcPacket2 = this.f13556o;
        parsableBitArray.m7625j(dtvCcPacket2.f13594c, dtvCcPacket2.f13595d);
        int i5 = 3;
        int m7622g = this.f13549h.m7622g(3);
        int m7622g2 = this.f13549h.m7622g(5);
        int i6 = 7;
        int i7 = 6;
        if (m7622g == 7) {
            this.f13549h.m7628m(2);
            m7622g = this.f13549h.m7622g(6);
            if (m7622g < 7) {
                C0576a.m4123v(44, "Invalid extended service number: ", m7622g, "Cea708Decoder");
            }
        }
        if (m7622g2 == 0) {
            if (m7622g != 0) {
                StringBuilder sb = new StringBuilder(59);
                sb.append("serviceNumber is non-zero (");
                sb.append(m7622g);
                sb.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb.toString());
            }
        } else if (m7622g == this.f13551j) {
            boolean z = false;
            while (this.f13549h.m7617b() > 0) {
                int m7622g3 = this.f13549h.m7622g(8);
                if (m7622g3 == 16) {
                    int m7622g4 = this.f13549h.m7622g(8);
                    if (m7622g4 > 31) {
                        if (m7622g4 <= 127) {
                            if (m7622g4 == 32) {
                                this.f13553l.m7214a(' ');
                            } else if (m7622g4 == 33) {
                                this.f13553l.m7214a((char) 160);
                            } else if (m7622g4 == 37) {
                                this.f13553l.m7214a((char) 8230);
                            } else if (m7622g4 == 42) {
                                this.f13553l.m7214a((char) 352);
                            } else if (m7622g4 == 44) {
                                this.f13553l.m7214a((char) 338);
                            } else if (m7622g4 == 63) {
                                this.f13553l.m7214a((char) 376);
                            } else if (m7622g4 == 57) {
                                this.f13553l.m7214a((char) 8482);
                            } else if (m7622g4 == 58) {
                                this.f13553l.m7214a((char) 353);
                            } else if (m7622g4 == 60) {
                                this.f13553l.m7214a((char) 339);
                            } else if (m7622g4 != 61) {
                                switch (m7622g4) {
                                    case 48:
                                        this.f13553l.m7214a((char) 9608);
                                        break;
                                    case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                        this.f13553l.m7214a((char) 8216);
                                        break;
                                    case 50:
                                        this.f13553l.m7214a((char) 8217);
                                        break;
                                    case 51:
                                        this.f13553l.m7214a((char) 8220);
                                        break;
                                    case 52:
                                        this.f13553l.m7214a((char) 8221);
                                        break;
                                    case 53:
                                        this.f13553l.m7214a((char) 8226);
                                        break;
                                    default:
                                        switch (m7622g4) {
                                            case C4632R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                this.f13553l.m7214a((char) 8539);
                                                break;
                                            case C4632R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                this.f13553l.m7214a((char) 8540);
                                                break;
                                            case C4632R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                this.f13553l.m7214a((char) 8541);
                                                break;
                                            case C4632R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                this.f13553l.m7214a((char) 8542);
                                                break;
                                            case C4632R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                this.f13553l.m7214a((char) 9474);
                                                break;
                                            case 123:
                                                this.f13553l.m7214a((char) 9488);
                                                break;
                                            case C4632R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                this.f13553l.m7214a((char) 9492);
                                                break;
                                            case 125:
                                                this.f13553l.m7214a((char) 9472);
                                                break;
                                            case 126:
                                                this.f13553l.m7214a((char) 9496);
                                                break;
                                            case 127:
                                                this.f13553l.m7214a((char) 9484);
                                                break;
                                            default:
                                                C0576a.m4123v(33, "Invalid G2 character: ", m7622g4, "Cea708Decoder");
                                                break;
                                        }
                                }
                            } else {
                                this.f13553l.m7214a((char) 8480);
                            }
                        } else if (m7622g4 <= 159) {
                            if (m7622g4 <= 135) {
                                this.f13549h.m7628m(32);
                            } else if (m7622g4 <= 143) {
                                this.f13549h.m7628m(40);
                            } else if (m7622g4 <= 159) {
                                this.f13549h.m7628m(2);
                                this.f13549h.m7628m(this.f13549h.m7622g(6) * 8);
                            }
                        } else if (m7622g4 > 255) {
                            C0576a.m4123v(37, "Invalid extended command: ", m7622g4, "Cea708Decoder");
                        } else if (m7622g4 == 160) {
                            this.f13553l.m7214a((char) 13252);
                        } else {
                            C0576a.m4123v(33, "Invalid G3 character: ", m7622g4, "Cea708Decoder");
                            this.f13553l.m7214a('_');
                        }
                        z = true;
                    } else if (m7622g4 > 7) {
                        if (m7622g4 <= 15) {
                            this.f13549h.m7628m(8);
                        } else if (m7622g4 <= 23) {
                            this.f13549h.m7628m(16);
                        } else if (m7622g4 <= 31) {
                            this.f13549h.m7628m(24);
                        }
                    }
                } else if (m7622g3 > 31) {
                    if (m7622g3 <= 127) {
                        if (m7622g3 == 127) {
                            this.f13553l.m7214a((char) 9835);
                        } else {
                            this.f13553l.m7214a((char) (m7622g3 & KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                    } else if (m7622g3 <= 159) {
                        switch (m7622g3) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                int i8 = m7622g3 - 128;
                                if (this.f13557p != i8) {
                                    this.f13557p = i8;
                                    this.f13553l = this.f13552k[i8];
                                    break;
                                }
                                break;
                            case 136:
                                for (int i9 = 1; i9 <= 8; i9++) {
                                    if (this.f13549h.m7621f()) {
                                        this.f13552k[8 - i9].m7216c();
                                    }
                                }
                                break;
                            case 137:
                                for (int i10 = 1; i10 <= 8; i10++) {
                                    if (this.f13549h.m7621f()) {
                                        this.f13552k[8 - i10].f13573d = true;
                                    }
                                }
                                break;
                            case 138:
                                for (int i11 = 1; i11 <= 8; i11++) {
                                    if (this.f13549h.m7621f()) {
                                        this.f13552k[8 - i11].f13573d = false;
                                    }
                                }
                                break;
                            case 139:
                                for (int i12 = 1; i12 <= 8; i12++) {
                                    if (this.f13549h.m7621f()) {
                                        this.f13552k[8 - i12].f13573d = !r1.f13573d;
                                    }
                                }
                                break;
                            case 140:
                                for (int i13 = 1; i13 <= 8; i13++) {
                                    if (this.f13549h.m7621f()) {
                                        this.f13552k[8 - i13].m7218f();
                                    }
                                }
                                break;
                            case 141:
                                this.f13549h.m7628m(8);
                                break;
                            case 142:
                                break;
                            case 143:
                                m7212l();
                                break;
                            case 144:
                                if (this.f13553l.f13572c) {
                                    this.f13549h.m7622g(4);
                                    this.f13549h.m7622g(2);
                                    this.f13549h.m7622g(2);
                                    boolean m7621f = this.f13549h.m7621f();
                                    boolean m7621f2 = this.f13549h.m7621f();
                                    this.f13549h.m7622g(3);
                                    this.f13549h.m7622g(3);
                                    this.f13553l.m7219g(m7621f, m7621f2);
                                    break;
                                } else {
                                    this.f13549h.m7628m(16);
                                    break;
                                }
                            case 145:
                                if (this.f13553l.f13572c) {
                                    int m7213d = CueInfoBuilder.m7213d(this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2));
                                    int m7213d2 = CueInfoBuilder.m7213d(this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2));
                                    this.f13549h.m7628m(2);
                                    CueInfoBuilder.m7213d(this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2), 0);
                                    this.f13553l.m7220h(m7213d, m7213d2);
                                    break;
                                } else {
                                    this.f13549h.m7628m(24);
                                    break;
                                }
                            case 146:
                                if (this.f13553l.f13572c) {
                                    this.f13549h.m7628m(4);
                                    int m7622g5 = this.f13549h.m7622g(4);
                                    this.f13549h.m7628m(2);
                                    this.f13549h.m7622g(6);
                                    CueInfoBuilder cueInfoBuilder = this.f13553l;
                                    if (cueInfoBuilder.f13591v != m7622g5) {
                                        cueInfoBuilder.m7214a('\n');
                                    }
                                    cueInfoBuilder.f13591v = m7622g5;
                                    break;
                                } else {
                                    this.f13549h.m7628m(16);
                                    break;
                                }
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                Log.w("Cea708Decoder", C0576a.m4111j(31, "Invalid C1 command: ", m7622g3));
                                break;
                            case 151:
                                if (this.f13553l.f13572c) {
                                    int m7213d3 = CueInfoBuilder.m7213d(this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2));
                                    this.f13549h.m7622g(2);
                                    CueInfoBuilder.m7213d(this.f13549h.m7622g(2), this.f13549h.m7622g(2), this.f13549h.m7622g(2), 0);
                                    this.f13549h.m7621f();
                                    this.f13549h.m7621f();
                                    this.f13549h.m7622g(2);
                                    this.f13549h.m7622g(2);
                                    int m7622g6 = this.f13549h.m7622g(2);
                                    this.f13549h.m7628m(8);
                                    CueInfoBuilder cueInfoBuilder2 = this.f13553l;
                                    cueInfoBuilder2.f13584o = m7213d3;
                                    cueInfoBuilder2.f13581l = m7622g6;
                                    break;
                                } else {
                                    this.f13549h.m7628m(32);
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
                                int i14 = m7622g3 - 152;
                                CueInfoBuilder cueInfoBuilder3 = this.f13552k[i14];
                                this.f13549h.m7628m(2);
                                boolean m7621f3 = this.f13549h.m7621f();
                                boolean m7621f4 = this.f13549h.m7621f();
                                this.f13549h.m7621f();
                                int m7622g7 = this.f13549h.m7622g(i5);
                                boolean m7621f5 = this.f13549h.m7621f();
                                int m7622g8 = this.f13549h.m7622g(i6);
                                int m7622g9 = this.f13549h.m7622g(8);
                                int m7622g10 = this.f13549h.m7622g(4);
                                int m7622g11 = this.f13549h.m7622g(4);
                                this.f13549h.m7628m(2);
                                this.f13549h.m7622g(i7);
                                this.f13549h.m7628m(2);
                                int m7622g12 = this.f13549h.m7622g(i5);
                                int m7622g13 = this.f13549h.m7622g(i5);
                                cueInfoBuilder3.f13572c = true;
                                cueInfoBuilder3.f13573d = m7621f3;
                                cueInfoBuilder3.f13580k = m7621f4;
                                cueInfoBuilder3.f13574e = m7622g7;
                                cueInfoBuilder3.f13575f = m7621f5;
                                cueInfoBuilder3.f13576g = m7622g8;
                                cueInfoBuilder3.f13577h = m7622g9;
                                cueInfoBuilder3.f13578i = m7622g10;
                                int i15 = m7622g11 + 1;
                                if (cueInfoBuilder3.f13579j != i15) {
                                    cueInfoBuilder3.f13579j = i15;
                                    while (true) {
                                        if ((m7621f4 && cueInfoBuilder3.f13570a.size() >= cueInfoBuilder3.f13579j) || cueInfoBuilder3.f13570a.size() >= 15) {
                                            cueInfoBuilder3.f13570a.remove(0);
                                        }
                                    }
                                }
                                if (m7622g12 != 0 && cueInfoBuilder3.f13582m != m7622g12) {
                                    cueInfoBuilder3.f13582m = m7622g12;
                                    int i16 = m7622g12 - 1;
                                    int i17 = CueInfoBuilder.f13562C[i16];
                                    boolean z2 = CueInfoBuilder.f13561B[i16];
                                    int i18 = CueInfoBuilder.f13569z[i16];
                                    int i19 = CueInfoBuilder.f13560A[i16];
                                    int i20 = CueInfoBuilder.f13568y[i16];
                                    cueInfoBuilder3.f13584o = i17;
                                    cueInfoBuilder3.f13581l = i20;
                                }
                                if (m7622g13 != 0 && cueInfoBuilder3.f13583n != m7622g13) {
                                    cueInfoBuilder3.f13583n = m7622g13;
                                    int i21 = m7622g13 - 1;
                                    int i22 = CueInfoBuilder.f13564E[i21];
                                    int i23 = CueInfoBuilder.f13563D[i21];
                                    cueInfoBuilder3.m7219g(false, false);
                                    cueInfoBuilder3.m7220h(CueInfoBuilder.f13566w, CueInfoBuilder.f13565F[i21]);
                                }
                                if (this.f13557p != i14) {
                                    this.f13557p = i14;
                                    this.f13553l = this.f13552k[i14];
                                    break;
                                }
                                break;
                        }
                    } else if (m7622g3 <= 255) {
                        this.f13553l.m7214a((char) (m7622g3 & KotlinVersion.MAX_COMPONENT_VALUE));
                    } else {
                        C0576a.m4123v(33, "Invalid base command: ", m7622g3, "Cea708Decoder");
                    }
                    z = true;
                } else if (m7622g3 != 0) {
                    if (m7622g3 == i5) {
                        this.f13554m = m7211k();
                    } else if (m7622g3 != 8) {
                        switch (m7622g3) {
                            case 12:
                                m7212l();
                                break;
                            case 13:
                                this.f13553l.m7214a('\n');
                                break;
                            case 14:
                                break;
                            default:
                                if (m7622g3 < 17 || m7622g3 > 23) {
                                    if (m7622g3 < 24 || m7622g3 > 31) {
                                        C0576a.m4123v(31, "Invalid C0 command: ", m7622g3, "Cea708Decoder");
                                        break;
                                    } else {
                                        C0576a.m4123v(54, "Currently unsupported COMMAND_P16 Command: ", m7622g3, "Cea708Decoder");
                                        this.f13549h.m7628m(16);
                                        break;
                                    }
                                } else {
                                    C0576a.m4123v(55, "Currently unsupported COMMAND_EXT1 Command: ", m7622g3, "Cea708Decoder");
                                    this.f13549h.m7628m(8);
                                    break;
                                }
                        }
                    } else {
                        CueInfoBuilder cueInfoBuilder4 = this.f13553l;
                        int length = cueInfoBuilder4.f13571b.length();
                        if (length > 0) {
                            cueInfoBuilder4.f13571b.delete(length - 1, length);
                        }
                    }
                }
                i5 = 3;
                i6 = 7;
                i7 = 6;
            }
            if (z) {
                this.f13554m = m7211k();
            }
        }
        this.f13556o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.exoplayer2.text.Cue> m7211k() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.Cea708Decoder.m7211k():java.util.List");
    }

    /* renamed from: l */
    public final void m7212l() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.f13552k[i2].m7218f();
        }
    }
}
