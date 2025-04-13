package com.swiftsoft.anixartd.p015ui.model.main.profile.comments;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModel;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ExtraProfileCommentsModel_ extends ExtraProfileCommentsModel implements GeneratedModel<View>, ExtraProfileCommentsModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModelBuilder
    /* renamed from: C1 */
    public ExtraProfileCommentsModelBuilder mo16085C1(ExtraProfileCommentsModel.Listener listener) {
        m4524l2();
        this.f29854k = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModelBuilder
    /* renamed from: F */
    public ExtraProfileCommentsModelBuilder mo16086F(int i2) {
        m4524l2();
        this.f29856m = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModelBuilder
    /* renamed from: N */
    public ExtraProfileCommentsModelBuilder mo16087N(long j2) {
        m4524l2();
        this.f29855l = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModelBuilder
    /* renamed from: a */
    public ExtraProfileCommentsModelBuilder mo16088a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ExtraProfileCommentsModelBuilder
    /* renamed from: d */
    public ExtraProfileCommentsModelBuilder mo16089d(@Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        this.f6932i = spanSizeOverrideCallback;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_extra_profile_comments;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtraProfileCommentsModel_) || !super.equals(obj)) {
            return false;
        }
        ExtraProfileCommentsModel_ extraProfileCommentsModel_ = (ExtraProfileCommentsModel_) obj;
        Objects.requireNonNull(extraProfileCommentsModel_);
        return (this.f29854k == null) == (extraProfileCommentsModel_.f29854k == null) && this.f29855l == extraProfileCommentsModel_.f29855l && this.f29856m == extraProfileCommentsModel_.f29856m;
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
        int hashCode = ((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f29854k != null ? 1 : 0)) * 31;
        long j2 = this.f29855l;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29856m;
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
        StringBuilder m24u = C0000a.m24u("ExtraProfileCommentsModel_{listener=");
        m24u.append(this.f29854k);
        m24u.append(", totalCount=");
        m24u.append(this.f29855l);
        m24u.append(", selectedSort=");
        m24u.append(this.f29856m);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
