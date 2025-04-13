package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {

    /* renamed from: b */
    @Nullable
    public S[] f68088b;

    /* renamed from: c */
    public int f68089c;

    /* renamed from: d */
    public int f68090d;

    /* renamed from: e */
    @Nullable
    public SubscriptionCountStateFlow f68091e;

    @NotNull
    /* renamed from: e */
    public final StateFlow<Integer> m34250e() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.f68091e;
            if (subscriptionCountStateFlow == null) {
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(this.f68089c);
                this.f68091e = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }

    @NotNull
    /* renamed from: g */
    public final S m34251g() {
        S s;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                S[] sArr = this.f68088b;
                if (sArr == null) {
                    sArr = mo34229i(2);
                    this.f68088b = sArr;
                } else if (this.f68089c >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.m32178g(copyOf, "copyOf(this, newSize)");
                    this.f68088b = (S[]) ((AbstractSharedFlowSlot[]) copyOf);
                    sArr = (S[]) ((AbstractSharedFlowSlot[]) copyOf);
                }
                int i2 = this.f68090d;
                do {
                    s = sArr[i2];
                    if (s == null) {
                        s = mo34228h();
                        sArr[i2] = s;
                    }
                    i2++;
                    if (i2 >= sArr.length) {
                        i2 = 0;
                    }
                } while (!s.mo34244a(this));
                this.f68090d = i2;
                this.f68089c++;
                subscriptionCountStateFlow = this.f68091e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.m34259B(1);
        }
        return s;
    }

    @NotNull
    /* renamed from: h */
    public abstract S mo34228h();

    @NotNull
    /* renamed from: i */
    public abstract S[] mo34229i(int i2);

    /* renamed from: j */
    public final void m34252j(@NotNull S s) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i2;
        Continuation<Unit>[] mo34245b;
        synchronized (this) {
            int i3 = this.f68089c - 1;
            this.f68089c = i3;
            subscriptionCountStateFlow = this.f68091e;
            i2 = 0;
            if (i3 == 0) {
                this.f68090d = 0;
            }
            mo34245b = s.mo34245b(this);
        }
        int length = mo34245b.length;
        while (i2 < length) {
            Continuation<Unit> continuation = mo34245b[i2];
            i2++;
            if (continuation != null) {
                continuation.mo31877j(Unit.f63088a);
            }
        }
        if (subscriptionCountStateFlow == null) {
            return;
        }
        subscriptionCountStateFlow.m34259B(-1);
    }
}
