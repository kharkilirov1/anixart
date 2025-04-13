package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpHeaders.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n\u001a\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0010H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m31884d2 = {"QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "hasBody", "", "response", "Lokhttp3/Response;", "parseChallenges", "", "Lokhttp3/Challenge;", "Lokhttp3/Headers;", "headerName", "", "promisesBody", "readChallengeHeader", "", "Lokio/Buffer;", "result", "", "readQuotedString", "readToken", "receiveHeaders", "Lokhttp3/CookieJar;", "url", "Lokhttp3/HttpUrl;", "headers", "skipCommasAndWhitespace", "startsWith", "prefix", "", "okhttp"}, m31885k = 2, m31886mv = {1, 4, 0})
@JvmName
/* loaded from: classes3.dex */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.f68753f;
        QUOTED_STRING_DELIMITERS = companion.m34592d("\"\\");
        TOKEN_DELIMITERS = companion.m34592d("\t ,=");
    }

    @Deprecated
    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.m32179h(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers parseChallenges, @NotNull String headerName) {
        Intrinsics.m32179h(parseChallenges, "$this$parseChallenges");
        Intrinsics.m32179h(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.m33927y(headerName, parseChallenges.name(i2), true)) {
                Buffer buffer = new Buffer();
                buffer.m34516D0(parseChallenges.value(i2));
                try {
                    readChallengeHeader(buffer, arrayList);
                } catch (EOFException e2) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response promisesBody) {
        Intrinsics.m32179h(promisesBody, "$this$promisesBody");
        if (Intrinsics.m32174c(promisesBody.request().method(), "HEAD")) {
            return false;
        }
        int code = promisesBody.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(promisesBody) == -1 && !StringsKt.m33927y("chunked", Response.header$default(promisesBody, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0082, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(okio.Buffer r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.mo34529V()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = kotlin.collections.MapsKt.m32059d()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L64
            if (r6 != 0) goto L41
            boolean r2 = r7.mo34529V()
            if (r2 == 0) goto L64
        L41:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = p000a.C0000a.m24u(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = kotlin.text.StringsKt.m33888N(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.m32178g(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L64:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6e:
            if (r3 != 0) goto L80
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L7b
            goto L82
        L7b:
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L80:
            if (r6 != 0) goto L8d
        L82:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L8d:
            r5 = 1
            if (r6 <= r5) goto L91
            return
        L91:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L98
            return
        L98:
            r5 = 34
            byte r5 = (byte) r5
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto La6
            java.lang.String r5 = readQuotedString(r7)
            goto Laa
        La6:
            java.lang.String r5 = readToken(r7)
        Laa:
            if (r5 == 0) goto Lc4
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb5
            return
        Lb5:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lc2
            boolean r3 = r7.mo34529V()
            if (r3 != 0) goto Lc2
            return
        Lc2:
            r3 = r0
            goto L6e
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.Buffer, java.util.List):void");
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        byte b = (byte) 34;
        if (!(buffer.readByte() == b)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long mo34540e0 = buffer.mo34540e0(QUOTED_STRING_DELIMITERS);
            if (mo34540e0 == -1) {
                return null;
            }
            if (buffer.m34539e(mo34540e0) == b) {
                buffer2.write(buffer, mo34540e0);
                buffer.readByte();
                return buffer2.m34553m();
            }
            if (buffer.f68742c == mo34540e0 + 1) {
                return null;
            }
            buffer2.write(buffer, mo34540e0);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final String readToken(Buffer buffer) {
        long mo34540e0 = buffer.mo34540e0(TOKEN_DELIMITERS);
        if (mo34540e0 == -1) {
            mo34540e0 = buffer.f68742c;
        }
        if (mo34540e0 != 0) {
            return buffer.m34555n(mo34540e0);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar receiveHeaders, @NotNull HttpUrl url, @NotNull Headers headers) {
        Intrinsics.m32179h(receiveHeaders, "$this$receiveHeaders");
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(headers, "headers");
        if (receiveHeaders == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.INSTANCE.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        receiveHeaders.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) {
        boolean z = false;
        while (!buffer.mo34529V()) {
            byte m34539e = buffer.m34539e(0L);
            if (m34539e == 9 || m34539e == 32) {
                buffer.readByte();
            } else {
                if (m34539e != 44) {
                    break;
                }
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(Buffer buffer, byte b) {
        return !buffer.mo34529V() && buffer.m34539e(0L) == b;
    }
}
