package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p000a.C0000a;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes3.dex */
final class JavaTypeResolverKt$getErasedUpperBound$1 extends Lambda implements Function0<SimpleType> {

    /* renamed from: b */
    public final /* synthetic */ TypeParameterDescriptor f64631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTypeResolverKt$getErasedUpperBound$1(TypeParameterDescriptor typeParameterDescriptor) {
        super(0);
        this.f64631b = typeParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public SimpleType invoke() {
        StringBuilder m24u = C0000a.m24u("Can't compute erased upper bound of type parameter `");
        m24u.append(this.f64631b);
        m24u.append('`');
        return ErrorUtils.m33652c(m24u.toString());
    }
}
