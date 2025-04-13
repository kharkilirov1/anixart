package com.swiftsoft.anixartd.p015ui.model.main.search;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.search.SearchRelatedModel;
import com.swiftsoft.anixartd.utils.Plurals;
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

/* compiled from: SearchRelatedModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/search/SearchRelatedModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SearchRelatedModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f30100k;

    /* renamed from: o */
    @EpoxyAttribute
    public long f30104o;

    /* renamed from: s */
    @EpoxyAttribute
    public Listener f30108s;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f30101l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @Nullable
    public String f30102m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @NotNull
    public String f30103n = "";

    /* renamed from: p */
    @EpoxyAttribute
    @Nullable
    public String f30105p = "";

    /* renamed from: q */
    @EpoxyAttribute
    @Nullable
    public String f30106q = "";

    /* renamed from: r */
    @EpoxyAttribute
    @Nullable
    public String f30107r = "";

    /* compiled from: SearchRelatedModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/search/SearchRelatedModel$Companion;", "", "", "DESCRIPTION_CHANGED", "I", "ID_CHANGED", "IMAGES_CHANGED", "IMAGE_CHANGED", "NAME_CHANGED", "RELEASE_COUNT_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: SearchRelatedModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/search/SearchRelatedModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo15218a(long j2, @NotNull String str, @Nullable String str2, @NotNull String str3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ((TextView) view2.findViewById(C2507R.id.name)).setText(this.f30101l);
        TextView textView = (TextView) view2.findViewById(C2507R.id.releaseCount);
        String string = context.getString(C2507R.string.related_release_count);
        Intrinsics.m32178g(string, "context.getString(R.string.related_release_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Plurals.f30231a.m16341a(context, (int) this.f30104o, C2507R.plurals.releases)}, 1));
        Intrinsics.m32178g(format, "format(format, *args)");
        textView.setText(format);
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.primaryImage);
        Intrinsics.m32178g(imageView, "view.primaryImage");
        ViewsKt.m16376i(imageView, this.f30105p, C2507R.drawable.placeholder);
        ImageView imageView2 = (ImageView) view2.findViewById(C2507R.id.secondaryImage);
        Intrinsics.m32178g(imageView2, "view.secondaryImage");
        ViewsKt.m16376i(imageView2, this.f30106q, C2507R.drawable.placeholder);
        ImageView imageView3 = (ImageView) view2.findViewById(C2507R.id.tertiaryImage);
        Intrinsics.m32178g(imageView3, "view.tertiaryImage");
        ViewsKt.m16376i(imageView3, this.f30107r, C2507R.drawable.placeholder);
        view2.setOnClickListener(new ViewOnClickListenerC2767a(this, 0));
        ((Button) view2.findViewById(C2507R.id.button)).setOnClickListener(new ViewOnClickListenerC2767a(this, 1));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof SearchRelatedModel) {
            SearchRelatedModel searchRelatedModel = (SearchRelatedModel) epoxyModel;
            if (this.f30100k != searchRelatedModel.f30100k) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f30101l, searchRelatedModel.f30101l)) {
                m12276k.add(1);
            }
            if (this.f30104o != searchRelatedModel.f30104o) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32174c(this.f30105p, searchRelatedModel.f30105p)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f30106q, searchRelatedModel.f30106q)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f30107r, searchRelatedModel.f30107r)) {
                m12276k.add(3);
            }
            if (!Intrinsics.m32174c(this.f30102m, searchRelatedModel.f30102m)) {
                m12276k.add(4);
            }
            if (!Intrinsics.m32174c(this.f30103n, searchRelatedModel.f30103n)) {
                m12276k.add(3);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_search_related;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0) || list.contains(4) || list.contains(5)) {
            ViewsKt.m16377j(view, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.search.SearchRelatedModel$bind$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view2) {
                    View it = view2;
                    Intrinsics.m32179h(it, "it");
                    SearchRelatedModel.Listener m16270v2 = SearchRelatedModel.this.m16270v2();
                    SearchRelatedModel searchRelatedModel = SearchRelatedModel.this;
                    m16270v2.mo15218a(searchRelatedModel.f30100k, searchRelatedModel.f30101l, searchRelatedModel.f30102m, searchRelatedModel.f30103n);
                    return Unit.f63088a;
                }
            });
            ((Button) view.findViewById(C2507R.id.button)).setOnClickListener(new ViewOnClickListenerC2767a(this, 2));
        }
        if (list.contains(2)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.releaseCount);
            String string = m12267b.getString(C2507R.string.related_release_count);
            Intrinsics.m32178g(string, "context.getString(R.string.related_release_count)");
            C2052a.m12290y(new Object[]{Plurals.f30231a.m16341a(m12267b, (int) this.f30104o, C2507R.plurals.releases)}, 1, string, "format(format, *args)", textView);
        }
        if (list.contains(1)) {
            ((TextView) view.findViewById(C2507R.id.name)).setText(this.f30101l);
        }
        if (list.contains(3)) {
            ImageView imageView = (ImageView) view.findViewById(C2507R.id.primaryImage);
            Intrinsics.m32178g(imageView, "view.primaryImage");
            ViewsKt.m16376i(imageView, this.f30105p, C2507R.drawable.placeholder);
            ImageView imageView2 = (ImageView) view.findViewById(C2507R.id.secondaryImage);
            Intrinsics.m32178g(imageView2, "view.secondaryImage");
            ViewsKt.m16376i(imageView2, this.f30106q, C2507R.drawable.placeholder);
            ImageView imageView3 = (ImageView) view.findViewById(C2507R.id.tertiaryImage);
            Intrinsics.m32178g(imageView3, "view.tertiaryImage");
            ViewsKt.m16376i(imageView3, this.f30107r, C2507R.drawable.placeholder);
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final Listener m16270v2() {
        Listener listener = this.f30108s;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}
