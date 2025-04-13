package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes3.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* renamed from: c */
    public static final /* synthetic */ KProperty[] f66332c = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(StarProjectionImpl.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};

    /* renamed from: a */
    public final Lazy f66333a;

    /* renamed from: b */
    public final TypeParameterDescriptor f66334b;

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.m32180i(typeParameter, "typeParameter");
        this.f66334b = typeParameter;
        this.f66333a = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$_type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public KotlinType invoke() {
                return StarProjectionImplKt.m33673a(StarProjectionImpl.this.f66334b);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* renamed from: a */
    public Variance mo33671a() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* renamed from: b */
    public boolean mo33672b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        Lazy lazy = this.f66333a;
        KProperty kProperty = f66332c[0];
        return (KotlinType) lazy.getValue();
    }
}
