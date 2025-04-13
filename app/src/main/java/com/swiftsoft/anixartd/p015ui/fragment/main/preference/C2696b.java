package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.preference.Preference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferencePresenter;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAlternativeConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.preference.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2696b implements Preference.OnPreferenceChangeListener, SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: b */
    public final /* synthetic */ int f28395b;

    /* renamed from: c */
    public final /* synthetic */ Object f28396c;

    public /* synthetic */ C2696b(Fragment fragment, int i2) {
        this.f28395b = i2;
        this.f28396c = fragment;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    /* renamed from: a */
    public boolean mo3394a(Preference preference, final Object obj) {
        final AdditionalPreferenceFragment this$0 = (AdditionalPreferenceFragment) this.f28396c;
        KProperty<Object>[] kPropertyArr = AdditionalPreferenceFragment.f28289r;
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(preference, "preference");
        if (!(obj instanceof Boolean)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String string = this$0.getString(((Boolean) obj).booleanValue() ? C2507R.string.alternative_connection_enable_text : C2507R.string.alternative_connection_disable_text);
        Intrinsics.m32178g(string, "if (isBind) getString(R.…_connection_disable_text)");
        final Context context = this$0.getContext();
        if (context == null) {
            return false;
        }
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
        builder.f30150b = 3;
        String string2 = this$0.getString(C2507R.string.confirmation);
        Intrinsics.m32178g(string2, "getString(R.string.confirmation)");
        builder.m16319k(string2);
        builder.m16310b(string);
        String string3 = this$0.getString(C2507R.string.cancel);
        Intrinsics.m32178g(string3, "getString(R.string.cancel)");
        builder.m16312d(string3);
        String string4 = this$0.getString(C2507R.string.yes);
        Intrinsics.m32178g(string4, "getString(R.string.yes)");
        builder.m16316h(string4);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.AdditionalPreferenceFragment$initializePreferences$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                AdditionalPreferenceFragment additionalPreferenceFragment = AdditionalPreferenceFragment.this;
                Prefs prefs = ((MainPreferencePresenter) additionalPreferenceFragment.f28291p.getValue(additionalPreferenceFragment, AdditionalPreferenceFragment.f28289r[0])).f26543a;
                Object isBind = obj;
                Intrinsics.m32178g(isBind, "isBind");
                prefs.m14049E(((Boolean) isBind).booleanValue());
                Object isBind2 = obj;
                Intrinsics.m32178g(isBind2, "isBind");
                EventBusKt.m16327a(new OnAlternativeConnection(((Boolean) isBind2).booleanValue()));
                Handler handler = new Handler();
                final Context context2 = context;
                handler.postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        Intrinsics.m32179h(context3, "$context");
                        try {
                            Intent launchIntentForPackage = context3.getPackageManager().getLaunchIntentForPackage(context3.getPackageName());
                            Intrinsics.m32176e(launchIntentForPackage);
                            context3.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
                            Runtime.getRuntime().exit(0);
                        } catch (Exception unused) {
                        }
                    }
                }, 300L);
                return Unit.f63088a;
            }
        });
        builder.f30159k = true;
        builder.m16317i();
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        switch (this.f28395b) {
            case 1:
                ChangeLoginPreferenceFragment this$0 = (ChangeLoginPreferenceFragment) this.f28396c;
                KProperty<Object>[] kPropertyArr = ChangeLoginPreferenceFragment.f28302h;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15529u();
                break;
            default:
                ProfileReleaseNotificationPreferencesFragment this$02 = (ProfileReleaseNotificationPreferencesFragment) this.f28396c;
                KProperty<Object>[] kPropertyArr2 = ProfileReleaseNotificationPreferencesFragment.f28382i;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15552u();
                break;
        }
    }
}
