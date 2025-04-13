package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tm0 {
    @NotNull
    /* renamed from: a */
    public static ArrayList m28688a(@NotNull TreeMap requestHeaders) {
        Intrinsics.m32179h(requestHeaders, "requestHeaders");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : requestHeaders.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(new C5049ey(str, (String) it.next()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m28689a(int i2, int i3) {
        if (i2 != 4) {
            if (!(100 <= i3 && i3 < 200) && i3 != 204 && i3 != 304) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: a */
    public static URL m28687a(@NotNull zv0 request, @Nullable f91 f91Var) throws IOException {
        Intrinsics.m32179h(request, "request");
        String mo27673m = request.mo27673m();
        if (f91Var != null) {
            String mo22666a = f91Var.mo22666a(mo27673m);
            if (mo22666a == null) {
                throw new IOException(um1.m29049a("URL blocked by rewriter: ", mo27673m));
            }
            mo27673m = mo22666a;
        }
        return new URL(mo27673m);
    }

    @Nullable
    /* renamed from: a */
    public static InputStream m28686a(@NotNull rw0 response) {
        Intrinsics.m32179h(response, "response");
        vw0 m27993a = response.m27993a();
        if (m27993a != null) {
            return m27993a.m29281a();
        }
        return null;
    }
}
