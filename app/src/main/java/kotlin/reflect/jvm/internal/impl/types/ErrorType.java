package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorType.kt */
/* loaded from: classes3.dex */
public class ErrorType extends SimpleType {

    /* renamed from: a */
    @NotNull
    public final TypeConstructor f66302a;

    /* renamed from: b */
    @NotNull
    public final MemberScope f66303b;

    /* renamed from: c */
    @NotNull
    public final List<TypeProjection> f66304c;

    /* renamed from: d */
    public final boolean f66305d;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ErrorType(@NotNull TypeConstructor constructor, @NotNull MemberScope memberScope, @NotNull List<? extends TypeProjection> arguments, boolean z) {
        Intrinsics.m32180i(constructor, "constructor");
        Intrinsics.m32180i(memberScope, "memberScope");
        Intrinsics.m32180i(arguments, "arguments");
        this.f66302a = constructor;
        this.f66303b = memberScope;
        this.f66304c = arguments;
        this.f66305d = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: G0 */
    public List<TypeProjection> mo33514G0() {
        return this.f66304c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: H0 */
    public TypeConstructor mo33515H0() {
        return this.f66302a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return this.f66305d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: L0 */
    public UnwrappedType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return new ErrorType(this.f66302a, this.f66303b, this.f66304c, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: N0 */
    public SimpleType mo32840N0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return this;
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
        return this.f66303b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f66302a.toString());
        sb.append(this.f66304c.isEmpty() ? "" : CollectionsKt.m31988A(this.f66304c, ", ", "<", ">", -1, "...", null));
        return sb.toString();
    }
}
