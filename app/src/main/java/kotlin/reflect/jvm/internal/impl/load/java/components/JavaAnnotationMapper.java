package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes3.dex */
public final class JavaAnnotationMapper {

    /* renamed from: a */
    public static final FqName f64388a;

    /* renamed from: b */
    public static final FqName f64389b;

    /* renamed from: c */
    public static final FqName f64390c;

    /* renamed from: d */
    public static final FqName f64391d;

    /* renamed from: e */
    public static final FqName f64392e;

    /* renamed from: f */
    @NotNull
    public static final Name f64393f;

    /* renamed from: g */
    @NotNull
    public static final Name f64394g;

    /* renamed from: h */
    @NotNull
    public static final Name f64395h;

    /* renamed from: i */
    public static final Map<FqName, FqName> f64396i;

    /* renamed from: j */
    @NotNull
    public static final Map<FqName, FqName> f64397j;

    /* renamed from: k */
    public static final JavaAnnotationMapper f64398k = new JavaAnnotationMapper();

    static {
        FqName fqName = new FqName(Target.class.getCanonicalName());
        f64388a = fqName;
        FqName fqName2 = new FqName(Retention.class.getCanonicalName());
        f64389b = fqName2;
        FqName fqName3 = new FqName(Deprecated.class.getCanonicalName());
        f64390c = fqName3;
        FqName fqName4 = new FqName(Documented.class.getCanonicalName());
        f64391d = fqName4;
        FqName fqName5 = new FqName("java.lang.annotation.Repeatable");
        f64392e = fqName5;
        f64393f = Name.m33211d(ThrowableDeserializer.PROP_NAME_MESSAGE);
        f64394g = Name.m33211d("allowedTargets");
        f64395h = Name.m33211d("value");
        KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
        f64396i = MapsKt.m32064i(new Pair(fqNames.f63799z, fqName), new Pair(fqNames.f63744C, fqName2), new Pair(fqNames.f63745D, fqName5), new Pair(fqNames.f63746E, fqName4));
        f64397j = MapsKt.m32064i(new Pair(fqName, fqNames.f63799z), new Pair(fqName2, fqNames.f63744C), new Pair(fqName3, fqNames.f63793t), new Pair(fqName5, fqNames.f63745D), new Pair(fqName4, fqNames.f63746E));
    }

    @Nullable
    /* renamed from: a */
    public final AnnotationDescriptor m32699a(@NotNull FqName fqName, @NotNull JavaAnnotationOwner annotationOwner, @NotNull LazyJavaResolverContext c2) {
        JavaAnnotation mo32799h;
        JavaAnnotation mo32799h2;
        Intrinsics.m32180i(annotationOwner, "annotationOwner");
        Intrinsics.m32180i(c2, "c");
        if (Intrinsics.m32174c(fqName, KotlinBuiltIns.f63730l.f63793t) && ((mo32799h2 = annotationOwner.mo32799h(f64390c)) != null || annotationOwner.mo32800k())) {
            return new JavaDeprecatedAnnotationDescriptor(mo32799h2, c2);
        }
        FqName fqName2 = f64396i.get(fqName);
        if (fqName2 == null || (mo32799h = annotationOwner.mo32799h(fqName2)) == null) {
            return null;
        }
        return f64398k.m32700b(mo32799h, c2);
    }

    @Nullable
    /* renamed from: b */
    public final AnnotationDescriptor m32700b(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext c2) {
        Intrinsics.m32180i(c2, "c");
        ClassId mo32796g = javaAnnotation.mo32796g();
        if (Intrinsics.m32174c(mo32796g, ClassId.m33188i(f64388a))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation, c2);
        }
        if (Intrinsics.m32174c(mo32796g, ClassId.m33188i(f64389b))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation, c2);
        }
        if (Intrinsics.m32174c(mo32796g, ClassId.m33188i(f64392e))) {
            FqName fqName = KotlinBuiltIns.f63730l.f63745D;
            Intrinsics.m32175d(fqName, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new JavaAnnotationDescriptor(c2, javaAnnotation, fqName);
        }
        if (Intrinsics.m32174c(mo32796g, ClassId.m33188i(f64391d))) {
            FqName fqName2 = KotlinBuiltIns.f63730l.f63746E;
            Intrinsics.m32175d(fqName2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new JavaAnnotationDescriptor(c2, javaAnnotation, fqName2);
        }
        if (Intrinsics.m32174c(mo32796g, ClassId.m33188i(f64390c))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c2, javaAnnotation);
    }
}
