package kotlin.sequences;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: _Sequences.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class SequencesKt___SequencesKt$minus$4$iterator$1 extends Lambda implements Function1<Object, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ Collection<Object> f66744b;

    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(Object obj) {
        return Boolean.valueOf(this.f66744b.contains(obj));
    }
}
