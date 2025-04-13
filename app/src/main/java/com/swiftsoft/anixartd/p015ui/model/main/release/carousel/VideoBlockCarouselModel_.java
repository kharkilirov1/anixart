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
public class VideoBlockCarouselModel_ extends EpoxyModel<VideoBlockCarousel> implements GeneratedModel<VideoBlockCarousel>, VideoBlockCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f30073k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f30074l = -1;

    /* renamed from: m */
    @Nullable
    public Carousel.Padding f30075m = null;

    /* renamed from: n */
    @NonNull
    public List<? extends EpoxyModel<?>> f30076n;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, VideoBlockCarousel videoBlockCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f30073k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBlockCarouselModelBuilder
    /* renamed from: a */
    public VideoBlockCarouselModelBuilder mo16247a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(VideoBlockCarousel videoBlockCarousel, EpoxyModel epoxyModel) {
        VideoBlockCarousel videoBlockCarousel2 = videoBlockCarousel;
        if (!(epoxyModel instanceof VideoBlockCarouselModel_)) {
            mo4496Z1(videoBlockCarousel2);
            return;
        }
        VideoBlockCarouselModel_ videoBlockCarouselModel_ = (VideoBlockCarouselModel_) epoxyModel;
        if (this.f30073k.get(3)) {
            Objects.requireNonNull(videoBlockCarouselModel_);
        } else if (this.f30073k.get(4)) {
            int i2 = this.f30074l;
            if (i2 != videoBlockCarouselModel_.f30074l) {
                videoBlockCarousel2.setPaddingDp(i2);
            }
        } else if (this.f30073k.get(5)) {
            if (videoBlockCarouselModel_.f30073k.get(5)) {
                if ((r0 = this.f30075m) != null) {
                }
            }
            videoBlockCarousel2.setPadding(this.f30075m);
        } else if (videoBlockCarouselModel_.f30073k.get(3) || videoBlockCarouselModel_.f30073k.get(4) || videoBlockCarouselModel_.f30073k.get(5)) {
            videoBlockCarousel2.setPaddingDp(this.f30074l);
        }
        Objects.requireNonNull(videoBlockCarouselModel_);
        if (this.f30073k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                videoBlockCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.f30073k.get(2) && (videoBlockCarouselModel_.f30073k.get(1) || videoBlockCarouselModel_.f30073k.get(2))) {
            videoBlockCarousel2.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends EpoxyModel<?>> list = this.f30076n;
        List<? extends EpoxyModel<?>> list2 = videoBlockCarouselModel_.f30076n;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        videoBlockCarousel2.setModels(this.f30076n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        VideoBlockCarousel videoBlockCarousel = new VideoBlockCarousel(viewGroup.getContext());
        videoBlockCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return videoBlockCarousel;
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
        if (!(obj instanceof VideoBlockCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        VideoBlockCarouselModel_ videoBlockCarouselModel_ = (VideoBlockCarouselModel_) obj;
        Objects.requireNonNull(videoBlockCarouselModel_);
        if (Float.compare(0.0f, 0.0f) != 0 || this.f30074l != videoBlockCarouselModel_.f30074l) {
            return false;
        }
        Carousel.Padding padding = this.f30075m;
        if (padding == null ? videoBlockCarouselModel_.f30075m != null : !padding.equals(videoBlockCarouselModel_.f30075m)) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.f30076n;
        List<? extends EpoxyModel<?>> list2 = videoBlockCarouselModel_.f30076n;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(VideoBlockCarousel videoBlockCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<VideoBlockCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f30074l) * 31;
        Carousel.Padding padding = this.f30075m;
        int hashCode2 = (hashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends EpoxyModel<?>> list = this.f30076n;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, VideoBlockCarousel videoBlockCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, VideoBlockCarousel videoBlockCarousel) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBlockCarouselModelBuilder
    /* renamed from: q */
    public VideoBlockCarouselModelBuilder mo16248q(@NonNull List list) {
        this.f30073k.set(6);
        m4524l2();
        this.f30076n = list;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.carousel.VideoBlockCarouselModelBuilder
    /* renamed from: s */
    public VideoBlockCarouselModelBuilder mo16249s(@Nullable Carousel.Padding padding) {
        this.f30073k.set(5);
        this.f30073k.clear(3);
        this.f30073k.clear(4);
        this.f30074l = -1;
        m4524l2();
        this.f30075m = padding;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(VideoBlockCarousel videoBlockCarousel) {
        videoBlockCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoBlockCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f30074l);
        sb.append(", padding_Padding=");
        sb.append(this.f30075m);
        sb.append(", models_List=");
        sb.append(this.f30076n);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(VideoBlockCarousel videoBlockCarousel) {
        if (this.f30073k.get(3)) {
            videoBlockCarousel.setPaddingRes(0);
        } else if (this.f30073k.get(4)) {
            videoBlockCarousel.setPaddingDp(this.f30074l);
        } else if (this.f30073k.get(5)) {
            videoBlockCarousel.setPadding(this.f30075m);
        } else {
            videoBlockCarousel.setPaddingDp(this.f30074l);
        }
        videoBlockCarousel.setHasFixedSize(false);
        if (this.f30073k.get(1)) {
            videoBlockCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f30073k.get(2)) {
            videoBlockCarousel.setInitialPrefetchItemCount(0);
        } else {
            videoBlockCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        videoBlockCarousel.setModels(this.f30076n);
    }
}
