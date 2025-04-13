package com.swiftsoft.anixartd.p015ui.model.main.schedule.carousel;

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
public class ScheduleCarouselModel_ extends EpoxyModel<ScheduleCarousel> implements GeneratedModel<ScheduleCarousel>, ScheduleCarouselModelBuilder {

    /* renamed from: k */
    public final BitSet f30093k = new BitSet(7);

    /* renamed from: l */
    @Dimension
    public int f30094l = -1;

    /* renamed from: m */
    @Nullable
    public Carousel.Padding f30095m = null;

    /* renamed from: n */
    @NonNull
    public List<? extends EpoxyModel<?>> f30096n;

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, ScheduleCarousel scheduleCarousel, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
        if (!this.f30093k.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.carousel.ScheduleCarouselModelBuilder
    /* renamed from: a */
    public ScheduleCarouselModelBuilder mo16261a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(ScheduleCarousel scheduleCarousel, EpoxyModel epoxyModel) {
        ScheduleCarousel scheduleCarousel2 = scheduleCarousel;
        if (!(epoxyModel instanceof ScheduleCarouselModel_)) {
            mo4496Z1(scheduleCarousel2);
            return;
        }
        ScheduleCarouselModel_ scheduleCarouselModel_ = (ScheduleCarouselModel_) epoxyModel;
        if (this.f30093k.get(3)) {
            Objects.requireNonNull(scheduleCarouselModel_);
        } else if (this.f30093k.get(4)) {
            int i2 = this.f30094l;
            if (i2 != scheduleCarouselModel_.f30094l) {
                scheduleCarousel2.setPaddingDp(i2);
            }
        } else if (this.f30093k.get(5)) {
            if (scheduleCarouselModel_.f30093k.get(5)) {
                if ((r0 = this.f30095m) != null) {
                }
            }
            scheduleCarousel2.setPadding(this.f30095m);
        } else if (scheduleCarouselModel_.f30093k.get(3) || scheduleCarouselModel_.f30093k.get(4) || scheduleCarouselModel_.f30093k.get(5)) {
            scheduleCarousel2.setPaddingDp(this.f30094l);
        }
        Objects.requireNonNull(scheduleCarouselModel_);
        if (this.f30093k.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                scheduleCarousel2.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.f30093k.get(2) && (scheduleCarouselModel_.f30093k.get(1) || scheduleCarouselModel_.f30093k.get(2))) {
            scheduleCarousel2.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends EpoxyModel<?>> list = this.f30096n;
        List<? extends EpoxyModel<?>> list2 = scheduleCarouselModel_.f30096n;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        scheduleCarousel2.setModels(this.f30096n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: c2 */
    public View mo4498c2(ViewGroup viewGroup) {
        ScheduleCarousel scheduleCarousel = new ScheduleCarousel(viewGroup.getContext());
        scheduleCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return scheduleCarousel;
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
        if (!(obj instanceof ScheduleCarouselModel_) || !super.equals(obj)) {
            return false;
        }
        ScheduleCarouselModel_ scheduleCarouselModel_ = (ScheduleCarouselModel_) obj;
        Objects.requireNonNull(scheduleCarouselModel_);
        if (Float.compare(0.0f, 0.0f) != 0 || this.f30094l != scheduleCarouselModel_.f30094l) {
            return false;
        }
        Carousel.Padding padding = this.f30095m;
        if (padding == null ? scheduleCarouselModel_.f30095m != null : !padding.equals(scheduleCarouselModel_.f30095m)) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.f30096n;
        List<? extends EpoxyModel<?>> list2 = scheduleCarouselModel_.f30096n;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(ScheduleCarousel scheduleCarousel, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: f2 */
    public int mo4502f2() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<ScheduleCarousel> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f30094l) * 31;
        Carousel.Padding padding = this.f30095m;
        int hashCode2 = (hashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends EpoxyModel<?>> list = this.f30096n;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, ScheduleCarousel scheduleCarousel) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, ScheduleCarousel scheduleCarousel) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.carousel.ScheduleCarouselModelBuilder
    /* renamed from: q */
    public ScheduleCarouselModelBuilder mo16262q(@NonNull List list) {
        this.f30093k.set(6);
        m4524l2();
        this.f30096n = list;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return true;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.carousel.ScheduleCarouselModelBuilder
    /* renamed from: s */
    public ScheduleCarouselModelBuilder mo16263s(@Nullable Carousel.Padding padding) {
        this.f30093k.set(5);
        this.f30093k.clear(3);
        this.f30093k.clear(4);
        this.f30094l = -1;
        m4524l2();
        this.f30095m = padding;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(ScheduleCarousel scheduleCarousel) {
        scheduleCarousel.m4491L0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScheduleCarouselModel_{hasFixedSize_Boolean=");
        sb.append(false);
        sb.append(", numViewsToShowOnScreen_Float=");
        sb.append(0.0f);
        sb.append(", initialPrefetchItemCount_Int=");
        C0576a.m4127z(sb, 0, ", paddingRes_Int=", 0, ", paddingDp_Int=");
        sb.append(this.f30094l);
        sb.append(", padding_Padding=");
        sb.append(this.f30095m);
        sb.append(", models_List=");
        sb.append(this.f30096n);
        sb.append("}");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(ScheduleCarousel scheduleCarousel) {
        if (this.f30093k.get(3)) {
            scheduleCarousel.setPaddingRes(0);
        } else if (this.f30093k.get(4)) {
            scheduleCarousel.setPaddingDp(this.f30094l);
        } else if (this.f30093k.get(5)) {
            scheduleCarousel.setPadding(this.f30095m);
        } else {
            scheduleCarousel.setPaddingDp(this.f30094l);
        }
        scheduleCarousel.setHasFixedSize(false);
        if (this.f30093k.get(1)) {
            scheduleCarousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.f30093k.get(2)) {
            scheduleCarousel.setInitialPrefetchItemCount(0);
        } else {
            scheduleCarousel.setNumViewsToShowOnScreen(0.0f);
        }
        scheduleCarousel.setModels(this.f30096n);
    }
}
