package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: exceptionUtils.kt */
/* loaded from: classes3.dex */
public final class ExceptionUtilsKt {
    /* renamed from: a */
    public static final boolean m33778a(@NotNull Throwable th) {
        Class<?> cls = th.getClass();
        while (!Intrinsics.m32174c(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
