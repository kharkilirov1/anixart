package org.jsoup.helper;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.jsoup.internal.StringUtil;

/* loaded from: classes3.dex */
public final class DataUtil {

    /* renamed from: a */
    public static final Pattern f68894a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b */
    public static final Charset f68895b;

    /* renamed from: c */
    public static final String f68896c;

    /* renamed from: d */
    public static final char[] f68897d;

    public static class BomCharset {

        /* renamed from: a */
        public final String f68898a;

        /* renamed from: b */
        public final boolean f68899b;

        public BomCharset(String str, boolean z) {
            this.f68898a = str;
            this.f68899b = z;
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        f68895b = forName;
        f68896c = forName.name();
        f68897d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    @Nullable
    /* renamed from: a */
    public static BomCharset m34667a(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        if ((bArr[0] == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (bArr[0] == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new BomCharset("UTF-32", false);
        }
        if ((bArr[0] == -2 && bArr[1] == -1) || (bArr[0] == -1 && bArr[1] == -2)) {
            return new BomCharset("UTF-16", false);
        }
        if (bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new BomCharset("UTF-8", true);
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static String m34668b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f68894a.matcher(str);
        if (matcher.find()) {
            return m34670d(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    /* renamed from: c */
    public static String m34669c() {
        StringBuilder m34700b = StringUtil.m34700b();
        Random random = new Random();
        for (int i2 = 0; i2 < 32; i2++) {
            char[] cArr = f68897d;
            m34700b.append(cArr[random.nextInt(cArr.length)]);
        }
        return StringUtil.m34705g(m34700b);
    }

    @Nullable
    /* renamed from: d */
    public static String m34670d(@Nullable String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
