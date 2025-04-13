package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: resolvers.kt */
/* loaded from: classes3.dex */
public interface TypeParameterResolver {

    /* compiled from: resolvers.kt */
    public static final class EMPTY implements TypeParameterResolver {

        /* renamed from: a */
        public static final EMPTY f64491a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        @Nullable
        /* renamed from: a */
        public TypeParameterDescriptor mo32725a(@NotNull JavaTypeParameter javaTypeParameter) {
            Intrinsics.m32180i(javaTypeParameter, "javaTypeParameter");
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    TypeParameterDescriptor mo32725a(@NotNull JavaTypeParameter javaTypeParameter);
}
