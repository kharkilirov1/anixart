package com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook;

import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: TorlookModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/torlook/TorlookModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class TorlookModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29727k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29728l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29729m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @NotNull
    public String f29730n = "";

    /* renamed from: o */
    @EpoxyAttribute
    @NotNull
    public String f29731o = "";

    /* renamed from: p */
    @EpoxyAttribute
    @NotNull
    public String f29732p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @NotNull
    public String f29733q = "";

    /* renamed from: r */
    @EpoxyAttribute
    @NotNull
    public String f29734r = "";

    /* renamed from: s */
    @EpoxyAttribute
    @NotNull
    public String f29735s = "";

    /* renamed from: t */
    @EpoxyAttribute
    @NotNull
    public String f29736t = "";

    /* renamed from: u */
    @EpoxyAttribute
    public Listener f29737u;

    /* compiled from: TorlookModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/torlook/TorlookModel$Companion;", "", "", "DATE_CHANGED", "I", "LEECH_COUNT_CHANGED", "SEARCH_QUERY_CHANGED", "SEED_COUNT_CHANGED", "SIZE_CHANGED", "TITLE_CHANGED", "TRACKER_DOMAIN_CHANGED", "TRACKER_ICON_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: TorlookModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/torlook/TorlookModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: N0 */
        void mo14621N0(@NotNull String str);

        /* renamed from: n0 */
        void mo14622n0(@NotNull String str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4496Z1(android.view.View r9) {
        /*
            r8 = this;
            android.view.View r9 = (android.view.View) r9
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.m32179h(r9, r0)
            r0 = 2131363004(0x7f0a04bc, float:1.8345805E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r8.f29727k
            java.lang.String r2 = r8.f29728l
            java.lang.String r1 = r8.m15992v2(r1, r2)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            r0 = 2131362827(0x7f0a040b, float:1.8345446E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r8.f29729m
            r0.setText(r1)
            r0 = 2131362106(0x7f0a013a, float:1.8343983E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r8.f29730n
            r0.setText(r1)
            r0 = 2131363024(0x7f0a04d0, float:1.8345845E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r8.f29731o
            r0.setText(r1)
            r0 = 2131363025(0x7f0a04d1, float:1.8345847E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "view.tracker_icon"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            java.lang.String r1 = r8.f29732p
            com.swiftsoft.anixartd.utils.ViewsKt.m16375h(r0, r1)
            r0 = 2131362792(0x7f0a03e8, float:1.8345375E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r8.f29733q
            r0.setText(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r8.f29734r
            r0.setText(r1)
            r0 = 2131362164(0x7f0a0174, float:1.83441E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "view.dot"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            java.lang.String r1 = r8.f29729m
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L92
            r1 = 1
            goto L93
        L92:
            r1 = 0
        L93:
            if (r1 != 0) goto La5
            java.lang.String r1 = r8.f29730n
            int r1 = r1.length()
            if (r1 != 0) goto L9f
            r1 = 1
            goto La0
        L9f:
            r1 = 0
        La0:
            if (r1 == 0) goto La3
            goto La5
        La3:
            r1 = 0
            goto La6
        La5:
            r1 = 1
        La6:
            r4 = 0
            r5 = 6
            com.swiftsoft.anixartd.utils.ViewsKt.m16373f(r0, r1, r3, r4, r5)
            r0 = 2131362454(0x7f0a0296, float:1.834469E38)
            android.view.View r1 = r9.findViewById(r0)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r6 = "view.magnet_link"
            kotlin.jvm.internal.Intrinsics.m32178g(r1, r6)
            java.lang.String r7 = r8.f29736t
            int r7 = r7.length()
            if (r7 != 0) goto Lc2
            goto Lc3
        Lc2:
            r2 = 0
        Lc3:
            com.swiftsoft.anixartd.utils.ViewsKt.m16373f(r1, r2, r3, r4, r5)
            r1 = 2131362436(0x7f0a0284, float:1.8344653E38)
            android.view.View r1 = r9.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r2 = "view.link"
            kotlin.jvm.internal.Intrinsics.m32178g(r1, r2)
            com.swiftsoft.anixartd.ui.model.main.episodes.torlook.TorlookModel$bind$1 r2 = new com.swiftsoft.anixartd.ui.model.main.episodes.torlook.TorlookModel$bind$1
            r2.<init>()
            com.swiftsoft.anixartd.utils.ViewsKt.m16377j(r1, r2)
            android.view.View r9 = r9.findViewById(r0)
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            kotlin.jvm.internal.Intrinsics.m32178g(r9, r6)
            com.swiftsoft.anixartd.ui.model.main.episodes.torlook.TorlookModel$bind$2 r0 = new com.swiftsoft.anixartd.ui.model.main.episodes.torlook.TorlookModel$bind$2
            r0.<init>()
            com.swiftsoft.anixartd.utils.ViewsKt.m16377j(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModel.mo4496Z1(java.lang.Object):void");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof TorlookModel) {
            TorlookModel torlookModel = (TorlookModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29727k, torlookModel.f29727k)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29728l, torlookModel.f29728l)) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32174c(this.f29729m, torlookModel.f29729m)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f29730n, torlookModel.f29730n)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f29731o, torlookModel.f29731o)) {
                m12276k.add(5);
            }
            if (!Intrinsics.m32174c(this.f29732p, torlookModel.f29732p)) {
                m12276k.add(6);
            }
            if (!Intrinsics.m32174c(this.f29733q, torlookModel.f29733q)) {
                m12276k.add(7);
            }
            if (!Intrinsics.m32174c(this.f29734r, torlookModel.f29734r)) {
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
        if (C2052a.m12291z(view, "view", list, "payloads", 1) || list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.title)).setText(Html.fromHtml(m15992v2(this.f29727k, this.f29728l)));
        }
        if (list.contains(3)) {
            ((TextView) view.findViewById(C2507R.id.size)).setText(this.f29729m);
            TextView textView = (TextView) view.findViewById(C2507R.id.dot);
            Intrinsics.m32178g(textView, "view.dot");
            ViewsKt.m16373f(textView, this.f29729m.length() == 0, false, null, 6);
        }
        if (list.contains(4)) {
            ((TextView) view.findViewById(C2507R.id.date)).setText(this.f29730n);
            TextView textView2 = (TextView) view.findViewById(C2507R.id.dot);
            Intrinsics.m32178g(textView2, "view.dot");
            ViewsKt.m16373f(textView2, this.f29730n.length() == 0, false, null, 6);
        }
        if (list.contains(5)) {
            ((TextView) view.findViewById(C2507R.id.tracker_domain)).setText(this.f29731o);
        }
        if (list.contains(6)) {
            ImageView imageView = (ImageView) view.findViewById(C2507R.id.tracker_icon);
            Intrinsics.m32178g(imageView, "view.tracker_icon");
            ViewsKt.m16375h(imageView, this.f29732p);
        }
        if (list.contains(7)) {
            ((TextView) view.findViewById(C2507R.id.seed_count)).setText(this.f29733q);
        }
        if (list.contains(8)) {
            ((TextView) view.findViewById(C2507R.id.leech_count)).setText(this.f29734r);
        }
    }

    /* renamed from: v2 */
    public final String m15992v2(String str, String str2) {
        Object[] array = StringsKt.m33893S(str, new String[]{" "}, false, 0, 6, null).toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        for (String str3 : (String[]) array) {
            String m33873e = new Regex("[<>{}\"\\/|;:.,~!?@#$%^=&*']").m33873e(str3, "");
            str2 = new Regex(C0000a.m14k("(?i)", m33873e)).m33873e(str2, "<b>" + m33873e + "</b>");
        }
        return str2;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
