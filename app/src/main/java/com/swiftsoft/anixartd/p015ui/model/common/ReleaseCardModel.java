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
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
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
import p000a.C0000a;

/* compiled from: ReleaseCardModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseCardModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseCardModel extends EpoxyModel<View> {

    /* renamed from: r */
    @EpoxyAttribute
    public int f29394r;

    /* renamed from: s */
    @EpoxyAttribute
    public long f29395s;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29397u;

    /* renamed from: v */
    @EpoxyAttribute
    public int f29398v;

    /* renamed from: w */
    @EpoxyAttribute
    public boolean f29399w;

    /* renamed from: x */
    @EpoxyAttribute
    public ReleaseModel.Listener f29400x;

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29387k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public Integer f29388l = 0;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f29389m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Double f29390n = Double.valueOf(0.0d);

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public String f29391o = "";

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public String f29392p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @Nullable
    public String f29393q = "";

    /* renamed from: t */
    @EpoxyAttribute
    @Nullable
    public Long f29396t = 0L;

    /* compiled from: ReleaseCardModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseCardModel$Companion;", "", "", "DESCRIPTION_CHANGED", "I", "EPISODES_RELEASED_CHANGED", "EPISODES_TOTAL_CHANGED", "FAV_CHANGED", "GRADE_CHANGED", "IMAGE_CHANGED", "RATING_AVAILABLE_CHANGED", "RELEASE_STATUS_CHANGED", "SEASON_CHANGED", "STATUS_CHANGED", "TITLE_CHANGED", "YEAR_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        String str = this.f29387k;
        Integer num = this.f29388l;
        Integer num2 = this.f29389m;
        Double d = this.f29390n;
        Long l2 = this.f29396t;
        int i2 = this.f29394r;
        String str2 = this.f29393q;
        boolean z = this.f29397u;
        int i3 = this.f29398v;
        if (l2 != null && l2.longValue() == 3 && this.f29395s != 0) {
            ((TextView) view2.findViewById(C2507R.id.episodes)).setText(Time.f30247a.m16356b(this.f29395s, "d MMM yyyy г."));
        } else if (l2 != null && l2.longValue() == 3) {
            String str3 = "";
            if (1 <= i2 && i2 < 5) {
                str3 = C0000a.m15l("", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "осень" : "лето" : "весна" : "зима", ' ');
            }
            if (!(str2 == null || str2.length() == 0)) {
                str3 = C0000a.m16m(str3, str2, " г.");
            }
            if (str3.length() > 0) {
                ((TextView) view2.findViewById(C2507R.id.episodes)).setText(str3);
            } else {
                ((TextView) view2.findViewById(C2507R.id.episodes)).setText(context.getString(C2507R.string.coming_soon));
            }
        }
        ((ImageView) view2.findViewById(C2507R.id.favorite)).setVisibility(z ? 0 : 8);
        if (i3 != 0) {
            RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout, "view.status_layout");
            ViewsKt.m16380m(relativeLayout, true);
            if (i3 == 1) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("смотрю");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.green_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i3 == 2) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("в планах");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.purple_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i3 == 3) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("просмотрено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.blue_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i3 == 4) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("отложено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.yellow_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            } else if (i3 == 5) {
                ((TextView) view2.findViewById(C2507R.id.status)).setText("брошено");
                C2052a.m12280o(view2, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view2, C2507R.color.red_alpha, (RelativeLayout) view2.findViewById(C2507R.id.status_layout), C2507R.id.status));
            }
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.status_layout);
            Intrinsics.m32178g(relativeLayout2, "view.status_layout");
            ViewsKt.m16380m(relativeLayout2, false);
        }
        if (str == null || str.length() == 0) {
            ((TextView) view2.findViewById(C2507R.id.title)).setText("Без названия");
        } else {
            ((TextView) view2.findViewById(C2507R.id.title)).setText(str);
        }
        if (l2 == null || l2.longValue() != 3) {
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
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.rating_layout);
        Intrinsics.m32178g(linearLayout, "view.rating_layout");
        ViewsKt.m16379l(linearLayout, this.f29399w && (l2 == null || l2.longValue() != 3));
        if (d != null) {
            C2052a.m12285t(d, 0, 1, (TextView) view2.findViewById(C2507R.id.grade));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.poster);
        Intrinsics.m32178g(appCompatImageView, "view.poster");
        ViewsKt.m16375h(appCompatImageView, this.f29392p);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.common.ReleaseCardModel$bind$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseCardModel releaseCardModel = ReleaseCardModel.this;
                ReleaseModel.Listener listener = releaseCardModel.f29400x;
                if (listener != null) {
                    listener.mo14364g(releaseCardModel.f6925b);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 1));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ReleaseCardModel) {
            ReleaseCardModel releaseCardModel = (ReleaseCardModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29387k, releaseCardModel.f29387k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29388l, releaseCardModel.f29388l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29389m, releaseCardModel.f29389m)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32172a(this.f29390n, releaseCardModel.f29390n)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29391o, releaseCardModel.f29391o)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f29392p, releaseCardModel.f29392p)) {
                m12276k.add(5);
            }
            if (!Intrinsics.m32174c(this.f29393q, releaseCardModel.f29393q)) {
                m12276k.add(6);
            }
            if (this.f29394r != releaseCardModel.f29394r) {
                m12276k.add(7);
            }
            if (!Intrinsics.m32174c(this.f29396t, releaseCardModel.f29396t)) {
                m12276k.add(8);
            }
            if (this.f29397u != releaseCardModel.f29397u) {
                m12276k.add(9);
            }
            if (this.f29398v != releaseCardModel.f29398v) {
                m12276k.add(10);
            }
            if (this.f29399w != releaseCardModel.f29399w) {
                m12276k.add(11);
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
        Long l2;
        String str2;
        String str3;
        Double d;
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29387k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29388l);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f29389m, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29388l);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f29389m, textView2);
        }
        if (list.contains(3) && (d = this.f29390n) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29392p);
        }
        if (list.contains(9)) {
            ((ImageView) view.findViewById(C2507R.id.favorite)).setVisibility(this.f29397u ? 0 : 8);
        }
        if (list.contains(10)) {
            if (this.f29398v != 0) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout, "view.status_layout");
                ViewsKt.m16380m(relativeLayout, true);
                int i2 = this.f29398v;
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
        String str4 = "осень";
        if (list.contains(6) || list.contains(7)) {
            int i3 = this.f29394r;
            if (1 <= i3 && i3 < 5) {
                str = C0000a.m15l("", i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "" : "осень" : "лето" : "весна" : "зима", ' ');
            } else {
                str = "";
            }
            String str5 = this.f29393q;
            if (!(str5 == null || str5.length() == 0)) {
                str = C0000a.m20q(C0000a.m24u(str), this.f29393q, " г.");
            }
            if (str.length() > 0) {
                ((TextView) view.findViewById(C2507R.id.episodes)).setText(str);
            }
        }
        if (list.contains(8)) {
            Long l3 = this.f29396t;
            if (l3 != null && l3.longValue() == 3) {
                str2 = "";
                if (this.f29395s != 0) {
                    ((TextView) view.findViewById(C2507R.id.episodes)).setText(Time.f30247a.m16356b(this.f29395s, "d MMM yyyy г."));
                }
            } else {
                str2 = "";
            }
            Long l4 = this.f29396t;
            if (l4 != null && l4.longValue() == 3) {
                int i4 = this.f29394r;
                if (1 <= i4 && i4 < 5) {
                    if (i4 == 1) {
                        str4 = "зима";
                    } else if (i4 == 2) {
                        str4 = "весна";
                    } else if (i4 == 3) {
                        str4 = "лето";
                    } else if (i4 != 4) {
                        str4 = str2;
                    }
                    str3 = C0000a.m15l(str2, str4, ' ');
                } else {
                    str3 = str2;
                }
                String str6 = this.f29393q;
                if (!(str6 == null || str6.length() == 0)) {
                    str3 = C0000a.m20q(C0000a.m24u(str3), this.f29393q, " г.");
                }
                if (str3.length() > 0) {
                    ((TextView) view.findViewById(C2507R.id.episodes)).setText(str3);
                } else {
                    ((TextView) view.findViewById(C2507R.id.episodes)).setText(m12267b.getString(C2507R.string.coming_soon));
                }
            }
        }
        if (list.contains(11)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
            Intrinsics.m32178g(linearLayout, "view.rating_layout");
            ViewsKt.m16379l(linearLayout, this.f29399w && ((l2 = this.f29396t) == null || l2.longValue() != 3));
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
