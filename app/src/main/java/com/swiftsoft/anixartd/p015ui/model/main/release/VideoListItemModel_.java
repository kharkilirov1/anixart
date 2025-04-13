package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class VideoListItemModel_ extends VideoListItemModel implements GeneratedModel<View>, VideoListItemModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: F0 */
    public VideoListItemModelBuilder mo16224F0(long j2) {
        m4524l2();
        this.f30048k = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: O */
    public VideoListItemModelBuilder mo16225O(@Nullable String str) {
        m4524l2();
        this.f30053p = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: P */
    public VideoListItemModelBuilder mo16226P(long j2) {
        m4524l2();
        this.f30052o = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: b */
    public VideoListItemModelBuilder mo16227b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: c */
    public VideoListItemModelBuilder mo16228c(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f30054q = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_video_list;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoListItemModel_) || !super.equals(obj)) {
            return false;
        }
        VideoListItemModel_ videoListItemModel_ = (VideoListItemModel_) obj;
        Objects.requireNonNull(videoListItemModel_);
        if (this.f30048k != videoListItemModel_.f30048k) {
            return false;
        }
        String str = this.f30049l;
        if (str == null ? videoListItemModel_.f30049l != null : !str.equals(videoListItemModel_.f30049l)) {
            return false;
        }
        String str2 = this.f30050m;
        if (str2 == null ? videoListItemModel_.f30050m != null : !str2.equals(videoListItemModel_.f30050m)) {
            return false;
        }
        String str3 = this.f30051n;
        if (str3 == null ? videoListItemModel_.f30051n != null : !str3.equals(videoListItemModel_.f30051n)) {
            return false;
        }
        if (this.f30052o != videoListItemModel_.f30052o) {
            return false;
        }
        String str4 = this.f30053p;
        if (str4 == null ? videoListItemModel_.f30053p != null : !str4.equals(videoListItemModel_.f30053p)) {
            return false;
        }
        String str5 = this.f30054q;
        if (str5 == null ? videoListItemModel_.f30054q != null : !str5.equals(videoListItemModel_.f30054q)) {
            return false;
        }
        String str6 = this.f30055r;
        if (str6 == null ? videoListItemModel_.f30055r == null : str6.equals(videoListItemModel_.f30055r)) {
            return (this.f30056s == null) == (videoListItemModel_.f30056s == null);
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
        long j2 = this.f30048k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f30049l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30050m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30051n;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j3 = this.f30052o;
        int i3 = (hashCode4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str4 = this.f30053p;
        int hashCode5 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f30054q;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f30055r;
        return ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.f30056s != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: k */
    public VideoListItemModelBuilder mo16229k(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f30051n = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: p0 */
    public VideoListItemModelBuilder mo16230p0(VideoListItemModel.Listener listener) {
        m4524l2();
        this.f30056s = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: t1 */
    public VideoListItemModelBuilder mo16231t1(@Nullable String str) {
        m4524l2();
        this.f30050m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("VideoListItemModel_{videoId=");
        m24u.append(this.f30048k);
        m24u.append(", name=");
        m24u.append(this.f30049l);
        m24u.append(", categoryText=");
        m24u.append(this.f30050m);
        m24u.append(", nickname=");
        m24u.append(this.f30051n);
        m24u.append(", timestamp=");
        m24u.append(this.f30052o);
        m24u.append(", releaseTitleRu=");
        m24u.append(this.f30053p);
        m24u.append(", image=");
        m24u.append(this.f30054q);
        m24u.append(", hostingIcon=");
        m24u.append(this.f30055r);
        m24u.append(", listener=");
        m24u.append(this.f30056s);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: u1 */
    public VideoListItemModelBuilder mo16232u1(@Nullable String str) {
        m4524l2();
        this.f30055r = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.release.VideoListItemModelBuilder
    /* renamed from: z */
    public VideoListItemModelBuilder mo16233z(@NotNull String str) {
        m4524l2();
        this.f30049l = str;
        return this;
    }
}
