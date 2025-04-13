package com.swiftsoft.anixartd.p015ui.model.main.profile.comments;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ProfileCollectionCommentModel_ extends ProfileCollectionCommentModel implements GeneratedModel<View>, ProfileCollectionCommentModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: B */
    public ProfileCollectionCommentModelBuilder mo16092B(long j2) {
        m4524l2();
        this.f29860k = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: E */
    public ProfileCollectionCommentModelBuilder mo16093E(boolean z) {
        m4524l2();
        this.f29870u = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: I1 */
    public ProfileCollectionCommentModelBuilder mo16094I1(long j2) {
        m4524l2();
        this.f29863n = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: K */
    public ProfileCollectionCommentModelBuilder mo16095K(long j2) {
        m4524l2();
        this.f29862m = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: W */
    public ProfileCollectionCommentModelBuilder mo16096W(long j2) {
        m4524l2();
        this.f29861l = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: W0 */
    public ProfileCollectionCommentModelBuilder mo16097W0(@Nullable String str) {
        m4524l2();
        this.f29864o = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: a0 */
    public ProfileCollectionCommentModelBuilder mo16098a0(ProfileCollectionCommentModel.Listener listener) {
        m4524l2();
        this.f29875z = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: b */
    public ProfileCollectionCommentModelBuilder mo16099b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_profile_comment;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileCollectionCommentModel_) || !super.equals(obj)) {
            return false;
        }
        ProfileCollectionCommentModel_ profileCollectionCommentModel_ = (ProfileCollectionCommentModel_) obj;
        Objects.requireNonNull(profileCollectionCommentModel_);
        if (this.f29860k != profileCollectionCommentModel_.f29860k || this.f29861l != profileCollectionCommentModel_.f29861l || this.f29862m != profileCollectionCommentModel_.f29862m || this.f29863n != profileCollectionCommentModel_.f29863n) {
            return false;
        }
        String str = this.f29864o;
        if (str == null ? profileCollectionCommentModel_.f29864o != null : !str.equals(profileCollectionCommentModel_.f29864o)) {
            return false;
        }
        String str2 = this.f29865p;
        if (str2 == null ? profileCollectionCommentModel_.f29865p != null : !str2.equals(profileCollectionCommentModel_.f29865p)) {
            return false;
        }
        if (this.f29866q != profileCollectionCommentModel_.f29866q || this.f29867r != profileCollectionCommentModel_.f29867r || this.f29868s != profileCollectionCommentModel_.f29868s || this.f29869t != profileCollectionCommentModel_.f29869t || this.f29870u != profileCollectionCommentModel_.f29870u) {
            return false;
        }
        String str3 = this.f29871v;
        if (str3 == null ? profileCollectionCommentModel_.f29871v != null : !str3.equals(profileCollectionCommentModel_.f29871v)) {
            return false;
        }
        String str4 = this.f29872w;
        if (str4 == null ? profileCollectionCommentModel_.f29872w != null : !str4.equals(profileCollectionCommentModel_.f29872w)) {
            return false;
        }
        if (this.f29873x == profileCollectionCommentModel_.f29873x && this.f29874y == profileCollectionCommentModel_.f29874y) {
            return (this.f29875z == null) == (profileCollectionCommentModel_.f29875z == null);
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
        long j2 = this.f29860k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f29861l;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f29862m;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f29863n;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        String str = this.f29864o;
        int hashCode2 = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29865p;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29866q ? 1 : 0)) * 31) + this.f29867r) * 31;
        long j6 = this.f29868s;
        int i6 = (((((hashCode3 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f29869t ? 1 : 0)) * 31) + (this.f29870u ? 1 : 0)) * 31;
        String str3 = this.f29871v;
        int hashCode4 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29872w;
        return ((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f29873x ? 1 : 0)) * 31) + (this.f29874y ? 1 : 0)) * 31) + (this.f29875z != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: k */
    public ProfileCollectionCommentModelBuilder mo16100k(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29871v = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: l */
    public ProfileCollectionCommentModelBuilder mo16101l(@Nullable String str) {
        m4524l2();
        this.f29872w = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: p */
    public ProfileCollectionCommentModelBuilder mo16102p(boolean z) {
        m4524l2();
        this.f29874y = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: r */
    public ProfileCollectionCommentModelBuilder mo16103r(boolean z) {
        m4524l2();
        this.f29873x = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: t */
    public ProfileCollectionCommentModelBuilder mo16104t(long j2) {
        m4524l2();
        this.f29868s = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ProfileCollectionCommentModel_{profileId=");
        m24u.append(this.f29860k);
        m24u.append(", parentCommentId=");
        m24u.append(this.f29861l);
        m24u.append(", commentId=");
        m24u.append(this.f29862m);
        m24u.append(", collectionId=");
        m24u.append(this.f29863n);
        m24u.append(", collectionTitle=");
        m24u.append(this.f29864o);
        m24u.append(", message=");
        m24u.append(this.f29865p);
        m24u.append(", spoiler=");
        m24u.append(this.f29866q);
        m24u.append(", votes=");
        m24u.append(this.f29867r);
        m24u.append(", date=");
        m24u.append(this.f29868s);
        m24u.append(", edited=");
        m24u.append(this.f29869t);
        m24u.append(", deleted=");
        m24u.append(this.f29870u);
        m24u.append(", nickname=");
        m24u.append(this.f29871v);
        m24u.append(", avatar=");
        m24u.append(this.f29872w);
        m24u.append(", sponsor=");
        m24u.append(this.f29873x);
        m24u.append(", verified=");
        m24u.append(this.f29874y);
        m24u.append(", listener=");
        m24u.append(this.f29875z);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: u */
    public ProfileCollectionCommentModelBuilder mo16105u(boolean z) {
        m4524l2();
        this.f29866q = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: v */
    public ProfileCollectionCommentModelBuilder mo16106v(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29865p = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: w */
    public ProfileCollectionCommentModelBuilder mo16107w(boolean z) {
        m4524l2();
        this.f29869t = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModelBuilder
    /* renamed from: x */
    public ProfileCollectionCommentModelBuilder mo16108x(int i2) {
        m4524l2();
        this.f29867r = i2;
        return this;
    }
}
