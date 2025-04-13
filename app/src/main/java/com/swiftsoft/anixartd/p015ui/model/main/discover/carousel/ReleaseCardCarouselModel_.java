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
public class ReleaseCardCarouselModel_ extends EpoxyModel<ReleaseCardCarousel> implements GeneratedModel<ReleaseCardCarousel>, ReleaseCardCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f29660k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f29661l = -1;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, ReleaseCardCarousel releaseCardCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f29660k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(ReleaseCardCarousel releaseCardCarousel, EpoxyModel epoxyModel) {
        ReleaseCardCarousel releaseCardCarousel2 = releaseCardCarousel;
        if (!(epoxyModel instanceof ReleaseCardCarouselModel_)) {
            mo4496Z1(releaseCardCarousel2);
            return;
        }
        ReleaseCardCarouselModel_ releaseCardCarouselModel_ = (ReleaseCardCarouselModel_) epoxyModel;
        if (this.f29660k.get(3)) {
            Objects.requireNonNull(releaseCardCarouselModel_);
        } else if (this.f29660k.get(4)) {
            int i2 = this.f29661l;
            if (i2 != releaseCardCarouselModel_.f29661l) {
                releaseCardCarousel2.setPaddingDp(i2);
            }
        } else if (this.f29660k.get(5)) {
            if (!releaseCardCarouselModel_.f29660k.get(5)) {
                releaseCardCarousel2.setPadding(null);
            }
        } else if (releaseCardCarouselModel_.f29660k.get(3) || releaseCardCarouselModel_.f29660k.get(4) || releaseCardCarouselModel_.f29660k.get(5)) {
            releaseCardCarousel2.setPaddingDp(this.f29661l);
        }
        Objects.requireNonNull(releaseCardCarouselModel_);
        if (this.f29660k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                releaseCardCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else {
            if (this.f29660k.get(2)) {
                return;
            }
            if (releaseCardCarouselModel_.f29660k.get(1) || releaseCardCarouselModel_.f29660k.get(2)) {
                releaseCardCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        ReleaseCardCarousel releaseCardCarousel = new ReleaseCardCarousel(viewGroup.getContext());
        releaseCardCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return releaseCardCarousel;
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
        if (!(obj instanceof ReleaseCardCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseCardCarouselModel_ releaseCardCarouselModel_ = (ReleaseCardCarouselModel_) obj;
        Objects.requireNonNull(releaseCardCarouselModel_);
        return Float.compare(0.0f, 0.0f) == 0 && this.f29661l == releaseCardCarouselModel_.f29661l;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(ReleaseCardCarousel releaseCardCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<ReleaseCardCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return (((((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f29661l) * 31) + 0) * 31) + 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, ReleaseCardCarousel releaseCardCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, ReleaseCardCarousel releaseCardCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(ReleaseCardCarousel releaseCardCarousel) {
        releaseCardCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReleaseCardCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f29661l);
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
    public void mo4496Z1(ReleaseCardCarousel releaseCardCarousel) {
        if (this.f29660k.get(3)) {
            releaseCardCarousel.setPaddingRes(0);
        } else if (this.f29660k.get(4)) {
            releaseCardCarousel.setPaddingDp(this.f29661l);
        } else if (this.f29660k.get(5)) {
            releaseCardCarousel.setPadding(null);
        } else {
            releaseCardCarousel.setPaddingDp(this.f29661l);
        }
        releaseCardCarousel.setHasFixedSize(false);
        if (this.f29660k.get(1)) {
            releaseCardCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f29660k.get(2)) {
            releaseCardCarousel.setInitialPrefetchItemCount(0);
        } else {
            releaseCardCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        releaseCardCarousel.setModels(null);
    }
}
