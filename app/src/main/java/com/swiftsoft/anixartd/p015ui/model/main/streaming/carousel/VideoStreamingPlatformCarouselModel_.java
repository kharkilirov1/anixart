package com.swiftsoft.anixartd.p015ui.model.main.streaming.carousel;

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
public class VideoStreamingPlatformCarouselModel_ extends EpoxyModel<VideoStreamingPlatformCarousel> implements GeneratedModel<VideoStreamingPlatformCarousel>, VideoStreamingPlatformCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f30120k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f30121l = -1;

    /* renamed from: m */
    @Nullable
    public Carousel.Padding f30122m = null;

    /* renamed from: n */
    @NonNull
    public List<? extends EpoxyModel<?>> f30123n;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, VideoStreamingPlatformCarousel videoStreamingPlatformCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f30120k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.carousel.VideoStreamingPlatformCarouselModelBuilder
    /* renamed from: a */
    public VideoStreamingPlatformCarouselModelBuilder mo16290a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(VideoStreamingPlatformCarousel videoStreamingPlatformCarousel, EpoxyModel epoxyModel) {
        VideoStreamingPlatformCarousel videoStreamingPlatformCarousel2 = videoStreamingPlatformCarousel;
        if (!(epoxyModel instanceof VideoStreamingPlatformCarouselModel_)) {
            mo4496Z1(videoStreamingPlatformCarousel2);
            return;
        }
        VideoStreamingPlatformCarouselModel_ videoStreamingPlatformCarouselModel_ = (VideoStreamingPlatformCarouselModel_) epoxyModel;
        if (this.f30120k.get(3)) {
            Objects.requireNonNull(videoStreamingPlatformCarouselModel_);
        } else if (this.f30120k.get(4)) {
            int i2 = this.f30121l;
            if (i2 != videoStreamingPlatformCarouselModel_.f30121l) {
                videoStreamingPlatformCarousel2.setPaddingDp(i2);
            }
        } else if (this.f30120k.get(5)) {
            if (videoStreamingPlatformCarouselModel_.f30120k.get(5)) {
                if ((r0 = this.f30122m) != null) {
                }
            }
            videoStreamingPlatformCarousel2.setPadding(this.f30122m);
        } else if (videoStreamingPlatformCarouselModel_.f30120k.get(3) || videoStreamingPlatformCarouselModel_.f30120k.get(4) || videoStreamingPlatformCarouselModel_.f30120k.get(5)) {
            videoStreamingPlatformCarousel2.setPaddingDp(this.f30121l);
        }
        Objects.requireNonNull(videoStreamingPlatformCarouselModel_);
        if (this.f30120k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                videoStreamingPlatformCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.f30120k.get(2) && (videoStreamingPlatformCarouselModel_.f30120k.get(1) || videoStreamingPlatformCarouselModel_.f30120k.get(2))) {
            videoStreamingPlatformCarousel2.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends EpoxyModel<?>> list = this.f30123n;
        List<? extends EpoxyModel<?>> list2 = videoStreamingPlatformCarouselModel_.f30123n;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        videoStreamingPlatformCarousel2.setModels(this.f30123n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        VideoStreamingPlatformCarousel videoStreamingPlatformCarousel = new VideoStreamingPlatformCarousel(viewGroup.getContext());
        videoStreamingPlatformCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return videoStreamingPlatformCarousel;
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
        if (!(obj instanceof VideoStreamingPlatformCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        VideoStreamingPlatformCarouselModel_ videoStreamingPlatformCarouselModel_ = (VideoStreamingPlatformCarouselModel_) obj;
        Objects.requireNonNull(videoStreamingPlatformCarouselModel_);
        if (Float.compare(0.0f, 0.0f) != 0 || this.f30121l != videoStreamingPlatformCarouselModel_.f30121l) {
            return false;
        }
        Carousel.Padding padding = this.f30122m;
        if (padding == null ? videoStreamingPlatformCarouselModel_.f30122m != null : !padding.equals(videoStreamingPlatformCarouselModel_.f30122m)) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.f30123n;
        List<? extends EpoxyModel<?>> list2 = videoStreamingPlatformCarouselModel_.f30123n;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(VideoStreamingPlatformCarousel videoStreamingPlatformCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<VideoStreamingPlatformCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f30121l) * 31;
        Carousel.Padding padding = this.f30122m;
        int hashCode2 = (hashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends EpoxyModel<?>> list = this.f30123n;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, VideoStreamingPlatformCarousel videoStreamingPlatformCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, VideoStreamingPlatformCarousel videoStreamingPlatformCarousel) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.carousel.VideoStreamingPlatformCarouselModelBuilder
    /* renamed from: q */
    public VideoStreamingPlatformCarouselModelBuilder mo16291q(@NonNull List list) {
        this.f30120k.set(6);
        m4524l2();
        this.f30123n = list;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.carousel.VideoStreamingPlatformCarouselModelBuilder
    /* renamed from: s */
    public VideoStreamingPlatformCarouselModelBuilder mo16292s(@Nullable Carousel.Padding padding) {
        this.f30120k.set(5);
        this.f30120k.clear(3);
        this.f30120k.clear(4);
        this.f30121l = -1;
        m4524l2();
        this.f30122m = padding;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(VideoStreamingPlatformCarousel videoStreamingPlatformCarousel) {
        videoStreamingPlatformCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoStreamingPlatformCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f30121l);
        sb.append(", padding_Padding=");
        sb.append(this.f30122m);
        sb.append(", models_List=");
        sb.append(this.f30123n);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(VideoStreamingPlatformCarousel videoStreamingPlatformCarousel) {
        if (this.f30120k.get(3)) {
            videoStreamingPlatformCarousel.setPaddingRes(0);
        } else if (this.f30120k.get(4)) {
            videoStreamingPlatformCarousel.setPaddingDp(this.f30121l);
        } else if (this.f30120k.get(5)) {
            videoStreamingPlatformCarousel.setPadding(this.f30122m);
        } else {
            videoStreamingPlatformCarousel.setPaddingDp(this.f30121l);
        }
        videoStreamingPlatformCarousel.setHasFixedSize(false);
        if (this.f30120k.get(1)) {
            videoStreamingPlatformCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f30120k.get(2)) {
            videoStreamingPlatformCarousel.setInitialPrefetchItemCount(0);
        } else {
            videoStreamingPlatformCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        videoStreamingPlatformCarousel.setModels(this.f30123n);
    }
}
