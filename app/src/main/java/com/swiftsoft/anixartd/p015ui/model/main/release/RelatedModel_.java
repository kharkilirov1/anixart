package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.database.entity.Category;
import com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class RelatedModel_ extends RelatedModel implements GeneratedModel<View>, RelatedModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: A */
    public RelatedModelBuilder mo16182A(@Nullable String str) {
        m4524l2();
        this.f30004s = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: C */
    public RelatedModelBuilder mo16183C(@Nullable Long l2) {
        m4524l2();
        this.f30007v = l2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: E1 */
    public RelatedModelBuilder mo16184E1(boolean z) {
        m4524l2();
        this.f29994A = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: I */
    public RelatedModelBuilder mo16185I(int i2) {
        m4524l2();
        this.f30005t = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: J */
    public RelatedModelBuilder mo16186J(long j2) {
        m4524l2();
        this.f30006u = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: T */
    public RelatedModelBuilder mo16187T(@Nullable Category category) {
        m4524l2();
        this.f30003r = category;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: b */
    public RelatedModelBuilder mo16188b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: c */
    public RelatedModelBuilder mo16189c(@Nullable String str) {
        m4524l2();
        this.f30002q = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: d0 */
    public RelatedModelBuilder mo16190d0(@Nullable Long l2) {
        m4524l2();
        this.f29996k = l2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: e */
    public RelatedModelBuilder mo16191e(@Nullable String str) {
        m4524l2();
        this.f29997l = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelatedModel_) || !super.equals(obj)) {
            return false;
        }
        RelatedModel_ relatedModel_ = (RelatedModel_) obj;
        Objects.requireNonNull(relatedModel_);
        Long l2 = this.f29996k;
        if (l2 == null ? relatedModel_.f29996k != null : !l2.equals(relatedModel_.f29996k)) {
            return false;
        }
        String str = this.f29997l;
        if (str == null ? relatedModel_.f29997l != null : !str.equals(relatedModel_.f29997l)) {
            return false;
        }
        Integer num = this.f29998m;
        if (num == null ? relatedModel_.f29998m != null : !num.equals(relatedModel_.f29998m)) {
            return false;
        }
        Integer num2 = this.f29999n;
        if (num2 == null ? relatedModel_.f29999n != null : !num2.equals(relatedModel_.f29999n)) {
            return false;
        }
        Double d = this.f30000o;
        if (d == null ? relatedModel_.f30000o != null : !d.equals(relatedModel_.f30000o)) {
            return false;
        }
        String str2 = this.f30001p;
        if (str2 == null ? relatedModel_.f30001p != null : !str2.equals(relatedModel_.f30001p)) {
            return false;
        }
        String str3 = this.f30002q;
        if (str3 == null ? relatedModel_.f30002q != null : !str3.equals(relatedModel_.f30002q)) {
            return false;
        }
        Category category = this.f30003r;
        if (category == null ? relatedModel_.f30003r != null : !category.equals(relatedModel_.f30003r)) {
            return false;
        }
        String str4 = this.f30004s;
        if (str4 == null ? relatedModel_.f30004s != null : !str4.equals(relatedModel_.f30004s)) {
            return false;
        }
        if (this.f30005t != relatedModel_.f30005t || this.f30006u != relatedModel_.f30006u) {
            return false;
        }
        Long l3 = this.f30007v;
        if (l3 == null ? relatedModel_.f30007v != null : !l3.equals(relatedModel_.f30007v)) {
            return false;
        }
        if (this.f30008w == relatedModel_.f30008w && this.f30009x == relatedModel_.f30009x && this.f30010y == relatedModel_.f30010y && this.f30011z == relatedModel_.f30011z && this.f29994A == relatedModel_.f29994A) {
            return (this.f29995B == null) == (relatedModel_.f29995B == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: f */
    public RelatedModelBuilder mo16192f(boolean z) {
        m4524l2();
        this.f30008w = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: f1 */
    public RelatedModelBuilder mo16193f1(RelatedModel.Listener listener) {
        m4524l2();
        this.f29995B = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: g */
    public RelatedModelBuilder mo16194g(@Nullable String str) {
        m4524l2();
        this.f30001p = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: h */
    public RelatedModelBuilder mo16195h(@Nullable Double d) {
        m4524l2();
        this.f30000o = d;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: h0 */
    public RelatedModelBuilder mo16196h0(boolean z) {
        m4524l2();
        this.f30011z = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Long l2 = this.f29996k;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f29997l;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29998m;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29999n;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f30000o;
        int hashCode6 = (hashCode5 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f30001p;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30002q;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Category category = this.f30003r;
        int hashCode9 = (hashCode8 + (category != null ? category.hashCode() : 0)) * 31;
        String str4 = this.f30004s;
        int hashCode10 = (((hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f30005t) * 31;
        long j2 = this.f30006u;
        int i2 = (hashCode10 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l3 = this.f30007v;
        return ((((((((((((i2 + (l3 != null ? l3.hashCode() : 0)) * 31) + (this.f30008w ? 1 : 0)) * 31) + this.f30009x) * 31) + (this.f30010y ? 1 : 0)) * 31) + (this.f30011z ? 1 : 0)) * 31) + (this.f29994A ? 1 : 0)) * 31) + (this.f29995B != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: i */
    public RelatedModelBuilder mo16197i(boolean z) {
        m4524l2();
        this.f30010y = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: m */
    public RelatedModelBuilder mo16198m(@Nullable Integer num) {
        m4524l2();
        this.f29999n = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: n */
    public RelatedModelBuilder mo16199n(@Nullable Integer num) {
        m4524l2();
        this.f29998m = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModelBuilder
    /* renamed from: o */
    public RelatedModelBuilder mo16200o(int i2) {
        m4524l2();
        this.f30009x = i2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("RelatedModel_{releaseId=");
        m24u.append(this.f29996k);
        m24u.append(", titleRussian=");
        m24u.append(this.f29997l);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29998m);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29999n);
        m24u.append(", grade=");
        m24u.append(this.f30000o);
        m24u.append(", description=");
        m24u.append(this.f30001p);
        m24u.append(", image=");
        m24u.append(this.f30002q);
        m24u.append(", category=");
        m24u.append(this.f30003r);
        m24u.append(", year=");
        m24u.append(this.f30004s);
        m24u.append(", season=");
        m24u.append(this.f30005t);
        m24u.append(", airedOnDate=");
        m24u.append(this.f30006u);
        m24u.append(", status=");
        m24u.append(this.f30007v);
        m24u.append(", favorite=");
        m24u.append(this.f30008w);
        m24u.append(", profileListStatus=");
        m24u.append(this.f30009x);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f30010y);
        m24u.append(", firstPosition=");
        m24u.append(this.f30011z);
        m24u.append(", lastPosition=");
        m24u.append(this.f29994A);
        m24u.append(", listener=");
        m24u.append(this.f29995B);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }
}
