package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes3.dex */
final class SimpleTypeImpl extends SimpleType {

    /* renamed from: a */
    @NotNull
    public final TypeConstructor f66326a;

    /* renamed from: b */
    @NotNull
    public final List<TypeProjection> f66327b;

    /* renamed from: c */
    public final boolean f66328c;

    /* renamed from: d */
    @NotNull
    public final MemberScope f66329d;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTypeImpl(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope) {
        this.f66326a = typeConstructor;
        this.f66327b = list;
        this.f66328c = z;
        this.f66329d = memberScope;
        if (memberScope instanceof ErrorUtils.ErrorScope) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + typeConstructor);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: G0 */
    public List<TypeProjection> mo33514G0() {
        return this.f66327b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: H0 */
    public TypeConstructor mo33515H0() {
        return this.f66326a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return this.f66328c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return z == this.f66328c ? this : z ? new NullableSimpleType(this) : new NotNullSimpleType(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: N0 */
    public SimpleType mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return newAnnotations.isEmpty() ? this : new AnnotatedSimpleType(this, newAnnotations);
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
        return this.f66329d;
    }
}
