package com.swiftsoft.anixartd.p015ui.model.main.episodes;

import android.content.Context;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.div2.C3033a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpisodeModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/EpisodeModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class EpisodeModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29685k;

    /* renamed from: l */
    @EpoxyAttribute
    public long f29686l;

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f29687m = "";

    /* renamed from: n */
    @EpoxyAttribute
    public boolean f29688n;

    /* renamed from: o */
    @EpoxyAttribute
    public boolean f29689o;

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f29690p;

    /* renamed from: q */
    @EpoxyAttribute
    public int f29691q;

    /* renamed from: r */
    @EpoxyAttribute
    public Listener f29692r;

    /* renamed from: s */
    @Nullable
    public PopupMenu f29693s;

    /* compiled from: EpisodeModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/EpisodeModel$Companion;", "", "", "DOWNLOAD_AVAILABLE_CHANGED", "I", "FILLER_CHANGED", "NAME_CHANGED", "OPENED_CHANGED", "PLAYBACK_POSITION_CHANGED", "", "WATCHING_TIME_FULLY", "J", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: EpisodeModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/episodes/EpisodeModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: b */
        void mo14585b(int i2, boolean z);

        /* renamed from: e */
        void mo14588e(int i2);

        /* renamed from: g */
        void mo14590g(int i2);

        /* renamed from: h */
        void mo14591h(int i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        String m17745g;
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        PopupMenu popupMenu = this.f29693s;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
        PopupMenu popupMenu2 = new PopupMenu(context, (RelativeLayout) view2.findViewById(C2507R.id.more), 0, C2507R.attr.popupMenuStyle, C2507R.style.CustomPopupMenuStyle);
        if (this.f29689o) {
            popupMenu2.getMenu().add(context.getString(C2507R.string.watch_mark_remove));
        } else {
            popupMenu2.getMenu().add(context.getString(C2507R.string.watch_mark_add));
        }
        popupMenu2.getMenu().add(context.getString(C2507R.string.report));
        popupMenu2.setOnMenuItemClickListener(new C2759b(context, this, 1));
        this.f29693s = popupMenu2;
        RelativeLayout bind$lambda$6 = (RelativeLayout) view2.findViewById(C2507R.id.download);
        Intrinsics.m32178g(bind$lambda$6, "bind$lambda$6");
        ViewsKt.m16377j(bind$lambda$6, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeModel$bind$6$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                EpisodeModel.this.m15967v2().mo14588e(EpisodeModel.this.f29691q);
                return Unit.f63088a;
            }
        });
        ViewsKt.m16379l(bind$lambda$6, this.f29690p);
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.more);
        Intrinsics.m32178g(relativeLayout, "view.more");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeModel$bind$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                PopupMenu popupMenu3 = EpisodeModel.this.f29693s;
                if (popupMenu3 != null) {
                    popupMenu3.show();
                }
                return Unit.f63088a;
            }
        });
        TextView textView = (TextView) view2.findViewById(C2507R.id.primaryText);
        String str = this.f29685k;
        textView.setText(!(str == null || str.length() == 0) ? this.f29685k : context.getString(C2507R.string.unknown_episode));
        TextView textView2 = (TextView) view2.findViewById(C2507R.id.secondaryText);
        if (this.f29686l == -1) {
            m17745g = context.getString(C2507R.string.watching_time_full);
        } else {
            String string = context.getString(C2507R.string.watching_time);
            Intrinsics.m32178g(string, "context.getString(R.string.watching_time)");
            m17745g = C3033a.m17745g(new Object[]{Time.f30247a.m16357c(this.f29686l / 1000)}, 1, string, "format(format, *args)");
        }
        Intrinsics.m32178g(m17745g, "if (playbackPosition == …/ 1000)\n                )");
        textView2.setText(m17745g);
        long j2 = this.f29686l;
        ViewsKt.m16379l(textView2, j2 == -1 || j2 > 1000);
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(C2507R.id.filler_layout);
        Intrinsics.m32178g(relativeLayout2, "view.filler_layout");
        ViewsKt.m16379l(relativeLayout2, this.f29688n);
        RelativeLayout relativeLayout3 = (RelativeLayout) view2.findViewById(C2507R.id.watched_layout);
        Intrinsics.m32178g(relativeLayout3, "view.watched_layout");
        ViewsKt.m16379l(relativeLayout3, this.f29689o);
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2758a(this, 1));
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 8));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof EpisodeModel) {
            EpisodeModel episodeModel = (EpisodeModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29685k, episodeModel.f29685k)) {
                m12276k.add(0);
            }
            if (this.f29686l != episodeModel.f29686l) {
                m12276k.add(1);
            }
            if (this.f29688n != episodeModel.f29688n) {
                m12276k.add(2);
            }
            if (this.f29689o != episodeModel.f29689o) {
                m12276k.add(3);
            }
            if (this.f29690p != episodeModel.f29690p) {
                m12276k.add(4);
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
        String m17745g;
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        boolean z = true;
        if (list.contains(0)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.primaryText);
            String str = this.f29685k;
            textView.setText(!(str == null || str.length() == 0) ? this.f29685k : m12267b.getString(C2507R.string.unknown_episode));
        }
        if (list.contains(1)) {
            TextView textView2 = (TextView) view.findViewById(C2507R.id.secondaryText);
            if (this.f29686l == -1) {
                m17745g = m12267b.getString(C2507R.string.watching_time_full);
            } else {
                String string = m12267b.getString(C2507R.string.watching_time);
                Intrinsics.m32178g(string, "context.getString(R.string.watching_time)");
                m17745g = C3033a.m17745g(new Object[]{Time.f30247a.m16357c(this.f29686l / 1000)}, 1, string, "format(format, *args)");
            }
            Intrinsics.m32178g(m17745g, "if (playbackPosition == …00)\n                    )");
            textView2.setText(m17745g);
            long j2 = this.f29686l;
            if (j2 != -1 && j2 <= 1000) {
                z = false;
            }
            ViewsKt.m16379l(textView2, z);
        }
        if (list.contains(2)) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.filler_layout);
            Intrinsics.m32178g(relativeLayout, "view.filler_layout");
            ViewsKt.m16379l(relativeLayout, this.f29688n);
        }
        if (list.contains(3)) {
            PopupMenu popupMenu = this.f29693s;
            if (popupMenu != null) {
                popupMenu.dismiss();
            }
            PopupMenu popupMenu2 = new PopupMenu(m12267b, (RelativeLayout) view.findViewById(C2507R.id.more), 0, C2507R.attr.popupMenuStyle, C2507R.style.CustomPopupMenuStyle);
            if (this.f29689o) {
                popupMenu2.getMenu().add(m12267b.getString(C2507R.string.watch_mark_remove));
            } else {
                popupMenu2.getMenu().add(m12267b.getString(C2507R.string.watch_mark_add));
            }
            popupMenu2.getMenu().add(m12267b.getString(C2507R.string.report));
            popupMenu2.setOnMenuItemClickListener(new C2759b(m12267b, this, 0));
            this.f29693s = popupMenu2;
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C2507R.id.more);
            Intrinsics.m32178g(relativeLayout2, "view.more");
            ViewsKt.m16377j(relativeLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.episodes.EpisodeModel$bind$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view2) {
                    View it = view2;
                    Intrinsics.m32179h(it, "it");
                    PopupMenu popupMenu3 = EpisodeModel.this.f29693s;
                    if (popupMenu3 != null) {
                        popupMenu3.show();
                    }
                    return Unit.f63088a;
                }
            });
            view.setOnLongClickListener(new ViewOnLongClickListenerC2758a(this, 0));
            RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(C2507R.id.watched_layout);
            Intrinsics.m32178g(relativeLayout3, "view.watched_layout");
            ViewsKt.m16379l(relativeLayout3, this.f29689o);
        }
        if (list.contains(4)) {
            RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(C2507R.id.download);
            Intrinsics.m32178g(relativeLayout4, "view.download");
            ViewsKt.m16379l(relativeLayout4, this.f29690p);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m15967v2() {
        Listener listener = this.f29692r;
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
        PopupMenu popupMenu = this.f29693s;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
        ((RelativeLayout) view.findViewById(C2507R.id.more)).setOnClickListener(null);
        ((RelativeLayout) view.findViewById(C2507R.id.download)).setOnClickListener(null);
        view.setOnClickListener(null);
    }
}
