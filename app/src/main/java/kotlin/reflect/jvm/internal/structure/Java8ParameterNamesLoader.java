package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaMember.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "Cache", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class Java8ParameterNamesLoader {

    /* renamed from: a */
    @Nullable
    public static Cache f66538a;

    /* compiled from: ReflectJavaMember.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Cache {

        /* renamed from: a */
        @Nullable
        public final Method f66539a;

        /* renamed from: b */
        @Nullable
        public final Method f66540b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f66539a = method;
            this.f66540b = method2;
        }
    }
}
