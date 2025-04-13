package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class CapturedTypeConstructor implements TypeConstructor {

    /* renamed from: a */
    @Nullable
    public NewCapturedTypeConstructor f65916a;

    /* renamed from: b */
    @NotNull
    public final TypeProjection f65917b;

    public CapturedTypeConstructor(@NotNull TypeProjection typeProjection) {
        Intrinsics.m32180i(typeProjection, "typeProjection");
        this.f65917b = typeProjection;
        typeProjection.mo33671a();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: a */
    public Collection<KotlinType> mo32602a() {
        KotlinType type = this.f65917b.mo33671a() == Variance.OUT_VARIANCE ? this.f65917b.getType() : mo32603n().m32408r();
        Intrinsics.m32175d(type, "if (typeProjection.proje… builtIns.nullableAnyType");
        return CollectionsKt.m31993F(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: b */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo32449b() {
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
        KotlinBuiltIns mo32603n = this.f65917b.getType().mo33515H0().mo32603n();
        Intrinsics.m32175d(mo32603n, "typeProjection.type.constructor.builtIns");
        return mo32603n;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CapturedTypeConstructor(");
        m24u.append(this.f65917b);
        m24u.append(')');
        return m24u.toString();
    }
}
