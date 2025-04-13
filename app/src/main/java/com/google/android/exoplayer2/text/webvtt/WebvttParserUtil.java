package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class WebvttParserUtil {

    /* renamed from: a */
    public static final Pattern f13849a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m7283a(ParsableByteArray parsableByteArray) {
        String m7643g = parsableByteArray.m7643g();
        return m7643g != null && m7643g.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static float m7284b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m7285c(String str) throws NumberFormatException {
        int i2 = Util.f14736a;
        String[] split = str.split("\\.", 2);
        long j2 = 0;
        for (String str2 : Util.m7725X(split[0], ":")) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (split.length == 2) {
            j3 += Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }

    /* renamed from: d */
    public static void m7286d(ParsableByteArray parsableByteArray) throws ParserException {
        int i2 = parsableByteArray.f14699b;
        if (m7283a(parsableByteArray)) {
            return;
        }
        parsableByteArray.m7635F(i2);
        String valueOf = String.valueOf(parsableByteArray.m7643g());
        throw ParserException.m5907a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), null);
    }
}
