package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes3.dex */
public final class LazyJavaAnnotationsKt {
    @NotNull
    /* renamed from: a */
    public static final Annotations m32722a(@NotNull LazyJavaResolverContext receiver$0, @NotNull JavaAnnotationOwner annotationsOwner) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(receiver$0, annotationsOwner);
    }
}
