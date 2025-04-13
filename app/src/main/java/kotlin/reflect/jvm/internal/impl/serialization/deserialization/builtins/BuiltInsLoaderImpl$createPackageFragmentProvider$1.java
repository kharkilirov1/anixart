package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: BuiltInsLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements Function1<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(BuiltInsResourceLoader builtInsResourceLoader) {
        super(1, builtInsResourceLoader);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(BuiltInsResourceLoader.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // kotlin.jvm.functions.Function1
    public InputStream invoke(String str) {
        InputStream resourceAsStream;
        String p1 = str;
        Intrinsics.m32180i(p1, "p1");
        Objects.requireNonNull((BuiltInsResourceLoader) this.receiver);
        ClassLoader classLoader = BuiltInsResourceLoader.class.getClassLoader();
        return (classLoader == null || (resourceAsStream = classLoader.getResourceAsStream(p1)) == null) ? ClassLoader.getSystemResourceAsStream(p1) : resourceAsStream;
    }
}
