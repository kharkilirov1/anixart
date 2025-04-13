package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class EncodedPath {
    /* renamed from: a */
    public static ResourcePath m12404a(String str) {
        List list;
        int length = str.length();
        Assert.m12490b(length >= 2, "Invalid path \"%s\"", str);
        if (length == 2) {
            Assert.m12490b(str.charAt(0) == 1 && str.charAt(1) == 1, "Non-empty path \"%s\" had length 2", str);
            list = Collections.emptyList();
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < length) {
                int indexOf = str.indexOf(1, i2);
                if (indexOf < 0 || indexOf > length2) {
                    throw new IllegalArgumentException(C0000a.m16m("Invalid encoded resource path: \"", str, "\""));
                }
                int i3 = indexOf + 1;
                char charAt = str.charAt(i3);
                if (charAt == 1) {
                    String substring = str.substring(i2, indexOf);
                    if (sb.length() != 0) {
                        sb.append(substring);
                        substring = sb.toString();
                        sb.setLength(0);
                    }
                    arrayList.add(substring);
                } else if (charAt == 16) {
                    sb.append(str.substring(i2, indexOf));
                    sb.append((char) 0);
                } else {
                    if (charAt != 17) {
                        throw new IllegalArgumentException(C0000a.m16m("Invalid encoded resource path: \"", str, "\""));
                    }
                    sb.append(str.substring(i2, i3));
                }
                i2 = indexOf + 2;
            }
            list = arrayList;
        }
        return ResourcePath.m12452l(list);
    }

    /* renamed from: b */
    public static <B extends BasePath<B>> String m12405b(B b) {
        StringBuilder sb = new StringBuilder();
        int m12434i = b.m12434i();
        for (int i2 = 0; i2 < m12434i; i2++) {
            if (sb.length() > 0) {
                sb.append((char) 1);
                sb.append((char) 1);
            }
            String m12432f = b.m12432f(i2);
            int length = m12432f.length();
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = m12432f.charAt(i3);
                if (charAt == 0) {
                    sb.append((char) 1);
                    sb.append((char) 16);
                } else if (charAt != 1) {
                    sb.append(charAt);
                } else {
                    sb.append((char) 1);
                    sb.append((char) 17);
                }
            }
        }
        sb.append((char) 1);
        sb.append((char) 1);
        return sb.toString();
    }
}
