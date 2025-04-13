package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: RawType.kt */
/* loaded from: classes3.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.m32180i(lowerBound, "lowerBound");
        Intrinsics.m32180i(upperBound, "upperBound");
        int i2 = KotlinTypeChecker.f66369a;
        NewKotlinTypeChecker.f66379b.m33713h(lowerBound, upperBound);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: K0 */
    public UnwrappedType mo32787K0(boolean z) {
        return new RawTypeImpl(this.f66316a.mo32787K0(z), this.f66317b.mo32787K0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: L0 */
    public UnwrappedType mo32788L0(Annotations newAnnotations) {
        Intrinsics.m32180i(newAnnotations, "newAnnotations");
        return new RawTypeImpl(this.f66316a.mo32788L0(newAnnotations), this.f66317b.mo32788L0(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: M0 */
    public SimpleType mo32789M0() {
        return this.f66316a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$2] */
    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* renamed from: N0 */
    public String mo32790N0(@NotNull final DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        RawTypeImpl$render$1 rawTypeImpl$render$1 = RawTypeImpl$render$1.f64635b;
        ?? r0 = new Function1<KotlinType, List<? extends String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<String> invoke(@NotNull KotlinType type) {
                Intrinsics.m32180i(type, "type");
                List<TypeProjection> mo33514G0 = type.mo33514G0();
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo33514G0, 10));
                Iterator<T> it = mo33514G0.iterator();
                while (it.hasNext()) {
                    arrayList.add(DescriptorRenderer.this.mo33369y((TypeProjection) it.next()));
                }
                return arrayList;
            }
        };
        RawTypeImpl$render$3 rawTypeImpl$render$3 = RawTypeImpl$render$3.f64637b;
        String mo33368x = descriptorRenderer.mo33368x(this.f66316a);
        String mo33368x2 = descriptorRenderer.mo33368x(this.f66317b);
        if (descriptorRendererOptions.mo33433p()) {
            return "raw (" + mo33368x + ".." + mo33368x2 + ')';
        }
        if (this.f66317b.mo33514G0().isEmpty()) {
            return descriptorRenderer.mo33365u(mo33368x, mo33368x2, TypeUtilsKt.m33748c(this));
        }
        List<String> invoke = r0.invoke(this.f66316a);
        List<String> invoke2 = r0.invoke(this.f66317b);
        String m31989B = CollectionsKt.m31989B(invoke, ", ", null, null, 0, null, new Function1<String, String>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(String str) {
                String it = str;
                Intrinsics.m32180i(it, "it");
                return "(raw) " + it;
            }
        }, 30, null);
        ArrayList arrayList = (ArrayList) CollectionsKt.m32039p0(invoke, invoke2);
        boolean z = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (!RawTypeImpl$render$1.f64635b.m32792a((String) pair.f63055b, (String) pair.f63056c)) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            mo33368x2 = rawTypeImpl$render$3.invoke(mo33368x2, m31989B);
        }
        String invoke3 = rawTypeImpl$render$3.invoke(mo33368x, m31989B);
        return Intrinsics.m32174c(invoke3, mo33368x2) ? invoke3 : descriptorRenderer.mo33365u(invoke3, mo33368x2, TypeUtilsKt.m33748c(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* renamed from: p */
    public MemberScope mo32791p() {
        ClassifierDescriptor mo32449b = mo33515H0().mo32449b();
        if (!(mo32449b instanceof ClassDescriptor)) {
            mo32449b = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b;
        if (classDescriptor != null) {
            MemberScope mo32505a0 = classDescriptor.mo32505a0(RawSubstitution.f64634d);
            Intrinsics.m32175d(mo32505a0, "classDescriptor.getMemberScope(RawSubstitution)");
            return mo32505a0;
        }
        StringBuilder m24u = C0000a.m24u("Incorrect classifier: ");
        m24u.append(mo33515H0().mo32449b());
        throw new IllegalStateException(m24u.toString().toString());
    }
}
