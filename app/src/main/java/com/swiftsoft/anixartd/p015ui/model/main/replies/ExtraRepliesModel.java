package com.swiftsoft.anixartd.p015ui.model.main.replies;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.replies.ExtraRepliesModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExtraRepliesModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/replies/ExtraRepliesModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ExtraRepliesModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f30077k;

    /* renamed from: l */
    @StringRes
    @EpoxyAttribute
    public int f30078l;

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f30079m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public String f30080n = "";

    /* renamed from: o */
    @EpoxyAttribute
    public Listener f30081o;

    /* compiled from: ExtraRepliesModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/replies/ExtraRepliesModel$Companion;", "", "", "IMAGE_CHANGED", "I", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ExtraRepliesModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/replies/ExtraRepliesModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: d */
        void mo14466d(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        TextView textView = (TextView) view2.findViewById(C2507R.id.info);
        String string = context.getString(this.f30078l);
        Intrinsics.m32178g(string, "context.getString(extraResourceId)");
        Object[] objArr = new Object[1];
        String str = this.f30079m;
        if (str == null) {
            str = "Без названия";
        }
        objArr[0] = str;
        String format = String.format(string, Arrays.copyOf(objArr, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        String str2 = this.f30080n;
        if (str2 != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16368a(appCompatImageView, str2);
        }
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.replies.ExtraRepliesModel$bind$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ExtraRepliesModel extraRepliesModel = ExtraRepliesModel.this;
                ExtraRepliesModel.Listener listener = extraRepliesModel.f30081o;
                if (listener != null) {
                    listener.mo14466d(extraRepliesModel.f30077k);
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
        if (epoxyModel instanceof ExtraRepliesModel) {
            ExtraRepliesModel extraRepliesModel = (ExtraRepliesModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f30079m, extraRepliesModel.f30079m)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f30080n, extraRepliesModel.f30080n)) {
                m12276k.add(1);
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
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.info);
            String string = m12267b.getString(this.f30078l);
            Intrinsics.m32178g(string, "context.getString(extraResourceId)");
            String format = String.format(string, Arrays.copyOf(new Object[]{this.f30079m}, 1));
            Intrinsics.m32178g(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
        }
        if (!list.contains(1) || (str = this.f30080n) == null) {
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16375h(appCompatImageView, str);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}
