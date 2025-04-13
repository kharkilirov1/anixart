package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class RelatedHeaderModel_ extends RelatedHeaderModel implements GeneratedModel<View>, RelatedHeaderModelBuilder {
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedHeaderModelBuilder
    /* renamed from: a */
    public RelatedHeaderModelBuilder mo16174a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedHeaderModelBuilder
    /* renamed from: c */
    public RelatedHeaderModelBuilder mo16175c(@NotNull String str) {
        m4524l2();
        this.f29991m = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedHeaderModelBuilder
    /* renamed from: d */
    public RelatedHeaderModelBuilder mo16176d(@Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        this.f6932i = spanSizeOverrideCallback;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelatedHeaderModel_) || !super.equals(obj)) {
            return false;
        }
        RelatedHeaderModel_ relatedHeaderModel_ = (RelatedHeaderModel_) obj;
        Objects.requireNonNull(relatedHeaderModel_);
        String str = this.f29989k;
        if (str == null ? relatedHeaderModel_.f29989k != null : !str.equals(relatedHeaderModel_.f29989k)) {
            return false;
        }
        String str2 = this.f29990l;
        if (str2 == null ? relatedHeaderModel_.f29990l != null : !str2.equals(relatedHeaderModel_.f29990l)) {
            return false;
        }
        String str3 = this.f29991m;
        return str3 == null ? relatedHeaderModel_.f29991m == null : str3.equals(relatedHeaderModel_.f29991m);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedHeaderModelBuilder
    /* renamed from: g */
    public RelatedHeaderModelBuilder mo16177g(@org.jetbrains.annotations.Nullable String str) {
        m4524l2();
        this.f29990l = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29989k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29990l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29991m;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedHeaderModelBuilder
    /* renamed from: l0 */
    public RelatedHeaderModelBuilder mo16178l0(@NotNull String str) {
        m4524l2();
        this.f29989k = str;
        return this;
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
        StringBuilder m24u = C0000a.m24u("RelatedHeaderModel_{nameRu=");
        m24u.append(this.f29989k);
        m24u.append(", description=");
        m24u.append(this.f29990l);
        m24u.append(", image=");
        m24u.append(this.f29991m);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
