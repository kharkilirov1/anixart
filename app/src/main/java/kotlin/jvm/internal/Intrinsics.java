package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class Intrinsics {

    @SinceKotlin
    public static class Kotlin {
    }

    @SinceKotlin
    /* renamed from: a */
    public static boolean m32172a(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    @SinceKotlin
    /* renamed from: b */
    public static boolean m32173b(Float f2, Float f3) {
        if (f2 == null) {
            if (f3 == null) {
                return true;
            }
        } else if (f3 != null && f2.floatValue() == f3.floatValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m32174c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static void m32175d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(C0000a.m14k(str, " must not be null"));
        m32186o(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    /* renamed from: e */
    public static void m32176e(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m32186o(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* renamed from: f */
    public static void m32177f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m32186o(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* renamed from: g */
    public static void m32178g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(C0000a.m14k(str, " must not be null"));
        m32186o(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* renamed from: h */
    public static void m32179h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m32183l(str));
        m32186o(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    /* renamed from: i */
    public static void m32180i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m32183l(str));
        m32186o(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    /* renamed from: j */
    public static int m32181j(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    /* renamed from: k */
    public static int m32182k(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* renamed from: l */
    public static String m32183l(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder m29z = C0000a.m29z("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        m29z.append(str);
        return m29z.toString();
    }

    /* renamed from: m */
    public static void m32184m() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: n */
    public static void m32185n() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: o */
    public static <T extends Throwable> T m32186o(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    /* renamed from: p */
    public static String m32187p(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static void m32188q() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        m32186o(kotlinNullPointerException, Intrinsics.class.getName());
        throw kotlinNullPointerException;
    }

    /* renamed from: r */
    public static void m32189r(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(C0000a.m16m("lateinit property ", str, " has not been initialized"));
        m32186o(uninitializedPropertyAccessException, Intrinsics.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
