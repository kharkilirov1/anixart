package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/sequences/GeneratorSequence;", "", "T", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class GeneratorSequence<T> implements Sequence<T> {

    /* renamed from: a */
    @NotNull
    public final Function0<T> f66697a;

    /* renamed from: b */
    @NotNull
    public final Function1<T, T> f66698b;

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        this.f66697a = function0;
        this.f66698b = function1;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new GeneratorSequence$iterator$1(this);
    }
}
