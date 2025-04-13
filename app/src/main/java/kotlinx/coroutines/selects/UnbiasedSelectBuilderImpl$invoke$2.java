package kotlinx.coroutines.selects;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: SelectUnbiased.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0000H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "Q", "R", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class UnbiasedSelectBuilderImpl$invoke$2 extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    public final /* synthetic */ SelectClause1<Object> f68390b;

    /* renamed from: c */
    public final /* synthetic */ UnbiasedSelectBuilderImpl<Object> f68391c;

    /* renamed from: d */
    public final /* synthetic */ Function2<Object, Continuation<Object>, Object> f68392d;

    @Override // kotlin.jvm.functions.Function0
    public Unit invoke() {
        SelectClause1<Object> selectClause1 = this.f68390b;
        Objects.requireNonNull(this.f68391c);
        selectClause1.mo34002f(null, this.f68392d);
        return Unit.f63088a;
    }
}
