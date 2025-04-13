package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes3.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f64411g = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: f */
    @NotNull
    public final NotNullLazyValue f64412f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JavaTargetAnnotationDescriptor(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$FqNames r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.f63730l
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r0.f63799z
            java.lang.String r1 = "KotlinBuiltIns.FQ_NAMES.target"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            r2.<init>(r4, r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r3 = r4.f64479c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r3 = r3.f64446a
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$allValueArguments$2 r4 = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$allValueArguments$2
            r4.<init>()
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r3 = r3.mo33623c(r4)
            r2.f64412f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor.<init>(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: a */
    public Map<Name, ConstantValue<?>> mo32586a() {
        return (Map) StorageKt.m33635a(this.f64412f, f64411g[0]);
    }
}
