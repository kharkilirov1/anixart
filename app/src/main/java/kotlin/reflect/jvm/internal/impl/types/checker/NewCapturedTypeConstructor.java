package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes3.dex */
public final class NewCapturedTypeConstructor implements TypeConstructor {

    /* renamed from: a */
    @NotNull
    public final TypeProjection f66377a;

    /* renamed from: b */
    public List<? extends UnwrappedType> f66378b;

    public NewCapturedTypeConstructor(@NotNull TypeProjection projection, @Nullable List<? extends UnwrappedType> list) {
        Intrinsics.m32180i(projection, "projection");
        this.f66377a = projection;
        this.f66378b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: a */
    public Collection mo32602a() {
        List<? extends UnwrappedType> list = this.f66378b;
        return list != null ? list : EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* renamed from: b */
    public ClassifierDescriptor mo32449b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: c */
    public boolean mo32450c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: n */
    public KotlinBuiltIns mo32603n() {
        KotlinType type = this.f66377a.getType();
        Intrinsics.m32175d(type, "projection.type");
        return TypeUtilsKt.m33748c(type);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CapturedType(");
        m24u.append(this.f66377a);
        m24u.append(')');
        return m24u.toString();
    }

    public NewCapturedTypeConstructor(TypeProjection typeProjection, List list, int i2) {
        this.f66377a = typeProjection;
        this.f66378b = null;
    }
}
