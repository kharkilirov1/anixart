package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* compiled from: KPropertyImpl.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m31884d2 = {"isJvmStaticProperty", "", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class KPropertyImplKt$computeCallerForAccessor$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: b */
    public final /* synthetic */ KPropertyImpl.Accessor f63605b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPropertyImplKt$computeCallerForAccessor$1(KPropertyImpl.Accessor accessor) {
        super(0);
        this.f63605b = accessor;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final boolean invoke2() {
        return this.f63605b.mo32286t().mo32264o().getAnnotations().mo32592R0(UtilKt.f63641a);
    }
}
