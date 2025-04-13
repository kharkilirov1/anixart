package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Timeout.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.TimeoutKt", m32126f = "Timeout.kt", m32127l = {100}, m32128m = "withTimeoutOrNull")
/* loaded from: classes3.dex */
final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67061e;

    /* renamed from: f */
    public Object f67062f;

    /* renamed from: g */
    public /* synthetic */ Object f67063g;

    /* renamed from: h */
    public int f67064h;

    public TimeoutKt$withTimeoutOrNull$1(Continuation<? super TimeoutKt$withTimeoutOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        TimeoutKt$withTimeoutOrNull$1<T> timeoutKt$withTimeoutOrNull$1;
        this.f67063g = obj;
        int i2 = this.f67064h | Integer.MIN_VALUE;
        this.f67064h = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67064h = i2 - Integer.MIN_VALUE;
            timeoutKt$withTimeoutOrNull$1 = this;
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1<>(this);
        }
        Object obj2 = timeoutKt$withTimeoutOrNull$1.f67063g;
        int i3 = timeoutKt$withTimeoutOrNull$1.f67064h;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef objectRef = (Ref.ObjectRef) timeoutKt$withTimeoutOrNull$1.f67062f;
            try {
                ResultKt.m31892b(obj2);
                return obj2;
            } catch (TimeoutCancellationException e2) {
                if (e2.f67059b != objectRef.f63351b) {
                    throw e2;
                }
            }
        }
        return null;
    }
}
