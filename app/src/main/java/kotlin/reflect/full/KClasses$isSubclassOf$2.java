package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* compiled from: KClasses.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KClass;", "kotlin.jvm.PlatformType", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class KClasses$isSubclassOf$2 extends Lambda implements Function1<KClass<?>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(KClass<?> kClass) {
        return Boolean.valueOf(Intrinsics.m32174c(kClass, null));
    }
}
