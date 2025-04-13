package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Collection.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m32126f = "Collection.kt", m32127l = {26}, m32128m = "toCollection")
/* loaded from: classes3.dex */
final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67526e;

    /* renamed from: f */
    public /* synthetic */ Object f67527f;

    /* renamed from: g */
    public int f67528g;

    public FlowKt__CollectionKt$toCollection$1(Continuation<? super FlowKt__CollectionKt$toCollection$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__CollectionKt$toCollection$1<T, C> flowKt__CollectionKt$toCollection$1;
        this.f67527f = obj;
        int i2 = this.f67528g | Integer.MIN_VALUE;
        this.f67528g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67528g = i2 - Integer.MIN_VALUE;
            flowKt__CollectionKt$toCollection$1 = this;
        } else {
            flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1<>(this);
        }
        Object obj2 = flowKt__CollectionKt$toCollection$1.f67527f;
        int i3 = flowKt__CollectionKt$toCollection$1.f67528g;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            flowKt__CollectionKt$toCollection$1.f67526e = null;
            flowKt__CollectionKt$toCollection$1.f67528g = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Collection collection = (Collection) flowKt__CollectionKt$toCollection$1.f67526e;
        ResultKt.m31892b(obj2);
        return collection;
    }
}
