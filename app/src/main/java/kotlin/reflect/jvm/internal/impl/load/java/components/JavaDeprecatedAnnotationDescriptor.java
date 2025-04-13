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
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f64403g = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: f */
    @NotNull
    public final NotNullLazyValue f64404f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JavaDeprecatedAnnotationDescriptor(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$FqNames r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.f63730l
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r0.f63793t
            java.lang.String r1 = "KotlinBuiltIns.FQ_NAMES.deprecated"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            r2.<init>(r4, r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r3 = r4.f64479c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r3 = r3.f64446a
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2 r4 = new kotlin.jvm.functions.Function0<java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2
                static {
                    /*
                        kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2 r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2) kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2.b kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function0
                public java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue> invoke() {
                    /*
                        r3 = this;
                        kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper r0 = kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.f64398k
                        kotlin.reflect.jvm.internal.impl.name.Name r0 = kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.f64393f
                        kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
                        java.lang.String r2 = "Deprecated in Java"
                        r1.<init>(r2)
                        kotlin.Pair r2 = new kotlin.Pair
                        r2.<init>(r0, r1)
                        java.util.Map r0 = kotlin.collections.MapsKt.m32063h(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2.invoke():java.lang.Object");
                }
            }
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r3 = r3.mo33623c(r4)
            r2.f64404f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor.<init>(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: a */
    public Map<Name, ConstantValue<?>> mo32586a() {
        return (Map) StorageKt.m33635a(this.f64404f, f64403g[0]);
    }
}
