package kotlin.internal.jdk7;

import kotlin.Metadata;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JDK7PlatformImplementations.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* compiled from: JDK7PlatformImplementations.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "kotlin-stdlib-jdk7"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class ReflectSdkVersion {

        /* renamed from: a */
        @JvmField
        @Nullable
        public static final Integer f63259a;

        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L18
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L19
            L18:
                r1 = r0
            L19:
                if (r1 == 0) goto L27
                int r2 = r1.intValue()
                if (r2 <= 0) goto L23
                r2 = 1
                goto L24
            L23:
                r2 = 0
            L24:
                if (r2 == 0) goto L27
                r0 = r1
            L27:
                kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.f63259a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.<clinit>():void");
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    /* renamed from: a */
    public void mo32130a(@NotNull Throwable th, @NotNull Throwable th2) {
        Integer num = ReflectSdkVersion.f63259a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo32130a(th, th2);
        }
    }
}
