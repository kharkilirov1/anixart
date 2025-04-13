package com.airbnb.epoxy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.swiftsoft.anixartd.C2507R;
import java.util.List;

@ModelView
/* loaded from: classes.dex */
public class Carousel extends EpoxyRecyclerView {

    /* renamed from: T0 */
    public static SnapHelperFactory f6872T0 = new SnapHelperFactory() { // from class: com.airbnb.epoxy.Carousel.1
        @Override // com.airbnb.epoxy.Carousel.SnapHelperFactory
        @NonNull
        /* renamed from: a */
        public SnapHelper mo4492a(Context context) {
            return new LinearSnapHelper();
        }
    };

    /* renamed from: U0 */
    @Dimension
    public static int f6873U0 = 8;

    /* renamed from: S0 */
    public float f6874S0;

    public static class Padding {

        /* renamed from: a */
        public final int f6875a;

        /* renamed from: b */
        public final int f6876b;

        /* renamed from: c */
        public final int f6877c;

        /* renamed from: d */
        public final int f6878d;

        /* renamed from: e */
        public final int f6879e;

        /* renamed from: f */
        public final PaddingType f6880f;

        public enum PaddingType {
            PX,
            DP,
            RESOURCE
        }

        public Padding(int i2, int i3, int i4, int i5, int i6, PaddingType paddingType) {
            this.f6875a = i2;
            this.f6876b = i3;
            this.f6877c = i4;
            this.f6878d = i5;
            this.f6879e = i6;
            this.f6880f = paddingType;
        }

        /* renamed from: a */
        public static Padding m4493a(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5, @Dimension int i6) {
            return new Padding(i2, i3, i4, i5, i6, PaddingType.DP);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Padding padding = (Padding) obj;
            return this.f6875a == padding.f6875a && this.f6876b == padding.f6876b && this.f6877c == padding.f6877c && this.f6878d == padding.f6878d && this.f6879e == padding.f6879e;
        }

        public int hashCode() {
            return (((((((this.f6875a * 31) + this.f6876b) * 31) + this.f6877c) * 31) + this.f6878d) * 31) + this.f6879e;
        }
    }

    public static abstract class SnapHelperFactory {
        @NonNull
        /* renamed from: a */
        public abstract SnapHelper mo4492a(Context context);
    }

    public Carousel(Context context) {
        super(context, null, 0, 6);
    }

    public static void setDefaultGlobalSnapHelperFactory(@Nullable SnapHelperFactory snapHelperFactory) {
        f6872T0 = snapHelperFactory;
    }

    public static void setDefaultItemSpacingDp(@Dimension int i2) {
        f6873U0 = i2;
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    /* renamed from: F0 */
    public void mo4490F0() {
        super.mo4490F0();
        int defaultSpacingBetweenItemsDp = getDefaultSpacingBetweenItemsDp();
        if (defaultSpacingBetweenItemsDp >= 0) {
            setItemSpacingDp(defaultSpacingBetweenItemsDp);
            if (getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
                setPaddingDp(defaultSpacingBetweenItemsDp);
            }
        }
        SnapHelperFactory snapHelperFactory = getSnapHelperFactory();
        if (snapHelperFactory != null) {
            snapHelperFactory.mo4492a(getContext()).m3952b(this);
        }
        setRemoveAdapterWhenDetachedFromWindow(false);
    }

    @OnViewRecycled
    /* renamed from: L0 */
    public void m4491L0() {
        EpoxyController epoxyController = this.f6945J0;
        if (epoxyController != null) {
            epoxyController.cancelPendingModelBuild();
        }
        this.f6945J0 = null;
        m4568I0(null, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: b0 */
    public void mo3792b0(View view) {
        int height;
        if (this.f6874S0 > 0.0f) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.setTag(C2507R.id.epoxy_recycler_view_child_initial_size_id, Integer.valueOf(layoutParams.width));
            int i2 = getSpacingDecorator().f6914a;
            int i3 = 0;
            int i4 = i2 > 0 ? (int) (i2 * this.f6874S0) : 0;
            boolean mo3700v = getLayoutManager().mo3700v();
            if (mo3700v) {
                height = (getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : getContext().getResources().getDisplayMetrics().widthPixels) - getPaddingLeft();
                if (getClipToPadding()) {
                    i3 = getPaddingRight();
                }
            } else {
                height = (getHeight() > 0 ? getHeight() : getMeasuredHeight() > 0 ? getMeasuredHeight() : getContext().getResources().getDisplayMetrics().heightPixels) - getPaddingTop();
                if (getClipToPadding()) {
                    i3 = getPaddingBottom();
                }
            }
            int i5 = (int) (((height - i3) - i4) / this.f6874S0);
            if (mo3700v) {
                layoutParams.width = i5;
            } else {
                layoutParams.height = i5;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: c0 */
    public void mo3793c0(View view) {
        Object tag = view.getTag(C2507R.id.epoxy_recycler_view_child_initial_size_id);
        if (tag instanceof Integer) {
            view.getLayoutParams().width = ((Integer) tag).intValue();
            view.setTag(C2507R.id.epoxy_recycler_view_child_initial_size_id, null);
        }
    }

    @Dimension
    public int getDefaultSpacingBetweenItemsDp() {
        return f6873U0;
    }

    public float getNumViewsToShowOnScreen() {
        return this.f6874S0;
    }

    @Nullable
    public SnapHelperFactory getSnapHelperFactory() {
        return f6872T0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @ModelProp
    public void setHasFixedSize(boolean z) {
        super.setHasFixedSize(z);
    }

    @ModelProp
    public void setInitialPrefetchItemCount(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("numItemsToPrefetch must be greater than 0");
        }
        if (i2 == 0) {
            i2 = 2;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).f5411F = i2;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    @ModelProp
    public void setModels(@NonNull List<? extends EpoxyModel<?>> list) {
        super.setModels(list);
    }

    @ModelProp
    public void setNumViewsToShowOnScreen(float f2) {
        this.f6874S0 = f2;
        setInitialPrefetchItemCount((int) Math.ceil(f2));
    }

    @ModelProp
    public void setPadding(@Nullable Padding padding) {
        if (padding == null) {
            setPaddingDp(0);
            return;
        }
        Padding.PaddingType paddingType = padding.f6880f;
        if (paddingType == Padding.PaddingType.PX) {
            setPadding(padding.f6875a, padding.f6876b, padding.f6877c, padding.f6878d);
            setItemSpacingPx(padding.f6879e);
        } else if (paddingType == Padding.PaddingType.DP) {
            setPadding(m4565E0(padding.f6875a), m4565E0(padding.f6876b), m4565E0(padding.f6877c), m4565E0(padding.f6878d));
            setItemSpacingPx(m4565E0(padding.f6879e));
        } else if (paddingType == Padding.PaddingType.RESOURCE) {
            setPadding(m4567H0(padding.f6875a), m4567H0(padding.f6876b), m4567H0(padding.f6877c), m4567H0(padding.f6878d));
            setItemSpacingPx(m4567H0(padding.f6879e));
        }
    }

    @ModelProp
    public void setPaddingDp(@Dimension int i2) {
        if (i2 == -1) {
            i2 = getDefaultSpacingBetweenItemsDp();
        }
        int m4565E0 = m4565E0(i2);
        setPadding(m4565E0, m4565E0, m4565E0, m4565E0);
        setItemSpacingPx(m4565E0);
    }

    @ModelProp
    public void setPaddingRes(@DimenRes int i2) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(i2);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        setItemSpacingPx(dimensionPixelOffset);
    }
}
