package com.swiftsoft.anixartd.p015ui.model.common;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseHistoryModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseHistoryModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseHistoryModel extends EpoxyModel<View> {

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29407p;

    /* renamed from: q */
    @EpoxyAttribute
    public int f29408q;

    /* renamed from: t */
    @EpoxyAttribute
    public long f29411t;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29412u;

    /* renamed from: v */
    @EpoxyAttribute
    public Listener f29413v;

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29402k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public Integer f29403l = 0;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f29404m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Double f29405n = Double.valueOf(0.0d);

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public String f29406o = "";

    /* renamed from: r */
    @EpoxyAttribute
    @Nullable
    public String f29409r = "";

    /* renamed from: s */
    @EpoxyAttribute
    @Nullable
    public String f29410s = "";

    /* compiled from: ReleaseHistoryModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseHistoryModel$Companion;", "", "", "EPISODES_RELEASED_CHANGED", "I", "EPISODES_TOTAL_CHANGED", "FAV_CHANGED", "GRADE_CHANGED", "IMAGE_CHANGED", "LV_DATE_CHANGED", "LV_EPISODE_CHANGED", "RATING_AVAILABLE_CHANGED", "STATUS_CHANGED", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseHistoryModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseHistoryModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo14364g(long j2);

        /* renamed from: k */
        void mo14365k(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        String str;
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        String str2 = this.f29402k;
        Integer num = this.f29403l;
        Integer num2 = this.f29404m;
        Double d = this.f29405n;
        boolean z = this.f29407p;
        int i2 = this.f29408q;
        String str3 = this.f29409r;
        String str4 = this.f29410s;
        long j2 = this.f29411t;
        ((ImageView) view2.findViewById(C2507R.id.favorite)).setVisibility(z ? 0 : 8);
        if (i2 != 0) {
            RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout, "view.status_layout");
            ViewsKt.m16380m(relativeLayout, true);
            if (i2 == 1) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("смотрю");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.green_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 2) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("в планах");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.purple_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 3) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("просмотрено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.blue_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 4) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("отложено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.yellow_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i2 == 5) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("брошено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.red_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            }
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout2, "view.status_layout");
            ViewsKt.m16380m(relativeLayout2, false);
        }
        if (str2 == null || str2.length() == 0) {
            ((TextView) view2.findViewById(C2507R.id.title)).setText("Без названия");
        } else {
            ((TextView) view2.findViewById(C2507R.id.title)).setText(str2);
        }
        if (num != null && num2 != null && Intrinsics.m32174c(num, num2)) {
            TextView textView = (TextView) C2052a.m12272g(num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes), view2, C2507R.id.episodes);
            TextView textView2 = (TextView) C2052a.m12265C(textView, "view.episodes", textView, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView2, "view.dot");
            ViewsKt.m16378k(textView2);
        } else if (num != null && num2 != null) {
            C2052a.m12286u(num, " из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView3 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView4 = (TextView) C2052a.m12265C(textView3, "view.episodes", textView3, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView4, "view.dot");
            ViewsKt.m16378k(textView4);
        } else if (num != null && num2 == null) {
            TextView textView5 = (TextView) C2052a.m12272g(num, " из ? эп", (TextView) view2.findViewById(C2507R.id.episodes), view2, C2507R.id.episodes);
            TextView textView6 = (TextView) C2052a.m12265C(textView5, "view.episodes", textView5, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView6, "view.dot");
            ViewsKt.m16378k(textView6);
        } else if (num != null || num2 == null) {
            TextView textView7 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView8 = (TextView) C2052a.m12271f(textView7, "view.episodes", textView7, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView8, "view.dot");
            ViewsKt.m16372e(textView8);
        } else {
            C2052a.m12287v("? из ", num2, " эп", (TextView) view2.findViewById(C2507R.id.episodes));
            TextView textView9 = (TextView) view2.findViewById(C2507R.id.episodes);
            TextView textView10 = (TextView) C2052a.m12265C(textView9, "view.episodes", textView9, view2, C2507R.id.dot);
            Intrinsics.m32178g(textView10, "view.dot");
            ViewsKt.m16378k(textView10);
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.rating_layout);
        Intrinsics.m32178g(linearLayout, "view.rating_layout");
        ViewsKt.m16379l(linearLayout, this.f29412u);
        if (d != null) {
            C2052a.m12285t(d, 0, 1, (TextView) view2.findViewById(C2507R.id.grade));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f29406o);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseHistoryModel.this.m15750v2().mo14364g(ReleaseHistoryModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 2));
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.more);
        Intrinsics.m32178g(imageView, "view.more");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel$bind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseHistoryModel.this.m15750v2().mo14365k(ReleaseHistoryModel.this.f6925b);
                return Unit.f63088a;
            }
        });
        ((TextView) view2.findViewById(C2507R.id.episode)).setText(str3);
        ((TextView) view2.findViewById(C2507R.id.type)).setText(str4);
        TextView textView11 = (TextView) view2.findViewById(C2507R.id.time);
        if (j2 != 0) {
            Time time = Time.f30247a;
            Context context = view2.getContext();
            Intrinsics.m32178g(context, "view.context");
            str = time.m16361g(context, j2);
        } else {
            str = "недавно";
        }
        textView11.setText(str);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ReleaseHistoryModel) {
            ReleaseHistoryModel releaseHistoryModel = (ReleaseHistoryModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29402k, releaseHistoryModel.f29402k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29403l, releaseHistoryModel.f29403l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29404m, releaseHistoryModel.f29404m)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32172a(this.f29405n, releaseHistoryModel.f29405n)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29406o, releaseHistoryModel.f29406o)) {
                m12276k.add(4);
            }
            if (this.f29407p != releaseHistoryModel.f29407p) {
                m12276k.add(5);
            }
            if (this.f29408q != releaseHistoryModel.f29408q) {
                m12276k.add(6);
            }
            if (!Intrinsics.m32174c(this.f29409r, releaseHistoryModel.f29409r)) {
                m12276k.add(7);
            }
            if (!Intrinsics.m32174c(this.f29410s, releaseHistoryModel.f29410s)) {
                m12276k.add(7);
            }
            if (this.f29411t != releaseHistoryModel.f29411t) {
                m12276k.add(8);
            }
            if (this.f29412u != releaseHistoryModel.f29412u) {
                m12276k.add(9);
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
        String str;
        Double d;
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29402k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29403l);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f29404m, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29403l);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f29404m, textView2);
        }
        if (list.contains(3) && (d = this.f29405n) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(4)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29406o);
        }
        if (list.contains(5)) {
            ((ImageView) view.findViewById(C2507R.id.favorite)).setVisibility(this.f29407p ? 0 : 8);
        }
        if (list.contains(6)) {
            if (this.f29408q != 0) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout, "view.status_layout");
                ViewsKt.m16380m(relativeLayout, true);
                int i2 = this.f29408q;
                if (i2 == 1) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("смотрю");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.green_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 2) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("в планах");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.purple_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 3) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("просмотрено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.blue_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 4) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("отложено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.yellow_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i2 == 5) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("брошено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.red_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                }
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout2, "view.status_layout");
                ViewsKt.m16380m(relativeLayout2, false);
            }
        }
        if (list.contains(7)) {
            ((TextView) view.findViewById(C2507R.id.episode)).setText(this.f29409r);
            ((TextView) view.findViewById(C2507R.id.type)).setText(this.f29410s);
        }
        if (list.contains(8)) {
            TextView textView3 = (TextView) view.findViewById(C2507R.id.time);
            if (this.f29411t != 0) {
                Time time = Time.f30247a;
                Context context = view.getContext();
                Intrinsics.m32178g(context, "view.context");
                str = time.m16361g(context, this.f29411t);
            } else {
                str = "недавно";
            }
            textView3.setText(str);
        }
        if (list.contains(9)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
            Intrinsics.m32178g(linearLayout, "view.rating_layout");
            ViewsKt.m16379l(linearLayout, this.f29412u);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m15750v2() {
        Listener listener = this.f29413v;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
        ((ImageView) view.findViewById(C2507R.id.more)).setOnClickListener(null);
    }
}
