package com.swiftsoft.anixartd.p015ui.model.extra;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ImpMessageModel_ extends ImpMessageModel implements GeneratedModel<View>, ImpMessageModelBuilder {
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
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_imp_message;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImpMessageModel_) || !super.equals(obj)) {
            return false;
        }
        ImpMessageModel_ impMessageModel_ = (ImpMessageModel_) obj;
        Objects.requireNonNull(impMessageModel_);
        String str = this.f29454k;
        if (str == null ? impMessageModel_.f29454k != null : !str.equals(impMessageModel_.f29454k)) {
            return false;
        }
        String str2 = this.f29455l;
        if (str2 == null ? impMessageModel_.f29455l != null : !str2.equals(impMessageModel_.f29455l)) {
            return false;
        }
        String str3 = this.f29456m;
        if (str3 == null ? impMessageModel_.f29456m != null : !str3.equals(impMessageModel_.f29456m)) {
            return false;
        }
        String str4 = this.f29457n;
        if (str4 == null ? impMessageModel_.f29457n == null : str4.equals(impMessageModel_.f29457n)) {
            return (this.f29458o == null) == (impMessageModel_.f29458o == null);
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
        String str = this.f29454k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29455l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29456m;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29457n;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f29458o != null ? 1 : 0);
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
        StringBuilder m24u = C0000a.m24u("ImpMessageModel_{impMessageText=");
        m24u.append(this.f29454k);
        m24u.append(", impMessageLink=");
        m24u.append(this.f29455l);
        m24u.append(", impMessageBackgroundColor=");
        m24u.append(this.f29456m);
        m24u.append(", impMessageTextColor=");
        m24u.append(this.f29457n);
        m24u.append(", listener=");
        m24u.append(this.f29458o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
