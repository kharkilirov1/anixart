package com.swiftsoft.anixart.utils;

import com.yandex.mobile.ads.C4632R;
import java.nio.charset.Charset;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixart/utils/StringUtils;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class StringUtils {

    /* renamed from: a */
    @NotNull
    public static final StringUtils f25336a = new StringUtils();

    /* renamed from: b */
    @NotNull
    public static final char[] f25337b;

    /* renamed from: c */
    @NotNull
    public static final Random f25338c;

    /* renamed from: d */
    @NotNull
    public static char[] f25339d;

    static {
        Charset.forName("UTF-8");
        f25338c = new Random();
        f25339d = new char[64];
        StringBuilder sb = new StringBuilder();
        for (char c2 = '0'; Intrinsics.m32181j(c2, 57) <= 0; c2 = (char) (c2 + 1)) {
            sb.append(c2);
        }
        for (char c3 = 'a'; Intrinsics.m32181j(c3, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor) <= 0; c3 = (char) (c3 + 1)) {
            sb.append(c3);
        }
        for (char c4 = 'A'; Intrinsics.m32181j(c4, 90) <= 0; c4 = (char) (c4 + 1)) {
            sb.append(c4);
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "tmp.toString()");
        char[] charArray = sb2.toCharArray();
        Intrinsics.m32178g(charArray, "this as java.lang.String).toCharArray()");
        f25337b = charArray;
    }

    @NotNull
    /* renamed from: a */
    public final synchronized String m14042a(int i2) {
        char[] cArr = f25339d;
        if (cArr.length < i2) {
            int length = cArr.length;
            while (length < i2) {
                length <<= 1;
            }
            f25339d = new char[length];
        }
        for (int i3 = 0; i3 < i2; i3++) {
            char[] cArr2 = f25339d;
            char[] cArr3 = f25337b;
            cArr2[i3] = cArr3[f25338c.nextInt(cArr3.length)];
        }
        return new String(f25339d, 0, i2);
    }
}
