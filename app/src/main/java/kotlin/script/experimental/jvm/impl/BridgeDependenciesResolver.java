package kotlin.script.experimental.jvm.impl;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.script.experimental.dependencies.AsyncDependenciesResolver;

/* compiled from: BridgeDependenciesResolver.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/jvm/impl/BridgeDependenciesResolver;", "Lkotlin/script/experimental/dependencies/AsyncDependenciesResolver;", "kotlin-scripting-jvm"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class BridgeDependenciesResolver implements AsyncDependenciesResolver {

    /* compiled from: BridgeDependenciesResolver.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"<anonymous>", "", "it", "", "Ljava/io/File;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
    /* renamed from: kotlin.script.experimental.jvm.impl.BridgeDependenciesResolver$1 */
    final class C67721 extends Lambda implements Function1<List<? extends File>, Unit> {
        static {
            new C67721();
        }

        public C67721() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(List<? extends File> list) {
            List<? extends File> it = list;
            Intrinsics.m32180i(it, "it");
            return Unit.f63088a;
        }
    }
}
