package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FoldingFeatureObserver.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m31884d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", m32126f = "FoldingFeatureObserver.kt", m32127l = {C4632R.styleable.AppCompatTheme_selectableItemBackground}, m32128m = "invokeSuspend")
/* loaded from: classes.dex */
final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f5973f;

    /* renamed from: g */
    public final /* synthetic */ FoldingFeatureObserver f5974g;

    /* renamed from: h */
    public final /* synthetic */ Activity f5975h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldingFeatureObserver$registerLayoutStateChangeCallback$1(FoldingFeatureObserver foldingFeatureObserver, Activity activity, Continuation<? super FoldingFeatureObserver$registerLayoutStateChangeCallback$1> continuation) {
        super(2, continuation);
        this.f5974g = foldingFeatureObserver;
        this.f5975h = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.f5974g, this.f5975h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.f5974g, this.f5975h, continuation).mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f5973f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            final Flow<WindowLayoutInfo> mo4465a = this.f5974g.f5961a.mo4465a(this.f5975h);
            final FoldingFeatureObserver foldingFeatureObserver = this.f5974g;
            Flow m34210b = FlowKt.m34210b(new Flow<FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                /* compiled from: Collect.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m31884d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, m31885k = 1, m31886mv = {1, 6, 0})
                /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements FlowCollector<WindowLayoutInfo> {

                    /* renamed from: b */
                    public final /* synthetic */ FlowCollector f5968b;

                    /* renamed from: c */
                    public final /* synthetic */ FoldingFeatureObserver f5969c;

                    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
                    @DebugMetadata(m32125c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", m32126f = "FoldingFeatureObserver.kt", m32127l = {138}, m32128m = "emit")
                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: e */
                        public /* synthetic */ Object f5970e;

                        /* renamed from: f */
                        public int f5971f;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        /* renamed from: m */
                        public final Object mo2379m(@NotNull Object obj) {
                            this.f5970e = obj;
                            this.f5971f |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.mo4139f(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, FoldingFeatureObserver foldingFeatureObserver) {
                        this.f5968b = flowCollector;
                        this.f5969c = foldingFeatureObserver;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    /* JADX WARN: Type inference failed for: r2v3 */
                    /* JADX WARN: Type inference failed for: r2v4 */
                    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @org.jetbrains.annotations.Nullable
                    /* renamed from: f */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object mo4139f(androidx.window.layout.WindowLayoutInfo r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof androidx.slidingpanelayout.widget.C0584x48a494f1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (androidx.slidingpanelayout.widget.C0584x48a494f1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.f5971f
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f5971f = r1
                            goto L18
                        L13:
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.f5970e
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.f5971f
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.m31892b(r8)
                            goto L68
                        L27:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L2f:
                            kotlin.ResultKt.m31892b(r8)
                            kotlinx.coroutines.flow.FlowCollector r8 = r6.f5968b
                            androidx.window.layout.WindowLayoutInfo r7 = (androidx.window.layout.WindowLayoutInfo) r7
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver r2 = r6.f5969c
                            java.util.Objects.requireNonNull(r2)
                            java.util.List<androidx.window.layout.DisplayFeature> r7 = r7.f6806a
                            java.util.Iterator r7 = r7.iterator()
                        L41:
                            boolean r2 = r7.hasNext()
                            r4 = 0
                            if (r2 == 0) goto L54
                            java.lang.Object r2 = r7.next()
                            r5 = r2
                            androidx.window.layout.DisplayFeature r5 = (androidx.window.layout.DisplayFeature) r5
                            boolean r5 = r5 instanceof androidx.window.layout.FoldingFeature
                            if (r5 == 0) goto L41
                            goto L55
                        L54:
                            r2 = r4
                        L55:
                            boolean r7 = r2 instanceof androidx.window.layout.FoldingFeature
                            if (r7 == 0) goto L5c
                            r4 = r2
                            androidx.window.layout.FoldingFeature r4 = (androidx.window.layout.FoldingFeature) r4
                        L5c:
                            if (r4 != 0) goto L5f
                            goto L68
                        L5f:
                            r0.f5971f = r3
                            java.lang.Object r7 = r8.mo4139f(r4, r0)
                            if (r7 != r1) goto L68
                            return r1
                        L68:
                            kotlin.Unit r7 = kotlin.Unit.f63088a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.C0584x48a494f1.AnonymousClass2.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                /* renamed from: a */
                public Object mo4140a(@NotNull FlowCollector<? super FoldingFeature> flowCollector, @NotNull Continuation continuation) {
                    Object mo4140a = Flow.this.mo4140a(new AnonymousClass2(flowCollector, foldingFeatureObserver), continuation);
                    return mo4140a == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4140a : Unit.f63088a;
                }
            });
            final FoldingFeatureObserver foldingFeatureObserver2 = this.f5974g;
            FlowCollector<FoldingFeature> flowCollector = new FlowCollector<FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                /* renamed from: f */
                public Object mo4139f(FoldingFeature foldingFeature, @NotNull Continuation<? super Unit> continuation) {
                    Unit unit;
                    FoldingFeature foldingFeature2 = foldingFeature;
                    FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = FoldingFeatureObserver.this.f5964d;
                    if (onFoldingFeatureChangeListener == null) {
                        unit = null;
                    } else {
                        onFoldingFeatureChangeListener.mo4141a(foldingFeature2);
                        unit = Unit.f63088a;
                    }
                    return unit == CoroutineSingletons.COROUTINE_SUSPENDED ? unit : Unit.f63088a;
                }
            };
            this.f5973f = 1;
            if (m34210b.mo4140a(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return Unit.f63088a;
    }
}
