package com.swiftsoft.anixartd.p015ui.model.main.streaming;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class VideoStreamingPlatformModel_ extends VideoStreamingPlatformModel implements GeneratedModel<View>, VideoStreamingPlatformModelBuilder {
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
        return C2507R.layout.item_video_stream_platform;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoStreamingPlatformModel_) || !super.equals(obj)) {
            return false;
        }
        VideoStreamingPlatformModel_ videoStreamingPlatformModel_ = (VideoStreamingPlatformModel_) obj;
        Objects.requireNonNull(videoStreamingPlatformModel_);
        String str = this.f30117k;
        if (str == null ? videoStreamingPlatformModel_.f30117k != null : !str.equals(videoStreamingPlatformModel_.f30117k)) {
            return false;
        }
        String str2 = this.f30118l;
        if (str2 == null ? videoStreamingPlatformModel_.f30118l == null : str2.equals(videoStreamingPlatformModel_.f30118l)) {
            return (this.f30119m == null) == (videoStreamingPlatformModel_.f30119m == null);
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
        String str = this.f30117k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30118l;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f30119m != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.VideoStreamingPlatformModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("VideoStreamingPlatformModel_{name=");
        m24u.append(this.f30117k);
        m24u.append(", icon=");
        m24u.append(this.f30118l);
        m24u.append(", listener=");
        m24u.append(this.f30119m);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.streaming.VideoStreamingPlatformModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    /* renamed from: w2 */
    public VideoStreamingPlatformModel_ m16289w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}
