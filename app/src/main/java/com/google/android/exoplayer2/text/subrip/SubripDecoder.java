package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {

    /* renamed from: q */
    public static final Pattern f13712q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    public static final Pattern f13713r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    public final StringBuilder f13714o;

    /* renamed from: p */
    public final ArrayList<String> f13715p;

    public SubripDecoder() {
        super("SubripDecoder");
        this.f13714o = new StringBuilder();
        this.f13715p = new ArrayList<>();
    }

    /* renamed from: m */
    public static float m7240m(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public static long m7241n(Matcher matcher, int i2) {
        String group = matcher.group(i2 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L;
        String group2 = matcher.group(i2 + 2);
        Objects.requireNonNull(group2);
        long parseLong2 = (Long.parseLong(group2) * 60 * 1000) + parseLong;
        String group3 = matcher.group(i2 + 3);
        Objects.requireNonNull(group3);
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i2 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    public Subtitle mo7185l(byte[] bArr, int i2, boolean z) {
        ParsableByteArray parsableByteArray;
        String m7643g;
        char c2;
        char c3;
        Cue m7178a;
        SubripDecoder subripDecoder = this;
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArr, i2);
        while (true) {
            String m7643g2 = parsableByteArray2.m7643g();
            if (m7643g2 != null) {
                if (m7643g2.length() != 0) {
                    try {
                        Integer.parseInt(m7643g2);
                        m7643g = parsableByteArray2.m7643g();
                    } catch (NumberFormatException unused) {
                        parsableByteArray = parsableByteArray2;
                        Log.w("SubripDecoder", m7643g2.length() != 0 ? "Skipping invalid index: ".concat(m7643g2) : new String("Skipping invalid index: "));
                    }
                    if (m7643g == null) {
                        Log.w("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f13712q.matcher(m7643g);
                        if (matcher.matches()) {
                            longArray.m7589a(m7241n(matcher, 1));
                            longArray.m7589a(m7241n(matcher, 6));
                            subripDecoder.f13714o.setLength(0);
                            subripDecoder.f13715p.clear();
                            for (String m7643g3 = parsableByteArray2.m7643g(); !TextUtils.isEmpty(m7643g3); m7643g3 = parsableByteArray2.m7643g()) {
                                if (subripDecoder.f13714o.length() > 0) {
                                    subripDecoder.f13714o.append("<br>");
                                }
                                StringBuilder sb = subripDecoder.f13714o;
                                ArrayList<String> arrayList2 = subripDecoder.f13715p;
                                String trim = m7643g3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = f13713r.matcher(trim);
                                int i3 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i3;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i3 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(subripDecoder.f13714o.toString());
                            String str = null;
                            int i4 = 0;
                            while (true) {
                                if (i4 < subripDecoder.f13715p.size()) {
                                    String str2 = subripDecoder.f13715p.get(i4);
                                    if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                        str = str2;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            Cue.Builder builder = new Cue.Builder();
                            builder.f13454a = fromHtml;
                            if (str == null) {
                                m7178a = builder.m7178a();
                                parsableByteArray = parsableByteArray2;
                            } else {
                                parsableByteArray = parsableByteArray2;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c2 = '\b';
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                if (c2 == 0 || c2 == 1 || c2 == 2) {
                                    builder.f13462i = 0;
                                } else if (c2 == 3 || c2 == 4 || c2 == 5) {
                                    builder.f13462i = 2;
                                } else {
                                    builder.f13462i = 1;
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                if (c3 == 0 || c3 == 1 || c3 == 2) {
                                    builder.f13460g = 2;
                                } else if (c3 == 3 || c3 == 4 || c3 == 5) {
                                    builder.f13460g = 0;
                                } else {
                                    builder.f13460g = 1;
                                }
                                builder.f13461h = m7240m(builder.f13462i);
                                builder.f13458e = m7240m(builder.f13460g);
                                builder.f13459f = 0;
                                m7178a = builder.m7178a();
                            }
                            arrayList.add(m7178a);
                            arrayList.add(Cue.f13435s);
                        } else {
                            parsableByteArray = parsableByteArray2;
                            Log.w("SubripDecoder", m7643g.length() != 0 ? "Skipping invalid timing: ".concat(m7643g) : new String("Skipping invalid timing: "));
                        }
                        subripDecoder = this;
                        parsableByteArray2 = parsableByteArray;
                    }
                }
            }
        }
        return new SubripSubtitle((Cue[]) arrayList.toArray(new Cue[0]), Arrays.copyOf(longArray.f14653b, longArray.f14652a));
    }
}
