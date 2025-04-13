package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugMetadata.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "Cache", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ModuleNameRetriever {

    /* renamed from: a */
    @NotNull
    public static final Cache f63246a = new Cache(null, null, null);

    /* renamed from: b */
    @Nullable
    public static Cache f63247b;

    /* compiled from: DebugMetadata.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Cache {

        /* renamed from: a */
        @JvmField
        @Nullable
        public final Method f63248a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final Method f63249b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final Method f63250c;

        public Cache(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f63248a = method;
            this.f63249b = method2;
            this.f63250c = method3;
        }
    }
}
