package kotlin.script.experimental.jvm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: jvmScriptingHostConfiguration.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "Ljava/lang/ClassLoader;", "kotlin.jvm.PlatformType", "it", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class JvmGetScriptingClass$invoke$actualClassLoadersChain$1 extends Lambda implements Function1<ClassLoader, ClassLoader> {
    static {
        new JvmGetScriptingClass$invoke$actualClassLoadersChain$1();
    }

    public JvmGetScriptingClass$invoke$actualClassLoadersChain$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public ClassLoader invoke(ClassLoader classLoader) {
        ClassLoader it = classLoader;
        Intrinsics.m32180i(it, "it");
        return it.getParent();
    }
}
