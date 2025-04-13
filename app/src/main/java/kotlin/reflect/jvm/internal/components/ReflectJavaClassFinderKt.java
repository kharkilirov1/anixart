package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaClassFinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"descriptors.runtime"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaClassFinderKt {
    @Nullable
    /* renamed from: a */
    public static final Class<?> m32347a(@NotNull ClassLoader receiver$0, @NotNull String fqName) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(fqName, "fqName");
        try {
            return receiver$0.loadClass(fqName);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
