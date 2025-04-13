package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: StubType.kt */
/* loaded from: classes3.dex */
public final class StubType extends SimpleType {

    /* renamed from: a */
    public final TypeConstructor f66337a;

    /* renamed from: b */
    public final boolean f66338b;

    /* renamed from: c */
    @NotNull
    public final TypeConstructor f66339c;

    /* renamed from: d */
    @NotNull
    public final MemberScope f66340d;

    public StubType(@NotNull TypeConstructor originalTypeVariable, boolean z, @NotNull TypeConstructor constructor, @NotNull MemberScope memberScope) {
        Intrinsics.m32180i(originalTypeVariable, "originalTypeVariable");
        Intrinsics.m32180i(constructor, "constructor");
        Intrinsics.m32180i(memberScope, "memberScope");
        this.f66337a = originalTypeVariable;
        this.f66338b = z;
        this.f66339c = constructor;
        this.f66340d = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: G0 */
    public List<TypeProjection> mo33514G0() {
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: H0 */
    public TypeConstructor mo33515H0() {
        return this.f66339c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return this.f66338b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: L0 */
    public /* bridge */ /* synthetic */ UnwrappedType mo32788L0(Annotations annotations) {
        mo32840N0(annotations);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return z == this.f66338b ? this : new StubType(this.f66337a, z, this.f66339c, this.f66340d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: N0 */
    public SimpleType mo32840N0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        throw new IllegalStateException("Shouldn't be called on non-fixed type".toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        int i2 = Annotations.f64023H1;
        return Annotations.Companion.f64024a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: p */
    public MemberScope mo32791p() {
        return this.f66340d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NonFixed: ");
        m24u.append(this.f66337a);
        return m24u.toString();
    }
}
