package com.swiftsoft.anixartd.p015ui.model.main.discover;

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
import com.swiftsoft.anixartd.p015ui.model.main.discover.CommentModel;
import com.swiftsoft.anixartd.utils.DigitsKt;
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

/* compiled from: CommentModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/CommentModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CommentModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29603k;

    /* renamed from: l */
    @EpoxyAttribute
    public long f29604l;

    /* renamed from: o */
    @EpoxyAttribute
    public boolean f29607o;

    /* renamed from: p */
    @EpoxyAttribute
    public int f29608p;

    /* renamed from: q */
    @EpoxyAttribute
    public long f29609q;

    /* renamed from: r */
    @EpoxyAttribute
    public boolean f29610r;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29613u;

    /* renamed from: v */
    @EpoxyAttribute
    public boolean f29614v;

    /* renamed from: w */
    @EpoxyAttribute
    public Listener f29615w;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f29605m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @NotNull
    public String f29606n = "";

    /* renamed from: s */
    @EpoxyAttribute
    @NotNull
    public String f29611s = "";

    /* renamed from: t */
    @EpoxyAttribute
    @Nullable
    public String f29612t = "";

    /* compiled from: CommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/CommentModel$Companion;", "", "", "AVATAR_CHANGED", "I", "DATE_CHANGED", "EDITED_CHANGED", "MIN_NEGATIVE_VOTES", "NICKNAME_CHANGED", "RELEASE_TITLE_CHANGED", "SPOILER_CHANGED", "SPONSOR_CHANGED", "TEXT_CHANGED", "VERIFIED_CHANGED", "VOTES_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/discover/CommentModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: b */
        void mo14547b(long j2);

        /* renamed from: f */
        void mo14549f(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.message)).setText(this.f29606n);
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f29611s);
        ((TextView) view2.findViewById(C2507R.id.title)).setText(this.f29605m);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.sponsor);
        Intrinsics.m32178g(appCompatImageView, "view.sponsor");
        ViewsKt.m16379l(appCompatImageView, this.f29613u);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.verified);
        Intrinsics.m32178g(appCompatImageView2, "view.verified");
        ViewsKt.m16379l(appCompatImageView2, this.f29614v);
        TextView textView = (TextView) view2.findViewById(C2507R.id.date);
        Time time = Time.f30247a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView.setText(time.m16361g(context, this.f29609q));
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.edited);
        Intrinsics.m32178g(appCompatImageView3, "view.edited");
        ViewsKt.m16379l(appCompatImageView3, this.f29610r);
        if (this.f29607o || this.f29608p <= -5) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            TextView textView2 = (TextView) C2052a.m12270e(view2, C2507R.attr.secondaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
            LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView2, "view.message", textView2, view2, C2507R.id.spoilerHideShow);
            Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
            ViewsKt.m16378k(linearLayout);
            TextView textView3 = (TextView) view2.findViewById(C2507R.id.tvSpoilerHint);
            int i2 = this.f29608p;
            textView3.setText((i2 <= -5 || !this.f29607o) ? (i2 > -5 || !this.f29607o) ? (i2 > -5 || this.f29607o) ? view2.getContext().getString(C2507R.string.comment_spoiler_warning) : view2.getContext().getString(C2507R.string.comment_too_many_negative_votes_warning) : view2.getContext().getString(C2507R.string.comment_spoiler_too_many_negative_votes_warning) : view2.getContext().getString(C2507R.string.comment_spoiler_warning));
            ((LinearLayout) view2.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2754a(booleanRef, view2, 0));
        } else {
            TextView textView4 = (TextView) C2052a.m12270e(view2, C2507R.attr.primaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
            LinearLayout linearLayout2 = (LinearLayout) C2052a.m12265C(textView4, "view.message", textView4, view2, C2507R.id.spoilerHideShow);
            Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
            ViewsKt.m16372e(linearLayout2);
        }
        ((TextView) view2.findViewById(C2507R.id.votes)).setText(StringsKt.m33891Q(DigitsKt.m16324e(this.f29608p), "-", "–", false, 4, null));
        int i3 = this.f29608p;
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
        ViewsKt.m16368a(appCompatImageView4, this.f29612t);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.discover.CommentModel$bind$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CommentModel commentModel = CommentModel.this;
                CommentModel.Listener listener = commentModel.f29615w;
                if (listener != null) {
                    listener.mo14547b(commentModel.f29604l);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
        Intrinsics.m32178g(appCompatImageView5, "view.avatar");
        ViewsKt.m16377j(appCompatImageView5, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.discover.CommentModel$bind$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CommentModel commentModel = CommentModel.this;
                CommentModel.Listener listener = commentModel.f29615w;
                if (listener != null) {
                    listener.mo14549f(commentModel.f29603k);
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
        if (epoxyModel instanceof CommentModel) {
            CommentModel commentModel = (CommentModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29606n, commentModel.f29606n)) {
                m12276k.add(0);
            }
            if (this.f29607o != commentModel.f29607o) {
                m12276k.add(1);
            }
            if (this.f29608p != commentModel.f29608p) {
                m12276k.add(2);
            }
            if (this.f29609q != commentModel.f29609q) {
                m12276k.add(3);
            }
            if (this.f29610r != commentModel.f29610r) {
                m12276k.add(9);
            }
            if (!Intrinsics.m32174c(this.f29611s, commentModel.f29611s)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f29612t, commentModel.f29612t)) {
                m12276k.add(5);
            }
            if (this.f29613u != commentModel.f29613u) {
                m12276k.add(6);
            }
            if (this.f29614v != commentModel.f29614v) {
                m12276k.add(7);
            }
            if (!Intrinsics.m32174c(this.f29605m, commentModel.f29605m)) {
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
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.message)).setText(this.f29606n);
        }
        int i2 = 1;
        if (list.contains(1)) {
            if (this.f29607o || this.f29608p <= -5) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                TextView textView = (TextView) C2052a.m12270e(view, C2507R.attr.secondaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView, "view.message", textView, view, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
                linearLayout.setVisibility(0);
                TextView textView2 = (TextView) view.findViewById(C2507R.id.tvSpoilerHint);
                int i3 = this.f29608p;
                textView2.setText((i3 <= -5 || !this.f29607o) ? (i3 > -5 || !this.f29607o) ? (i3 > -5 || this.f29607o) ? view.getContext().getString(C2507R.string.comment_spoiler_warning) : view.getContext().getString(C2507R.string.comment_too_many_negative_votes_warning) : view.getContext().getString(C2507R.string.comment_spoiler_too_many_negative_votes_warning) : view.getContext().getString(C2507R.string.comment_spoiler_warning));
                ((LinearLayout) view.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2754a(booleanRef, view, i2));
            } else {
                TextView textView3 = (TextView) C2052a.m12270e(view, C2507R.attr.primaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                Intrinsics.m32178g(textView3, "view.message");
                textView3.setVisibility(0);
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
                ViewsKt.m16372e(linearLayout2);
            }
        }
        if (list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.votes)).setText(StringsKt.m33891Q(DigitsKt.m16324e(this.f29608p), "-", "–", false, 4, null));
            int i4 = this.f29608p;
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
            textView4.setText(time.m16361g(context, this.f29609q));
        }
        if (list.contains(9)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.edited);
            Intrinsics.m32178g(appCompatImageView, "view.edited");
            ViewsKt.m16379l(appCompatImageView, this.f29610r);
        }
        if (list.contains(4)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f29611s);
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView2, "view.avatar");
            ViewsKt.m16375h(appCompatImageView2, this.f29612t);
        }
        if (list.contains(6)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.sponsor);
            Intrinsics.m32178g(appCompatImageView3, "view.sponsor");
            ViewsKt.m16379l(appCompatImageView3, this.f29613u);
        }
        if (list.contains(7)) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(C2507R.id.verified);
            Intrinsics.m32178g(appCompatImageView4, "view.verified");
            ViewsKt.m16379l(appCompatImageView4, this.f29614v);
        }
        if (list.contains(8)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29605m);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
