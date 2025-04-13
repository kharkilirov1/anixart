package com.swiftsoft.anixartd.p015ui.model.common;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CheckboxModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/CheckboxModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CheckboxModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public String f29378k;

    /* renamed from: l */
    @EpoxyAttribute
    public int f29379l;

    /* renamed from: m */
    @EpoxyAttribute
    public boolean f29380m;

    /* renamed from: n */
    @EpoxyAttribute
    public Listener f29381n;

    /* compiled from: CheckboxModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/CheckboxModel$Companion;", "", "", "CHECKED_CHANGED", "I", "TITLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CheckboxModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/CheckboxModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14649a(boolean z, int i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(C2507R.id.checkbox);
        appCompatCheckBox.setText(m15714v2());
        appCompatCheckBox.setChecked(this.f29380m);
        appCompatCheckBox.setOnCheckedChangeListener(new C2746a(this, 1));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof CheckboxModel) {
            CheckboxModel checkboxModel = (CheckboxModel) epoxyModel;
            if (!Intrinsics.m32174c(m15714v2(), checkboxModel.m15714v2())) {
                m12276k.add(0);
            }
            if (this.f29380m != checkboxModel.f29380m) {
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
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((AppCompatCheckBox) view.findViewById(C2507R.id.checkbox)).setText(m15714v2());
        }
        if (list.contains(1)) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(C2507R.id.checkbox);
            appCompatCheckBox.setOnCheckedChangeListener(null);
            appCompatCheckBox.setChecked(this.f29380m);
            appCompatCheckBox.setOnCheckedChangeListener(new C2746a(this, 0));
        }
    }

    @NotNull
    /* renamed from: v2 */
    public final String m15714v2() {
        String str = this.f29378k;
        if (str != null) {
            return str;
        }
        Intrinsics.m32189r("title");
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        ((AppCompatCheckBox) view.findViewById(C2507R.id.checkbox)).setOnCheckedChangeListener(null);
    }
}
