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
public class VideoBannerCarouselModel_ extends EpoxyModel<VideoBannerCarousel> implements GeneratedModel<VideoBannerCarousel>, VideoBannerCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f30069k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f30070l = -1;

    /* renamed from: m */
    @Nullable
    public Carousel.Padding f30071m = null;

    /* renamed from: n */
    @NonNull
    public List<? extends EpoxyModel<?>> f30072n;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, VideoBannerCarousel videoBannerCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f30069k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBannerCarouselModelBuilder
    /* renamed from: a */
    public VideoBannerCarouselModelBuilder mo16243a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(VideoBannerCarousel videoBannerCarousel, EpoxyModel epoxyModel) {
        VideoBannerCarousel videoBannerCarousel2 = videoBannerCarousel;
        if (!(epoxyModel instanceof VideoBannerCarouselModel_)) {
            mo4496Z1(videoBannerCarousel2);
            return;
        }
        VideoBannerCarouselModel_ videoBannerCarouselModel_ = (VideoBannerCarouselModel_) epoxyModel;
        if (this.f30069k.get(3)) {
            Objects.requireNonNull(videoBannerCarouselModel_);
        } else if (this.f30069k.get(4)) {
            int i2 = this.f30070l;
            if (i2 != videoBannerCarouselModel_.f30070l) {
                videoBannerCarousel2.setPaddingDp(i2);
            }
        } else if (this.f30069k.get(5)) {
            if (videoBannerCarouselModel_.f30069k.get(5)) {
                if ((r0 = this.f30071m) != null) {
                }
            }
            videoBannerCarousel2.setPadding(this.f30071m);
        } else if (videoBannerCarouselModel_.f30069k.get(3) || videoBannerCarouselModel_.f30069k.get(4) || videoBannerCarouselModel_.f30069k.get(5)) {
            videoBannerCarousel2.setPaddingDp(this.f30070l);
        }
        Objects.requireNonNull(videoBannerCarouselModel_);
        if (this.f30069k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                videoBannerCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.f30069k.get(2) && (videoBannerCarouselModel_.f30069k.get(1) || videoBannerCarouselModel_.f30069k.get(2))) {
            videoBannerCarousel2.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends EpoxyModel<?>> list = this.f30072n;
        List<? extends EpoxyModel<?>> list2 = videoBannerCarouselModel_.f30072n;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        videoBannerCarousel2.setModels(this.f30072n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        VideoBannerCarousel videoBannerCarousel = new VideoBannerCarousel(viewGroup.getContext());
        videoBannerCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return videoBannerCarousel;
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
        if (!(obj instanceof VideoBannerCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        VideoBannerCarouselModel_ videoBannerCarouselModel_ = (VideoBannerCarouselModel_) obj;
        Objects.requireNonNull(videoBannerCarouselModel_);
        if (Float.compare(0.0f, 0.0f) != 0 || this.f30070l != videoBannerCarouselModel_.f30070l) {
            return false;
        }
        Carousel.Padding padding = this.f30071m;
        if (padding == null ? videoBannerCarouselModel_.f30071m != null : !padding.equals(videoBannerCarouselModel_.f30071m)) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.f30072n;
        List<? extends EpoxyModel<?>> list2 = videoBannerCarouselModel_.f30072n;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(VideoBannerCarousel videoBannerCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<VideoBannerCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f30070l) * 31;
        Carousel.Padding padding = this.f30071m;
        int hashCode2 = (hashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends EpoxyModel<?>> list = this.f30072n;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, VideoBannerCarousel videoBannerCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, VideoBannerCarousel videoBannerCarousel) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBannerCarouselModelBuilder
    /* renamed from: q */
    public VideoBannerCarouselModelBuilder mo16244q(@NonNull List list) {
        this.f30069k.set(6);
        m4524l2();
        this.f30072n = list;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBannerCarouselModelBuilder
    /* renamed from: s */
    public VideoBannerCarouselModelBuilder mo16245s(@Nullable Carousel.Padding padding) {
        this.f30069k.set(5);
        this.f30069k.clear(3);
        this.f30069k.clear(4);
        this.f30070l = -1;
        m4524l2();
        this.f30071m = padding;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(VideoBannerCarousel videoBannerCarousel) {
        videoBannerCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoBannerCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f30070l);
        sb.append(", padding_Padding=");
        sb.append(this.f30071m);
        sb.append(", models_List=");
        sb.append(this.f30072n);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(VideoBannerCarousel videoBannerCarousel) {
        if (this.f30069k.get(3)) {
            videoBannerCarousel.setPaddingRes(0);
        } else if (this.f30069k.get(4)) {
            videoBannerCarousel.setPaddingDp(this.f30070l);
        } else if (this.f30069k.get(5)) {
            videoBannerCarousel.setPadding(this.f30071m);
        } else {
            videoBannerCarousel.setPaddingDp(this.f30070l);
        }
        videoBannerCarousel.setHasFixedSize(false);
        if (this.f30069k.get(1)) {
            videoBannerCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f30069k.get(2)) {
            videoBannerCarousel.setInitialPrefetchItemCount(0);
        } else {
            videoBannerCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        videoBannerCarousel.setModels(this.f30072n);
    }
}
