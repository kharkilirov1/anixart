package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import android.widget.Button;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class VideoAppealListItemModel_ extends VideoAppealListItemModel implements GeneratedModel<View>, VideoAppealListItemModelBuilder {
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
        return C2507R.layout.item_video_appeal_list;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoAppealListItemModel_) || !super.equals(obj)) {
            return false;
        }
        VideoAppealListItemModel_ videoAppealListItemModel_ = (VideoAppealListItemModel_) obj;
        Objects.requireNonNull(videoAppealListItemModel_);
        if (this.f30029k != videoAppealListItemModel_.f30029k) {
            return false;
        }
        String str = this.f30030l;
        if (str == null ? videoAppealListItemModel_.f30030l != null : !str.equals(videoAppealListItemModel_.f30030l)) {
            return false;
        }
        String str2 = this.f30031m;
        if (str2 == null ? videoAppealListItemModel_.f30031m != null : !str2.equals(videoAppealListItemModel_.f30031m)) {
            return false;
        }
        String str3 = this.f30032n;
        if (str3 == null ? videoAppealListItemModel_.f30032n != null : !str3.equals(videoAppealListItemModel_.f30032n)) {
            return false;
        }
        if (this.f30033o != videoAppealListItemModel_.f30033o) {
            return false;
        }
        String str4 = this.f30034p;
        if (str4 == null ? videoAppealListItemModel_.f30034p != null : !str4.equals(videoAppealListItemModel_.f30034p)) {
            return false;
        }
        String str5 = this.f30035q;
        if (str5 == null ? videoAppealListItemModel_.f30035q != null : !str5.equals(videoAppealListItemModel_.f30035q)) {
            return false;
        }
        String str6 = this.f30036r;
        if (str6 == null ? videoAppealListItemModel_.f30036r == null : str6.equals(videoAppealListItemModel_.f30036r)) {
            return (this.f30037s == null) == (videoAppealListItemModel_.f30037s == null);
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
        long j2 = this.f30029k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f30030l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30031m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30032n;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j3 = this.f30033o;
        int i3 = (hashCode4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str4 = this.f30034p;
        int hashCode5 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f30035q;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f30036r;
        return ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.f30037s != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoAppealListItemModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
        ((Button) view2.findViewById(C2507R.id.btn_delete)).setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("VideoAppealListItemModel_{videoId=");
        m24u.append(this.f30029k);
        m24u.append(", name=");
        m24u.append(this.f30030l);
        m24u.append(", categoryText=");
        m24u.append(this.f30031m);
        m24u.append(", nickname=");
        m24u.append(this.f30032n);
        m24u.append(", timestamp=");
        m24u.append(this.f30033o);
        m24u.append(", releaseTitleRu=");
        m24u.append(this.f30034p);
        m24u.append(", image=");
        m24u.append(this.f30035q);
        m24u.append(", hostingIcon=");
        m24u.append(this.f30036r);
        m24u.append(", listener=");
        m24u.append(this.f30037s);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoAppealListItemModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
        ((Button) view.findViewById(C2507R.id.btn_delete)).setOnClickListener(null);
    }

    /* renamed from: w2 */
    public VideoAppealListItemModelBuilder m16212w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    /* renamed from: x2 */
    public VideoAppealListItemModelBuilder m16213x2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f30035q = str;
        return this;
    }

    /* renamed from: y2 */
    public VideoAppealListItemModelBuilder m16214y2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f30032n = str;
        return this;
    }
}
