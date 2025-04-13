package com.swiftsoft.anixartd.p015ui.model.main.profile.friends.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class RecommendationCarouselModel_ extends EpoxyModel<RecommendationCarousel> implements GeneratedModel<RecommendationCarousel>, RecommendationCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f29936k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f29937l = -1;

    /* renamed from: m */
    @NonNull
    public List<? extends EpoxyModel<?>> f29938m;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, RecommendationCarousel recommendationCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f29936k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(RecommendationCarousel recommendationCarousel, EpoxyModel epoxyModel) {
        RecommendationCarousel recommendationCarousel2 = recommendationCarousel;
        if (!(epoxyModel instanceof RecommendationCarouselModel_)) {
            mo4496Z1(recommendationCarousel2);
            return;
        }
        RecommendationCarouselModel_ recommendationCarouselModel_ = (RecommendationCarouselModel_) epoxyModel;
        if (this.f29936k.get(3)) {
            Objects.requireNonNull(recommendationCarouselModel_);
        } else if (this.f29936k.get(4)) {
            int i2 = this.f29937l;
            if (i2 != recommendationCarouselModel_.f29937l) {
                recommendationCarousel2.setPaddingDp(i2);
            }
        } else if (this.f29936k.get(5)) {
            if (!recommendationCarouselModel_.f29936k.get(5)) {
                recommendationCarousel2.setPadding(null);
            }
        } else if (recommendationCarouselModel_.f29936k.get(3) || recommendationCarouselModel_.f29936k.get(4) || recommendationCarouselModel_.f29936k.get(5)) {
            recommendationCarousel2.setPaddingDp(this.f29937l);
        }
        Objects.requireNonNull(recommendationCarouselModel_);
        if (this.f29936k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                recommendationCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.f29936k.get(2) && (recommendationCarouselModel_.f29936k.get(1) || recommendationCarouselModel_.f29936k.get(2))) {
            recommendationCarousel2.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends EpoxyModel<?>> list = this.f29938m;
        List<? extends EpoxyModel<?>> list2 = recommendationCarouselModel_.f29938m;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        recommendationCarousel2.setModels(this.f29938m);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        RecommendationCarousel recommendationCarousel = new RecommendationCarousel(viewGroup.getContext());
        recommendationCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return recommendationCarousel;
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
        if (!(obj instanceof RecommendationCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        RecommendationCarouselModel_ recommendationCarouselModel_ = (RecommendationCarouselModel_) obj;
        Objects.requireNonNull(recommendationCarouselModel_);
        if (Float.compare(0.0f, 0.0f) != 0 || this.f29937l != recommendationCarouselModel_.f29937l) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.f29938m;
        List<? extends EpoxyModel<?>> list2 = recommendationCarouselModel_.f29938m;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(RecommendationCarousel recommendationCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<RecommendationCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f29937l) * 31) + 0) * 31;
        List<? extends EpoxyModel<?>> list = this.f29938m;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, RecommendationCarousel recommendationCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, RecommendationCarousel recommendationCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(RecommendationCarousel recommendationCarousel) {
        recommendationCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecommendationCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f29937l);
        sb.append(", padding_Padding=");
        sb.append((Object) null);
        sb.append(", models_List=");
        sb.append(this.f29938m);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(RecommendationCarousel recommendationCarousel) {
        if (this.f29936k.get(3)) {
            recommendationCarousel.setPaddingRes(0);
        } else if (this.f29936k.get(4)) {
            recommendationCarousel.setPaddingDp(this.f29937l);
        } else if (this.f29936k.get(5)) {
            recommendationCarousel.setPadding(null);
        } else {
            recommendationCarousel.setPaddingDp(this.f29937l);
        }
        recommendationCarousel.setHasFixedSize(false);
        if (this.f29936k.get(1)) {
            recommendationCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f29936k.get(2)) {
            recommendationCarousel.setInitialPrefetchItemCount(0);
        } else {
            recommendationCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        recommendationCarousel.setModels(this.f29938m);
    }
}
