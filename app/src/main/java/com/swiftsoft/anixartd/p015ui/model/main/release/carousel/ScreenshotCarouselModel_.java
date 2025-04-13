package com.swiftsoft.anixartd.p015ui.model.main.release.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ScreenshotCarouselModel_ extends EpoxyModel<ScreenshotCarousel> implements GeneratedModel<ScreenshotCarousel>, ScreenshotCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f30065k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f30066l = -1;

    /* renamed from: m */
    @Nullable
    public Carousel.Padding f30067m = null;

    /* renamed from: n */
    @NonNull
    public List<? extends EpoxyModel<?>> f30068n;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, ScreenshotCarousel screenshotCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f30065k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.ScreenshotCarouselModelBuilder
    /* renamed from: a */
    public ScreenshotCarouselModelBuilder mo16239a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(ScreenshotCarousel screenshotCarousel, EpoxyModel epoxyModel) {
        ScreenshotCarousel screenshotCarousel2 = screenshotCarousel;
        if (!(epoxyModel instanceof ScreenshotCarouselModel_)) {
            mo4496Z1(screenshotCarousel2);
            return;
        }
        ScreenshotCarouselModel_ screenshotCarouselModel_ = (ScreenshotCarouselModel_) epoxyModel;
        if (this.f30065k.get(3)) {
            Objects.requireNonNull(screenshotCarouselModel_);
        } else if (this.f30065k.get(4)) {
            int i2 = this.f30066l;
            if (i2 != screenshotCarouselModel_.f30066l) {
                screenshotCarousel2.setPaddingDp(i2);
            }
        } else if (this.f30065k.get(5)) {
            if (screenshotCarouselModel_.f30065k.get(5)) {
                if ((r0 = this.f30067m) != null) {
                }
            }
            screenshotCarousel2.setPadding(this.f30067m);
        } else if (screenshotCarouselModel_.f30065k.get(3) || screenshotCarouselModel_.f30065k.get(4) || screenshotCarouselModel_.f30065k.get(5)) {
            screenshotCarousel2.setPaddingDp(this.f30066l);
        }
        Objects.requireNonNull(screenshotCarouselModel_);
        if (this.f30065k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                screenshotCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.f30065k.get(2) && (screenshotCarouselModel_.f30065k.get(1) || screenshotCarouselModel_.f30065k.get(2))) {
            screenshotCarousel2.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends EpoxyModel<?>> list = this.f30068n;
        List<? extends EpoxyModel<?>> list2 = screenshotCarouselModel_.f30068n;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        screenshotCarousel2.setModels(this.f30068n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        ScreenshotCarousel screenshotCarousel = new ScreenshotCarousel(viewGroup.getContext());
        screenshotCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return screenshotCarousel;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: e2 */
    public int mo4500e2(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScreenshotCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        ScreenshotCarouselModel_ screenshotCarouselModel_ = (ScreenshotCarouselModel_) obj;
        Objects.requireNonNull(screenshotCarouselModel_);
        if (Float.compare(0.0f, 0.0f) != 0 || this.f30066l != screenshotCarouselModel_.f30066l) {
            return false;
        }
        Carousel.Padding padding = this.f30067m;
        if (padding == null ? screenshotCarouselModel_.f30067m != null : !padding.equals(screenshotCarouselModel_.f30067m)) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.f30068n;
        List<? extends EpoxyModel<?>> list2 = screenshotCarouselModel_.f30068n;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(ScreenshotCarousel screenshotCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<ScreenshotCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f30066l) * 31;
        Carousel.Padding padding = this.f30067m;
        int hashCode2 = (hashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends EpoxyModel<?>> list = this.f30068n;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, ScreenshotCarousel screenshotCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, ScreenshotCarousel screenshotCarousel) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.ScreenshotCarouselModelBuilder
    /* renamed from: q */
    public ScreenshotCarouselModelBuilder mo16240q(@NonNull List list) {
        this.f30065k.set(6);
        m4524l2();
        this.f30068n = list;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.ScreenshotCarouselModelBuilder
    /* renamed from: s */
    public ScreenshotCarouselModelBuilder mo16241s(@Nullable Carousel.Padding padding) {
        this.f30065k.set(5);
        this.f30065k.clear(3);
        this.f30065k.clear(4);
        this.f30066l = -1;
        m4524l2();
        this.f30067m = padding;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(ScreenshotCarousel screenshotCarousel) {
        screenshotCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScreenshotCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f30066l);
        sb.append(", padding_Padding=");
        sb.append(this.f30067m);
        sb.append(", models_List=");
        sb.append(this.f30068n);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(ScreenshotCarousel screenshotCarousel) {
        if (this.f30065k.get(3)) {
            screenshotCarousel.setPaddingRes(0);
        } else if (this.f30065k.get(4)) {
            screenshotCarousel.setPaddingDp(this.f30066l);
        } else if (this.f30065k.get(5)) {
            screenshotCarousel.setPadding(this.f30067m);
        } else {
            screenshotCarousel.setPaddingDp(this.f30066l);
        }
        screenshotCarousel.setHasFixedSize(false);
        if (this.f30065k.get(1)) {
            screenshotCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f30065k.get(2)) {
            screenshotCarousel.setInitialPrefetchItemCount(0);
        } else {
            screenshotCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        screenshotCarousel.setModels(this.f30068n);
    }
}
