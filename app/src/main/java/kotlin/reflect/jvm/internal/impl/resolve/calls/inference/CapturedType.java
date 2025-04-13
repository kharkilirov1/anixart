package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class CapturedType extends SimpleType implements SubtypingRepresentatives {

    /* renamed from: a */
    @NotNull
    public final TypeProjection f65912a;

    /* renamed from: b */
    @NotNull
    public final CapturedTypeConstructor f65913b;

    /* renamed from: c */
    public final boolean f65914c;

    /* renamed from: d */
    @NotNull
    public final Annotations f65915d;

    public CapturedType(@NotNull TypeProjection typeProjection, @NotNull CapturedTypeConstructor constructor, boolean z, @NotNull Annotations annotations) {
        Intrinsics.m32180i(typeProjection, "typeProjection");
        Intrinsics.m32180i(constructor, "constructor");
        Intrinsics.m32180i(annotations, "annotations");
        this.f65912a = typeProjection;
        this.f65913b = constructor;
        this.f65914c = z;
        this.f65915d = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    @NotNull
    /* renamed from: C0 */
    public KotlinType mo33513C0() {
        Variance variance = Variance.OUT_VARIANCE;
        KotlinType m32408r = TypeUtilsKt.m33748c(this).m32408r();
        Intrinsics.m32175d(m32408r, "builtIns.nullableAnyType");
        if (this.f65912a.mo33671a() == variance) {
            m32408r = this.f65912a.getType();
        }
        Intrinsics.m32175d(m32408r, "if (typeProjection.proje…jection.type else default");
        return m32408r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: G0 */
    public List<TypeProjection> mo33514G0() {
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: H0 */
    public TypeConstructor mo33515H0() {
        return this.f65913b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return this.f65914c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: K0 */
    public UnwrappedType mo32787K0(boolean z) {
        return z == this.f65914c ? this : new CapturedType(this.f65912a, this.f65913b, z, this.f65915d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: L0 */
    public UnwrappedType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new CapturedType(this.f65912a, this.f65913b, this.f65914c, newAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return z == this.f65914c ? this : new CapturedType(this.f65912a, this.f65913b, z, this.f65915d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: N0 */
    public SimpleType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new CapturedType(this.f65912a, this.f65913b, this.f65914c, newAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    @NotNull
    /* renamed from: O */
    public KotlinType mo33516O() {
        Variance variance = Variance.IN_VARIANCE;
        KotlinType m32407q = TypeUtilsKt.m33748c(this).m32407q();
        Intrinsics.m32175d(m32407q, "builtIns.nothingType");
        if (this.f65912a.mo33671a() == variance) {
            m32407q = this.f65912a.getType();
        }
        Intrinsics.m32175d(m32407q, "if (typeProjection.proje…jection.type else default");
        return m32407q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    /* renamed from: Z */
    public boolean mo33517Z(@NotNull KotlinType kotlinType) {
        return this.f65913b == kotlinType.mo33515H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f65915d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: p */
    public MemberScope mo32791p() {
        return ErrorUtils.m33651b("No member resolution should be done on captured type, it used only during constraint system resolution", true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Captured(");
        m24u.append(this.f65912a);
        m24u.append(')');
        m24u.append(this.f65914c ? "?" : "");
        return m24u.toString();
    }
}
