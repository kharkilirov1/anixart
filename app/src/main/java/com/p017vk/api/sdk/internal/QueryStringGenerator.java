package com.p017vk.api.sdk.internal;

import com.p017vk.api.sdk.okhttp.OkHttpMethodCall;
import com.p017vk.api.sdk.utils.ThreadLocalDelegate;
import com.p017vk.api.sdk.utils.ThreadLocalDelegateImpl;
import com.p017vk.api.sdk.utils.ThreadLocalDelegateKt;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: QueryStringGenerator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/internal/QueryStringGenerator;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class QueryStringGenerator {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f30703a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(QueryStringGenerator.class), "strBuilder", "getStrBuilder()Ljava/lang/StringBuilder;"))};

    /* renamed from: c */
    public static final QueryStringGenerator f30705c = new QueryStringGenerator();

    /* renamed from: b */
    public static final ThreadLocalDelegate f30704b = ThreadLocalDelegateKt.m16534a(new Function0<StringBuilder>() { // from class: com.vk.api.sdk.internal.QueryStringGenerator$strBuilder$2
        @Override // kotlin.jvm.functions.Function0
        public StringBuilder invoke() {
            return new StringBuilder();
        }
    });

    @NotNull
    /* renamed from: a */
    public final String m16510a(@Nullable String str, @Nullable String str2, int i2, @NotNull OkHttpMethodCall okHttpMethodCall) {
        String method = okHttpMethodCall.f30732a;
        String version = okHttpMethodCall.f30733b;
        Map<String, String> args = okHttpMethodCall.f30734c;
        Intrinsics.m32180i(method, "method");
        Intrinsics.m32180i(version, "version");
        Intrinsics.m32180i(args, "args");
        if (str2 == null || str2.length() == 0) {
            return m16511b(version, args, str, i2, true);
        }
        String str3 = "/method/" + method + '?' + m16511b(version, args, str, i2, false) + str2;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        Charset charset = Charsets.f66855b;
        if (str3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str3.getBytes(charset);
        Intrinsics.m32175d(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] digested = messageDigest.digest(bytes);
        Intrinsics.m32175d(digested, "digested");
        QueryStringGenerator$md5$1 queryStringGenerator$md5$1 = QueryStringGenerator$md5$1.f30706b;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i3 = 0;
        for (byte b : digested) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) "");
            }
            if (queryStringGenerator$md5$1 != null) {
                sb.append((CharSequence) queryStringGenerator$md5$1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return C0000a.m16m(m16511b(version, args, str, i2, true), "&sig=", sb2);
    }

    /* renamed from: b */
    public final String m16511b(String str, Map<String, String> map, String str2, int i2, boolean z) {
        m16512c().setLength(0);
        StringBuilder plus = m16512c();
        Intrinsics.m32180i(plus, "$this$plus");
        plus.append("v=");
        plus.append(str);
        plus.append("&https=1&");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ((!Intrinsics.m32174c(key, "v")) && (!Intrinsics.m32174c(key, "access_token")) && (true ^ Intrinsics.m32174c(key, "api_id"))) {
                plus.append(key);
                plus.append("=");
                if (z) {
                    try {
                        value = URLEncoder.encode(value, "UTF-8");
                        Intrinsics.m32175d(value, "URLEncoder.encode(this, \"UTF-8\")");
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                plus.append(value);
                plus.append("&");
            }
        }
        if (!(str2 == null || str2.length() == 0)) {
            plus.append("access_token=");
            plus.append(str2);
            plus.append("&");
        } else if (i2 != 0) {
            plus.append("api_id=");
            plus.append(String.valueOf(i2));
            plus.append("&");
        } else {
            plus.append("&");
        }
        plus.setLength(plus.length() - 1);
        String sb = plus.toString();
        Intrinsics.m32175d(sb, "sb.toString()");
        return sb;
    }

    /* renamed from: c */
    public final StringBuilder m16512c() {
        ThreadLocalDelegate getValue = f30704b;
        KProperty property = f30703a[0];
        Intrinsics.m32180i(getValue, "$this$getValue");
        Intrinsics.m32180i(property, "property");
        return (StringBuilder) ((ThreadLocalDelegateImpl) getValue).get();
    }
}
