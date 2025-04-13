package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes3.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* renamed from: e */
    public static final /* synthetic */ KProperty[] f64027e = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(BuiltInAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/KotlinType;"))};

    /* renamed from: a */
    @NotNull
    public final Lazy f64028a = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$type$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public SimpleType invoke() {
            BuiltInAnnotationDescriptor builtInAnnotationDescriptor = BuiltInAnnotationDescriptor.this;
            ClassDescriptor m32401i = builtInAnnotationDescriptor.f64029b.m32401i(builtInAnnotationDescriptor.f64030c);
            Intrinsics.m32175d(m32401i, "builtIns.getBuiltInClassByFqName(fqName)");
            return m32401i.mo32502r();
        }
    });

    /* renamed from: b */
    public final KotlinBuiltIns f64029b;

    /* renamed from: c */
    @NotNull
    public final FqName f64030c;

    /* renamed from: d */
    @NotNull
    public final Map<Name, ConstantValue<?>> f64031d;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull FqName fqName, @NotNull Map<Name, ? extends ConstantValue<?>> map) {
        this.f64029b = kotlinBuiltIns;
        this.f64030c = fqName;
        this.f64031d = map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: a */
    public Map<Name, ConstantValue<?>> mo32586a() {
        return this.f64031d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: d */
    public FqName mo32587d() {
        return this.f64030c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        Lazy lazy = this.f64028a;
        KProperty kProperty = f64027e[0];
        return (KotlinType) lazy.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* renamed from: i */
    public SourceElement mo32588i() {
        return SourceElement.f63979a;
    }
}
