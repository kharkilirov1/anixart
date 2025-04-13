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

/* compiled from: Mutex.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.sync.MutexKt", m32126f = "Mutex.kt", m32127l = {C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m32128m = "withLock")
/* loaded from: classes3.dex */
final class MutexKt$withLock$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f68425e;

    /* renamed from: f */
    public Object f68426f;

    /* renamed from: g */
    public Object f68427g;

    /* renamed from: h */
    public /* synthetic */ Object f68428h;

    /* renamed from: i */
    public int f68429i;

    public MutexKt$withLock$1(Continuation<? super MutexKt$withLock$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        MutexKt$withLock$1<T> mutexKt$withLock$1;
        this.f68428h = obj;
        int i2 = this.f68429i | Integer.MIN_VALUE;
        this.f68429i = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f68429i = i2 - Integer.MIN_VALUE;
            mutexKt$withLock$1 = this;
        } else {
            mutexKt$withLock$1 = new MutexKt$withLock$1<>(this);
        }
        Object obj2 = mutexKt$withLock$1.f68428h;
        int i3 = mutexKt$withLock$1.f68429i;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            mutexKt$withLock$1.f68425e = null;
            mutexKt$withLock$1.f68426f = null;
            mutexKt$withLock$1.f68427g = null;
            mutexKt$withLock$1.f68429i = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Function0 function0 = (Function0) mutexKt$withLock$1.f68427g;
        Object obj3 = mutexKt$withLock$1.f68426f;
        Mutex mutex = (Mutex) mutexKt$withLock$1.f68425e;
        ResultKt.m31892b(obj2);
        try {
            return function0.invoke();
        } finally {
            mutex.mo34398a(obj3);
        }
    }
}
