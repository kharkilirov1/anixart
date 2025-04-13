package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.database.entity.Category;
import com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class RelatedCompactModel_ extends RelatedCompactModel implements GeneratedModel<View>, RelatedCompactModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: A */
    public RelatedCompactModelBuilder mo16165A(@Nullable String str) {
        m4524l2();
        this.f29982m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: T */
    public RelatedCompactModelBuilder mo16166T(@Nullable Category category) {
        m4524l2();
        this.f29985p = category;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: b */
    public RelatedCompactModelBuilder mo16167b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: c */
    public RelatedCompactModelBuilder mo16168c(@Nullable String str) {
        m4524l2();
        this.f29984o = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: d1 */
    public RelatedCompactModelBuilder mo16169d1(RelatedCompactModel.Listener listener) {
        m4524l2();
        this.f29987r = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: e */
    public RelatedCompactModelBuilder mo16170e(@Nullable String str) {
        m4524l2();
        this.f29981l = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelatedCompactModel_) || !super.equals(obj)) {
            return false;
        }
        RelatedCompactModel_ relatedCompactModel_ = (RelatedCompactModel_) obj;
        Objects.requireNonNull(relatedCompactModel_);
        if (this.f29980k != relatedCompactModel_.f29980k) {
            return false;
        }
        String str = this.f29981l;
        if (str == null ? relatedCompactModel_.f29981l != null : !str.equals(relatedCompactModel_.f29981l)) {
            return false;
        }
        String str2 = this.f29982m;
        if (str2 == null ? relatedCompactModel_.f29982m != null : !str2.equals(relatedCompactModel_.f29982m)) {
            return false;
        }
        Double d = this.f29983n;
        if (d == null ? relatedCompactModel_.f29983n != null : !d.equals(relatedCompactModel_.f29983n)) {
            return false;
        }
        String str3 = this.f29984o;
        if (str3 == null ? relatedCompactModel_.f29984o != null : !str3.equals(relatedCompactModel_.f29984o)) {
            return false;
        }
        Category category = this.f29985p;
        if (category == null ? relatedCompactModel_.f29985p != null : !category.equals(relatedCompactModel_.f29985p)) {
            return false;
        }
        if (this.f29986q != relatedCompactModel_.f29986q) {
            return false;
        }
        return (this.f29987r == null) == (relatedCompactModel_.f29987r == null);
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: h */
    public RelatedCompactModelBuilder mo16171h(@Nullable Double d) {
        m4524l2();
        this.f29983n = d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        long j2 = this.f29980k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29981l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29982m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Double d = this.f29983n;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        String str3 = this.f29984o;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Category category = this.f29985p;
        return ((((hashCode5 + (category != null ? category.hashCode() : 0)) * 31) + (this.f29986q ? 1 : 0)) * 31) + (this.f29987r != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: i */
    public RelatedCompactModelBuilder mo16172i(boolean z) {
        m4524l2();
        this.f29986q = z;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("RelatedCompactModel_{releaseId=");
        m24u.append(this.f29980k);
        m24u.append(", titleRussian=");
        m24u.append(this.f29981l);
        m24u.append(", year=");
        m24u.append(this.f29982m);
        m24u.append(", grade=");
        m24u.append(this.f29983n);
        m24u.append(", image=");
        m24u.append(this.f29984o);
        m24u.append(", category=");
        m24u.append(this.f29985p);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29986q);
        m24u.append(", listener=");
        m24u.append(this.f29987r);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedCompactModelBuilder
    /* renamed from: y */
    public RelatedCompactModelBuilder mo16173y(long j2) {
        m4524l2();
        this.f29980k = j2;
        return this;
    }
}
