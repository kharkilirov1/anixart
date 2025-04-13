package com.swiftsoft.anixartd.p015ui.model.main.profile.comments;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.comments.ProfileCollectionCommentModel;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileCollectionCommentModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/comments/ProfileCollectionCommentModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ProfileCollectionCommentModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29860k;

    /* renamed from: l */
    @EpoxyAttribute
    public long f29861l;

    /* renamed from: m */
    @EpoxyAttribute
    public long f29862m;

    /* renamed from: n */
    @EpoxyAttribute
    public long f29863n;

    /* renamed from: q */
    @EpoxyAttribute
    public boolean f29866q;

    /* renamed from: r */
    @EpoxyAttribute
    public int f29867r;

    /* renamed from: s */
    @EpoxyAttribute
    public long f29868s;

    /* renamed from: t */
    @EpoxyAttribute
    public boolean f29869t;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29870u;

    /* renamed from: x */
    @EpoxyAttribute
    public boolean f29873x;

    /* renamed from: y */
    @EpoxyAttribute
    public boolean f29874y;

    /* renamed from: z */
    @EpoxyAttribute
    public Listener f29875z;

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public String f29864o = "";

    /* renamed from: p */
    @EpoxyAttribute
    @NotNull
    public String f29865p = "";

    /* renamed from: v */
    @EpoxyAttribute
    @NotNull
    public String f29871v = "";

    /* renamed from: w */
    @EpoxyAttribute
    @Nullable
    public String f29872w = "";

    /* compiled from: ProfileCollectionCommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/comments/ProfileCollectionCommentModel$Companion;", "", "", "AVATAR_CHANGED", "I", "COLLECTION_TITLE_CHANGED", "DATE_CHANGED", "DELETED_CHANGED", "EDITED_CHANGED", "MIN_NEGATIVE_VOTES", "NICKNAME_CHANGED", "SPOILER_CHANGED", "SPONSOR_CHANGED", "TEXT_CHANGED", "VERIFIED_CHANGED", "VOTES_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileCollectionCommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/comments/ProfileCollectionCommentModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: f */
        void mo14866f(long j2);

        /* renamed from: y0 */
        void mo14867y0(long j2, long j3, long j4);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.message)).setText(this.f29865p);
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f29871v);
        ((TextView) view2.findViewById(C2507R.id.title)).setText(this.f29864o);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.sponsor);
        Intrinsics.m32178g(appCompatImageView, "view.sponsor");
        ViewsKt.m16379l(appCompatImageView, this.f29873x);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.verified);
        Intrinsics.m32178g(appCompatImageView2, "view.verified");
        ViewsKt.m16379l(appCompatImageView2, this.f29874y);
        TextView textView = (TextView) view2.findViewById(C2507R.id.date);
        Time time = Time.f30247a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView.setText(time.m16361g(context, this.f29868s));
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) C2052a.m12264B(view2, C2507R.string.profile_comments_to_collection, (TextView) view2.findViewById(C2507R.id.contentType), C2507R.id.edited);
        Intrinsics.m32178g(appCompatImageView3, "view.edited");
        ViewsKt.m16379l(appCompatImageView3, this.f29869t);
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.message);
        Intrinsics.m32178g(textView2, "view.message");
        ViewsKt.m16373f(textView2, this.f29870u, false, null, 6);
        TextView textView3 = (TextView) view2.findViewById(C2507R.id.deleted);
        Intrinsics.m32178g(textView3, "view.deleted");
        ViewsKt.m16379l(textView3, this.f29870u);
        if (!this.f29870u) {
            if (this.f29866q || this.f29867r <= -5) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                TextView textView4 = (TextView) C2052a.m12270e(view2, C2507R.attr.secondaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView4, "view.message", textView4, view2, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
                ViewsKt.m16378k(linearLayout);
                TextView textView5 = (TextView) view2.findViewById(C2507R.id.tvSpoilerHint);
                int i2 = this.f29867r;
                textView5.setText((i2 <= -5 || !this.f29866q) ? (i2 > -5 || !this.f29866q) ? (i2 > -5 || this.f29866q) ? view2.getContext().getString(C2507R.string.comment_spoiler_warning) : view2.getContext().getString(C2507R.string.comment_too_many_negative_votes_warning) : view2.getContext().getString(C2507R.string.comment_spoiler_too_many_negative_votes_warning) : view2.getContext().getString(C2507R.string.comment_spoiler_warning));
                ((LinearLayout) view2.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2764b(booleanRef, view2, 1));
            } else {
                TextView textView6 = (TextView) C2052a.m12270e(view2, C2507R.attr.primaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout2 = (LinearLayout) C2052a.m12265C(textView6, "view.message", textView6, view2, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
                ViewsKt.m16372e(linearLayout2);
            }
        }
        ((TextView) view2.findViewById(C2507R.id.votes)).setText(StringsKt.m33891Q(String.valueOf(this.f29867r), "-", "–", false, 4, null));
        int i3 = this.f29867r;
        if (i3 == 0) {
            ((LinearLayout) view2.findViewById(C2507R.id.votes_layout)).setBackgroundResource(C2507R.drawable.background_comment_vote_regular);
            ((TextView) view2.findViewById(C2507R.id.votes)).setTextColor(ViewsKt.m16370c(view2, C2507R.attr.tertiaryTextColor));
        } else if (i3 > 0) {
            ((LinearLayout) view2.findViewById(C2507R.id.votes_layout)).setBackgroundResource(C2507R.drawable.background_comment_vote_positive);
            C2052a.m12280o(view2, C2507R.color.green, (TextView) view2.findViewById(C2507R.id.votes));
        } else {
            ((LinearLayout) view2.findViewById(C2507R.id.votes_layout)).setBackgroundResource(C2507R.drawable.background_comment_vote_negative);
            C2052a.m12280o(view2, C2507R.color.red, (TextView) view2.findViewById(C2507R.id.votes));
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
        Intrinsics.m32178g(appCompatImageView4, "view.avatar");
        ViewsKt.m16368a(appCompatImageView4, this.f29872w);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.comments.ProfileCollectionCommentModel$bind$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ProfileCollectionCommentModel profileCollectionCommentModel = ProfileCollectionCommentModel.this;
                ProfileCollectionCommentModel.Listener listener = profileCollectionCommentModel.f29875z;
                if (listener != null) {
                    listener.mo14867y0(profileCollectionCommentModel.f29863n, profileCollectionCommentModel.f29861l, profileCollectionCommentModel.f29862m);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
        Intrinsics.m32178g(appCompatImageView5, "view.avatar");
        ViewsKt.m16377j(appCompatImageView5, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.profile.comments.ProfileCollectionCommentModel$bind$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ProfileCollectionCommentModel profileCollectionCommentModel = ProfileCollectionCommentModel.this;
                ProfileCollectionCommentModel.Listener listener = profileCollectionCommentModel.f29875z;
                if (listener != null) {
                    listener.mo14866f(profileCollectionCommentModel.f29860k);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ProfileCollectionCommentModel) {
            ProfileCollectionCommentModel profileCollectionCommentModel = (ProfileCollectionCommentModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29865p, profileCollectionCommentModel.f29865p)) {
                m12276k.add(0);
            }
            if (this.f29866q != profileCollectionCommentModel.f29866q) {
                m12276k.add(1);
            }
            if (this.f29867r != profileCollectionCommentModel.f29867r) {
                m12276k.add(2);
            }
            if (this.f29868s != profileCollectionCommentModel.f29868s) {
                m12276k.add(3);
            }
            if (this.f29869t != profileCollectionCommentModel.f29869t) {
                m12276k.add(9);
            }
            if (this.f29870u != profileCollectionCommentModel.f29870u) {
                m12276k.add(10);
            }
            if (!Intrinsics.m32174c(this.f29871v, profileCollectionCommentModel.f29871v)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f29872w, profileCollectionCommentModel.f29872w)) {
                m12276k.add(5);
            }
            if (this.f29873x != profileCollectionCommentModel.f29873x) {
                m12276k.add(6);
            }
            if (this.f29874y != profileCollectionCommentModel.f29874y) {
                m12276k.add(7);
            }
            if (!Intrinsics.m32174c(this.f29864o, profileCollectionCommentModel.f29864o)) {
                m12276k.add(8);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        int i2 = 0;
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.message)).setText(this.f29865p);
        }
        if (list.contains(1)) {
            if (this.f29866q || this.f29867r <= -5) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                TextView textView = (TextView) C2052a.m12270e(view, C2507R.attr.secondaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView, "view.message", textView, view, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
                ViewsKt.m16378k(linearLayout);
                TextView textView2 = (TextView) view.findViewById(C2507R.id.tvSpoilerHint);
                int i3 = this.f29867r;
                textView2.setText((i3 <= -5 || !this.f29866q) ? (i3 > -5 || !this.f29866q) ? (i3 > -5 || this.f29866q) ? view.getContext().getString(C2507R.string.comment_spoiler_warning) : view.getContext().getString(C2507R.string.comment_too_many_negative_votes_warning) : view.getContext().getString(C2507R.string.comment_spoiler_too_many_negative_votes_warning) : view.getContext().getString(C2507R.string.comment_spoiler_warning));
                ((LinearLayout) view.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2764b(booleanRef, view, i2));
            } else {
                TextView textView3 = (TextView) C2052a.m12270e(view, C2507R.attr.primaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout2 = (LinearLayout) C2052a.m12265C(textView3, "view.message", textView3, view, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
                ViewsKt.m16372e(linearLayout2);
            }
        }
        if (list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.votes)).setText(StringsKt.m33891Q(String.valueOf(this.f29867r), "-", "–", false, 4, null));
            int i4 = this.f29867r;
            if (i4 == 0) {
                ((LinearLayout) view.findViewById(C2507R.id.votes_layout)).setBackgroundResource(C2507R.drawable.background_comment_vote_regular);
                ((TextView) view.findViewById(C2507R.id.votes)).setTextColor(ViewsKt.m16370c(view, C2507R.attr.tertiaryTextColor));
            } else if (i4 > 0) {
                ((LinearLayout) view.findViewById(C2507R.id.votes_layout)).setBackgroundResource(C2507R.drawable.background_comment_vote_positive);
                C2052a.m12280o(view, C2507R.color.green, (TextView) view.findViewById(C2507R.id.votes));
            } else {
                ((LinearLayout) view.findViewById(C2507R.id.votes_layout)).setBackgroundResource(C2507R.drawable.background_comment_vote_negative);
                C2052a.m12280o(view, C2507R.color.red, (TextView) view.findViewById(C2507R.id.votes));
            }
        }
        if (list.contains(3)) {
            TextView textView4 = (TextView) view.findViewById(C2507R.id.date);
            Time time = Time.f30247a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            textView4.setText(time.m16361g(context, this.f29868s));
        }
        if (list.contains(9)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.edited);
            Intrinsics.m32178g(appCompatImageView, "view.edited");
            ViewsKt.m16379l(appCompatImageView, this.f29869t);
        }
        if (list.contains(10)) {
            TextView textView5 = (TextView) view.findViewById(C2507R.id.message);
            Intrinsics.m32178g(textView5, "view.message");
            ViewsKt.m16373f(textView5, this.f29870u, false, null, 6);
            TextView textView6 = (TextView) view.findViewById(C2507R.id.deleted);
            Intrinsics.m32178g(textView6, "view.deleted");
            ViewsKt.m16379l(textView6, this.f29870u);
        }
        if (list.contains(4)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f29871v);
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView2, "view.avatar");
            ViewsKt.m16375h(appCompatImageView2, this.f29872w);
        }
        if (list.contains(6)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.sponsor);
            Intrinsics.m32178g(appCompatImageView3, "view.sponsor");
            ViewsKt.m16379l(appCompatImageView3, this.f29873x);
        }
        if (list.contains(7)) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(C2507R.id.verified);
            Intrinsics.m32178g(appCompatImageView4, "view.verified");
            ViewsKt.m16379l(appCompatImageView4, this.f29874y);
        }
        if (list.contains(8)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29864o);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
