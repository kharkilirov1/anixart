package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RuntimeTypeMapperKt {
    @NotNull
    /* renamed from: a */
    public static final String m32317a(@NotNull Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.m32175d(parameterTypes, "parameterTypes");
        sb.append(ArraysKt.m31939O(parameterTypes, "", "(", ")", 0, null, new Function1<Class<?>, String>() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$signature$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(Class<?> cls) {
                Class<?> it = cls;
                Intrinsics.m32175d(it, "it");
                return ReflectClassUtilKt.m33799c(it);
            }
        }, 24, null));
        Class<?> returnType = method.getReturnType();
        Intrinsics.m32175d(returnType, "returnType");
        sb.append(ReflectClassUtilKt.m33799c(returnType));
        return sb.toString();
    }
}
