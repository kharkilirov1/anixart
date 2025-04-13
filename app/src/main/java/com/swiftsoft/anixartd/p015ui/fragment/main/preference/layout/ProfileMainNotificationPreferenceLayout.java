package com.swiftsoft.anixartd.p015ui.fragment.main.preference.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.swiftsoft.anixartd.utils.radiobutton.types.CardRadioButton;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileMainNotificationPreferenceLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/layout/ProfileMainNotificationPreferenceLayout;", "Landroidx/preference/Preference;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class ProfileMainNotificationPreferenceLayout extends Preference implements CustomRadioGroup.OnRadioButtonListener {

    /* renamed from: P */
    public int f28422P;

    /* compiled from: ProfileMainNotificationPreferenceLayout.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/layout/ProfileMainNotificationPreferenceLayout$Companion;", "", "", "STATUS_ALL", "I", "STATUS_RELEASE", "STATUS_SELECTED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProfileMainNotificationPreferenceLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
    }

    public /* synthetic */ ProfileMainNotificationPreferenceLayout(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* renamed from: R */
    public final void m15553R(int i2) {
        this.f28422P = i2;
        mo3387p(mo3349O());
        mo3344o();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup.OnRadioButtonListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        switch (view.getId()) {
            case C2507R.id.statusAll /* 2131362910 */:
                this.f28422P = 1;
                break;
            case C2507R.id.statusRelease /* 2131362914 */:
                this.f28422P = 3;
                break;
            case C2507R.id.statusSelected /* 2131362915 */:
                this.f28422P = 2;
                break;
        }
        if (m3376a(Integer.valueOf(this.f28422P))) {
            mo3387p(mo3349O());
            mo3344o();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NotNull PreferenceViewHolder preferenceViewHolder) {
        super.mo3338t(preferenceViewHolder);
        CustomRadioGroup customRadioGroup = (CustomRadioGroup) preferenceViewHolder.itemView.findViewById(C2507R.id.radioGroup);
        customRadioGroup.setOnRadioClickListener(this);
        customRadioGroup.m16470a();
        int i2 = this.f28422P;
        CardRadioButton cardRadioButton = i2 != 1 ? i2 != 2 ? i2 != 3 ? (CardRadioButton) preferenceViewHolder.itemView.findViewById(C2507R.id.statusAll) : (CardRadioButton) preferenceViewHolder.itemView.findViewById(C2507R.id.statusRelease) : (CardRadioButton) preferenceViewHolder.itemView.findViewById(C2507R.id.statusSelected) : (CardRadioButton) preferenceViewHolder.itemView.findViewById(C2507R.id.statusAll);
        Intrinsics.m32178g(cardRadioButton, "when (selectedStatus) {\n…      }\n                }");
        customRadioGroup.setSelectedButtonToSelectedState(cardRadioButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProfileMainNotificationPreferenceLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i2) {
        super(context, attrs, i2);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
    }
}
