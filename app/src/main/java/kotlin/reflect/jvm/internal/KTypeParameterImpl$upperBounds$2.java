package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p000a.C0000a;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class KTypeParameterImpl$upperBounds$2 extends Lambda implements Function0<List<? extends KTypeImpl>> {

    /* renamed from: b */
    public final /* synthetic */ KTypeParameterImpl f63627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.f63627b = kTypeParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public List<? extends KTypeImpl> invoke() {
        List<KotlinType> upperBounds = this.f63627b.f63625c.getUpperBounds();
        Intrinsics.m32175d(upperBounds, "descriptor.upperBounds");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(upperBounds, 10));
        for (KotlinType kotlinType : upperBounds) {
            Intrinsics.m32175d(kotlinType, "kotlinType");
            arrayList.add(new KTypeImpl(kotlinType, new Function0() { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    StringBuilder m24u = C0000a.m24u("Java type is not yet supported for type parameters: ");
                    m24u.append(KTypeParameterImpl$upperBounds$2.this.f63627b.f63625c);
                    throw new NotImplementedError(C0000a.m14k("An operation is not implemented: ", m24u.toString()));
                }
            }));
        }
        return arrayList;
    }
}
