package kotlinx.coroutines.sync;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Semaphore.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.sync.SemaphoreKt", m32126f = "Semaphore.kt", m32127l = {C4632R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m32128m = "withPermit")
/* loaded from: classes3.dex */
final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f68444e;

    /* renamed from: f */
    public Object f68445f;

    /* renamed from: g */
    public /* synthetic */ Object f68446g;

    /* renamed from: h */
    public int f68447h;

    public SemaphoreKt$withPermit$1(Continuation<? super SemaphoreKt$withPermit$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        SemaphoreKt$withPermit$1<T> semaphoreKt$withPermit$1;
        this.f68446g = obj;
        int i2 = this.f68447h | Integer.MIN_VALUE;
        this.f68447h = i2;
        int i3 = SemaphoreKt.f68438a;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f68447h = i2 - Integer.MIN_VALUE;
            semaphoreKt$withPermit$1 = this;
        } else {
            semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1<>(this);
        }
        Object obj2 = semaphoreKt$withPermit$1.f68446g;
        int i4 = semaphoreKt$withPermit$1.f68447h;
        if (i4 == 0) {
            ResultKt.m31892b(obj2);
            semaphoreKt$withPermit$1.f68444e = null;
            semaphoreKt$withPermit$1.f68445f = null;
            semaphoreKt$withPermit$1.f68447h = 1;
            throw null;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Function0 function0 = (Function0) semaphoreKt$withPermit$1.f68445f;
        Semaphore semaphore = (Semaphore) semaphoreKt$withPermit$1.f68444e;
        ResultKt.m31892b(obj2);
        try {
            return function0.invoke();
        } finally {
            semaphore.release();
        }
    }
}
