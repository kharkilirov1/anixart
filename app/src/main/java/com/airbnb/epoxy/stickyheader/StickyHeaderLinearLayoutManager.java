package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "HeaderPositionsAdapterDataObserver", "SavedState", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    public BaseEpoxyAdapter f7071H;

    /* renamed from: I */
    public View f7072I;

    /* renamed from: J */
    public int f7073J;

    /* renamed from: K */
    public int f7074K;

    /* compiled from: StickyHeaderLinearLayoutManager.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$HeaderPositionsAdapterDataObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public final class HeaderPositionsAdapterDataObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* compiled from: StickyHeaderLinearLayoutManager.kt */
    @Parcelize
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;", "Landroid/os/Parcelable;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final /* data */ class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();

        /* renamed from: b */
        @Nullable
        public final Parcelable f7075b;

        /* renamed from: c */
        public final int f7076c;

        /* renamed from: d */
        public final int f7077d;

        @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel in) {
                Intrinsics.m32179h(in, "in");
                return new SavedState(in.readParcelable(SavedState.class.getClassLoader()), in.readInt(), in.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(@Nullable Parcelable parcelable, int i2, int i3) {
            this.f7075b = parcelable;
            this.f7076c = i2;
            this.f7077d = i3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return Intrinsics.m32174c(this.f7075b, savedState.f7075b) && this.f7076c == savedState.f7076c && this.f7077d == savedState.f7077d;
        }

        public int hashCode() {
            Parcelable parcelable = this.f7075b;
            return ((((parcelable != null ? parcelable.hashCode() : 0) * 31) + this.f7076c) * 31) + this.f7077d;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("SavedState(superState=");
            m24u.append(this.f7075b);
            m24u.append(", scrollPosition=");
            m24u.append(this.f7076c);
            m24u.append(", scrollOffset=");
            return C0000a.m18o(m24u, this.f7077d, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i2) {
            Intrinsics.m32179h(parcel, "parcel");
            parcel.writeParcelable(this.f7075b, i2);
            parcel.writeInt(this.f7076c);
            parcel.writeInt(this.f7077d);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo3665B(@NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(state, "state");
        return ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                return Integer.valueOf(StickyHeaderLinearLayoutManager.this.m3685i1(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo3596C(@NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(state, "state");
        return ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                return Integer.valueOf(StickyHeaderLinearLayoutManager.this.m3686j1(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo3599D(@NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(state, "state");
        return ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                return Integer.valueOf(StickyHeaderLinearLayoutManager.this.m3687k1(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo3667E(@NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(state, "state");
        return ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollExtent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                return Integer.valueOf(StickyHeaderLinearLayoutManager.this.m3685i1(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo3602F(@NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(state, "state");
        return ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                return Integer.valueOf(StickyHeaderLinearLayoutManager.this.m3686j1(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F0 */
    public void mo3603F0(@NotNull final RecyclerView.Recycler recycler, @NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(recycler, "recycler");
        Intrinsics.m32179h(state, "state");
        m4637S1(new Function0<Unit>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onLayoutChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                super/*androidx.recyclerview.widget.LinearLayoutManager*/.mo3603F0(recycler, state);
                return Unit.f63088a;
            }
        });
        if (!state.f5627g) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo3604G(@NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(state, "state");
        return ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollRange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                return Integer.valueOf(StickyHeaderLinearLayoutManager.this.m3687k1(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H0 */
    public void mo3671H0(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            parcelable = null;
        }
        SavedState savedState = (SavedState) parcelable;
        if (savedState != null) {
            this.f7073J = savedState.f7076c;
            this.f7074K = savedState.f7077d;
            Parcelable parcelable2 = savedState.f7075b;
            if (parcelable2 instanceof LinearLayoutManager.SavedState) {
                LinearLayoutManager.SavedState savedState2 = (LinearLayoutManager.SavedState) parcelable2;
                this.f5408C = savedState2;
                if (this.f5406A != -1) {
                    savedState2.f5442b = -1;
                }
                m3871R0();
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    /* renamed from: I0 */
    public Parcelable mo3673I0() {
        return new SavedState(super.mo3673I0(), this.f7073J, this.f7074K);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: I1 */
    public void mo3674I1(int i2, int i3) {
        this.f7073J = -1;
        this.f7074K = Integer.MIN_VALUE;
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public int mo3611S0(final int i2, @NotNull final RecyclerView.Recycler recycler, @Nullable final RecyclerView.State state) {
        Intrinsics.m32179h(recycler, "recycler");
        int intValue = ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                int mo3611S0;
                mo3611S0 = super/*androidx.recyclerview.widget.LinearLayoutManager*/.mo3611S0(i2, recycler, state);
                return Integer.valueOf(mo3611S0);
            }
        })).intValue();
        if (intValue == 0) {
            return intValue;
        }
        throw null;
    }

    /* renamed from: S1 */
    public final <T> T m4637S1(Function0<? extends T> function0) {
        View view = this.f7072I;
        if (view != null) {
            m3862I(view);
        }
        T invoke = function0.invoke();
        View view2 = this.f7072I;
        if (view2 != null) {
            m3901t(view2, -1);
        }
        return invoke;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: T0 */
    public void mo3680T0(int i2) {
        this.f7073J = -1;
        this.f7074K = Integer.MIN_VALUE;
        throw null;
    }

    /* renamed from: T1 */
    public final void m4638T1(RecyclerView.Adapter<?> adapter) {
        BaseEpoxyAdapter baseEpoxyAdapter = this.f7071H;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.unregisterAdapterDataObserver(null);
        }
        if (!(adapter instanceof BaseEpoxyAdapter)) {
            this.f7071H = null;
            throw null;
        }
        BaseEpoxyAdapter baseEpoxyAdapter2 = (BaseEpoxyAdapter) adapter;
        this.f7071H = baseEpoxyAdapter2;
        if (baseEpoxyAdapter2 == null) {
            throw null;
        }
        baseEpoxyAdapter2.registerAdapterDataObserver(null);
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U0 */
    public int mo3614U0(final int i2, @NotNull final RecyclerView.Recycler recycler, @Nullable final RecyclerView.State state) {
        Intrinsics.m32179h(recycler, "recycler");
        int intValue = ((Number) m4637S1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Integer invoke() {
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
                return Integer.valueOf(stickyHeaderLinearLayoutManager.f5413s == 0 ? 0 : stickyHeaderLinearLayoutManager.m3672H1(i2, recycler, state));
            }
        })).intValue();
        if (intValue == 0) {
            return intValue;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    /* renamed from: e */
    public PointF mo3683e(final int i2) {
        return (PointF) m4637S1(new Function0<PointF>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public PointF invoke() {
                PointF mo3683e;
                mo3683e = super/*androidx.recyclerview.widget.LinearLayoutManager*/.mo3683e(i2);
                return mo3683e;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s0 */
    public void mo3900s0(@Nullable RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.Adapter<?> adapter2) {
        m4638T1(adapter2);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: t0 */
    public void mo3573t0(@NotNull RecyclerView recyclerView) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        m4638T1(recyclerView.getAdapter());
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    /* renamed from: v0 */
    public View mo3623v0(@NotNull final View view, final int i2, @NotNull final RecyclerView.Recycler recycler, @NotNull final RecyclerView.State state) {
        Intrinsics.m32179h(recycler, "recycler");
        Intrinsics.m32179h(state, "state");
        return (View) m4637S1(new Function0<View>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onFocusSearchFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public View invoke() {
                View mo3623v0;
                mo3623v0 = super/*androidx.recyclerview.widget.LinearLayoutManager*/.mo3623v0(view, i2, recycler, state);
                return mo3623v0;
            }
        });
    }
}
