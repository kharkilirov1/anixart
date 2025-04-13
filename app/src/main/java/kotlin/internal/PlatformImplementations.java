package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatformImplementations.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/internal/PlatformImplementations;", "", "ReflectThrowable", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public class PlatformImplementations {

    /* compiled from: PlatformImplementations.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class ReflectThrowable {

        /* renamed from: a */
        @JvmField
        @Nullable
        public static final Method f63253a;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.m32174c(r7.length == 1 ? r7[0] : null, java.lang.Throwable.class) != false) goto L14;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.Intrinsics.m32178g(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Le:
                r5 = 0
                if (r4 >= r2) goto L3d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.Intrinsics.m32174c(r7, r8)
                r8 = 1
                if (r7 == 0) goto L35
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                kotlin.jvm.internal.Intrinsics.m32178g(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L2e
                r5 = r7[r3]
            L2e:
                boolean r5 = kotlin.jvm.internal.Intrinsics.m32174c(r5, r0)
                if (r5 == 0) goto L35
                goto L36
            L35:
                r8 = 0
            L36:
                if (r8 == 0) goto L3a
                r5 = r6
                goto L3d
            L3a:
                int r4 = r4 + 1
                goto Le
            L3d:
                kotlin.internal.PlatformImplementations.ReflectThrowable.f63253a = r5
                int r0 = r1.length
            L40:
                if (r3 >= r0) goto L54
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = kotlin.jvm.internal.Intrinsics.m32174c(r2, r4)
                if (r2 == 0) goto L51
                goto L54
            L51:
                int r3 = r3 + 1
                goto L40
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementations.ReflectThrowable.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo32130a(@NotNull Throwable th, @NotNull Throwable th2) {
        Method method = ReflectThrowable.f63253a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    @NotNull
    /* renamed from: b */
    public Random mo32131b() {
        return new FallbackThreadLocalRandom();
    }
}
