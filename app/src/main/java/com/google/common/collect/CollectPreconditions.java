package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
/* loaded from: classes.dex */
final class CollectPreconditions {
    /* renamed from: a */
    public static void m11426a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException(C0576a.m4114m(valueOf.length() + 24, "null key in entry: null=", valueOf));
        }
        if (obj2 != null) {
            return;
        }
        String valueOf2 = String.valueOf(obj);
        throw new NullPointerException(C0576a.m4115n(valueOf2.length() + 26, "null value in entry: ", valueOf2, "=null"));
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static int m11427b(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public static long m11428c(long j2, String str) {
        if (j2 >= 0) {
            return j2;
        }
        StringBuilder sb = new StringBuilder(str.length() + 49);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public static void m11429d(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
