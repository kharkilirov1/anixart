package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.room.util.C0576a;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class CarouselModel_ extends EpoxyModel<Carousel> implements GeneratedModel<Carousel>, CarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f6885k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f6886l = -1;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, Carousel carousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f6885k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(Carousel carousel, EpoxyModel epoxyModel) {
        Carousel carousel2 = carousel;
        if (!(epoxyModel instanceof CarouselModel_)) {
            mo4496Z1(carousel2);
            return;
        }
        CarouselModel_ carouselModel_ = (CarouselModel_) epoxyModel;
        if (this.f6885k.get(3)) {
            Objects.requireNonNull(carouselModel_);
        } else if (this.f6885k.get(4)) {
            int i2 = this.f6886l;
            if (i2 != carouselModel_.f6886l) {
                carousel2.setPaddingDp(i2);
            }
        } else if (this.f6885k.get(5)) {
            if (!carouselModel_.f6885k.get(5)) {
                carousel2.setPadding(null);
            }
        } else if (carouselModel_.f6885k.get(3) || carouselModel_.f6885k.get(4) || carouselModel_.f6885k.get(5)) {
            carousel2.setPaddingDp(this.f6886l);
        }
        Objects.requireNonNull(carouselModel_);
        if (this.f6885k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                carousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else {
            if (this.f6885k.get(2)) {
                return;
            }
            if (carouselModel_.f6885k.get(1) || carouselModel_.f6885k.get(2)) {
                carousel2.setNumViewsToShowOnScreen(0.0f);
            }
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        Carousel carousel = new Carousel(viewGroup.getContext());
        carousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return carousel;
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
        if (!(obj instanceof CarouselModel_) || !super.equals(obj)) {
            return false;
        }
        CarouselModel_ carouselModel_ = (CarouselModel_) obj;
        Objects.requireNonNull(carouselModel_);
        return Float.compare(0.0f, 0.0f) == 0 && this.f6886l == carouselModel_.f6886l;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(Carousel carousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<Carousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return (((((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f6886l) * 31) + 0) * 31) + 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, Carousel carousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, Carousel carousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(Carousel carousel) {
        carousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f6886l);
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
    public void mo4496Z1(Carousel carousel) {
        if (this.f6885k.get(3)) {
            carousel.setPaddingRes(0);
        } else if (this.f6885k.get(4)) {
            carousel.setPaddingDp(this.f6886l);
        } else if (this.f6885k.get(5)) {
            carousel.setPadding(null);
        } else {
            carousel.setPaddingDp(this.f6886l);
        }
        carousel.setHasFixedSize(false);
        if (this.f6885k.get(1)) {
            carousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f6885k.get(2)) {
            carousel.setInitialPrefetchItemCount(0);
        } else {
            carousel.setNumViewsToShowOnScreen(0.0f);
        }
        carousel.setModels(null);
    }
}
