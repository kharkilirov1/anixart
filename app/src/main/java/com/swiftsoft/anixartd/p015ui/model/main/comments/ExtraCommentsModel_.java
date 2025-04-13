package com.swiftsoft.anixartd.p015ui.model.main.comments;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModel;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ExtraCommentsModel_ extends ExtraCommentsModel implements GeneratedModel<View>, ExtraCommentsModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModelBuilder
    /* renamed from: F */
    public ExtraCommentsModelBuilder mo15901F(int i2) {
        m4524l2();
        this.f29592o = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModelBuilder
    /* renamed from: M */
    public ExtraCommentsModelBuilder mo15902M(long j2) {
        m4524l2();
        this.f29591n = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModelBuilder
    /* renamed from: R */
    public ExtraCommentsModelBuilder mo15903R(@PluralsRes int i2) {
        m4524l2();
        this.f29589l = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModelBuilder
    /* renamed from: V */
    public ExtraCommentsModelBuilder mo15904V(@StringRes int i2) {
        m4524l2();
        this.f29590m = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModelBuilder
    /* renamed from: a */
    public ExtraCommentsModelBuilder mo15905a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_extra_comments;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtraCommentsModel_) || !super.equals(obj)) {
            return false;
        }
        ExtraCommentsModel_ extraCommentsModel_ = (ExtraCommentsModel_) obj;
        Objects.requireNonNull(extraCommentsModel_);
        return (this.f29588k == null) == (extraCommentsModel_.f29588k == null) && this.f29589l == extraCommentsModel_.f29589l && this.f29590m == extraCommentsModel_.f29590m && this.f29591n == extraCommentsModel_.f29591n && this.f29592o == extraCommentsModel_.f29592o;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f29588k != null ? 1 : 0)) * 31) + this.f29589l) * 31) + this.f29590m) * 31;
        long j2 = this.f29591n;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29592o;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ void mo4506s2(View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ExtraCommentsModel_{listener=");
        m24u.append(this.f29588k);
        m24u.append(", extraResourceId=");
        m24u.append(this.f29589l);
        m24u.append(", zeroResourceId=");
        m24u.append(this.f29590m);
        m24u.append(", extraCount=");
        m24u.append(this.f29591n);
        m24u.append(", selectedSort=");
        m24u.append(this.f29592o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentsModelBuilder
    /* renamed from: y1 */
    public ExtraCommentsModelBuilder mo15906y1(ExtraCommentsModel.Listener listener) {
        m4524l2();
        this.f29588k = listener;
        return this;
    }
}
