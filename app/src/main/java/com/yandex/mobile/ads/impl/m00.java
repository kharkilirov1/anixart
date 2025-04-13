package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C6127zk;
import com.yandex.mobile.ads.impl.eq0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@JvmName
/* loaded from: classes3.dex */
public final class m00 {

    /* renamed from: a */
    @NotNull
    private static final ByteString f52556a;

    /* renamed from: b */
    @NotNull
    private static final ByteString f52557b;

    static {
        ByteString.Companion companion = ByteString.f68753f;
        f52556a = companion.m34592d("\"\\");
        f52557b = companion.m34592d("\t ,=");
    }

    @NotNull
    /* renamed from: a */
    public static final ArrayList m26549a(@NotNull C5204hy c5204hy, @NotNull String headerName) {
        Intrinsics.m32179h(c5204hy, "<this>");
        Intrinsics.m32179h(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c5204hy.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.m33927y(headerName, c5204hy.m25380a(i2), true)) {
                Buffer buffer = new Buffer();
                buffer.m34516D0(c5204hy.m25383b(i2));
                try {
                    m26551a(buffer, arrayList);
                } catch (EOFException e2) {
                    int i3 = eq0.f50037c;
                    Objects.requireNonNull(eq0.C5041a.m24241b());
                    eq0.m24229a(5, "Unable to parse challenge", e2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static final boolean m26553b(Buffer buffer) {
        boolean z = false;
        while (!buffer.mo34529V()) {
            byte m34539e = buffer.m34539e(0L);
            if (m34539e != 44) {
                if (!(m34539e == 32 || m34539e == 9)) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0112, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0112, code lost:
    
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m26551a(okio.Buffer r18, java.util.ArrayList r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m00.m26551a(okio.Buffer, java.util.ArrayList):void");
    }

    /* renamed from: a */
    private static final String m26548a(Buffer buffer) {
        long mo34540e0 = buffer.mo34540e0(f52557b);
        if (mo34540e0 == -1) {
            mo34540e0 = buffer.f68742c;
        }
        if (mo34540e0 != 0) {
            return buffer.m34555n(mo34540e0);
        }
        return null;
    }

    /* renamed from: a */
    public static final void m26550a(@NotNull InterfaceC4875bl interfaceC4875bl, @NotNull t00 url, @NotNull C5204hy headers) {
        Intrinsics.m32179h(interfaceC4875bl, "<this>");
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(headers, "headers");
        if (interfaceC4875bl == InterfaceC4875bl.f48916a) {
            return;
        }
        int i2 = C6127zk.f57214n;
        List<C6127zk> m30206a = C6127zk.a.m30206a(url, headers);
        if (m30206a.isEmpty()) {
            return;
        }
        interfaceC4875bl.mo22540a(url, m30206a);
    }

    /* renamed from: a */
    public static final boolean m26552a(@NotNull rw0 rw0Var) {
        Intrinsics.m32179h(rw0Var, "<this>");
        if (Intrinsics.m32174c(rw0Var.m28008p().m22638f(), "HEAD")) {
            return false;
        }
        int m27997e = rw0Var.m27997e();
        return (((m27997e >= 100 && m27997e < 200) || m27997e == 204 || m27997e == 304) && t91.m28496a(rw0Var) == -1 && !StringsKt.m33927y("chunked", rw0.m27992a(rw0Var, "Transfer-Encoding"), true)) ? false : true;
    }
}
