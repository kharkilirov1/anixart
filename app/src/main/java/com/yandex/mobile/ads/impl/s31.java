package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5751sl;
import com.yandex.mobile.ads.impl.u31;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class s31 extends i11 {

    /* renamed from: r */
    private static final Pattern f54495r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m */
    private final boolean f54496m;

    /* renamed from: n */
    @Nullable
    private final t31 f54497n;

    /* renamed from: o */
    private LinkedHashMap f54498o;

    /* renamed from: p */
    private float f54499p = -3.4028235E38f;

    /* renamed from: q */
    private float f54500q = -3.4028235E38f;

    public s31(@Nullable List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f54496m = false;
            this.f54497n = null;
            return;
        }
        this.f54496m = true;
        String m28103a = s91.m28103a(list.get(0));
        C5220ia.m25473a(m28103a.startsWith("Format:"));
        this.f54497n = (t31) C5220ia.m25469a(t31.m28457a(m28103a));
        m28064a(new ap0(list.get(1)));
    }

    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    public final w41 mo23247a(byte[] bArr, int i2, boolean z) {
        ap0 ap0Var;
        t31 t31Var;
        long j2;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        s31 s31Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ap0 ap0Var2 = new ap0(i2, bArr);
        if (!s31Var.f54496m) {
            s31Var.m28064a(ap0Var2);
        }
        t31 t31Var2 = s31Var.f54496m ? s31Var.f54497n : null;
        while (true) {
            String m22597j = ap0Var2.m22597j();
            if (m22597j == null) {
                return new v31(arrayList, arrayList2);
            }
            if (m22597j.startsWith("Format:")) {
                t31Var2 = t31.m28457a(m22597j);
            } else {
                if (m22597j.startsWith("Dialogue:")) {
                    if (t31Var2 == null) {
                        ai1.m22527a("Skipping dialogue line before complete format: ", m22597j, "SsaDecoder");
                    } else {
                        C5220ia.m25473a(m22597j.startsWith("Dialogue:"));
                        String[] split = m22597j.substring(9).split(",", t31Var2.f54942e);
                        if (split.length != t31Var2.f54942e) {
                            ai1.m22527a("Skipping dialogue line with fewer columns than format: ", m22597j, "SsaDecoder");
                        } else {
                            long m28063a = m28063a(split[t31Var2.f54938a]);
                            if (m28063a == -9223372036854775807L) {
                                ai1.m22527a("Skipping invalid timing: ", m22597j, "SsaDecoder");
                            } else {
                                long m28063a2 = m28063a(split[t31Var2.f54939b]);
                                if (m28063a2 == -9223372036854775807L) {
                                    ai1.m22527a("Skipping invalid timing: ", m22597j, "SsaDecoder");
                                } else {
                                    LinkedHashMap linkedHashMap = s31Var.f54498o;
                                    u31 u31Var = (linkedHashMap == null || (i7 = t31Var2.f54940c) == -1) ? null : (u31) linkedHashMap.get(split[i7].trim());
                                    String str = split[t31Var2.f54941d];
                                    u31.C5840b m28878a = u31.C5840b.m28878a(str);
                                    String replace = u31.C5840b.m28880c(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f2 = s31Var.f54499p;
                                    float f3 = s31Var.f54500q;
                                    SpannableString spannableString = new SpannableString(replace);
                                    C5751sl.a m28304a = new C5751sl.a().m28304a(spannableString);
                                    if (u31Var != null) {
                                        ap0Var = ap0Var2;
                                        if (u31Var.f55360c != null) {
                                            t31Var = t31Var2;
                                            j2 = m28063a2;
                                            spannableString.setSpan(new ForegroundColorSpan(u31Var.f55360c.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            t31Var = t31Var2;
                                            j2 = m28063a2;
                                        }
                                        if (u31Var.f55367j == 3 && u31Var.f55361d != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(u31Var.f55361d.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f4 = u31Var.f55362e;
                                        if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                            m28304a.m28311b(1, f4 / f3);
                                        }
                                        boolean z2 = u31Var.f55363f;
                                        if (z2 && u31Var.f55364g) {
                                            i5 = 33;
                                            i6 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i5 = 33;
                                            i6 = 0;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (u31Var.f55364g) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (u31Var.f55365h) {
                                            spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i5);
                                        }
                                        if (u31Var.f55366i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i5);
                                        }
                                    } else {
                                        ap0Var = ap0Var2;
                                        t31Var = t31Var2;
                                        j2 = m28063a2;
                                    }
                                    int i8 = m28878a.f55383a;
                                    int i9 = i8 != -1 ? i8 : u31Var != null ? u31Var.f55359b : -1;
                                    switch (i9) {
                                        case 0:
                                        default:
                                            c80.m23073a("Unknown alignment: ", i9, "SsaDecoder");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    C5751sl.a m28309b = m28304a.m28309b(alignment);
                                    int i10 = Integer.MIN_VALUE;
                                    switch (i9) {
                                        case 0:
                                        default:
                                            c80.m23073a("Unknown alignment: ", i9, "SsaDecoder");
                                        case -1:
                                            i3 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i3 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i3 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i3 = 2;
                                            break;
                                    }
                                    C5751sl.a m28308b = m28309b.m28308b(i3);
                                    switch (i9) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            c80.m23073a("Unknown alignment: ", i9, "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i10 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i10 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i10 = 0;
                                            break;
                                    }
                                    m28308b.m28301a(i10);
                                    PointF pointF = m28878a.f55384b;
                                    if (pointF == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                        int m28315d = m28304a.m28315d();
                                        float f5 = 0.95f;
                                        m28304a.m28307b(m28315d != 0 ? m28315d != 1 ? m28315d != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                        int m28312c = m28304a.m28312c();
                                        if (m28312c == 0) {
                                            i4 = 0;
                                            f5 = 0.05f;
                                        } else if (m28312c == 1) {
                                            i4 = 0;
                                            f5 = 0.5f;
                                        } else if (m28312c != 2) {
                                            i4 = 0;
                                            f5 = -3.4028235E38f;
                                        } else {
                                            i4 = 0;
                                        }
                                        m28304a.m28302a(i4, f5);
                                    } else {
                                        m28304a.m28307b(pointF.x / f2);
                                        m28304a.m28302a(0, m28878a.f55384b.y / f3);
                                    }
                                    C5751sl m28305a = m28304a.m28305a();
                                    int m28062a = m28062a(j2, arrayList2, arrayList);
                                    for (int m28062a2 = m28062a(m28063a, arrayList2, arrayList); m28062a2 < m28062a; m28062a2++) {
                                        ((List) arrayList.get(m28062a2)).add(m28305a);
                                    }
                                    s31Var = this;
                                    ap0Var2 = ap0Var;
                                    t31Var2 = t31Var;
                                }
                            }
                        }
                    }
                }
                ap0Var = ap0Var2;
                t31Var = t31Var2;
                s31Var = this;
                ap0Var2 = ap0Var;
                t31Var2 = t31Var;
            }
        }
    }

    /* renamed from: a */
    private void m28064a(ap0 ap0Var) {
        while (true) {
            String m22597j = ap0Var.m22597j();
            if (m22597j == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(m22597j)) {
                while (true) {
                    String m22597j2 = ap0Var.m22597j();
                    if (m22597j2 != null && (ap0Var.m22579a() == 0 || ap0Var.m22594g() != 91)) {
                        String[] split = m22597j2.split(":");
                        if (split.length == 2) {
                            String m24832b = C5114ga.m24832b(split[0].trim());
                            Objects.requireNonNull(m24832b);
                            if (m24832b.equals("playresx")) {
                                this.f54499p = Float.parseFloat(split[1].trim());
                            } else if (m24832b.equals("playresy")) {
                                try {
                                    this.f54500q = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(m22597j)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                u31.C5839a c5839a = null;
                while (true) {
                    String m22597j3 = ap0Var.m22597j();
                    if (m22597j3 == null || (ap0Var.m22579a() != 0 && ap0Var.m22594g() == 91)) {
                        break;
                    }
                    if (m22597j3.startsWith("Format:")) {
                        c5839a = u31.C5839a.m28877a(m22597j3);
                    } else if (m22597j3.startsWith("Style:")) {
                        if (c5839a == null) {
                            ai1.m22527a("Skipping 'Style:' line before 'Format:' line: ", m22597j3, "SsaDecoder");
                        } else {
                            u31 m28874a = u31.m28874a(m22597j3, c5839a);
                            if (m28874a != null) {
                                linkedHashMap.put(m28874a.f55358a, m28874a);
                            }
                        }
                    }
                }
                this.f54498o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(m22597j)) {
                d90.m23841c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(m22597j)) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static long m28063a(String str) {
        Matcher matcher = f54495r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i2 = s91.f54530a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
    }

    /* renamed from: a */
    private static int m28062a(long j2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j2) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j2) {
                i2 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i2, Long.valueOf(j2));
        arrayList2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i2 - 1)));
        return i2;
    }
}
