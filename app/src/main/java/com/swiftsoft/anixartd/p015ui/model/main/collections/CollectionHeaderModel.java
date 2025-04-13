package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.PopupMenu;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.ViewOnClickListenerC2742a;
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
import p000a.C0000a;

/* compiled from: CollectionHeaderModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionHeaderModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CollectionHeaderModel extends EpoxyModel<View> {

    /* renamed from: n */
    @EpoxyAttribute
    public long f29492n;

    /* renamed from: o */
    @EpoxyAttribute
    public long f29493o;

    /* renamed from: p */
    @EpoxyAttribute
    public long f29494p;

    /* renamed from: q */
    @EpoxyAttribute
    public int f29495q;

    /* renamed from: r */
    @EpoxyAttribute
    public boolean f29496r;

    /* renamed from: s */
    @EpoxyAttribute
    public boolean f29497s;

    /* renamed from: u */
    @EpoxyAttribute
    public boolean f29499u;

    /* renamed from: v */
    @EpoxyAttribute
    public Listener f29500v;

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29489k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29490l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29491m = "";

    /* renamed from: t */
    @EpoxyAttribute
    @NotNull
    public String f29498t = "";

    /* compiled from: CollectionHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionHeaderModel$Companion;", "", "", "AVATAR_CHANGED", "I", "COMMENT_COUNT_CHANGED", "CREATION_DATE_CHANGED", "DESCRIPTION_CHANGED", "FAVORITE_CHANGED", "FAVORITE_COUNT_CHANGED", "IMAGE_CHANGED", "LAST_UPDATE_DATE_CHANGED", "PRIVATE_CHANGED", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CollectionHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/CollectionHeaderModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: D0 */
        void mo14381D0();

        /* renamed from: E0 */
        void mo14382E0();

        /* renamed from: Q0 */
        void mo14383Q0();

        /* renamed from: W0 */
        void mo14384W0();

        /* renamed from: a */
        void mo14386a();

        /* renamed from: i0 */
        void mo14388i0();

        /* renamed from: j0 */
        void mo14389j0();

        /* renamed from: p0 */
        void mo14390p0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.title)).setText(this.f29489k);
        ((TextView) view2.findViewById(C2507R.id.description)).setText(this.f29490l);
        TextView textView = (TextView) view2.findViewById(C2507R.id.description);
        Intrinsics.m32178g(textView, "view.description");
        final int i2 = 0;
        final int i3 = 1;
        ViewsKt.m16379l(textView, this.f29490l.length() > 0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.date_more);
        Intrinsics.m32178g(appCompatImageView, "view.date_more");
        ViewsKt.m16373f(appCompatImageView, this.f29493o <= this.f29492n, false, null, 6);
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.last_update_date);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2052a.m12271f(textView2, "view.last_update_date", textView2, view2, C2507R.id.date_more);
        Intrinsics.m32178g(appCompatImageView2, "view.date_more");
        ViewsKt.m16378k(appCompatImageView2);
        ((LinearLayout) view2.findViewById(C2507R.id.date_layout)).setOnClickListener(new ViewOnClickListenerC2742a(view2, i3));
        ((TextView) view2.findViewById(C2507R.id.description)).setTextIsSelectable(false);
        ((TextView) view2.findViewById(C2507R.id.description)).post(new RunnableC2749b(view2, i2));
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView3, "view.image");
        ViewsKt.m16376i(appCompatImageView3, this.f29491m, C2507R.drawable.placeholder_collection);
        TextView textView3 = (TextView) view2.findViewById(C2507R.id.create_date);
        Time time = Time.f30247a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView3.setText(time.m16361g(context, this.f29492n));
        TextView textView4 = (TextView) view2.findViewById(C2507R.id.last_update_date);
        StringBuilder m24u = C0000a.m24u("Ред. ");
        Context context2 = view2.getContext();
        Intrinsics.m32178g(context2, "view.context");
        m24u.append(time.m16361g(context2, this.f29493o));
        textView4.setText(m24u.toString());
        ((TextView) view2.findViewById(C2507R.id.comment_count)).setText(DigitsKt.m16325f(this.f29494p));
        ((TextView) view2.findViewById(C2507R.id.fav_count)).setText(DigitsKt.m16324e(this.f29495q));
        if (this.f29496r) {
            m15823x2(view2);
        } else {
            m15822w2(view2);
        }
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.private_collection);
        Intrinsics.m32178g(linearLayout, "view.private_collection");
        ViewsKt.m16379l(linearLayout, this.f29497s && this.f29499u);
        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(C2507R.id.management_actions);
        Intrinsics.m32178g(linearLayout2, "view.management_actions");
        ViewsKt.m16379l(linearLayout2, this.f29499u);
        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(C2507R.id.comments_show_all);
        Intrinsics.m32178g(linearLayout3, "view.comments_show_all");
        ViewsKt.m16373f(linearLayout3, this.f29497s, false, null, 6);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
        Intrinsics.m32178g(appCompatImageView4, "view.avatar");
        ViewsKt.m16368a(appCompatImageView4, this.f29498t);
        ((AppCompatImageView) view2.findViewById(C2507R.id.image)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.collections.a

            /* renamed from: c */
            public final /* synthetic */ CollectionHeaderModel f29541c;

            {
                this.f29541c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View moreView) {
                switch (i2) {
                    case 0:
                        CollectionHeaderModel this$0 = this.f29541c;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15821v2().mo14390p0();
                        break;
                    case 1:
                        CollectionHeaderModel this$02 = this.f29541c;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32178g(moreView, "moreView");
                        Context context3 = moreView.getContext();
                        PopupMenu popupMenu = new PopupMenu(context3, moreView);
                        popupMenu.m882a().inflate(C2507R.menu.collection, popupMenu.f1394b);
                        popupMenu.f1396d = new C2722a(this$02, 5);
                        MenuBuilder menuBuilder = popupMenu.f1394b;
                        Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context3, menuBuilder, moreView);
                        menuPopupHelper.m651e(true);
                        menuPopupHelper.f939g = 8388613;
                        menuPopupHelper.m653g();
                        break;
                    default:
                        CollectionHeaderModel this$03 = this.f29541c;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15821v2().mo14381D0();
                        break;
                }
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.addToFav);
        Intrinsics.m32178g(relativeLayout, "view.addToFav");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel$bind$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionHeaderModel.this.m15821v2().mo14386a();
                return Unit.f63088a;
            }
        });
        LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(C2507R.id.comments_show_all);
        Intrinsics.m32178g(linearLayout4, "view.comments_show_all");
        ViewsKt.m16377j(linearLayout4, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel$bind$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionHeaderModel.this.m15821v2().mo14388i0();
                return Unit.f63088a;
            }
        });
        ((AppCompatImageView) view2.findViewById(C2507R.id.more)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.collections.a

            /* renamed from: c */
            public final /* synthetic */ CollectionHeaderModel f29541c;

            {
                this.f29541c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View moreView) {
                switch (i3) {
                    case 0:
                        CollectionHeaderModel this$0 = this.f29541c;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15821v2().mo14390p0();
                        break;
                    case 1:
                        CollectionHeaderModel this$02 = this.f29541c;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32178g(moreView, "moreView");
                        Context context3 = moreView.getContext();
                        PopupMenu popupMenu = new PopupMenu(context3, moreView);
                        popupMenu.m882a().inflate(C2507R.menu.collection, popupMenu.f1394b);
                        popupMenu.f1396d = new C2722a(this$02, 5);
                        MenuBuilder menuBuilder = popupMenu.f1394b;
                        Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context3, menuBuilder, moreView);
                        menuPopupHelper.m651e(true);
                        menuPopupHelper.f939g = 8388613;
                        menuPopupHelper.m653g();
                        break;
                    default:
                        CollectionHeaderModel this$03 = this.f29541c;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15821v2().mo14381D0();
                        break;
                }
            }
        });
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.edit);
        Intrinsics.m32178g(relativeLayout2, "view.edit");
        ViewsKt.m16377j(relativeLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel$bind$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                CollectionHeaderModel.this.m15821v2().mo14382E0();
                return Unit.f63088a;
            }
        });
        final int i4 = 2;
        ((RelativeLayout) view2.findViewById(C2507R.id.delete)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.collections.a

            /* renamed from: c */
            public final /* synthetic */ CollectionHeaderModel f29541c;

            {
                this.f29541c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View moreView) {
                switch (i4) {
                    case 0:
                        CollectionHeaderModel this$0 = this.f29541c;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15821v2().mo14390p0();
                        break;
                    case 1:
                        CollectionHeaderModel this$02 = this.f29541c;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32178g(moreView, "moreView");
                        Context context3 = moreView.getContext();
                        PopupMenu popupMenu = new PopupMenu(context3, moreView);
                        popupMenu.m882a().inflate(C2507R.menu.collection, popupMenu.f1394b);
                        popupMenu.f1396d = new C2722a(this$02, 5);
                        MenuBuilder menuBuilder = popupMenu.f1394b;
                        Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context3, menuBuilder, moreView);
                        menuPopupHelper.m651e(true);
                        menuPopupHelper.f939g = 8388613;
                        menuPopupHelper.m653g();
                        break;
                    default:
                        CollectionHeaderModel this$03 = this.f29541c;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m15821v2().mo14381D0();
                        break;
                }
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof CollectionHeaderModel) {
            CollectionHeaderModel collectionHeaderModel = (CollectionHeaderModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29489k, collectionHeaderModel.f29489k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29490l, collectionHeaderModel.f29490l)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29491m, collectionHeaderModel.f29491m)) {
                m12276k.add(3);
            }
            if (this.f29492n != collectionHeaderModel.f29492n) {
                m12276k.add(4);
            }
            if (this.f29493o != collectionHeaderModel.f29493o) {
                m12276k.add(5);
            }
            if (this.f29494p != collectionHeaderModel.f29494p) {
                m12276k.add(6);
            }
            if (this.f29495q != collectionHeaderModel.f29495q) {
                m12276k.add(7);
            }
            if (this.f29496r != collectionHeaderModel.f29496r) {
                m12276k.add(8);
            }
            if (this.f29497s != collectionHeaderModel.f29497s) {
                m12276k.add(9);
            }
            if (!Intrinsics.m32174c(this.f29498t, collectionHeaderModel.f29498t)) {
                m12276k.add(10);
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
            ((TextView) view.findViewById(C2507R.id.title)).setText(this.f29489k);
        }
        if (list.contains(1)) {
            ((TextView) view.findViewById(C2507R.id.description)).setText(this.f29490l);
            TextView textView = (TextView) view.findViewById(C2507R.id.description);
            Intrinsics.m32178g(textView, "view.description");
            ViewsKt.m16379l(textView, this.f29490l.length() > 0);
        }
        if (list.contains(3)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16376i(appCompatImageView, this.f29491m, C2507R.drawable.placeholder_collection);
        }
        if (list.contains(4)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.create_date);
            Time time = Time.f30247a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            textView2.setText(time.m16361g(context, this.f29492n));
        }
        if (list.contains(5)) {
            TextView textView3 = (TextView) view.findViewById(C2507R.id.last_update_date);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2052a.m12271f(textView3, "view.last_update_date", textView3, view, C2507R.id.date_more);
            Intrinsics.m32178g(appCompatImageView2, "view.date_more");
            ViewsKt.m16378k(appCompatImageView2);
            TextView textView4 = (TextView) view.findViewById(C2507R.id.last_update_date);
            TextView textView5 = (TextView) C2052a.m12271f(textView4, "view.last_update_date", textView4, view, C2507R.id.last_update_date);
            StringBuilder m24u = C0000a.m24u("Ред. ");
            Time time2 = Time.f30247a;
            Context context2 = view.getContext();
            Intrinsics.m32178g(context2, "view.context");
            m24u.append(time2.m16361g(context2, this.f29493o));
            textView5.setText(m24u.toString());
        }
        if (list.contains(6)) {
            ((TextView) view.findViewById(C2507R.id.comment_count)).setText(DigitsKt.m16325f(this.f29494p));
        }
        if (list.contains(7)) {
            ((TextView) view.findViewById(C2507R.id.fav_count)).setText(DigitsKt.m16324e(this.f29495q));
        }
        if (list.contains(8)) {
            if (this.f29496r) {
                m15823x2(view);
            } else {
                m15822w2(view);
            }
        }
        if (list.contains(9)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.private_collection);
            Intrinsics.m32178g(linearLayout, "view.private_collection");
            ViewsKt.m16379l(linearLayout, this.f29497s && this.f29499u);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C2507R.id.comments_show_all);
            Intrinsics.m32178g(linearLayout2, "view.comments_show_all");
            ViewsKt.m16373f(linearLayout2, this.f29497s, false, null, 6);
        }
        if (list.contains(10)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView3, "view.avatar");
            ViewsKt.m16368a(appCompatImageView3, this.f29498t);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m15821v2() {
        Listener listener = this.f29500v;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }

    /* renamed from: w2 */
    public final void m15822w2(View view) {
        Context context = view.getContext();
        Intrinsics.m32178g(context, "context");
        int m16369b = ViewsKt.m16369b(context, C2507R.attr.secondaryTextColor);
        ((TextView) view.findViewById(C2507R.id.fav_count)).setText(DigitsKt.m16324e(this.f29495q));
        ((TextView) view.findViewById(C2507R.id.fav_text)).setText("Добавить в закладки");
        ((TextView) view.findViewById(C2507R.id.fav_count)).setTextColor(m16369b);
        ((TextView) view.findViewById(C2507R.id.fav_text)).setTextColor(m16369b);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.fav_icon);
        appCompatImageView.setImageDrawable(appCompatImageView.getResources().getDrawable(C2507R.drawable.ic_favorite_border));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(m16369b));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.addToFav);
        relativeLayout.setBackground(relativeLayout.getResources().getDrawable(C2507R.drawable.button_tag_large_default));
    }

    /* renamed from: x2 */
    public final void m15823x2(View view) {
        Resources resources = view.getContext().getResources();
        ((TextView) view.findViewById(C2507R.id.fav_count)).setText(DigitsKt.m16324e(this.f29495q));
        ((TextView) view.findViewById(C2507R.id.fav_text)).setText("Удалить из закладок");
        ((TextView) view.findViewById(C2507R.id.fav_count)).setTextColor(resources.getColor(C2507R.color.yellow));
        ((TextView) view.findViewById(C2507R.id.fav_text)).setTextColor(resources.getColor(C2507R.color.yellow));
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.fav_icon);
        appCompatImageView.setImageDrawable(resources.getDrawable(C2507R.drawable.ic_favorite));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(resources.getColor(C2507R.color.yellow)));
        ((RelativeLayout) view.findViewById(C2507R.id.addToFav)).setBackground(resources.getDrawable(C2507R.drawable.button_tag_large_yellow));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: y2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        ((RelativeLayout) view.findViewById(C2507R.id.addToFav)).setOnClickListener(null);
        ((LinearLayout) view.findViewById(C2507R.id.comments_show_all)).setOnClickListener(null);
        ((AppCompatImageView) view.findViewById(C2507R.id.more)).setOnClickListener(null);
        ((RelativeLayout) view.findViewById(C2507R.id.edit)).setOnClickListener(null);
        ((RelativeLayout) view.findViewById(C2507R.id.delete)).setOnClickListener(null);
        ((TextView) view.findViewById(C2507R.id.description)).setText("");
    }
}
