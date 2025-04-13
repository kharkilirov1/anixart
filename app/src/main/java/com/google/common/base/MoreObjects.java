package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class MoreObjects {

    public static final class ToStringHelper {

        /* renamed from: a */
        public final String f20527a;

        /* renamed from: b */
        public final ValueHolder f20528b;

        /* renamed from: c */
        public ValueHolder f20529c;

        /* renamed from: d */
        public boolean f20530d;

        public static final class ValueHolder {

            /* renamed from: a */
            @NullableDecl
            public String f20531a;

            /* renamed from: b */
            @NullableDecl
            public Object f20532b;

            /* renamed from: c */
            @NullableDecl
            public ValueHolder f20533c;

            public ValueHolder() {
            }

            public ValueHolder(C15641 c15641) {
            }
        }

        public ToStringHelper(String str, C15641 c15641) {
            ValueHolder valueHolder = new ValueHolder(null);
            this.f20528b = valueHolder;
            this.f20529c = valueHolder;
            this.f20530d = false;
            this.f20527a = str;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public ToStringHelper m11167a(String str, double d) {
            m11171e(str, String.valueOf(d));
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public ToStringHelper m11168b(String str, int i2) {
            m11171e(str, String.valueOf(i2));
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public ToStringHelper m11169c(String str, long j2) {
            m11171e(str, String.valueOf(j2));
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public ToStringHelper m11170d(String str, boolean z) {
            m11171e(str, String.valueOf(z));
            return this;
        }

        /* renamed from: e */
        public final ToStringHelper m11171e(String str, @NullableDecl Object obj) {
            ValueHolder valueHolder = new ValueHolder(null);
            this.f20529c.f20533c = valueHolder;
            this.f20529c = valueHolder;
            valueHolder.f20532b = obj;
            java.util.Objects.requireNonNull(str);
            valueHolder.f20531a = str;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public ToStringHelper m11172f(@NullableDecl Object obj) {
            ValueHolder valueHolder = new ValueHolder(null);
            this.f20529c.f20533c = valueHolder;
            this.f20529c = valueHolder;
            valueHolder.f20532b = obj;
            return this;
        }

        public String toString() {
            boolean z = this.f20530d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f20527a);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.f20528b.f20533c; valueHolder != null; valueHolder = valueHolder.f20533c) {
                Object obj = valueHolder.f20532b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = valueHolder.f20531a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static <T> T m11165a(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        java.util.Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    /* renamed from: b */
    public static ToStringHelper m11166b(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName(), null);
    }
}
