package com.yandex.mobile.ads.impl;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.yandex.mobile.ads.impl.AbstractC5814tr;
import com.yandex.mobile.ads.impl.C5204hy;
import com.yandex.mobile.ads.impl.C5495nh;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.vw0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.KotlinVersion;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName
/* loaded from: classes3.dex */
public final class t91 {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final byte[] f54979a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final C5204hy f54980b = C5204hy.b.m25394a(new String[0]);

    /* renamed from: c */
    @JvmField
    @NotNull
    public static final uw0 f54981c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public static final TimeZone f54982d;

    /* renamed from: e */
    @NotNull
    private static final Regex f54983e;

    /* renamed from: f */
    @JvmField
    public static final boolean f54984f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final String f54985g;

    static {
        byte[] bArr = new byte[0];
        f54979a = bArr;
        f54981c = vw0.C5944a.m29282a(bArr);
        dw0.C4991a.m23949b(bArr);
        Options.Companion companion = Options.f68774e;
        ByteString.Companion companion2 = ByteString.f68753f;
        companion.m34611c(companion2.m34590b("efbbbf"), companion2.m34590b("feff"), companion2.m34590b("fffe"), companion2.m34590b("0000ffff"), companion2.m34590b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.m32176e(timeZone);
        f54982d = timeZone;
        f54983e = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f54984f = false;
        f54985g = StringsKt.m33886L(StringsKt.m33885K(mn0.class.getName(), "com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib."), "Client");
    }

    /* renamed from: a */
    public static final int m28483a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static final int m28484a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (!('a' <= c2 && c2 < 'g')) {
            c3 = 'A';
            if (!('A' <= c2 && c2 < 'G')) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    /* renamed from: a */
    public static final int m28488a(long j2, @Nullable TimeUnit timeUnit) {
        boolean z = true;
        if (!(j2 >= 0)) {
            throw new IllegalStateException(um1.m29049a("timeout", " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (!(millis <= ParserMinimalBase.MAX_INT_L)) {
            throw new IllegalArgumentException(um1.m29049a("timeout", " too large.").toString());
        }
        if (millis == 0 && j2 > 0) {
            z = false;
        }
        if (z) {
            return (int) millis;
        }
        throw new IllegalArgumentException(um1.m29049a("timeout", " too small.").toString());
    }

    /* renamed from: a */
    public static final int m28493a(short s) {
        return s & 65535;
    }

    /* renamed from: a */
    public static final long m28495a(int i2) {
        return i2 & ParserMinimalBase.MAX_INT_L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final AbstractC5814tr m28499a(AbstractC5814tr this_asFactory, InterfaceC5537og it) {
        Intrinsics.m32179h(this_asFactory, "$this_asFactory");
        Intrinsics.m32179h(it, "it");
        return this_asFactory;
    }

    @NotNull
    /* renamed from: b */
    public static final String[] m28527b(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.m32179h(strArr, "<this>");
        Intrinsics.m32179h(other, "other");
        Intrinsics.m32179h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: d */
    public static final boolean m28531d(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        return StringsKt.m33927y(name, "Authorization", true) || StringsKt.m33927y(name, "Cookie", true) || StringsKt.m33927y(name, "Proxy-Authorization", true) || StringsKt.m33927y(name, "Set-Cookie", true);
    }

    @NotNull
    /* renamed from: c */
    public static final String m28529c(int i2, int i3, @NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        int m28485a = m28485a(i2, i3, str);
        String substring = str.substring(m28485a, m28520b(m28485a, i3, str));
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static final int m28520b(int i2, int i3, @NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                char charAt = str.charAt(i4);
                if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m28494a(@NotNull String[] strArr, @NotNull C5495nh.a comparator) {
        Intrinsics.m32179h(strArr, "<this>");
        Intrinsics.m32179h(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], "TLS_FALLBACK_SCSV") == 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static /* synthetic */ int m28523b(String str, char c2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m28489a(str, c2, 0, i2);
    }

    /* renamed from: b */
    public static final int m28522b(@NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Intrinsics.m32181j(charAt, 31) <= 0 || Intrinsics.m32181j(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final void m28508a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public static final int m28521b(int i2, @Nullable String str) {
        if (str == null) {
            return i2;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > ParserMinimalBase.MAX_INT_L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final ThreadFactory m28507a(@NotNull final String name, final boolean z) {
        Intrinsics.m32179h(name, "name");
        return new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.yp1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m28504a;
                m28504a = t91.m28504a(name, z, runnable);
                return m28504a;
            }
        };
    }

    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m28526b(@NotNull List<? extends T> list) {
        Intrinsics.m32179h(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.m32031l0(list));
        Intrinsics.m32178g(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final Thread m28504a(String name, boolean z, Runnable runnable) {
        Intrinsics.m32179h(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: a */
    public static final boolean m28518a(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.m32179h(strArr, "<this>");
        Intrinsics.m32179h(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    Iterator m32154a = ArrayIteratorKt.m32154a(strArr2);
                    while (m32154a.hasNext()) {
                        if (comparator.compare(str, (String) m32154a.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: a */
    public static final String m28502a(@NotNull t00 t00Var, boolean z) {
        String m28392g;
        Intrinsics.m32179h(t00Var, "<this>");
        if (StringsKt.m33922t(t00Var.m28392g(), ":", false, 2, null)) {
            StringBuilder m2872a = C0321a.m2872a('[');
            m2872a.append(t00Var.m28392g());
            m2872a.append(']');
            m28392g = m2872a.toString();
        } else {
            m28392g = t00Var.m28392g();
        }
        if (!z && t00Var.m28394i() == t00.C5777b.m28420a(t00Var.m28397l())) {
            return m28392g;
        }
        return m28392g + ':' + t00Var.m28394i();
    }

    @NotNull
    /* renamed from: a */
    public static final String[] m28519a(@NotNull String value, @NotNull String[] strArr) {
        Intrinsics.m32179h(strArr, "<this>");
        Intrinsics.m32179h(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.m32178g(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[ArraysKt.m31929E(strArr2)] = value;
        return strArr2;
    }

    /* renamed from: a */
    public static final int m28485a(int i2, int i3, @NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public static final int m28486a(int i2, int i3, @NotNull String str, @NotNull String delimiters) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(delimiters, "delimiters");
        while (i2 < i3) {
            if (StringsKt.m33921s(delimiters, str.charAt(i2), false, 2, null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public static final int m28489a(@NotNull String str, char c2, int i2, int i3) {
        Intrinsics.m32179h(str, "<this>");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public static final boolean m28514a(@NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        return f54983e.m33872d(str);
    }

    @NotNull
    /* renamed from: a */
    public static final String m28503a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.m32179h(format, "format");
        Intrinsics.m32179h(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.m32178g(format2, "format(locale, format, *args)");
        return format2;
    }

    @NotNull
    /* renamed from: a */
    public static final C5204hy m28497a(@NotNull List<C5096fy> list) {
        Intrinsics.m32179h(list, "<this>");
        C5204hy.a aVar = new C5204hy.a();
        for (C5096fy c5096fy : list) {
            aVar.m25391b(c5096fy.m24753a().m34586p(), c5096fy.m24754b().m34586p());
        }
        return aVar.m25386a();
    }

    /* renamed from: a */
    public static final boolean m28513a(@NotNull t00 t00Var, @NotNull t00 other) {
        Intrinsics.m32179h(t00Var, "<this>");
        Intrinsics.m32179h(other, "other");
        return Intrinsics.m32174c(t00Var.m28392g(), other.m28392g()) && t00Var.m28394i() == other.m28394i() && Intrinsics.m32174c(t00Var.m28397l(), other.m28397l());
    }

    @NotNull
    /* renamed from: a */
    public static final AbstractC5814tr.b m28498a(@NotNull AbstractC5814tr.a aVar) {
        Intrinsics.m32179h(aVar, "<this>");
        return new en1(aVar, 13);
    }

    /* renamed from: a */
    public static final void m28512a(@NotNull BufferedSink bufferedSink, int i2) throws IOException {
        Intrinsics.m32179h(bufferedSink, "<this>");
        bufferedSink.writeByte((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedSink.writeByte((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedSink.writeByte(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: a */
    public static final int m28492a(@NotNull BufferedSource bufferedSource) throws IOException {
        Intrinsics.m32179h(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r5 == Long.MAX_VALUE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r11.timeout().clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r5 != Long.MAX_VALUE) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m28516a(@org.jetbrains.annotations.NotNull okio.Source r11, int r12, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.m32179h(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.m32179h(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.getF68772c()
            boolean r2 = r2.getHasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            okio.Timeout r2 = r11.getF68772c()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            okio.Timeout r2 = r11.getF68772c()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L6c
            r12.<init>()     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L6c
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L6c
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L50
            long r7 = r12.f68742c     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L6c
            r12.skip(r7)     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L6c
            goto L3e
        L50:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L7a
            goto L72
        L56:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L63
            okio.Timeout r11 = r11.getF68772c()
            r11.clearDeadline()
            goto L6b
        L63:
            okio.Timeout r11 = r11.getF68772c()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L6b:
            throw r12
        L6c:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L7a
        L72:
            okio.Timeout r11 = r11.getF68772c()
            r11.clearDeadline()
            goto L82
        L7a:
            okio.Timeout r11 = r11.getF68772c()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L82:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t91.m28516a(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: a */
    public static final boolean m28517a(@NotNull Source source, @NotNull TimeUnit timeUnit) {
        Intrinsics.m32179h(source, "<this>");
        Intrinsics.m32179h(timeUnit, "timeUnit");
        try {
            return m28516a(source, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m28515a(@NotNull Socket socket, @NotNull BufferedSource source) {
        Intrinsics.m32179h(socket, "<this>");
        Intrinsics.m32179h(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !source.mo34529V();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public static final int m28491a(@NotNull Buffer buffer) {
        Intrinsics.m32179h(buffer, "<this>");
        int i2 = 0;
        while (!buffer.mo34529V() && buffer.m34539e(0L) == 61) {
            i2++;
            buffer.readByte();
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m28487a(int i2, @NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        int length = str.length();
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\t') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    /* renamed from: a */
    public static final long m28496a(@NotNull rw0 rw0Var) {
        Intrinsics.m32179h(rw0Var, "<this>");
        String m25381a = rw0Var.m28000h().m25381a("Content-Length");
        if (m25381a == null) {
            return -1L;
        }
        try {
            return Long.parseLong(m25381a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m28505a(@NotNull T... elements) {
        Intrinsics.m32179h(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.m31994G(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.m32178g(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    @NotNull
    /* renamed from: a */
    public static final <K, V> Map<K, V> m28506a(@NotNull Map<K, ? extends V> map) {
        Map<K, V> map2;
        Intrinsics.m32179h(map, "<this>");
        if (map.isEmpty()) {
            map2 = EmptyMap.f63145b;
            return map2;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.m32178g(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public static final void m28509a(@NotNull Closeable closeable) {
        Intrinsics.m32179h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m28510a(@NotNull Socket socket) {
        Intrinsics.m32179h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.m32174c(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m28511a(@NotNull ArrayList arrayList, Object obj) {
        Intrinsics.m32179h(arrayList, "<this>");
        if (arrayList.contains(obj)) {
            return;
        }
        arrayList.add(obj);
    }

    @NotNull
    /* renamed from: a */
    public static final Exception m28500a(@NotNull IOException iOException, @NotNull List suppressed) {
        Intrinsics.m32179h(iOException, "<this>");
        Intrinsics.m32179h(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            Objects.requireNonNull(System.out);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.m31878a(iOException, (Exception) it.next());
        }
        return iOException;
    }
}
