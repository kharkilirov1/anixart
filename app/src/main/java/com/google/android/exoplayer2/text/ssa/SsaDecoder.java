package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.ssa.SsaStyle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {

    /* renamed from: t */
    public static final Pattern f13678t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    public final boolean f13679o;

    /* renamed from: p */
    @Nullable
    public final SsaDialogueFormat f13680p;

    /* renamed from: q */
    public Map<String, SsaStyle> f13681q;

    /* renamed from: r */
    public float f13682r;

    /* renamed from: s */
    public float f13683s;

    public SsaDecoder() {
        this(null);
    }

    /* renamed from: m */
    public static int m7231m(long j2, List<Long> list, List<List<Cue>> list2) {
        int i2;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (list.get(size).longValue() == j2) {
                return size;
            }
            if (list.get(size).longValue() < j2) {
                i2 = size + 1;
                break;
            }
            size--;
        }
        list.add(i2, Long.valueOf(j2));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList(list2.get(i2 - 1)));
        return i2;
    }

    /* renamed from: n */
    public static float m7232n(int i2) {
        if (i2 == 0) {
            return 0.05f;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: p */
    public static long m7233p(String str) {
        Matcher matcher = f13678t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i2 = Util.f14736a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    public Subtitle mo7185l(byte[] bArr, int i2, boolean z) {
        ParsableByteArray parsableByteArray;
        SsaDialogueFormat ssaDialogueFormat;
        long j2;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        SsaDecoder ssaDecoder = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArr, i2);
        if (!ssaDecoder.f13679o) {
            ssaDecoder.m7234o(parsableByteArray2);
        }
        SsaDialogueFormat ssaDialogueFormat2 = ssaDecoder.f13679o ? ssaDecoder.f13680p : null;
        while (true) {
            String m7643g = parsableByteArray2.m7643g();
            if (m7643g == null) {
                return new SsaSubtitle(arrayList, arrayList2);
            }
            if (m7643g.startsWith("Format:")) {
                ssaDialogueFormat2 = SsaDialogueFormat.m7235a(m7643g);
            } else {
                if (m7643g.startsWith("Dialogue:")) {
                    if (ssaDialogueFormat2 == null) {
                        Log.w("SsaDecoder", m7643g.length() != 0 ? "Skipping dialogue line before complete format: ".concat(m7643g) : new String("Skipping dialogue line before complete format: "));
                    } else {
                        Assertions.m7513a(m7643g.startsWith("Dialogue:"));
                        String[] split = m7643g.substring(9).split(",", ssaDialogueFormat2.f13688e);
                        if (split.length != ssaDialogueFormat2.f13688e) {
                            Log.w("SsaDecoder", m7643g.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(m7643g) : new String("Skipping dialogue line with fewer columns than format: "));
                        } else {
                            long m7233p = m7233p(split[ssaDialogueFormat2.f13684a]);
                            if (m7233p == -9223372036854775807L) {
                                Log.w("SsaDecoder", m7643g.length() != 0 ? "Skipping invalid timing: ".concat(m7643g) : new String("Skipping invalid timing: "));
                            } else {
                                long m7233p2 = m7233p(split[ssaDialogueFormat2.f13685b]);
                                if (m7233p2 == -9223372036854775807L) {
                                    Log.w("SsaDecoder", m7643g.length() != 0 ? "Skipping invalid timing: ".concat(m7643g) : new String("Skipping invalid timing: "));
                                } else {
                                    Map<String, SsaStyle> map = ssaDecoder.f13681q;
                                    SsaStyle ssaStyle = (map == null || (i7 = ssaDialogueFormat2.f13686c) == -1) ? null : map.get(split[i7].trim());
                                    String str = split[ssaDialogueFormat2.f13687d];
                                    Matcher matcher = SsaStyle.Overrides.f13706a.matcher(str);
                                    PointF pointF = null;
                                    int i8 = -1;
                                    while (true) {
                                        parsableByteArray = parsableByteArray2;
                                        if (matcher.find()) {
                                            String group = matcher.group(1);
                                            Objects.requireNonNull(group);
                                            try {
                                                PointF m7239a = SsaStyle.Overrides.m7239a(group);
                                                if (m7239a != null) {
                                                    pointF = m7239a;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = SsaStyle.Overrides.f13709d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    Objects.requireNonNull(group2);
                                                    i6 = SsaStyle.m7236a(group2);
                                                } else {
                                                    i6 = -1;
                                                }
                                                if (i6 != -1) {
                                                    i8 = i6;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            parsableByteArray2 = parsableByteArray;
                                        } else {
                                            String replace = SsaStyle.Overrides.f13706a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                            float f2 = ssaDecoder.f13682r;
                                            float f3 = ssaDecoder.f13683s;
                                            SpannableString spannableString = new SpannableString(replace);
                                            Cue.Builder builder = new Cue.Builder();
                                            builder.f13454a = spannableString;
                                            if (ssaStyle != null) {
                                                if (ssaStyle.f13691c != null) {
                                                    ssaDialogueFormat = ssaDialogueFormat2;
                                                    j2 = m7233p2;
                                                    spannableString.setSpan(new ForegroundColorSpan(ssaStyle.f13691c.intValue()), 0, spannableString.length(), 33);
                                                } else {
                                                    ssaDialogueFormat = ssaDialogueFormat2;
                                                    j2 = m7233p2;
                                                }
                                                float f4 = ssaStyle.f13692d;
                                                if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                                    builder.f13464k = f4 / f3;
                                                    builder.f13463j = 1;
                                                }
                                                boolean z2 = ssaStyle.f13693e;
                                                if (z2 && ssaStyle.f13694f) {
                                                    i4 = 33;
                                                    i5 = 0;
                                                    spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                } else {
                                                    i4 = 33;
                                                    i5 = 0;
                                                    if (z2) {
                                                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                    } else if (ssaStyle.f13694f) {
                                                        spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                    }
                                                }
                                                if (ssaStyle.f13695g) {
                                                    spannableString.setSpan(new UnderlineSpan(), i5, spannableString.length(), i4);
                                                }
                                                if (ssaStyle.f13696h) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i5, spannableString.length(), i4);
                                                }
                                            } else {
                                                ssaDialogueFormat = ssaDialogueFormat2;
                                                j2 = m7233p2;
                                            }
                                            if (i8 == -1) {
                                                i8 = ssaStyle != null ? ssaStyle.f13690b : -1;
                                            }
                                            switch (i8) {
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", C0576a.m4111j(30, "Unknown alignment: ", i8));
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
                                            builder.f13456c = alignment;
                                            int i9 = Integer.MIN_VALUE;
                                            switch (i8) {
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", C0576a.m4111j(30, "Unknown alignment: ", i8));
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
                                            builder.f13462i = i3;
                                            switch (i8) {
                                                case -1:
                                                    break;
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", C0576a.m4111j(30, "Unknown alignment: ", i8));
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                    i9 = 2;
                                                    break;
                                                case 4:
                                                case 5:
                                                case 6:
                                                    i9 = 1;
                                                    break;
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i9 = 0;
                                                    break;
                                            }
                                            builder.f13460g = i9;
                                            if (pointF == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                                builder.f13461h = m7232n(builder.f13462i);
                                                builder.f13458e = m7232n(builder.f13460g);
                                                builder.f13459f = 0;
                                            } else {
                                                builder.f13461h = pointF.x / f2;
                                                builder.f13458e = pointF.y / f3;
                                                builder.f13459f = 0;
                                            }
                                            Cue m7178a = builder.m7178a();
                                            int m7231m = m7231m(j2, arrayList2, arrayList);
                                            for (int m7231m2 = m7231m(m7233p, arrayList2, arrayList); m7231m2 < m7231m; m7231m2++) {
                                                ((List) arrayList.get(m7231m2)).add(m7178a);
                                            }
                                            ssaDecoder = this;
                                            ssaDialogueFormat2 = ssaDialogueFormat;
                                            parsableByteArray2 = parsableByteArray;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                parsableByteArray = parsableByteArray2;
                ssaDialogueFormat = ssaDialogueFormat2;
                ssaDecoder = this;
                ssaDialogueFormat2 = ssaDialogueFormat;
                parsableByteArray2 = parsableByteArray;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0293  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7234o(com.google.android.exoplayer2.util.ParsableByteArray r26) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.SsaDecoder.m7234o(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    public SsaDecoder(@Nullable List<byte[]> list) {
        super("SsaDecoder");
        this.f13682r = -3.4028235E38f;
        this.f13683s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f13679o = false;
            this.f13680p = null;
            return;
        }
        this.f13679o = true;
        String m7748q = Util.m7748q(list.get(0));
        Assertions.m7513a(m7748q.startsWith("Format:"));
        SsaDialogueFormat m7235a = SsaDialogueFormat.m7235a(m7748q);
        Objects.requireNonNull(m7235a);
        this.f13680p = m7235a;
        m7234o(new ParsableByteArray(list.get(1)));
    }
}
