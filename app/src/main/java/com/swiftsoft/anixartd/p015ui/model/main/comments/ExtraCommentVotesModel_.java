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
import com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModel;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ExtraCommentVotesModel_ extends ExtraCommentVotesModel implements GeneratedModel<View>, ExtraCommentVotesModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModelBuilder
    /* renamed from: D1 */
    public ExtraCommentVotesModelBuilder mo15894D1(ExtraCommentVotesModel.Listener listener) {
        m4524l2();
        this.f29579k = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModelBuilder
    /* renamed from: F */
    public ExtraCommentVotesModelBuilder mo15895F(int i2) {
        m4524l2();
        this.f29583o = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModelBuilder
    /* renamed from: M */
    public ExtraCommentVotesModelBuilder mo15896M(long j2) {
        m4524l2();
        this.f29582n = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModelBuilder
    /* renamed from: R */
    public ExtraCommentVotesModelBuilder mo15897R(@PluralsRes int i2) {
        m4524l2();
        this.f29580l = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModelBuilder
    /* renamed from: V */
    public ExtraCommentVotesModelBuilder mo15898V(@StringRes int i2) {
        m4524l2();
        this.f29581m = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.comments.ExtraCommentVotesModelBuilder
    /* renamed from: a */
    public ExtraCommentVotesModelBuilder mo15899a(@Nullable CharSequence charSequence) {
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
        if (!(obj instanceof ExtraCommentVotesModel_) || !super.equals(obj)) {
            return false;
        }
        ExtraCommentVotesModel_ extraCommentVotesModel_ = (ExtraCommentVotesModel_) obj;
        Objects.requireNonNull(extraCommentVotesModel_);
        return (this.f29579k == null) == (extraCommentVotesModel_.f29579k == null) && this.f29580l == extraCommentVotesModel_.f29580l && this.f29581m == extraCommentVotesModel_.f29581m && this.f29582n == extraCommentVotesModel_.f29582n && this.f29583o == extraCommentVotesModel_.f29583o;
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
        int hashCode = ((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f29579k != null ? 1 : 0)) * 31) + this.f29580l) * 31) + this.f29581m) * 31;
        long j2 = this.f29582n;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29583o;
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
        StringBuilder m24u = C0000a.m24u("ExtraCommentVotesModel_{listener=");
        m24u.append(this.f29579k);
        m24u.append(", extraResourceId=");
        m24u.append(this.f29580l);
        m24u.append(", zeroResourceId=");
        m24u.append(this.f29581m);
        m24u.append(", extraCount=");
        m24u.append(this.f29582n);
        m24u.append(", selectedSort=");
        m24u.append(this.f29583o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
