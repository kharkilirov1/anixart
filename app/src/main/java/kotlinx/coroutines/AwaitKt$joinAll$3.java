package kotlinx.coroutines;

import com.yandex.mobile.ads.C4632R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Await.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.AwaitKt", m32126f = "Await.kt", m32127l = {C4632R.styleable.AppCompatTheme_dropDownListViewStyle}, m32128m = "joinAll")
/* loaded from: classes3.dex */
final class AwaitKt$joinAll$3 extends ContinuationImpl {

    /* renamed from: e */
    public Object f66936e;

    /* renamed from: f */
    public /* synthetic */ Object f66937f;

    /* renamed from: g */
    public int f66938g;

    public AwaitKt$joinAll$3(Continuation<? super AwaitKt$joinAll$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        this.f66937f = obj;
        int i2 = this.f66938g | Integer.MIN_VALUE;
        this.f66938g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f66938g = i2 - Integer.MIN_VALUE;
            awaitKt$joinAll$3 = this;
        } else {
            awaitKt$joinAll$3 = new AwaitKt$joinAll$3(this);
        }
        Object obj2 = awaitKt$joinAll$3.f66937f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = awaitKt$joinAll$3.f66938g;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = (Iterator) awaitKt$joinAll$3.f66936e;
        ResultKt.m31892b(obj2);
        while (it.hasNext()) {
            Job job = (Job) it.next();
            awaitKt$joinAll$3.f66936e = it;
            awaitKt$joinAll$3.f66938g = 1;
            if (job.mo34062k(awaitKt$joinAll$3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f63088a;
    }
}
