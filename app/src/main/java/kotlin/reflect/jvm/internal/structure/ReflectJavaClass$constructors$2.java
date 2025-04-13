package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: ReflectJavaClass.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0019\u0010\u0002\u001a\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, m31884d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "p1", "Ljava/lang/reflect/Constructor;", "Lkotlin/ParameterName;", "name", "member", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class ReflectJavaClass$constructors$2 extends FunctionReference implements Function1<Constructor<?>, ReflectJavaConstructor> {

    /* renamed from: d */
    public static final ReflectJavaClass$constructors$2 f66556d = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(ReflectJavaConstructor.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public ReflectJavaConstructor invoke(Constructor<?> constructor) {
        Constructor<?> p1 = constructor;
        Intrinsics.m32180i(p1, "p1");
        return new ReflectJavaConstructor(p1);
    }
}
