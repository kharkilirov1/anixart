package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes3.dex */
final class JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 extends Lambda implements Function1<JavaType, Boolean> {

    /* renamed from: b */
    public static final JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 f64628b = new JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1();

    public JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1() {
        super(1);
    }

    /* renamed from: a */
    public final boolean m32778a(@Nullable JavaType javaType) {
        if (!(javaType instanceof JavaWildcardType)) {
            javaType = null;
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        return (javaWildcardType == null || javaWildcardType.mo32834w() == null || javaWildcardType.mo32833C()) ? false : true;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(JavaType javaType) {
        return Boolean.valueOf(m32778a(javaType));
    }
}
