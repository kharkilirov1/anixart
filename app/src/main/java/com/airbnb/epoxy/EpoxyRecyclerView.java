package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.Px;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.preload.EpoxyPreloader;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.ViewMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpoxyRecyclerView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0005()*+,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\bJ\u0012\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\bH\u0016J\u001a\u0010\u001a\u001a\u00020\u00062\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u0017H\u0016J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010!\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001fH\u0016R\u001a\u0010'\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006-"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "getContextForSharedViewPool", "", "removeAdapterWhenDetachedFromWindow", "", "setRemoveAdapterWhenDetachedFromWindow", "", "delayMsWhenRemovingAdapterOnDetach", "setDelayMsWhenRemovingAdapterOnDetach", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layout", "setLayoutManager", "itemSpacingRes", "setItemSpacingRes", "dp", "setItemSpacingDp", "spacingPx", "setItemSpacingPx", "", "Lcom/airbnb/epoxy/EpoxyModel;", "models", "setModels", "Lcom/airbnb/epoxy/EpoxyController;", "controller", "setController", "setControllerAndBuildModels", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "setAdapter", "Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "I0", "Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "getSpacingDecorator", "()Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "spacingDecorator", "Companion", "ModelBuilderCallback", "ModelBuilderCallbackController", "PreloadConfig", "WithModelsController", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public class EpoxyRecyclerView extends RecyclerView {

    /* renamed from: R0 */
    public static final ActivityRecyclerPool f6943R0 = new ActivityRecyclerPool();

    /* renamed from: I0, reason: from kotlin metadata */
    @NotNull
    public final EpoxyItemSpacingDecorator spacingDecorator;

    /* renamed from: J0 */
    public EpoxyController f6945J0;

    /* renamed from: K0 */
    public RecyclerView.Adapter<?> f6946K0;

    /* renamed from: L0 */
    public boolean f6947L0;

    /* renamed from: M0 */
    public int f6948M0;

    /* renamed from: N0 */
    public boolean f6949N0;

    /* renamed from: O0 */
    public final Runnable f6950O0;

    /* renamed from: P0 */
    public final List<EpoxyPreloader<?>> f6951P0;

    /* renamed from: Q0 */
    public final List<PreloadConfig<?, ?, ?>> f6952Q0;

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$Companion;", "", "Lcom/airbnb/epoxy/ActivityRecyclerPool;", "ACTIVITY_RECYCLER_POOL", "Lcom/airbnb/epoxy/ActivityRecyclerPool;", "", "DEFAULT_ADAPTER_REMOVAL_DELAY_MS", "I", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class Companion {
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public interface ModelBuilderCallback {
        /* renamed from: a */
        void mo4571a(@NotNull EpoxyController epoxyController);
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Lcom/airbnb/epoxy/EpoxyController;", "()V", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;)V", "buildModels", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class ModelBuilderCallbackController extends EpoxyController {

        @NotNull
        private ModelBuilderCallback callback = new ModelBuilderCallback() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$ModelBuilderCallbackController$callback$1
            @Override // com.airbnb.epoxy.EpoxyRecyclerView.ModelBuilderCallback
            /* renamed from: a */
            public void mo4571a(@NotNull EpoxyController epoxyController) {
            }
        };

        @Override // com.airbnb.epoxy.EpoxyController
        public void buildModels() {
            this.callback.mo4571a(this);
        }

        @NotNull
        public final ModelBuilderCallback getCallback() {
            return this.callback;
        }

        public final void setCallback(@NotNull ModelBuilderCallback modelBuilderCallback) {
            Intrinsics.m32179h(modelBuilderCallback, "<set-?>");
            this.callback = modelBuilderCallback;
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007¨\u0006\b"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$PreloadConfig;", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class PreloadConfig<T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> {
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0014R+\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Lcom/airbnb/epoxy/EpoxyController;", "()V", "callback", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "buildModels", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class WithModelsController extends EpoxyController {

        @NotNull
        private Function1<? super EpoxyController, Unit> callback = new Function1<EpoxyController, Unit>() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$callback$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(EpoxyController epoxyController) {
                EpoxyController receiver = epoxyController;
                Intrinsics.m32179h(receiver, "$receiver");
                return Unit.f63088a;
            }
        };

        @Override // com.airbnb.epoxy.EpoxyController
        public void buildModels() {
            this.callback.invoke(this);
        }

        @NotNull
        public final Function1<EpoxyController, Unit> getCallback() {
            return this.callback;
        }

        public final void setCallback(@NotNull Function1<? super EpoxyController, Unit> function1) {
            Intrinsics.m32179h(function1, "<set-?>");
            this.callback = function1;
        }
    }

    @JvmOverloads
    public EpoxyRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EpoxyRecyclerView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.m32179h(r2, r5)
            r1.<init>(r2, r3, r4)
            com.airbnb.epoxy.EpoxyItemSpacingDecorator r5 = new com.airbnb.epoxy.EpoxyItemSpacingDecorator
            r5.<init>()
            r1.spacingDecorator = r5
            r5 = 1
            r1.f6947L0 = r5
            r5 = 2000(0x7d0, float:2.803E-42)
            r1.f6948M0 = r5
            com.airbnb.epoxy.EpoxyRecyclerView$removeAdapterRunnable$1 r5 = new com.airbnb.epoxy.EpoxyRecyclerView$removeAdapterRunnable$1
            r5.<init>()
            r1.f6950O0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.f6951P0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.f6952Q0 = r5
            if (r3 == 0) goto L4d
            int[] r5 = com.airbnb.viewmodeladapter.C0774R.styleable.f7876a
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r5, r4, r0)
            java.lang.String r3 = "context.obtainStyledAttr…tyleAttr, 0\n            )"
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r3)
            int r3 = r2.getDimensionPixelSize(r0, r0)
            r1.setItemSpacingPx(r3)
            r2.recycle()
        L4d:
            r1.mo4490F0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyRecyclerView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private final Context getContextForSharedViewPool() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return context;
            }
        }
        Context context2 = getContext();
        Intrinsics.m32178g(context2, "this.context");
        return context2;
    }

    /* renamed from: C0 */
    public final void m4563C0() {
        this.f6946K0 = null;
        if (this.f6949N0) {
            removeCallbacks(this.f6950O0);
            this.f6949N0 = false;
        }
    }

    @NotNull
    /* renamed from: D0 */
    public RecyclerView.LayoutManager mo4564D0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i2 = layoutParams.height;
        if (i2 != -1 && i2 != 0) {
            getContext();
            return new LinearLayoutManager(0, false);
        }
        int i3 = layoutParams.width;
        if (i3 == -1 || i3 == 0) {
            setHasFixedSize(true);
        }
        return new LinearLayoutManager(getContext());
    }

    @Px
    /* renamed from: E0 */
    public final int m4565E0(@Dimension int i2) {
        Resources resources = getResources();
        Intrinsics.m32178g(resources, "resources");
        return (int) TypedValue.applyDimension(1, i2, resources.getDisplayMetrics());
    }

    @CallSuper
    /* renamed from: F0 */
    public void mo4490F0() {
        setClipToPadding(false);
        ActivityRecyclerPool activityRecyclerPool = f6943R0;
        Context context = getContextForSharedViewPool();
        Function0<RecyclerView.RecycledViewPool> function0 = new Function0<RecyclerView.RecycledViewPool>() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$initViewPool$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public RecyclerView.RecycledViewPool invoke() {
                Objects.requireNonNull(EpoxyRecyclerView.this);
                return new UnboundedViewPool();
            }
        };
        Objects.requireNonNull(activityRecyclerPool);
        Intrinsics.m32179h(context, "context");
        Iterator<PoolReference> it = activityRecyclerPool.f6842a.iterator();
        Intrinsics.m32178g(it, "pools.iterator()");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            Intrinsics.m32178g(next, "iterator.next()");
            PoolReference poolReference2 = next;
            if (poolReference2.m4622h() == context) {
                if (poolReference != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                poolReference = poolReference2;
            } else if (ActivityRecyclerPoolKt.m4474a(poolReference2.m4622h())) {
                poolReference2.f7038c.mo3915a();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, (RecyclerView.RecycledViewPool) function0.invoke(), activityRecyclerPool);
            Lifecycle m4473a = activityRecyclerPool.m4473a(context);
            if (m4473a != null) {
                m4473a.mo3187a(poolReference);
            }
            activityRecyclerPool.f6842a.add(poolReference);
        }
        setRecycledViewPool(poolReference.f7038c);
    }

    /* renamed from: G0 */
    public final void m4566G0() {
        RecyclerView.Adapter<?> adapter = getAdapter();
        if (adapter != null) {
            m4568I0(null, true);
            this.f6946K0 = adapter;
        }
        if (ActivityRecyclerPoolKt.m4474a(getContext())) {
            getRecycledViewPool().mo3915a();
        }
    }

    @Px
    /* renamed from: H0 */
    public final int m4567H0(@DimenRes int i2) {
        return getResources().getDimensionPixelOffset(i2);
    }

    /* renamed from: I0 */
    public void m4568I0(@Nullable RecyclerView.Adapter<?> adapter, boolean z) {
        setLayoutFrozen(false);
        m3820t0(adapter, true, z);
        m3799i0(true);
        requestLayout();
        m4563C0();
        m4570K0();
    }

    /* renamed from: J0 */
    public final void m4569J0() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        EpoxyController epoxyController = this.f6945J0;
        if (!(layoutManager instanceof GridLayoutManager) || epoxyController == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (epoxyController.getSpanCount() == gridLayoutManager.f5327I && gridLayoutManager.f5332N == epoxyController.getSpanSizeLookup()) {
            return;
        }
        epoxyController.setSpanCount(gridLayoutManager.f5327I);
        gridLayoutManager.f5332N = epoxyController.getSpanSizeLookup();
    }

    /* renamed from: K0 */
    public final void m4570K0() {
        Iterator<T> it = this.f6951P0.iterator();
        while (it.hasNext()) {
            m3809n0((EpoxyPreloader) it.next());
        }
        this.f6951P0.clear();
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            Iterator<T> it2 = this.f6952Q0.iterator();
            while (it2.hasNext()) {
                PreloadConfig preloadConfig = (PreloadConfig) it2.next();
                if (adapter instanceof EpoxyAdapter) {
                    Objects.requireNonNull(preloadConfig);
                    CollectionsKt.m31993F(null);
                    Intrinsics.m32179h(null, "requestHolderFactory");
                    throw null;
                }
                if (this.f6945J0 != null) {
                    Objects.requireNonNull(preloadConfig);
                    CollectionsKt.m31993F(null);
                    Intrinsics.m32179h(null, "requestHolderFactory");
                    throw null;
                }
            }
        }
    }

    @NotNull
    public final EpoxyItemSpacingDecorator getSpacingDecorator() {
        return this.spacingDecorator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.Adapter<?> adapter = this.f6946K0;
        if (adapter != null) {
            m4568I0(adapter, false);
        }
        m4563C0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.f6951P0.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((EpoxyPreloader) it.next()).f7058e.f7062a.iterator();
            while (it2.hasNext()) {
                ((PreloadRequestHolder) it2.next()).clear();
            }
        }
        if (this.f6947L0) {
            int i2 = this.f6948M0;
            if (i2 > 0) {
                this.f6949N0 = true;
                postDelayed(this.f6950O0, i2);
            } else {
                m4566G0();
            }
        }
        if (ActivityRecyclerPoolKt.m4474a(getContext())) {
            getRecycledViewPool().mo3915a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        m4569J0();
        super.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        m4563C0();
        m4570K0();
    }

    public final void setController(@NotNull EpoxyController controller) {
        Intrinsics.m32179h(controller, "controller");
        this.f6945J0 = controller;
        setAdapter(controller.getAdapter());
        m4569J0();
    }

    public final void setControllerAndBuildModels(@NotNull EpoxyController controller) {
        Intrinsics.m32179h(controller, "controller");
        controller.requestModelBuild();
        setController(controller);
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int delayMsWhenRemovingAdapterOnDetach) {
        this.f6948M0 = delayMsWhenRemovingAdapterOnDetach;
    }

    public final void setItemSpacingDp(@Dimension int dp) {
        setItemSpacingPx(m4565E0(dp));
    }

    public void setItemSpacingPx(@Px int spacingPx) {
        m3805l0(this.spacingDecorator);
        EpoxyItemSpacingDecorator epoxyItemSpacingDecorator = this.spacingDecorator;
        epoxyItemSpacingDecorator.f6914a = spacingPx;
        if (spacingPx > 0) {
            mo3802k(epoxyItemSpacingDecorator);
        }
    }

    public final void setItemSpacingRes(@DimenRes int itemSpacingRes) {
        setItemSpacingPx(getResources().getDimensionPixelOffset(itemSpacingRes));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(@Nullable RecyclerView.LayoutManager layout) {
        super.setLayoutManager(layout);
        m4569J0();
    }

    @Override // android.view.View
    public void setLayoutParams(@NotNull ViewGroup.LayoutParams params) {
        Intrinsics.m32179h(params, "params");
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(params);
        if (z && getLayoutManager() == null) {
            setLayoutManager(mo4564D0());
        }
    }

    public void setModels(@NotNull List<? extends EpoxyModel<?>> models) {
        Intrinsics.m32179h(models, "models");
        EpoxyController epoxyController = this.f6945J0;
        if (!(epoxyController instanceof SimpleEpoxyController)) {
            epoxyController = null;
        }
        SimpleEpoxyController simpleEpoxyController = (SimpleEpoxyController) epoxyController;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(models);
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean removeAdapterWhenDetachedFromWindow) {
        this.f6947L0 = removeAdapterWhenDetachedFromWindow;
    }
}
