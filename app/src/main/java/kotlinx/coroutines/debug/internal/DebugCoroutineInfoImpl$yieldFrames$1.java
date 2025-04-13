package kotlinx.coroutines.debug.internal;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugCoroutineInfoImpl.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", m32126f = "DebugCoroutineInfoImpl.kt", m32127l = {C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m32128m = "yieldFrames")
/* loaded from: classes3.dex */
final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67421e;

    /* renamed from: f */
    public Object f67422f;

    /* renamed from: g */
    public Object f67423g;

    /* renamed from: h */
    public /* synthetic */ Object f67424h;

    /* renamed from: i */
    public final /* synthetic */ DebugCoroutineInfoImpl f67425i;

    /* renamed from: j */
    public int f67426j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, Continuation<? super DebugCoroutineInfoImpl$yieldFrames$1> continuation) {
        super(continuation);
        this.f67425i = debugCoroutineInfoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67424h = obj;
        this.f67426j |= Integer.MIN_VALUE;
        return DebugCoroutineInfoImpl.m34202a(this.f67425i, null, null, this);
    }
}
