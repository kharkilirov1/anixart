package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes3.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* renamed from: b */
    public final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> f64468b;

    /* renamed from: c */
    public final LazyJavaResolverContext f64469c;

    /* renamed from: d */
    public final JavaAnnotationOwner f64470d;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext c2, @NotNull JavaAnnotationOwner annotationOwner) {
        Intrinsics.m32180i(c2, "c");
        Intrinsics.m32180i(annotationOwner, "annotationOwner");
        this.f64469c = c2;
        this.f64470d = annotationOwner;
        this.f64468b = c2.f64479c.f64446a.mo33627g(new Function1<JavaAnnotation, AnnotationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$annotationDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public AnnotationDescriptor invoke(JavaAnnotation javaAnnotation) {
                JavaAnnotation annotation = javaAnnotation;
                Intrinsics.m32180i(annotation, "annotation");
                return JavaAnnotationMapper.f64398k.m32700b(annotation, LazyJavaAnnotations.this.f64469c);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: R0 */
    public boolean mo32592R0(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return Annotations.DefaultImpls.m32596b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* renamed from: h */
    public AnnotationDescriptor mo32593h(@NotNull FqName fqName) {
        AnnotationDescriptor invoke;
        Intrinsics.m32180i(fqName, "fqName");
        JavaAnnotation mo32799h = this.f64470d.mo32799h(fqName);
        return (mo32799h == null || (invoke = this.f64468b.invoke(mo32799h)) == null) ? JavaAnnotationMapper.f64398k.m32699a(fqName, this.f64470d, this.f64469c) : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f64470d.getAnnotations().isEmpty() && !this.f64470d.mo32800k();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        Sequence m33852t = SequencesKt.m33852t(CollectionsKt.m32028k(this.f64470d.getAnnotations()), this.f64468b);
        JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.f64398k;
        FqName fqName = KotlinBuiltIns.f63730l.f63793t;
        Intrinsics.m32175d(fqName, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return new FilteringSequence$iterator$1((FilteringSequence) SequencesKt.m33843k(SequencesKt.m33856x(m33852t, javaAnnotationMapper.m32699a(fqName, this.f64470d, this.f64469c))));
    }
}
