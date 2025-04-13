package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes3.dex */
public final class NewCapturedType extends SimpleType {

    /* renamed from: a */
    @NotNull
    public final CaptureStatus f66372a;

    /* renamed from: b */
    @NotNull
    public final NewCapturedTypeConstructor f66373b;

    /* renamed from: c */
    @Nullable
    public final UnwrappedType f66374c;

    /* renamed from: d */
    @NotNull
    public final Annotations f66375d;

    /* renamed from: e */
    public final boolean f66376e;

    public NewCapturedType(@NotNull CaptureStatus captureStatus, @NotNull NewCapturedTypeConstructor constructor, @Nullable UnwrappedType unwrappedType, @NotNull Annotations annotations, boolean z) {
        Intrinsics.m32180i(captureStatus, "captureStatus");
        Intrinsics.m32180i(constructor, "constructor");
        Intrinsics.m32180i(annotations, "annotations");
        this.f66372a = captureStatus;
        this.f66373b = constructor;
        this.f66374c = unwrappedType;
        this.f66375d = annotations;
        this.f66376e = z;
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
        return this.f66373b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: I0 */
    public boolean mo32838I0() {
        return this.f66376e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: K0 */
    public UnwrappedType mo32787K0(boolean z) {
        return new NewCapturedType(this.f66372a, this.f66373b, this.f66374c, this.f66375d, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: M0 */
    public SimpleType mo32787K0(boolean z) {
        return new NewCapturedType(this.f66372a, this.f66373b, this.f66374c, this.f66375d, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType mo32788L0(@NotNull Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new NewCapturedType(this.f66372a, this.f66373b, this.f66374c, newAnnotations, this.f66376e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f66375d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: p */
    public MemberScope mo32791p() {
        return ErrorUtils.m33651b("No member resolution should be done on captured type!", true);
    }
}
