package com.swiftsoft.anixartd.p015ui.model.main.profile.comments;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ProfileReleaseCommentModel_ extends ProfileReleaseCommentModel implements GeneratedModel<View>, ProfileReleaseCommentModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: B */
    public ProfileReleaseCommentModelBuilder mo16111B(long j2) {
        m4524l2();
        this.f29878k = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: E */
    public ProfileReleaseCommentModelBuilder mo16112E(boolean z) {
        m4524l2();
        this.f29888u = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: K */
    public ProfileReleaseCommentModelBuilder mo16113K(long j2) {
        m4524l2();
        this.f29880m = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: W */
    public ProfileReleaseCommentModelBuilder mo16114W(long j2) {
        m4524l2();
        this.f29879l = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: b */
    public ProfileReleaseCommentModelBuilder mo16115b(long j2) {
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
        if (!(obj instanceof ProfileReleaseCommentModel_) || !super.equals(obj)) {
            return false;
        }
        ProfileReleaseCommentModel_ profileReleaseCommentModel_ = (ProfileReleaseCommentModel_) obj;
        Objects.requireNonNull(profileReleaseCommentModel_);
        if (this.f29878k != profileReleaseCommentModel_.f29878k || this.f29879l != profileReleaseCommentModel_.f29879l || this.f29880m != profileReleaseCommentModel_.f29880m || this.f29881n != profileReleaseCommentModel_.f29881n) {
            return false;
        }
        String str = this.f29882o;
        if (str == null ? profileReleaseCommentModel_.f29882o != null : !str.equals(profileReleaseCommentModel_.f29882o)) {
            return false;
        }
        String str2 = this.f29883p;
        if (str2 == null ? profileReleaseCommentModel_.f29883p != null : !str2.equals(profileReleaseCommentModel_.f29883p)) {
            return false;
        }
        if (this.f29884q != profileReleaseCommentModel_.f29884q || this.f29885r != profileReleaseCommentModel_.f29885r || this.f29886s != profileReleaseCommentModel_.f29886s || this.f29887t != profileReleaseCommentModel_.f29887t || this.f29888u != profileReleaseCommentModel_.f29888u) {
            return false;
        }
        String str3 = this.f29889v;
        if (str3 == null ? profileReleaseCommentModel_.f29889v != null : !str3.equals(profileReleaseCommentModel_.f29889v)) {
            return false;
        }
        String str4 = this.f29890w;
        if (str4 == null ? profileReleaseCommentModel_.f29890w != null : !str4.equals(profileReleaseCommentModel_.f29890w)) {
            return false;
        }
        if (this.f29891x == profileReleaseCommentModel_.f29891x && this.f29892y == profileReleaseCommentModel_.f29892y) {
            return (this.f29893z == null) == (profileReleaseCommentModel_.f29893z == null);
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
        long j2 = this.f29878k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f29879l;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f29880m;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f29881n;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        String str = this.f29882o;
        int hashCode2 = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29883p;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29884q ? 1 : 0)) * 31) + this.f29885r) * 31;
        long j6 = this.f29886s;
        int i6 = (((((hashCode3 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f29887t ? 1 : 0)) * 31) + (this.f29888u ? 1 : 0)) * 31;
        String str3 = this.f29889v;
        int hashCode4 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29890w;
        return ((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f29891x ? 1 : 0)) * 31) + (this.f29892y ? 1 : 0)) * 31) + (this.f29893z != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: i1 */
    public ProfileReleaseCommentModelBuilder mo16116i1(ProfileReleaseCommentModel.Listener listener) {
        m4524l2();
        this.f29893z = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: k */
    public ProfileReleaseCommentModelBuilder mo16117k(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29889v = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: l */
    public ProfileReleaseCommentModelBuilder mo16118l(@Nullable String str) {
        m4524l2();
        this.f29890w = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: p */
    public ProfileReleaseCommentModelBuilder mo16119p(boolean z) {
        m4524l2();
        this.f29892y = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: r */
    public ProfileReleaseCommentModelBuilder mo16120r(boolean z) {
        m4524l2();
        this.f29891x = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: t */
    public ProfileReleaseCommentModelBuilder mo16121t(long j2) {
        m4524l2();
        this.f29886s = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ProfileReleaseCommentModel_{profileId=");
        m24u.append(this.f29878k);
        m24u.append(", parentCommentId=");
        m24u.append(this.f29879l);
        m24u.append(", commentId=");
        m24u.append(this.f29880m);
        m24u.append(", releaseId=");
        m24u.append(this.f29881n);
        m24u.append(", releaseTitle=");
        m24u.append(this.f29882o);
        m24u.append(", message=");
        m24u.append(this.f29883p);
        m24u.append(", spoiler=");
        m24u.append(this.f29884q);
        m24u.append(", votes=");
        m24u.append(this.f29885r);
        m24u.append(", date=");
        m24u.append(this.f29886s);
        m24u.append(", edited=");
        m24u.append(this.f29887t);
        m24u.append(", deleted=");
        m24u.append(this.f29888u);
        m24u.append(", nickname=");
        m24u.append(this.f29889v);
        m24u.append(", avatar=");
        m24u.append(this.f29890w);
        m24u.append(", sponsor=");
        m24u.append(this.f29891x);
        m24u.append(", verified=");
        m24u.append(this.f29892y);
        m24u.append(", listener=");
        m24u.append(this.f29893z);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: u */
    public ProfileReleaseCommentModelBuilder mo16122u(boolean z) {
        m4524l2();
        this.f29884q = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: v */
    public ProfileReleaseCommentModelBuilder mo16123v(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29883p = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: w */
    public ProfileReleaseCommentModelBuilder mo16124w(boolean z) {
        m4524l2();
        this.f29887t = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: w0 */
    public ProfileReleaseCommentModelBuilder mo16125w0(@Nullable String str) {
        m4524l2();
        this.f29882o = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: x */
    public ProfileReleaseCommentModelBuilder mo16126x(int i2) {
        m4524l2();
        this.f29885r = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileReleaseCommentModelBuilder
    /* renamed from: y */
    public ProfileReleaseCommentModelBuilder mo16127y(long j2) {
        m4524l2();
        this.f29881n = j2;
        return this;
    }
}
