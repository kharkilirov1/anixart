package com.swiftsoft.anixartd.p015ui.model.main.search;

import android.view.View;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class SearchRelatedModel_ extends SearchRelatedModel implements GeneratedModel<View>, SearchRelatedModelBuilder {
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

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchRelatedModel_) || !super.equals(obj)) {
            return false;
        }
        SearchRelatedModel_ searchRelatedModel_ = (SearchRelatedModel_) obj;
        Objects.requireNonNull(searchRelatedModel_);
        if (this.f30100k != searchRelatedModel_.f30100k) {
            return false;
        }
        String str = this.f30101l;
        if (str == null ? searchRelatedModel_.f30101l != null : !str.equals(searchRelatedModel_.f30101l)) {
            return false;
        }
        String str2 = this.f30102m;
        if (str2 == null ? searchRelatedModel_.f30102m != null : !str2.equals(searchRelatedModel_.f30102m)) {
            return false;
        }
        String str3 = this.f30103n;
        if (str3 == null ? searchRelatedModel_.f30103n != null : !str3.equals(searchRelatedModel_.f30103n)) {
            return false;
        }
        if (this.f30104o != searchRelatedModel_.f30104o) {
            return false;
        }
        String str4 = this.f30105p;
        if (str4 == null ? searchRelatedModel_.f30105p != null : !str4.equals(searchRelatedModel_.f30105p)) {
            return false;
        }
        String str5 = this.f30106q;
        if (str5 == null ? searchRelatedModel_.f30106q != null : !str5.equals(searchRelatedModel_.f30106q)) {
            return false;
        }
        String str6 = this.f30107r;
        if (str6 == null ? searchRelatedModel_.f30107r == null : str6.equals(searchRelatedModel_.f30107r)) {
            return (this.f30108s == null) == (searchRelatedModel_.f30108s == null);
        }
        return false;
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
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        long j2 = this.f30100k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f30101l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30102m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30103n;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j3 = this.f30104o;
        int i3 = (hashCode4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str4 = this.f30105p;
        int hashCode5 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f30106q;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f30107r;
        return ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.f30108s != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.search.SearchRelatedModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SearchRelatedModel_{relatedId=");
        m24u.append(this.f30100k);
        m24u.append(", nameRu=");
        m24u.append(this.f30101l);
        m24u.append(", description=");
        m24u.append(this.f30102m);
        m24u.append(", image=");
        m24u.append(this.f30103n);
        m24u.append(", releaseCount=");
        m24u.append(this.f30104o);
        m24u.append(", primaryImage=");
        m24u.append(this.f30105p);
        m24u.append(", secondaryImage=");
        m24u.append(this.f30106q);
        m24u.append(", tertiaryImage=");
        m24u.append(this.f30107r);
        m24u.append(", listener=");
        m24u.append(this.f30108s);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.search.SearchRelatedModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: x2 */
    public SearchRelatedModelBuilder m16272x2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f30103n = str;
        return this;
    }

    /* renamed from: y2 */
    public SearchRelatedModelBuilder m16273y2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f30101l = str;
        return this;
    }
}
