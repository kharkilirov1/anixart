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
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ReleaseModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseModel extends EpoxyModel<View> {

    /* renamed from: r */
    @EpoxyAttribute
    public int f29423r;

    /* renamed from: s */
    @EpoxyAttribute
    public long f29424s;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29426u;

    /* renamed from: v */
    @EpoxyAttribute
    public int f29427v;

    /* renamed from: w */
    @EpoxyAttribute
    public boolean f29428w;

    /* renamed from: x */
    @EpoxyAttribute
    public Listener f29429x;

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29416k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public Integer f29417l = 0;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public Integer f29418m = 0;

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public Double f29419n = Double.valueOf(0.0d);

    /* renamed from: o */
    @EpoxyAttribute
    @Nullable
    public String f29420o = "";

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public String f29421p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @Nullable
    public String f29422q = "";

    /* renamed from: t */
    @EpoxyAttribute
    @Nullable
    public Long f29425t = 0L;

    /* compiled from: ReleaseModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Companion;", "", "", "DESCRIPTION_CHANGED", "I", "EPISODES_RELEASED_CHANGED", "EPISODES_TOTAL_CHANGED", "FAV_CHANGED", "GRADE_CHANGED", "IMAGE_CHANGED", "RATING_AVAILABLE_CHANGED", "RELEASE_STATUS_CHANGED", "SEASON_CHANGED", "STATUS_CHANGED", "TITLE_CHANGED", "YEAR_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ReleaseModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: g */
        void mo14364g(long j2);

        /* renamed from: k */
        void mo14365k(long j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x026b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.m32174c(r4, r9) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0222  */
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4496Z1(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel.mo4496Z1(java.lang.Object):void");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ReleaseModel) {
            ReleaseModel releaseModel = (ReleaseModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29416k, releaseModel.f29416k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29417l, releaseModel.f29417l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29418m, releaseModel.f29418m)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32172a(this.f29419n, releaseModel.f29419n)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29420o, releaseModel.f29420o)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f29421p, releaseModel.f29421p)) {
                m12276k.add(5);
            }
            if (!Intrinsics.m32174c(this.f29422q, releaseModel.f29422q)) {
                m12276k.add(6);
            }
            if (this.f29423r != releaseModel.f29423r) {
                m12276k.add(7);
            }
            if (!Intrinsics.m32174c(this.f29425t, releaseModel.f29425t)) {
                m12276k.add(8);
            }
            if (this.f29426u != releaseModel.f29426u) {
                m12276k.add(9);
            }
            if (this.f29427v != releaseModel.f29427v) {
                m12276k.add(10);
            }
            if (this.f29428w != releaseModel.f29428w) {
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
        String str2;
        Long l2;
        Double d;
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29416k);
        }
        if (list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29417l);
            sb.append(" из ");
            C2052a.m12288w(sb, this.f29418m, textView);
        }
        if (list.contains(2)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.episodes);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29417l);
            sb2.append(" из ");
            C2052a.m12288w(sb2, this.f29418m, textView2);
        }
        if (list.contains(3) && (d = this.f29419n) != null) {
            ((TextView) view.findViewById(C2507R.id.grade)).setText(DigitsKt.m16323d(d.doubleValue(), 0, 1));
        }
        if (list.contains(4)) {
            String str3 = this.f29420o;
            if (!(str3 == null || str3.length() == 0) || ((l2 = this.f29425t) != null && l2.longValue() == 3)) {
                ((TextView) view.findViewById(C2507R.id.description)).setText(this.f29420o);
            } else {
                ((TextView) view.findViewById(C2507R.id.description)).setText(view.getContext().getString(C2507R.string.description_not_specified));
            }
        }
        if (list.contains(5)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.poster);
            Intrinsics.m32178g(appCompatImageView, "view.poster");
            ViewsKt.m16375h(appCompatImageView, this.f29421p);
        }
        String str4 = "лето";
        String str5 = "";
        if (list.contains(6) || list.contains(7)) {
            int i2 = this.f29423r;
            if (1 <= i2 && i2 < 5) {
                str = C0000a.m15l("", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "осень" : "лето" : "весна" : "зима", ' ');
            } else {
                str = "";
            }
            String str6 = this.f29422q;
            if (!(str6 == null || str6.length() == 0)) {
                str = C0000a.m20q(C0000a.m24u(str), this.f29422q, " г.");
            }
            if (str.length() > 0) {
                ((TextView) view.findViewById(C2507R.id.announcement)).setText(str);
            }
        }
        if (list.contains(8)) {
            Long l3 = this.f29425t;
            if (l3 != null && l3.longValue() == 3) {
                str2 = "view.release_status";
                if (this.f29424s != 0) {
                    ((TextView) view.findViewById(C2507R.id.description)).setMaxLines(3);
                    TextView textView3 = (TextView) view.findViewById(C2507R.id.announcement);
                    TextView textView4 = (TextView) C2052a.m12265C(textView3, "view.announcement", textView3, view, C2507R.id.release_status);
                    ((TextView) C2052a.m12265C(textView4, str2, textView4, view, C2507R.id.release_status)).setText("Анонс");
                    ((TextView) view.findViewById(C2507R.id.announcement)).setText(Time.f30247a.m16356b(this.f29424s, "d MMM yyyy г."));
                }
            } else {
                str2 = "view.release_status";
            }
            Long l4 = this.f29425t;
            if (l4 != null && l4.longValue() == 3) {
                ((TextView) view.findViewById(C2507R.id.description)).setMaxLines(3);
                TextView textView5 = (TextView) view.findViewById(C2507R.id.announcement);
                TextView textView6 = (TextView) C2052a.m12265C(textView5, "view.announcement", textView5, view, C2507R.id.release_status);
                ((TextView) C2052a.m12265C(textView6, str2, textView6, view, C2507R.id.release_status)).setText("Анонс");
                int i3 = this.f29423r;
                if (1 <= i3 && i3 < 5) {
                    if (i3 == 1) {
                        str4 = "зима";
                    } else if (i3 == 2) {
                        str4 = "весна";
                    } else if (i3 != 3) {
                        str4 = i3 != 4 ? "" : "осень";
                    }
                    str5 = C0000a.m15l("", str4, ' ');
                }
                String str7 = this.f29422q;
                if (!(str7 == null || str7.length() == 0)) {
                    str5 = C0000a.m20q(C0000a.m24u(str5), this.f29422q, " г.");
                }
                if (str5.length() > 0) {
                    ((TextView) view.findViewById(C2507R.id.announcement)).setText(str5);
                } else {
                    ((TextView) view.findViewById(C2507R.id.announcement)).setText(m12267b.getString(C2507R.string.coming_soon));
                }
            } else {
                ((TextView) view.findViewById(C2507R.id.description)).setMaxLines(4);
                TextView textView7 = (TextView) view.findViewById(C2507R.id.description);
                TextView textView8 = (TextView) C2052a.m12265C(textView7, "view.description", textView7, view, C2507R.id.announcement);
                TextView textView9 = (TextView) C2052a.m12271f(textView8, "view.announcement", textView8, view, C2507R.id.release_status);
                Intrinsics.m32178g(textView9, str2);
                ViewsKt.m16372e(textView9);
            }
        }
        if (list.contains(9)) {
            ((ImageView) view.findViewById(C2507R.id.favorite)).setVisibility(this.f29426u ? 0 : 8);
        }
        if (list.contains(10)) {
            if (this.f29427v != 0) {
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout, "view.status_layout");
                ViewsKt.m16380m(relativeLayout, true);
                int i4 = this.f29427v;
                if (i4 == 1) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("смотрю");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.green_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i4 == 2) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("в планах");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.purple_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i4 == 3) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("просмотрено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.blue_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i4 == 4) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("отложено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.yellow_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                } else if (i4 == 5) {
                    ((TextView) view.findViewById(C2507R.id.status)).setText("брошено");
                    C2052a.m12280o(view, C2507R.color.white_alpha_75, (TextView) C2052a.m12269d(view, C2507R.color.red_alpha, (RelativeLayout) view.findViewById(C2507R.id.status_layout), C2507R.id.status));
                }
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C2507R.id.status_layout);
                Intrinsics.m32178g(relativeLayout2, "view.status_layout");
                ViewsKt.m16380m(relativeLayout2, false);
            }
        }
        if (list.contains(11)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.rating_layout);
            Intrinsics.m32178g(linearLayout, "view.rating_layout");
            ViewsKt.m16379l(linearLayout, this.f29428w);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m15754v2() {
        Listener listener = this.f29429x;
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
