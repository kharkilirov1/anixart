package com.swiftsoft.anixartd.p015ui.model.common;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class TopReleaseModel_ extends TopReleaseModel implements GeneratedModel<View>, TopReleaseModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: C0 */
    public TopReleaseModelBuilder mo15784C0(TopReleaseModel.Listener listener) {
        m4524l2();
        this.f29449u = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: P1 */
    public TopReleaseModelBuilder mo15785P1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29447s = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: b */
    public TopReleaseModelBuilder mo15786b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: c */
    public TopReleaseModelBuilder mo15787c(@Nullable String str) {
        m4524l2();
        this.f29444p = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_top;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: e */
    public TopReleaseModelBuilder mo15788e(@Nullable String str) {
        m4524l2();
        this.f29439k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopReleaseModel_) || !super.equals(obj)) {
            return false;
        }
        TopReleaseModel_ topReleaseModel_ = (TopReleaseModel_) obj;
        Objects.requireNonNull(topReleaseModel_);
        String str = this.f29439k;
        if (str == null ? topReleaseModel_.f29439k != null : !str.equals(topReleaseModel_.f29439k)) {
            return false;
        }
        Integer num = this.f29440l;
        if (num == null ? topReleaseModel_.f29440l != null : !num.equals(topReleaseModel_.f29440l)) {
            return false;
        }
        Integer num2 = this.f29441m;
        if (num2 == null ? topReleaseModel_.f29441m != null : !num2.equals(topReleaseModel_.f29441m)) {
            return false;
        }
        Double d = this.f29442n;
        if (d == null ? topReleaseModel_.f29442n != null : !d.equals(topReleaseModel_.f29442n)) {
            return false;
        }
        String str2 = this.f29443o;
        if (str2 == null ? topReleaseModel_.f29443o != null : !str2.equals(topReleaseModel_.f29443o)) {
            return false;
        }
        String str3 = this.f29444p;
        if (str3 == null ? topReleaseModel_.f29444p != null : !str3.equals(topReleaseModel_.f29444p)) {
            return false;
        }
        if (this.f29445q != topReleaseModel_.f29445q || this.f29446r != topReleaseModel_.f29446r) {
            return false;
        }
        String str4 = this.f29447s;
        if (str4 == null ? topReleaseModel_.f29447s != null : !str4.equals(topReleaseModel_.f29447s)) {
            return false;
        }
        if (this.f29448t != topReleaseModel_.f29448t) {
            return false;
        }
        return (this.f29449u == null) == (topReleaseModel_.f29449u == null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: f */
    public TopReleaseModelBuilder mo15789f(boolean z) {
        m4524l2();
        this.f29445q = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: g */
    public TopReleaseModelBuilder mo15790g(@Nullable String str) {
        m4524l2();
        this.f29443o = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: h */
    public TopReleaseModelBuilder mo15791h(@Nullable Double d) {
        m4524l2();
        this.f29442n = d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29439k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29440l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29441m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29442n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29443o;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29444p;
        int hashCode7 = (((((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f29445q ? 1 : 0)) * 31) + this.f29446r) * 31;
        String str4 = this.f29447s;
        return ((((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f29448t ? 1 : 0)) * 31) + (this.f29449u != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: i */
    public TopReleaseModelBuilder mo15792i(boolean z) {
        m4524l2();
        this.f29448t = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: m */
    public TopReleaseModelBuilder mo15793m(@Nullable Integer num) {
        m4524l2();
        this.f29441m = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: n */
    public TopReleaseModelBuilder mo15794n(@Nullable Integer num) {
        m4524l2();
        this.f29440l = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModelBuilder
    /* renamed from: o */
    public TopReleaseModelBuilder mo15795o(int i2) {
        m4524l2();
        this.f29446r = i2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TopReleaseModel_{titleRussian=");
        m24u.append(this.f29439k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29440l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29441m);
        m24u.append(", grade=");
        m24u.append(this.f29442n);
        m24u.append(", description=");
        m24u.append(this.f29443o);
        m24u.append(", image=");
        m24u.append(this.f29444p);
        m24u.append(", favorite=");
        m24u.append(this.f29445q);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29446r);
        m24u.append(", position=");
        m24u.append(this.f29447s);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29448t);
        m24u.append(", listener=");
        m24u.append(this.f29449u);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.TopReleaseModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }
}
