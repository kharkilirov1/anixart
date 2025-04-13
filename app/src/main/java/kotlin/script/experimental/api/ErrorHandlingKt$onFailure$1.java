package kotlin.script.experimental.api;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: errorHandling.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032(\u0010\u0004\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00030\u0006H\u0086@ø\u0001\u0000"}, m31884d2 = {"onFailure", "", "R", "Lkotlin/script/experimental/api/ResultWithDiagnostics;", "body", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "continuation"}, m31885k = 3, m31886mv = {1, 1, 13})
@DebugMetadata(m32125c = "kotlin/script/experimental/api/ErrorHandlingKt", m32126f = "errorHandling.kt", m32127l = {C4632R.styleable.AppCompatTheme_listChoiceBackgroundIndicator, C4632R.styleable.AppCompatTheme_listMenuViewStyle}, m32128m = "onFailure")
/* loaded from: classes3.dex */
final class ErrorHandlingKt$onFailure$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f66581e;

    /* renamed from: f */
    public int f66582f;

    /* renamed from: g */
    public Object f66583g;

    /* renamed from: h */
    public Object f66584h;

    public ErrorHandlingKt$onFailure$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ErrorHandlingKt$onFailure$1 errorHandlingKt$onFailure$1;
        this.f66581e = obj;
        int i2 = this.f66582f | Integer.MIN_VALUE;
        this.f66582f = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f66582f = i2 - Integer.MIN_VALUE;
            errorHandlingKt$onFailure$1 = this;
        } else {
            errorHandlingKt$onFailure$1 = new ErrorHandlingKt$onFailure$1(this);
        }
        Object obj2 = errorHandlingKt$onFailure$1.f66581e;
        int i3 = errorHandlingKt$onFailure$1.f66582f;
        if (i3 == 0) {
            if (obj2 instanceof Result.Failure) {
                throw ((Result.Failure) obj2).f63061b;
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultWithDiagnostics resultWithDiagnostics = (ResultWithDiagnostics) errorHandlingKt$onFailure$1.f66583g;
        if (obj2 instanceof Result.Failure) {
            throw ((Result.Failure) obj2).f63061b;
        }
        return resultWithDiagnostics;
    }
}
