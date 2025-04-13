package com.swiftsoft.anixartd.p015ui.model.main.discover.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.room.util.C0576a;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public class InterestingCarouselModel_ extends EpoxyModel<InterestingCarousel> implements GeneratedModel<InterestingCarousel>, InterestingCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f29658k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f29659l = -1;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, InterestingCarousel interestingCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f29658k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(InterestingCarousel interestingCarousel, EpoxyModel epoxyModel) {
        InterestingCarousel interestingCarousel2 = interestingCarousel;
        if (!(epoxyModel instanceof InterestingCarouselModel_)) {
            mo4496Z1(interestingCarousel2);
            return;
        }
        InterestingCarouselModel_ interestingCarouselModel_ = (InterestingCarouselModel_) epoxyModel;
        if (this.f29658k.get(3)) {
            Objects.requireNonNull(interestingCarouselModel_);
        } else if (this.f29658k.get(4)) {
            int i2 = this.f29659l;
            if (i2 != interestingCarouselModel_.f29659l) {
                interestingCarousel2.setPaddingDp(i2);
            }
        } else if (this.f29658k.get(5)) {
            if (!interestingCarouselModel_.f29658k.get(5)) {
                interestingCarousel2.setPadding(null);
            }
        } else if (interestingCarouselModel_.f29658k.get(3) || interestingCarouselModel_.f29658k.get(4) || interestingCarouselModel_.f29658k.get(5)) {
            interestingCarousel2.setPaddingDp(this.f29659l);
        }
        Objects.requireNonNull(interestingCarouselModel_);
        if (this.f29658k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                interestingCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else {
            if (this.f29658k.get(2)) {
                return;
            }
            if (interestingCarouselModel_.f29658k.get(1) || interestingCarouselModel_.f29658k.get(2)) {
                interestingCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        InterestingCarousel interestingCarousel = new InterestingCarousel(viewGroup.getContext());
        interestingCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return interestingCarousel;
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
        if (!(obj instanceof InterestingCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        InterestingCarouselModel_ interestingCarouselModel_ = (InterestingCarouselModel_) obj;
        Objects.requireNonNull(interestingCarouselModel_);
        return Float.compare(0.0f, 0.0f) == 0 && this.f29659l == interestingCarouselModel_.f29659l;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(InterestingCarousel interestingCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<InterestingCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return (((((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f29659l) * 31) + 0) * 31) + 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, InterestingCarousel interestingCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, InterestingCarousel interestingCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(InterestingCarousel interestingCarousel) {
        interestingCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InterestingCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f29659l);
        sb.append(", padding_Padding=");
        sb.append((Object) null);
        sb.append(", models_List=");
        sb.append((Object) null);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(InterestingCarousel interestingCarousel) {
        if (this.f29658k.get(3)) {
            interestingCarousel.setPaddingRes(0);
        } else if (this.f29658k.get(4)) {
            interestingCarousel.setPaddingDp(this.f29659l);
        } else if (this.f29658k.get(5)) {
            interestingCarousel.setPadding(null);
        } else {
            interestingCarousel.setPaddingDp(this.f29659l);
        }
        interestingCarousel.setHasFixedSize(false);
        if (this.f29658k.get(1)) {
            interestingCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f29658k.get(2)) {
            interestingCarousel.setInitialPrefetchItemCount(0);
        } else {
            interestingCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        interestingCarousel.setModels(null);
    }
}
