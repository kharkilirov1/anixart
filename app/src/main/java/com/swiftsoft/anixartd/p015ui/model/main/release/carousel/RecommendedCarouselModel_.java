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
public class RecommendedCarouselModel_ extends EpoxyModel<RecommendedCarousel> implements GeneratedModel<RecommendedCarousel>, RecommendedCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f30061k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f30062l = -1;

    /* renamed from: m */
    @Nullable
    public Carousel.Padding f30063m = null;

    /* renamed from: n */
    @NonNull
    public List<? extends EpoxyModel<?>> f30064n;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, RecommendedCarousel recommendedCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f30061k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.RecommendedCarouselModelBuilder
    /* renamed from: a */
    public RecommendedCarouselModelBuilder mo16235a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(RecommendedCarousel recommendedCarousel, EpoxyModel epoxyModel) {
        RecommendedCarousel recommendedCarousel2 = recommendedCarousel;
        if (!(epoxyModel instanceof RecommendedCarouselModel_)) {
            mo4496Z1(recommendedCarousel2);
            return;
        }
        RecommendedCarouselModel_ recommendedCarouselModel_ = (RecommendedCarouselModel_) epoxyModel;
        if (this.f30061k.get(3)) {
            Objects.requireNonNull(recommendedCarouselModel_);
        } else if (this.f30061k.get(4)) {
            int i2 = this.f30062l;
            if (i2 != recommendedCarouselModel_.f30062l) {
                recommendedCarousel2.setPaddingDp(i2);
            }
        } else if (this.f30061k.get(5)) {
            if (recommendedCarouselModel_.f30061k.get(5)) {
                if ((r0 = this.f30063m) != null) {
                }
            }
            recommendedCarousel2.setPadding(this.f30063m);
        } else if (recommendedCarouselModel_.f30061k.get(3) || recommendedCarouselModel_.f30061k.get(4) || recommendedCarouselModel_.f30061k.get(5)) {
            recommendedCarousel2.setPaddingDp(this.f30062l);
        }
        Objects.requireNonNull(recommendedCarouselModel_);
        if (this.f30061k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                recommendedCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.f30061k.get(2) && (recommendedCarouselModel_.f30061k.get(1) || recommendedCarouselModel_.f30061k.get(2))) {
            recommendedCarousel2.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends EpoxyModel<?>> list = this.f30064n;
        List<? extends EpoxyModel<?>> list2 = recommendedCarouselModel_.f30064n;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        recommendedCarousel2.setModels(this.f30064n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        RecommendedCarousel recommendedCarousel = new RecommendedCarousel(viewGroup.getContext());
        recommendedCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return recommendedCarousel;
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
        if (!(obj instanceof RecommendedCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        RecommendedCarouselModel_ recommendedCarouselModel_ = (RecommendedCarouselModel_) obj;
        Objects.requireNonNull(recommendedCarouselModel_);
        if (Float.compare(0.0f, 0.0f) != 0 || this.f30062l != recommendedCarouselModel_.f30062l) {
            return false;
        }
        Carousel.Padding padding = this.f30063m;
        if (padding == null ? recommendedCarouselModel_.f30063m != null : !padding.equals(recommendedCarouselModel_.f30063m)) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.f30064n;
        List<? extends EpoxyModel<?>> list2 = recommendedCarouselModel_.f30064n;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(RecommendedCarousel recommendedCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<RecommendedCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f30062l) * 31;
        Carousel.Padding padding = this.f30063m;
        int hashCode2 = (hashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends EpoxyModel<?>> list = this.f30064n;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, RecommendedCarousel recommendedCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, RecommendedCarousel recommendedCarousel) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.RecommendedCarouselModelBuilder
    /* renamed from: q */
    public RecommendedCarouselModelBuilder mo16236q(@NonNull List list) {
        this.f30061k.set(6);
        m4524l2();
        this.f30064n = list;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.RecommendedCarouselModelBuilder
    /* renamed from: s */
    public RecommendedCarouselModelBuilder mo16237s(@Nullable Carousel.Padding padding) {
        this.f30061k.set(5);
        this.f30061k.clear(3);
        this.f30061k.clear(4);
        this.f30062l = -1;
        m4524l2();
        this.f30063m = padding;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(RecommendedCarousel recommendedCarousel) {
        recommendedCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecommendedCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f30062l);
        sb.append(", padding_Padding=");
        sb.append(this.f30063m);
        sb.append(", models_List=");
        sb.append(this.f30064n);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(RecommendedCarousel recommendedCarousel) {
        if (this.f30061k.get(3)) {
            recommendedCarousel.setPaddingRes(0);
        } else if (this.f30061k.get(4)) {
            recommendedCarousel.setPaddingDp(this.f30062l);
        } else if (this.f30061k.get(5)) {
            recommendedCarousel.setPadding(this.f30063m);
        } else {
            recommendedCarousel.setPaddingDp(this.f30062l);
        }
        recommendedCarousel.setHasFixedSize(false);
        if (this.f30061k.get(1)) {
            recommendedCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f30061k.get(2)) {
            recommendedCarousel.setInitialPrefetchItemCount(0);
        } else {
            recommendedCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        recommendedCarousel.setModels(this.f30064n);
    }
}
