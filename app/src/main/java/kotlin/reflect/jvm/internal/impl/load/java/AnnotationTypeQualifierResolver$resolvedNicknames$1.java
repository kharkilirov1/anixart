package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

/* compiled from: AnnotationTypeQualifierResolver.kt */
/* loaded from: classes3.dex */
public final class AnnotationTypeQualifierResolver$resolvedNicknames$1 extends FunctionReference implements Function1<ClassDescriptor, AnnotationDescriptor> {
    public AnnotationTypeQualifierResolver$resolvedNicknames$1(AnnotationTypeQualifierResolver annotationTypeQualifierResolver) {
        super(1, annotationTypeQualifierResolver);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* renamed from: getName */
    public final String getF63590i() {
        return "computeTypeQualifierNickname";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(AnnotationTypeQualifierResolver.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function1
    public AnnotationDescriptor invoke(ClassDescriptor classDescriptor) {
        ClassDescriptor p1 = classDescriptor;
        Intrinsics.m32180i(p1, "p1");
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = (AnnotationTypeQualifierResolver) this.receiver;
        Objects.requireNonNull(annotationTypeQualifierResolver);
        if (!p1.getAnnotations().mo32592R0(AnnotationTypeQualifierResolverKt.f64298a)) {
            return null;
        }
        Iterator<AnnotationDescriptor> it = p1.getAnnotations().iterator();
        while (it.hasNext()) {
            AnnotationDescriptor m32668d = annotationTypeQualifierResolver.m32668d(it.next());
            if (m32668d != null) {
                return m32668d;
            }
        }
        return null;
    }
}
