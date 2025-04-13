package com.swiftsoft.anixartd.p015ui.model.main.notifications;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseCommentModel;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationReleaseCommentModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseCommentModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class NotificationReleaseCommentModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f29783k;

    /* renamed from: l */
    @EpoxyAttribute
    public long f29784l;

    /* renamed from: m */
    @EpoxyAttribute
    public long f29785m;

    /* renamed from: o */
    @EpoxyAttribute
    public boolean f29787o;

    /* renamed from: r */
    @EpoxyAttribute
    public long f29790r;

    /* renamed from: s */
    @EpoxyAttribute
    public boolean f29791s;

    /* renamed from: t */
    @EpoxyAttribute
    public Listener f29792t;

    /* renamed from: n */
    @EpoxyAttribute
    @NotNull
    public String f29786n = "";

    /* renamed from: p */
    @EpoxyAttribute
    @NotNull
    public String f29788p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @NotNull
    public String f29789q = "";

    /* compiled from: NotificationReleaseCommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseCommentModel$Companion;", "", "", "AVATAR_CHANGED", "I", "IS_NEW_CHANGED", "LOGIN_CHANGED", "MESSAGE_CHANGED", "SPOILER_CHANGED", "TIMESTAMP_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: NotificationReleaseCommentModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/notifications/NotificationReleaseCommentModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: N */
        void mo14713N(long j2, long j3, long j4);

        /* renamed from: k */
        void mo14718k(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16368a(appCompatImageView, this.f29789q);
        TextView textView = (TextView) view2.findViewById(C2507R.id.message);
        String string = context.getString(C2507R.string.comment_notification_text);
        Intrinsics.m32178g(string, "context.getString(R.stri…omment_notification_text)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.f29788p, this.f29786n}, 2));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        if (this.f29787o) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            TextView textView2 = (TextView) C2052a.m12270e(view2, C2507R.attr.secondaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
            LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView2, "view.message", textView2, view2, C2507R.id.spoilerHideShow);
            Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
            ViewsKt.m16378k(linearLayout);
            ((LinearLayout) view2.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2762b(booleanRef, view2, 2));
        } else {
            TextView textView3 = (TextView) C2052a.m12270e(view2, C2507R.attr.primaryTextColor, (TextView) view2.findViewById(C2507R.id.message), C2507R.id.message);
            LinearLayout linearLayout2 = (LinearLayout) C2052a.m12265C(textView3, "view.message", textView3, view2, C2507R.id.spoilerHideShow);
            Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
            ViewsKt.m16372e(linearLayout2);
        }
        TextView textView4 = (TextView) view2.findViewById(C2507R.id.date);
        long j2 = this.f29790r;
        textView4.setText(j2 != 0 ? Time.f30247a.m16361g(context, j2) : "время не указано");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.is_new);
        Intrinsics.m32178g(appCompatImageView2, "view.is_new");
        ViewsKt.m16379l(appCompatImageView2, this.f29791s);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.notifications.NotificationReleaseCommentModel$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                NotificationReleaseCommentModel notificationReleaseCommentModel = NotificationReleaseCommentModel.this;
                NotificationReleaseCommentModel.Listener listener = notificationReleaseCommentModel.f29792t;
                if (listener != null) {
                    listener.mo14713N(notificationReleaseCommentModel.f29783k, notificationReleaseCommentModel.f29784l, notificationReleaseCommentModel.f29785m);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 10));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof NotificationReleaseCommentModel) {
            NotificationReleaseCommentModel notificationReleaseCommentModel = (NotificationReleaseCommentModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29786n, notificationReleaseCommentModel.f29786n)) {
                m12276k.add(0);
            }
            if (this.f29787o != notificationReleaseCommentModel.f29787o) {
                m12276k.add(5);
            }
            if (!Intrinsics.m32174c(this.f29788p, notificationReleaseCommentModel.f29788p)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f29789q, notificationReleaseCommentModel.f29789q)) {
                m12276k.add(2);
            }
            if (this.f29790r != notificationReleaseCommentModel.f29790r) {
                m12276k.add(3);
            }
            if (this.f29791s != notificationReleaseCommentModel.f29791s) {
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
        String str;
        Context context = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0) || list.contains(1)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.message);
            String string = view.getContext().getString(C2507R.string.notification_comment_spoiler_warning);
            Intrinsics.m32178g(string, "view.context.getString(R…_comment_spoiler_warning)");
            String format = String.format(string, Arrays.copyOf(new Object[]{this.f29788p, this.f29786n}, 2));
            Intrinsics.m32178g(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
        }
        if (list.contains(5)) {
            if (this.f29787o) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                TextView textView2 = (TextView) C2052a.m12270e(view, C2507R.attr.secondaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout = (LinearLayout) C2052a.m12271f(textView2, "view.message", textView2, view, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout, "view.spoilerHideShow");
                ViewsKt.m16378k(linearLayout);
                ((LinearLayout) view.findViewById(C2507R.id.spoilerHideShow)).setOnClickListener(new ViewOnClickListenerC2762b(booleanRef, view, 3));
            } else {
                TextView textView3 = (TextView) C2052a.m12270e(view, C2507R.attr.primaryTextColor, (TextView) view.findViewById(C2507R.id.message), C2507R.id.message);
                LinearLayout linearLayout2 = (LinearLayout) C2052a.m12265C(textView3, "view.message", textView3, view, C2507R.id.spoilerHideShow);
                Intrinsics.m32178g(linearLayout2, "view.spoilerHideShow");
                ViewsKt.m16372e(linearLayout2);
            }
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16368a(appCompatImageView, this.f29789q);
        }
        if (list.contains(3)) {
            TextView textView4 = (TextView) view.findViewById(C2507R.id.date);
            if (this.f29790r != 0) {
                Time time = Time.f30247a;
                Intrinsics.m32178g(context, "context");
                str = time.m16361g(context, this.f29790r);
            } else {
                str = "время не указано";
            }
            textView4.setText(str);
        }
        if (list.contains(4)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.is_new);
            Intrinsics.m32178g(appCompatImageView2, "view.is_new");
            ViewsKt.m16379l(appCompatImageView2, this.f29791s);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
